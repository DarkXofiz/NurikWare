package NurikWare;

import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public enum class11169 {
   FLOAT("FLOAT", "float", false),
   INT("INT", "int", false),
   BOOL("BOOL", "bool", false),
   VEC2("VEC2", "vec2", false),
   VEC3("VEC3", "vec3", false),
   VEC4("VEC4", "vec4", false),
   FLOAT_ARRAY("FLOAT_ARRAY", "float", true);

   public String fields_07f967a3f78943be5b7036c4e47452c9b_0;
   public String fields_07f967a3f78943be5b7036c4e47452c9b_1;
   public Boolean fields_07f967a3f78943be5b7036c4e47452c9b_2;
   public boolean fields_07f967a3f78943be5b7036c4e47452c9b_init;

   private static boolean L(Object var0) {
      if (var0 instanceof Boolean obool) {
         return obool;
      } else {
         if (var0 instanceof Number number) {
            int i = y(number);
            if (i == 0 || i == 1) {
               return i == 1;
            }
         }

         throw new IllegalArgumentException("Expected boolean or 0/1 number, got " + i(var0));
      }
   }

   private static void L() {
   }

   private class11169(String var3, String var4, boolean var5) {
      this.u();
      this.fields_07f967a3f78943be5b7036c4e47452c9b_0 = var3;
      this.fields_07f967a3f78943be5b7036c4e47452c9b_1 = var4;
      this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = var5;
   }

   static {
      L();
   }

   private static String i(Object var0) {
      return var0 == null ? "null" : var0.getClass().getName();
   }

   private void u() {
      if (!this.fields_07f967a3f78943be5b7036c4e47452c9b_init) {
         this.fields_07f967a3f78943be5b7036c4e47452c9b_init = true;
         this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = false;
      }
   }

   private static Number u(Object var0) {
      if (var0 instanceof Number) {
         return (Number)var0;
      } else {
         throw new IllegalArgumentException("Expected number, got " + i(var0));
      }
   }

   private static int y(Object var0) {
      Number number = u(var0);
      double d0 = number.doubleValue();
      int i = number.intValue();
      if (d0 != i) {
         throw new IllegalArgumentException("Expected integer number, got " + var0);
      } else {
         return i;
      }
   }

   public String y() {
      return this.fields_07f967a3f78943be5b7036c4e47452c9b_0;
   }

   private static String y(Object var0, int var1) {
      StringBuilder stringbuilder = new StringBuilder();
      N(stringbuilder, var0, var1);
      return stringbuilder.toString();
   }

   private static String y(String var0, Object var1, int var2) {
      float[] afloat = N(var1, var2);
      StringBuilder stringbuilder = new StringBuilder(var0).append('(');

      for (int i = 0; i < var2; i++) {
         if (i > 0) {
            stringbuilder.append(", ");
         }

         stringbuilder.append(N(afloat[i]));
      }

      return stringbuilder.append(')').toString();
   }

   private static void N(StringBuilder var0, Object var1, int var2) {
      if (var1 instanceof FloatBuffer floatbuffer) {
         int l = floatbuffer.limit();
         if (l != var2) {
            throw new IllegalArgumentException("Expected float buffer with limit " + var2 + ", got " + l);
         } else {
            for (int i1 = 0; i1 < var2; i1++) {
               N(var0, i1, floatbuffer.get(i1));
            }
         }
      } else if (var1 instanceof float[] afloat) {
         if (afloat.length != var2) {
            throw new IllegalArgumentException("Expected float array length " + var2 + ", got " + afloat.length);
         } else {
            for (int k = 0; k < var2; k++) {
               N(var0, k, afloat[k]);
            }
         }
      } else if (var1 instanceof double[] adouble) {
         if (adouble.length != var2) {
            throw new IllegalArgumentException("Expected double array length " + var2 + ", got " + adouble.length);
         } else {
            for (int j = 0; j < var2; j++) {
               N(var0, j, (float)adouble[j]);
            }
         }
      } else if (!(var1 instanceof Collection collection)) {
         throw new IllegalArgumentException("Expected float array, FloatBuffer, double array or number collection, got " + i(var1));
      } else if (collection.size() != var2) {
         throw new IllegalArgumentException("Expected collection size " + var2 + ", got " + collection.size());
      } else {
         int i = 0;

         for (Object object : collection) {
            N(var0, i++, u(object).floatValue());
         }
      }
   }

   private static void N(StringBuilder var0, int var1, float var2) {
      if (var1 > 0) {
         var0.append(", ");
      }

      var0.append(N(var2));
   }

   public String N(String var1, int var2) {
      if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2) {
         if (var2 <= 0) {
            throw new IllegalArgumentException("Array template uniform needs a positive size: " + var1);
         } else {
            return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + var1 + "[" + var2 + "];";
         }
      } else {
         return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + var1 + ";";
      }
   }

   public String N(Object var1) {
      return switch (this) {
         case FLOAT -> N(u(var1));
         case INT -> Integer.toString(y(var1));
         case BOOL -> L(var1) ? "1" : "0";
         case VEC2 -> y("vec2", var1, 2);
         case VEC3 -> y("vec3", var1, 3);
         case VEC4 -> y("vec4", var1, 4);
         case FLOAT_ARRAY -> throw new IllegalArgumentException("FLOAT_ARRAY needs defineDeclaration with array size");
      };
   }

   private static String N(Number var0) {
      return N(var0.floatValue());
   }

   public boolean N() {
      return this.fields_07f967a3f78943be5b7036c4e47452c9b_2;
   }

   public String N(String var1, Object var2, int var3) {
      if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2) {
         if (var3 <= 0) {
            throw new IllegalArgumentException("Array template define needs a positive size: " + var1);
         } else {
            return "const "
               + this.fields_07f967a3f78943be5b7036c4e47452c9b_1
               + " "
               + var1
               + "["
               + var3
               + "] = "
               + this.fields_07f967a3f78943be5b7036c4e47452c9b_1
               + "["
               + var3
               + "]("
               + y(var2, var3)
               + ");";
         }
      } else {
         return "#define " + var1 + " " + this.N(var2);
      }
   }

   private static String N(float var0) {
      if (!Float.isFinite(var0)) {
         throw new IllegalArgumentException("GLSL float literal must be finite: " + var0);
      } else {
         String s = String.format(Locale.ROOT, "%s", var0);
         return s.indexOf(46) < 0 && s.indexOf(69) < 0 && s.indexOf(101) < 0 ? s + ".0" : s;
      }
   }

   private static float[] N(Object var0, int var1) {
      if (var0 instanceof Vector2fc vector2fc && var1 == 2) {
         return new float[]{vector2fc.x(), vector2fc.y()};
      } else if (var0 instanceof Vector3fc vector3fc && var1 == 3) {
         return new float[]{vector3fc.x(), vector3fc.y(), vector3fc.z()};
      } else if (var0 instanceof Vector4fc vector4fc && var1 == 4) {
         return new float[]{vector4fc.x(), vector4fc.y(), vector4fc.z(), vector4fc.w()};
      } else if (var0 instanceof float[] afloat1 && afloat1.length == var1) {
         return (float[])afloat1.clone();
      } else if (var0 instanceof double[] adouble && adouble.length == var1) {
         float[] afloat2 = new float[var1];

         for (int j = 0; j < var1; j++) {
            afloat2[j] = (float)adouble[j];
         }

         return afloat2;
      } else if (var0 instanceof Collection collection && collection.size() == var1) {
         float[] afloat = new float[var1];
         Iterator iterator = collection.iterator();

         for (int i = 0; i < var1; i++) {
            afloat[i] = u(iterator.next()).floatValue();
         }

         return afloat;
      } else {
         throw new IllegalArgumentException("Expected " + var1 + " float values, got " + i(var0));
      }
   }

   public static class11169 N(String var0) {
      for (class11169 class11169 : values()) {
         if (class11169.fields_07f967a3f78943be5b7036c4e47452c9b_0.equals(var0)) {
            return class11169;
         }
      }

      throw new IllegalArgumentException("Unknown shader template marker type: " + var0);
   }
}
