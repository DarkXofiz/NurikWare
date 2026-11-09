package NurikWare;
import java.lang.reflect.Method;
import java.io.FileOutputStream;

public final class GLTrace {
   private static int count; private static FileOutputStream file; private static boolean fileTried;
   private static final Method[] M = new Method[77];
   private static void t(String n, Object... a) {
      count++; if (count > 20000) return;
      StringBuilder sb = new StringBuilder().append(count).append(' ').append(n).append('(');
      for (int i = 0; i < a.length; i++) { if (i > 0) sb.append(','); Object o = a[i];
         if (o instanceof java.nio.Buffer b) sb.append(b.getClass().getSimpleName()).append('#').append(b.remaining());
         else if (o instanceof int[] ia) sb.append("int[").append(ia.length).append(']');
         else if (o instanceof CharSequence cs) { String s = cs.toString(); sb.append('"').append(s.length() > 40 ? s.substring(0, 40) : s).append('"'); }
         else sb.append(o); }
      sb.append(')'); String line = sb.toString();
      try { if (!fileTried) { fileTried = true; try { file = new FileOutputStream(System.getProperty("user.home", ".") + "/nurikware-gltrace.txt", false); } catch (Throwable e) { } }
         if (file != null) file.write((line + "\n").getBytes()); } catch (Throwable e) { }
      if ((count > 520 && count <= 9000) || n.startsWith("!")) System.out.println("[GLTRACE] " + line);
   }
   private static void tr(String n, Object r, Object a0, Object a1) {
      try { boolean show = false; String s = String.valueOf(r);
         if (r instanceof String str) { show = str.length() > 0; s = str.length() > 300 ? str.substring(0, 300) : str; s = s.replace('\n', ' '); }
         else if ((n.equals("glGetShaderi") && Integer.valueOf(35713).equals(a1) || n.equals("glGetProgrami") && Integer.valueOf(35714).equals(a1)) && Integer.valueOf(0).equals(r)) { show = true; s = "!!! COMPILE/LINK FAILED for " + a0; }
         else if (count > 520 && count <= 9000) show = true;
         if (show) { String line = "   = " + n + " -> " + s; if (file != null) { try { file.write((line + "\n").getBytes()); } catch (Throwable e) { } } System.out.println("[GLTRACE] " + line); }
      } catch (Throwable e) { }
   }
   private static Object call(int idx, String owner, String name, Class<?>[] types, Object[] args) {
      try { Method m = M[idx]; if (m == null) { m = Class.forName(owner).getMethod(name, types); M[idx] = m; }
         return m.invoke(null, args);
      } catch (java.lang.reflect.InvocationTargetException e) { Throwable c = e.getCause(); t("!EXC " + name + " " + c); if (c instanceof RuntimeException r) throw r; if (c instanceof Error er) throw er; throw new RuntimeException(c);
      } catch (Throwable e) { t("!ERR " + name + " " + e); return null; }
   }
   public static void glActiveTexture(int a0) {
      t("glActiveTexture", a0);
      call(0, "org.lwjgl.opengl.GL13", "glActiveTexture", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glAttachShader(int a0, int a1) {
      t("glAttachShader", a0, a1);
      call(1, "org.lwjgl.opengl.GL31", "glAttachShader", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glBindBuffer(int a0, int a1) {
      t("glBindBuffer", a0, a1);
      call(2, "org.lwjgl.opengl.GL33", "glBindBuffer", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glBindBufferBase(int a0, int a1, int a2) {
      t("glBindBufferBase", a0, a1, a2);
      call(3, "org.lwjgl.opengl.GL33", "glBindBufferBase", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glBindSampler(int a0, int a1) {
      t("glBindSampler", a0, a1);
      call(4, "org.lwjgl.opengl.GL33", "glBindSampler", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glBindTexture(int a0, int a1) {
      t("glBindTexture", a0, a1);
      call(5, "org.lwjgl.opengl.GL11", "glBindTexture", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glBindVertexArray(int a0) {
      t("glBindVertexArray", a0);
      call(6, "org.lwjgl.opengl.GL33", "glBindVertexArray", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glBindVertexBuffer(int a0, int a1, long a2, int a3) {
      t("glBindVertexBuffer", a0, a1, a2, a3);
      call(7, "org.lwjgl.opengl.ARBVertexAttribBinding", "glBindVertexBuffer", new Class<?>[]{int.class, int.class, long.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glClear(int a0) {
      t("glClear", a0);
      call(8, "org.lwjgl.opengl.GL11", "glClear", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glClearColor(float a0, float a1, float a2, float a3) {
      t("glClearColor", a0, a1, a2, a3);
      call(9, "org.lwjgl.opengl.GL13", "glClearColor", new Class<?>[]{float.class, float.class, float.class, float.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glColorMask(boolean a0, boolean a1, boolean a2, boolean a3) {
      t("glColorMask", a0, a1, a2, a3);
      call(10, "org.lwjgl.opengl.GL11", "glColorMask", new Class<?>[]{boolean.class, boolean.class, boolean.class, boolean.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glCompileShader(int a0) {
      t("glCompileShader", a0);
      call(11, "org.lwjgl.opengl.GL31", "glCompileShader", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static int glCreateProgram() {
      t("glCreateProgram");
      Object r = call(12, "org.lwjgl.opengl.GL31", "glCreateProgram", new Class<?>[]{}, new Object[]{}); tr("glCreateProgram", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static int glCreateShader(int a0) {
      t("glCreateShader", a0);
      Object r = call(13, "org.lwjgl.opengl.GL31", "glCreateShader", new Class<?>[]{int.class}, new Object[]{a0}); tr("glCreateShader", r, a0, null); return r == null ? 0 : ((Integer) r);
   }
   public static void glDeleteFramebuffers(int a0) {
      t("glDeleteFramebuffers", a0);
      call(14, "org.lwjgl.opengl.GL30", "glDeleteFramebuffers", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glDeleteQueries(int[] a0) {
      t("glDeleteQueries", a0);
      call(15, "org.lwjgl.opengl.GL33", "glDeleteQueries", new Class<?>[]{int[].class}, new Object[]{a0});
   }
   public static void glDeleteShader(int a0) {
      t("glDeleteShader", a0);
      call(16, "org.lwjgl.opengl.GL31", "glDeleteShader", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glDeleteTextures(int a0) {
      t("glDeleteTextures", a0);
      call(17, "org.lwjgl.opengl.GL11", "glDeleteTextures", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glDepthMask(boolean a0) {
      t("glDepthMask", a0);
      call(18, "org.lwjgl.opengl.GL11", "glDepthMask", new Class<?>[]{boolean.class}, new Object[]{a0});
   }
   public static void glDetachShader(int a0, int a1) {
      t("glDetachShader", a0, a1);
      call(19, "org.lwjgl.opengl.GL31", "glDetachShader", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glDisable(int a0) {
      t("glDisable", a0);
      call(20, "org.lwjgl.opengl.GL11", "glDisable", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glDrawArrays(int a0, int a1, int a2) {
      t("glDrawArrays", a0, a1, a2);
      call(21, "org.lwjgl.opengl.GL33", "glDrawArrays", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glDrawElements(int a0, int a1, int a2, long a3) {
      t("glDrawElements", a0, a1, a2, a3);
      call(22, "org.lwjgl.opengl.GL33", "glDrawElements", new Class<?>[]{int.class, int.class, int.class, long.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glEnable(int a0) {
      t("glEnable", a0);
      call(23, "org.lwjgl.opengl.GL11", "glEnable", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glEnableVertexAttribArray(int a0) {
      t("glEnableVertexAttribArray", a0);
      call(24, "org.lwjgl.opengl.GL33", "glEnableVertexAttribArray", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glFramebufferTexture2D(int a0, int a1, int a2, int a3, int a4) {
      t("glFramebufferTexture2D", a0, a1, a2, a3, a4);
      call(25, "org.lwjgl.opengl.GL30", "glFramebufferTexture2D", new Class<?>[]{int.class, int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3, a4});
   }
   public static int glGenBuffers() {
      t("glGenBuffers");
      Object r = call(26, "org.lwjgl.opengl.GL33", "glGenBuffers", new Class<?>[]{}, new Object[]{}); tr("glGenBuffers", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static int glGenFramebuffers() {
      t("glGenFramebuffers");
      Object r = call(27, "org.lwjgl.opengl.GL30", "glGenFramebuffers", new Class<?>[]{}, new Object[]{}); tr("glGenFramebuffers", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static void glGenQueries(int[] a0) {
      t("glGenQueries", a0);
      call(28, "org.lwjgl.opengl.GL33", "glGenQueries", new Class<?>[]{int[].class}, new Object[]{a0});
   }
   public static int glGenSamplers() {
      t("glGenSamplers");
      Object r = call(29, "org.lwjgl.opengl.GL33", "glGenSamplers", new Class<?>[]{}, new Object[]{}); tr("glGenSamplers", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static int glGenTextures() {
      t("glGenTextures");
      Object r = call(30, "org.lwjgl.opengl.GL30", "glGenTextures", new Class<?>[]{}, new Object[]{}); tr("glGenTextures", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static int glGenVertexArrays() {
      t("glGenVertexArrays");
      Object r = call(31, "org.lwjgl.opengl.GL33", "glGenVertexArrays", new Class<?>[]{}, new Object[]{}); tr("glGenVertexArrays", r, null, null); return r == null ? 0 : ((Integer) r);
   }
   public static void glGenerateMipmap(int a0) {
      t("glGenerateMipmap", a0);
      call(32, "org.lwjgl.opengl.GL30", "glGenerateMipmap", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static java.lang.String glGetActiveUniform(int a0, int a1, java.nio.IntBuffer a2, java.nio.IntBuffer a3) {
      t("glGetActiveUniform", a0, a1, a2, a3);
      Object r = call(33, "org.lwjgl.opengl.GL31", "glGetActiveUniform", new Class<?>[]{int.class, int.class, java.nio.IntBuffer.class, java.nio.IntBuffer.class}, new Object[]{a0, a1, a2, a3}); tr("glGetActiveUniform", r, a0, a1); return (java.lang.String) r;
   }
   public static void glGetAttachedShaders(int a0, java.nio.IntBuffer a1, java.nio.IntBuffer a2) {
      t("glGetAttachedShaders", a0, a1, a2);
      call(34, "org.lwjgl.opengl.GL31", "glGetAttachedShaders", new Class<?>[]{int.class, java.nio.IntBuffer.class, java.nio.IntBuffer.class}, new Object[]{a0, a1, a2});
   }
   public static int glGetInteger(int a0) {
      t("glGetInteger", a0);
      Object r = call(35, "org.lwjgl.opengl.GL11", "glGetInteger", new Class<?>[]{int.class}, new Object[]{a0}); tr("glGetInteger", r, a0, null); return r == null ? 0 : ((Integer) r);
   }
   public static void glGetIntegerv(int a0, int[] a1) {
      t("glGetIntegerv", a0, a1);
      call(36, "org.lwjgl.opengl.GL11", "glGetIntegerv", new Class<?>[]{int.class, int[].class}, new Object[]{a0, a1});
   }
   public static java.lang.String glGetProgramInfoLog(int a0) {
      t("glGetProgramInfoLog", a0);
      Object r = call(37, "org.lwjgl.opengl.GL31", "glGetProgramInfoLog", new Class<?>[]{int.class}, new Object[]{a0}); tr("glGetProgramInfoLog", r, a0, null); return (java.lang.String) r;
   }
   public static int glGetProgrami(int a0, int a1) {
      t("glGetProgrami", a0, a1);
      Object r = call(38, "org.lwjgl.opengl.GL31", "glGetProgrami", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1}); tr("glGetProgrami", r, a0, a1); return r == null ? 0 : ((Integer) r);
   }
   public static long glGetQueryObjectui64(int a0, int a1) {
      t("glGetQueryObjectui64", a0, a1);
      Object r = call(39, "org.lwjgl.opengl.GL33", "glGetQueryObjectui64", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1}); tr("glGetQueryObjectui64", r, a0, a1); return r == null ? 0L : ((Long) r);
   }
   public static java.lang.String glGetShaderInfoLog(int a0) {
      t("glGetShaderInfoLog", a0);
      Object r = call(40, "org.lwjgl.opengl.GL31", "glGetShaderInfoLog", new Class<?>[]{int.class}, new Object[]{a0}); tr("glGetShaderInfoLog", r, a0, null); return (java.lang.String) r;
   }
   public static int glGetShaderi(int a0, int a1) {
      t("glGetShaderi", a0, a1);
      Object r = call(41, "org.lwjgl.opengl.GL31", "glGetShaderi", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1}); tr("glGetShaderi", r, a0, a1); return r == null ? 0 : ((Integer) r);
   }
   public static int glGetUniformBlockIndex(int a0, java.lang.CharSequence a1) {
      t("glGetUniformBlockIndex", a0, a1);
      Object r = call(42, "org.lwjgl.opengl.GL31", "glGetUniformBlockIndex", new Class<?>[]{int.class, java.lang.CharSequence.class}, new Object[]{a0, a1}); tr("glGetUniformBlockIndex", r, a0, a1); return r == null ? 0 : ((Integer) r);
   }
   public static int glGetUniformLocation(int a0, java.lang.CharSequence a1) {
      t("glGetUniformLocation", a0, a1);
      Object r = call(43, "org.lwjgl.opengl.GL31", "glGetUniformLocation", new Class<?>[]{int.class, java.lang.CharSequence.class}, new Object[]{a0, a1}); tr("glGetUniformLocation", r, a0, a1); return r == null ? 0 : ((Integer) r);
   }
   public static boolean glIsEnabled(int a0) {
      t("glIsEnabled", a0);
      Object r = call(44, "org.lwjgl.opengl.GL33", "glIsEnabled", new Class<?>[]{int.class}, new Object[]{a0}); tr("glIsEnabled", r, a0, null); return r == null ? false : ((Boolean) r);
   }
   public static boolean glIsProgram(int a0) {
      t("glIsProgram", a0);
      Object r = call(45, "org.lwjgl.opengl.GL33", "glIsProgram", new Class<?>[]{int.class}, new Object[]{a0}); tr("glIsProgram", r, a0, null); return r == null ? false : ((Boolean) r);
   }
   public static void glLabelObjectEXT(int a0, int a1, java.lang.CharSequence a2) {
      t("glLabelObjectEXT", a0, a1, a2);
      call(46, "org.lwjgl.opengl.EXTDebugLabel", "glLabelObjectEXT", new Class<?>[]{int.class, int.class, java.lang.CharSequence.class}, new Object[]{a0, a1, a2});
   }
   public static void glLinkProgram(int a0) {
      t("glLinkProgram", a0);
      call(47, "org.lwjgl.opengl.GL31", "glLinkProgram", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glPixelStorei(int a0, int a1) {
      t("glPixelStorei", a0, a1);
      call(48, "org.lwjgl.opengl.GL11", "glPixelStorei", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glQueryCounter(int a0, int a1) {
      t("glQueryCounter", a0, a1);
      call(49, "org.lwjgl.opengl.GL33", "glQueryCounter", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glReadPixels(int a0, int a1, int a2, int a3, int a4, int a5, java.nio.ByteBuffer a6) {
      t("glReadPixels", a0, a1, a2, a3, a4, a5, a6);
      call(50, "org.lwjgl.opengl.GL11", "glReadPixels", new Class<?>[]{int.class, int.class, int.class, int.class, int.class, int.class, java.nio.ByteBuffer.class}, new Object[]{a0, a1, a2, a3, a4, a5, a6});
   }
   public static void glSamplerParameteri(int a0, int a1, int a2) {
      t("glSamplerParameteri", a0, a1, a2);
      call(51, "org.lwjgl.opengl.GL33", "glSamplerParameteri", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glScissor(int a0, int a1, int a2, int a3) {
      t("glScissor", a0, a1, a2, a3);
      call(52, "org.lwjgl.opengl.GL11", "glScissor", new Class<?>[]{int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glShaderSource(int a0, java.lang.CharSequence a1) {
      t("glShaderSource", a0, a1);
      call(53, "org.lwjgl.opengl.GL31", "glShaderSource", new Class<?>[]{int.class, java.lang.CharSequence.class}, new Object[]{a0, a1});
   }
   public static void glTexImage2D(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.ByteBuffer a8) {
      t("glTexImage2D", a0, a1, a2, a3, a4, a5, a6, a7, a8);
      call(54, "org.lwjgl.opengl.GL30", "glTexImage2D", new Class<?>[]{int.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, java.nio.ByteBuffer.class}, new Object[]{a0, a1, a2, a3, a4, a5, a6, a7, a8});
   }
   public static void glTexParameteri(int a0, int a1, int a2) {
      t("glTexParameteri", a0, a1, a2);
      call(55, "org.lwjgl.opengl.GL30", "glTexParameteri", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glTexSubImage2D(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.ByteBuffer a8) {
      t("glTexSubImage2D", a0, a1, a2, a3, a4, a5, a6, a7, a8);
      call(56, "org.lwjgl.opengl.GL11", "glTexSubImage2D", new Class<?>[]{int.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, java.nio.ByteBuffer.class}, new Object[]{a0, a1, a2, a3, a4, a5, a6, a7, a8});
   }
   public static void glUniform1f(int a0, float a1) {
      t("glUniform1f", a0, a1);
      call(57, "org.lwjgl.opengl.GL33", "glUniform1f", new Class<?>[]{int.class, float.class}, new Object[]{a0, a1});
   }
   public static void glUniform1fv(int a0, java.nio.FloatBuffer a1) {
      t("glUniform1fv", a0, a1);
      call(58, "org.lwjgl.opengl.GL33", "glUniform1fv", new Class<?>[]{int.class, java.nio.FloatBuffer.class}, new Object[]{a0, a1});
   }
   public static void glUniform1i(int a0, int a1) {
      t("glUniform1i", a0, a1);
      call(59, "org.lwjgl.opengl.GL33", "glUniform1i", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glUniform2f(int a0, float a1, float a2) {
      t("glUniform2f", a0, a1, a2);
      call(60, "org.lwjgl.opengl.GL33", "glUniform2f", new Class<?>[]{int.class, float.class, float.class}, new Object[]{a0, a1, a2});
   }
   public static void glUniform2i(int a0, int a1, int a2) {
      t("glUniform2i", a0, a1, a2);
      call(61, "org.lwjgl.opengl.GL33", "glUniform2i", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glUniform3f(int a0, float a1, float a2, float a3) {
      t("glUniform3f", a0, a1, a2, a3);
      call(62, "org.lwjgl.opengl.GL33", "glUniform3f", new Class<?>[]{int.class, float.class, float.class, float.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glUniform3i(int a0, int a1, int a2, int a3) {
      t("glUniform3i", a0, a1, a2, a3);
      call(63, "org.lwjgl.opengl.GL33", "glUniform3i", new Class<?>[]{int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glUniform4f(int a0, float a1, float a2, float a3, float a4) {
      t("glUniform4f", a0, a1, a2, a3, a4);
      call(64, "org.lwjgl.opengl.GL33", "glUniform4f", new Class<?>[]{int.class, float.class, float.class, float.class, float.class}, new Object[]{a0, a1, a2, a3, a4});
   }
   public static void glUniform4i(int a0, int a1, int a2, int a3, int a4) {
      t("glUniform4i", a0, a1, a2, a3, a4);
      call(65, "org.lwjgl.opengl.GL33", "glUniform4i", new Class<?>[]{int.class, int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3, a4});
   }
   public static void glUniformBlockBinding(int a0, int a1, int a2) {
      t("glUniformBlockBinding", a0, a1, a2);
      call(66, "org.lwjgl.opengl.GL31", "glUniformBlockBinding", new Class<?>[]{int.class, int.class, int.class}, new Object[]{a0, a1, a2});
   }
   public static void glUniformMatrix4fv(int a0, boolean a1, java.nio.FloatBuffer a2) {
      t("glUniformMatrix4fv", a0, a1, a2);
      call(67, "org.lwjgl.opengl.GL33", "glUniformMatrix4fv", new Class<?>[]{int.class, boolean.class, java.nio.FloatBuffer.class}, new Object[]{a0, a1, a2});
   }
   public static void glUseProgram(int a0) {
      t("glUseProgram", a0);
      call(68, "org.lwjgl.opengl.GL31", "glUseProgram", new Class<?>[]{int.class}, new Object[]{a0});
   }
   public static void glVertexAttribBinding(int a0, int a1) {
      t("glVertexAttribBinding", a0, a1);
      call(69, "org.lwjgl.opengl.ARBVertexAttribBinding", "glVertexAttribBinding", new Class<?>[]{int.class, int.class}, new Object[]{a0, a1});
   }
   public static void glVertexAttribFormat(int a0, int a1, int a2, boolean a3, int a4) {
      t("glVertexAttribFormat", a0, a1, a2, a3, a4);
      call(70, "org.lwjgl.opengl.ARBVertexAttribBinding", "glVertexAttribFormat", new Class<?>[]{int.class, int.class, int.class, boolean.class, int.class}, new Object[]{a0, a1, a2, a3, a4});
   }
   public static void glVertexAttribIFormat(int a0, int a1, int a2, int a3) {
      t("glVertexAttribIFormat", a0, a1, a2, a3);
      call(71, "org.lwjgl.opengl.ARBVertexAttribBinding", "glVertexAttribIFormat", new Class<?>[]{int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void glVertexAttribIPointer(int a0, int a1, int a2, int a3, long a4) {
      t("glVertexAttribIPointer", a0, a1, a2, a3, a4);
      call(72, "org.lwjgl.opengl.GL33", "glVertexAttribIPointer", new Class<?>[]{int.class, int.class, int.class, int.class, long.class}, new Object[]{a0, a1, a2, a3, a4});
   }
   public static void glVertexAttribPointer(int a0, int a1, int a2, boolean a3, int a4, long a5) {
      t("glVertexAttribPointer", a0, a1, a2, a3, a4, a5);
      call(73, "org.lwjgl.opengl.GL33", "glVertexAttribPointer", new Class<?>[]{int.class, int.class, int.class, boolean.class, int.class, long.class}, new Object[]{a0, a1, a2, a3, a4, a5});
   }
   public static void glViewport(int a0, int a1, int a2, int a3) {
      t("glViewport", a0, a1, a2, a3);
      call(74, "org.lwjgl.opengl.GL11", "glViewport", new Class<?>[]{int.class, int.class, int.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void nglBufferData(int a0, long a1, long a2, int a3) {
      t("nglBufferData", a0, a1, a2, a3);
      call(75, "org.lwjgl.opengl.GL33", "nglBufferData", new Class<?>[]{int.class, long.class, long.class, int.class}, new Object[]{a0, a1, a2, a3});
   }
   public static void nglBufferSubData(int a0, long a1, long a2, long a3) {
      t("nglBufferSubData", a0, a1, a2, a3);
      call(76, "org.lwjgl.opengl.GL33", "nglBufferSubData", new Class<?>[]{int.class, long.class, long.class, long.class}, new Object[]{a0, a1, a2, a3});
   }
}
