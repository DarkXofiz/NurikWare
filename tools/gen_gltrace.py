#!/usr/bin/env python3
# Client'in kullandigi tum OpenGL cagrilari icin kayit (trace) sinifi uretir: tools/GLTrace.java -> GLTrace.class
# Kullanim: python3 tools/gen_gltrace.py <jar>   (javac / jdk.compiler gerekir)
import re, struct, sys, zipfile, subprocess, os

HERE = os.path.dirname(os.path.abspath(__file__))
SKIP = {"glVertexAttribDivisor", "glDrawElementsInstanced", "glDrawArraysInstanced"}  # PhoneCompat'ta


def parse(d):
    cnt = struct.unpack(">H", d[8:10])[0]; pos = 10; ents = {}; i = 1
    while i < cnt:
        t = d[pos]
        if t == 1:
            l = struct.unpack(">H", d[pos + 1:pos + 3])[0]; ents[i] = (1, d[pos + 3:pos + 3 + l].decode("utf-8", "replace")); pos += 3 + l
        elif t in (3, 4): ents[i] = (t,); pos += 5
        elif t in (9, 10, 11, 12, 17, 18):
            a, b = struct.unpack(">HH", d[pos + 1:pos + 5]); ents[i] = (t, a, b); pos += 5
        elif t in (5, 6): ents[i] = (t,); pos += 9; i += 1
        elif t in (7, 8, 16, 19, 20): ents[i] = (t, struct.unpack(">H", d[pos + 1:pos + 3])[0]); pos += 3
        elif t == 15: ents[i] = (t,); pos += 4
        else: raise Exception(t)
        i += 1
    return cnt, ents


def jtype(d):
    m = {"I": "int", "J": "long", "F": "float", "D": "double", "Z": "boolean", "B": "byte", "S": "short", "C": "char", "V": "void"}
    arr = d.startswith("[")
    d = d.lstrip("[")
    if d in m: base = m[d]
    else: base = d[1:-1].replace("/", ".")
    return base + ("[]" if arr else "")


def main(jar):
    z = zipfile.ZipFile(jar)
    sigs = {}
    for n in z.namelist():
        if not (n.startswith("NurikWare/") and n.endswith(".class")): continue
        d = z.read(n)
        if b"org/lwjgl/opengl" not in d: continue
        cnt, e = parse(d)
        for i, x in e.items():
            if x[0] == 10:
                cl = e[e[x[1]][1]][1]; nm = e[e[x[2]][1]][1]; ds = e[e[x[2]][2]][1]
                if cl.startswith("org/lwjgl/opengl/") and nm not in SKIP:
                    sigs.setdefault((nm, ds), cl.replace("/", "."))
    out = ["package NurikWare;", "import java.lang.reflect.Method;", "import java.io.FileOutputStream;", "",
           "public final class GLTrace {",
           "   private static int count; private static FileOutputStream file; private static boolean fileTried;",
           "   private static final Method[] M = new Method[%d];" % len(sigs),
           "   private static void t(String n, Object... a) {",
           "      count++; if (count > 20000) return;",
           "      StringBuilder sb = new StringBuilder().append(count).append(' ').append(n).append('(');",
           "      for (int i = 0; i < a.length; i++) { if (i > 0) sb.append(','); Object o = a[i];",
           "         if (o instanceof java.nio.Buffer b) sb.append(b.getClass().getSimpleName()).append('#').append(b.remaining());",
           "         else if (o instanceof int[] ia) sb.append(\"int[\").append(ia.length).append(']');",
           "         else if (o instanceof CharSequence cs) { String s = cs.toString(); sb.append('\"').append(s.length() > 40 ? s.substring(0, 40) : s).append('\"'); }",
           "         else sb.append(o); }",
           "      sb.append(')'); String line = sb.toString();",
           "      try { if (!fileTried) { fileTried = true; try { file = new FileOutputStream(System.getProperty(\"user.home\", \".\") + \"/nurikware-gltrace.txt\", false); } catch (Throwable e) { } }",
           "         if (file != null) file.write((line + \"\\n\").getBytes()); } catch (Throwable e) { }",
           "      if ((count > 520 && count <= 9000) || n.startsWith(\"!\")) System.out.println(\"[GLTRACE] \" + line);",
           "   }",
           "   private static void tr(String n, Object r, Object a0, Object a1) {",
           "      try { boolean show = false; String s = String.valueOf(r);",
           "         if (r instanceof String str) { show = str.length() > 0; s = str.length() > 300 ? str.substring(0, 300) : str; s = s.replace('\\n', ' '); }",
           "         else if ((n.equals(\"glGetShaderi\") && Integer.valueOf(35713).equals(a1) || n.equals(\"glGetProgrami\") && Integer.valueOf(35714).equals(a1)) && Integer.valueOf(0).equals(r)) { show = true; s = \"!!! COMPILE/LINK FAILED for \" + a0; }",
           "         else if (count > 520 && count <= 9000) show = true;",
           "         if (show) { String line = \"   = \" + n + \" -> \" + s; if (file != null) { try { file.write((line + \"\\n\").getBytes()); } catch (Throwable e) { } } System.out.println(\"[GLTRACE] \" + line); }",
           "      } catch (Throwable e) { }",
           "   }",
           "   private static Object call(int idx, String owner, String name, Class<?>[] types, Object[] args) {",
           "      try { Method m = M[idx]; if (m == null) { m = Class.forName(owner).getMethod(name, types); M[idx] = m; }",
           "         return m.invoke(null, args);",
           "      } catch (java.lang.reflect.InvocationTargetException e) { Throwable c = e.getCause(); t(\"!EXC \" + name + \" \" + c); if (c instanceof RuntimeException r) throw r; if (c instanceof Error er) throw er; throw new RuntimeException(c);",
           "      } catch (Throwable e) { t(\"!ERR \" + name + \" \" + e); return null; }",
           "   }"]
    for idx, ((nm, ds), owner) in enumerate(sorted(sigs.items())):
        args_d, ret_d = ds[1:].split(")")
        params = re.findall(r"\[?[BCDFIJSZ]|\[?L[^;]+;", args_d)
        jt = [jtype(p) for p in params]
        ret = jtype(ret_d)
        plist = ", ".join("%s a%d" % (t, i) for i, t in enumerate(jt))
        names = ", ".join("a%d" % i for i in range(len(jt)))
        ctypes = ", ".join("%s.class" % t for t in jt)
        boxed = "new Object[]{%s}" % names
        body = "      t(\"%s\"%s);\n" % (nm, (", " + names) if names else "")
        callx = "call(%d, \"%s\", \"%s\", new Class<?>[]{%s}, %s)" % (idx, owner, nm, ctypes, boxed)
        if ret == "void":
            body += "      %s;" % callx
        else:
            defaults = {"int": "0", "long": "0L", "float": "0f", "double": "0d", "boolean": "false", "byte": "0", "short": "0", "char": "0"}
            wrap = {"int": "Integer", "long": "Long", "float": "Float", "double": "Double", "boolean": "Boolean", "byte": "Byte", "short": "Short", "char": "Character"}
            if ret in wrap:
                a0 = "a0" if len(jt) > 0 else "null"; a1 = "a1" if len(jt) > 1 else "null"
                body += "      Object r = %s; tr(\"%s\", r, %s, %s); return r == null ? %s : ((%s) r);" % (callx, nm, a0, a1, defaults[ret], wrap[ret])
            else:
                a0 = "a0" if len(jt) > 0 else "null"; a1 = "a1" if len(jt) > 1 else "null"
                body += "      Object r = %s; tr(\"%s\", r, %s, %s); return (%s) r;" % (callx, nm, a0, a1, ret)
        out.append("   public static %s %s(%s) {\n%s\n   }" % (ret, nm, plist, body))
    out.append("}")
    open(os.path.join(HERE, "gltrace_sigs.txt"), "w").write("\n".join("%s %s" % k for k in sorted(sigs)) + "\n")
    src = os.path.join(HERE, "GLTrace.java")
    open(src, "w", encoding="utf-8").write("\n".join(out) + "\n")
    tmp = "/tmp/gt_out"; os.makedirs(tmp, exist_ok=True)
    r = subprocess.run(["java", "--add-modules", "jdk.compiler", "-m", "jdk.compiler/com.sun.tools.javac.Main",
                        "-source", "17", "-target", "17", "-nowarn", "-d", tmp, src], capture_output=True, text=True)
    print(r.stdout[-1500:], r.stderr[-2500:])
    import shutil
    shutil.copy(os.path.join(tmp, "NurikWare", "GLTrace.class"), os.path.join(HERE, "GLTrace.class"))
    print("tamam:", len(sigs), "imza ->", os.path.join(HERE, "GLTrace.class"))


if __name__ == "__main__":
    main(sys.argv[1])
