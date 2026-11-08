package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.function.IntFunction;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL31;

public class class09322 extends class09306 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;

   @Override
   public void L() {
      this.E();
      this.W();
      ((class09337)this.N_3).y();
      int i = 0;
      int j = 0;

      try {
         i = this.N(35633, (String)this.N_0);
         j = this.N(35632, (String)this.N_1);
         GL31.glAttachShader((Integer)super.y_0, i);
         GL31.glAttachShader((Integer)super.y_0, j);
         GL31.glLinkProgram((Integer)super.y_0);
         if (GL31.glGetProgrami((Integer)super.y_0, 35714) == 0) {
            throw new IllegalStateException(
               "Shader link failed: " + (String)this.N_0 + ", " + (String)this.N_1 + ". " + GL31.glGetProgramInfoLog((Integer)super.y_0)
            );
         }

         this.N_4 = null;
         this.N_5 = null;
         this.N_6 = null;
      } finally {
         if (i != 0) {
            GL31.glDetachShader((Integer)super.y_0, i);
            GL31.glDeleteShader(i);
         }

         if (j != 0) {
            GL31.glDetachShader((Integer)super.y_0, j);
            GL31.glDeleteShader(j);
         }
      }
   }

   public class12003 L(String var1) {
      return this.N(var1, class12003::new, class09353.INT);
   }

   public void M() {
      GL31.glUseProgram((Integer)super.y_0);
   }

   public class12026 M(String var1) {
      return this.N(var1, class12026::new, class09353.SAMPLER_2D);
   }

   public class09322(String var1, String var2, class09337 var3, String var4) {
      super(GL31.glCreateProgram());
      this.E();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_3 = var3;
      this.N_2 = var4;
      this.L();
   }

   public class09322(String var1, String var2) {
      this(var1, var2, class09337.N, "");
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class09322 class09322)) {
         return false;
      } else if (!class09322.N(this)) {
         return false;
      } else {
         String s = this.B();
         String s1 = class09322.B();
         if (s == null ? s1 == null : s.equals(s1)) {
            String s2 = this.R();
            String s3 = class09322.R();
            if (s2 == null ? s3 == null : s2.equals(s3)) {
               String s4 = this.i();
               String s5 = class09322.i();
               return s4 == null ? s5 == null : s4.equals(s5);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      String s = this.B();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      String s1 = this.R();
      i = i * 59 + (s1 == null ? 43 : s1.hashCode());
      String s2 = this.i();
      return i * 59 + (s2 == null ? 43 : s2.hashCode());
   }

   public String B() {
      this.E();
      return (String)this.N_0;
   }

   public class11210 B(String var1) {
      return this.N(var1, class11210::new, class09353.IVEC2);
   }

   public Object2ObjectOpenHashMap<String, class12004> Z() {
      this.E();
      return (Object2ObjectOpenHashMap<String, class12004>)this.N_4;
   }

   public class12042 Z(String var1) {
      return this.N(var1, class12042::new, class09353.IVEC4);
   }

   public class11200 i(String var1) {
      return this.N(var1, class11200::new, class09353.FLOAT);
   }

   public String i() {
      this.E();
      return (String)this.N_2;
   }

   private Object2ObjectOpenHashMap<String, class09307> s() {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_5 != null) {
         return (Object2ObjectOpenHashMap<String, class09307>)this.N_5;
      } else {
         this.N_5 = new Object2ObjectOpenHashMap();
         int i = GL31.glGetProgrami((Integer)super.y_0, 35718);
         IntBuffer intbuffer = BufferUtils.createIntBuffer(1);
         IntBuffer intbuffer1 = BufferUtils.createIntBuffer(1);

         for (int j = 0; j < i; j++) {
            intbuffer.clear();
            intbuffer1.clear();
            String s = GL31.glGetActiveUniform((Integer)super.y_0, j, intbuffer, intbuffer1);
            class09307 class09307 = new class09307(s, intbuffer1.get(0), intbuffer.get(0));
            ((Object2ObjectOpenHashMap)this.N_5).put(Y(s), class09307);
            ((Object2ObjectOpenHashMap)this.N_5).put(s, class09307);
         }

         return (Object2ObjectOpenHashMap<String, class09307>)this.N_5;
      }
   }

   private String m(String var1) {
      class01079 class01079 = (class01079)class06202.Nq()
         .Nm()
         .method_14486(class11911.N(var1))
         .orElseThrow(() -> new IllegalStateException("Shader resource was not found: " + var1));

      try {
         String s;
         try (InputStream inputstream = class01079.method_14482()) {
            s = IOUtils.toString(inputstream, StandardCharsets.UTF_8);
         }

         return s;
      } catch (IOException ioexception) {
         throw new IllegalStateException("Failed to read shader source: " + var1, ioexception);
      }
   }

   public class12017 U(String var1) {
      return this.N(var1, class12017::new, class09353.VEC3);
   }

   public class12038 z(String var1) {
      return this.N(var1, class12038::new, class09353.MAT4);
   }

   public Object2ObjectOpenHashMap<String, class12009> u() {
      this.E();
      return (Object2ObjectOpenHashMap<String, class12009>)this.N_6;
   }

   public class12005 u(String var1) {
      return this.N(var1, class12005::new, class09353.IVEC3);
   }

   public class11170 y(String var1) {
      return this.N(var1, class11170::new, class09353.FLOAT_ARRAY);
   }

   private static String y(int var0) {
      return switch (var0) {
         case 5124 -> "int";
         case 5126 -> "float";
         case 35664 -> "vec2";
         case 35665 -> "vec3";
         case 35666 -> "vec4";
         case 35667 -> "ivec2";
         case 35668 -> "ivec3";
         case 35669 -> "ivec4";
         case 35670 -> "bool";
         case 35676 -> "mat4";
         case 35678 -> "sampler2D";
         default -> "0x" + Integer.toHexString(var0);
      };
   }

   private void E() {
   }

   public class12009 N(String var1, int var2) {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_6 == null) {
         this.N_6 = new Object2ObjectOpenHashMap();
      } else {
         class12009 class12009x = (class12009)((Object2ObjectOpenHashMap)this.N_6).get(var1);
         if (class12009x != null) {
            return class12009x;
         }
      }

      int i = GL31.glGetUniformBlockIndex((Integer)super.y_0, var1);
      if (i == -1) {
         throw new IllegalArgumentException("Uniform block was not found or is inactive: " + var1 + " in " + (String)this.N_0 + ", " + (String)this.N_1);
      } else {
         GL31.glUniformBlockBinding((Integer)super.y_0, i, var2);
         class12009 class12009x = new class12009(i, var2);
         ((Object2ObjectOpenHashMap)this.N_6).put(var1, class12009x);
         return class12009x;
      }
   }

   public boolean N(Object var1) {
      return var1 instanceof class09322;
   }

   private <T extends class12004> T N(String var1, IntFunction<T> var2, class09353 var3) {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_4 == null) {
         this.N_4 = new Object2ObjectOpenHashMap();
      } else {
         class12004 class12004x = (class12004)((Object2ObjectOpenHashMap)this.N_4).get(var1);
         if (class12004x != null) {
            return (T)class12004x;
         }
      }

      int i = GL31.glGetUniformLocation((Integer)super.y_0, var1);
      if (i < 0 && !var1.endsWith("[0]")) {
         i = GL31.glGetUniformLocation((Integer)super.y_0, var1 + "[0]");
      }

      if (i < 0) {
         throw new IllegalArgumentException("Uniform was not found or is inactive: " + var1 + " in " + (String)this.N_0 + ", " + (String)this.N_1);
      } else {
         if (((class09337)this.N_3).N()) {
            this.N(var1, var3);
         }

         class12004 class12004x = (class12004)var2.apply(i);
         ((Object2ObjectOpenHashMap)this.N_4).put(var1, class12004x);
         return (T)class12004x;
      }
   }

   private void N(String var1, class09353 var2) {
      this.E();
      class09307 class09307 = (class09307)this.s().get(Y(var1));
      if (class09307 != null) {
         if (!var2.N(class09307.N(), class09307.y(), var1.endsWith("]"))) {
            throw new IllegalArgumentException(
               "Uniform type mismatch: "
                  + var1
                  + " in "
                  + (String)this.N_0
                  + ", "
                  + (String)this.N_1
                  + ". Expected "
                  + var2.N()
                  + ", actual "
                  + y(class09307.N())
                  + (class09307.y() > 1 ? "[" + class09307.y() + "]" : "")
            );
         }
      }
   }

   private int N(int var1, String var2) {
      this.E();
      String s = ((class09337)this.N_3).N(var1, var2, this.m(var2));
      int i = GL31.glCreateShader(var1);
      GL31.glShaderSource(i, s);
      GL31.glCompileShader(i);
      if (GL31.glGetShaderi(i, 35713) == 0) {
         String s1 = GL31.glGetShaderInfoLog(i);
         GL31.glDeleteShader(i);
         throw new IllegalStateException("Shader compile failed: " + var2 + ". " + s1);
      } else {
         return i;
      }
   }

   public class12043 N(String var1) {
      return this.N(var1, class12043::new, class09353.VEC4);
   }

   public class09337 N() {
      this.E();
      return (class09337)this.N_3;
   }

   private void W() {
      int i = GL31.glGetProgrami((Integer)super.y_0, 35717);
      if (i > 0) {
         IntBuffer intbuffer = BufferUtils.createIntBuffer(1);
         IntBuffer intbuffer1 = BufferUtils.createIntBuffer(i);
         GL31.glGetAttachedShaders((Integer)super.y_0, intbuffer, intbuffer1);

         for (int j = 0; j < intbuffer.get(0); j++) {
            GL31.glDetachShader((Integer)super.y_0, intbuffer1.get(j));
         }
      }
   }

   public String R() {
      this.E();
      return (String)this.N_1;
   }

   public class11993 R(String var1) {
      return this.N(var1, class11993::new, class09353.VEC2);
   }

   private static String Y(String var0) {
      int i = var0.indexOf(91);
      return i >= 0 ? var0.substring(0, i) : var0;
   }
}
