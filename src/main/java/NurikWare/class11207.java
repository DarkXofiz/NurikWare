package NurikWare;

import minecraft.class06889;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class class11207 {
   private static String[] B;

   private class11207() {
      super();
      throw new UnsupportedOperationException(B[1]);
   }

   static {
      y();
   }

   private static void y() {
      B = new String[2];
      B[0] = "mismatch format";
      B[1] = "This is a utility class and cannot be instantiated";
   }

   public static void N(class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, float var10) {
      N(var0, (class09087)class09063.N_1);
      var0.M().N(var1, var2, var3, var4).N(var1, var5, var6, var7).y(var8).y(var9).N(var10).y();
   }

   private static void N(class11213 var0, class09087 var1) {
      if (var0.R() != var1) {
         throw new IllegalStateException(B[0]);
      }
   }

   public static void N(Matrix4fStack var0, class11213 var1, class11213 var2, class06889 var3, class11884 var4, int var5) {
      N(var1, (class09087)class09063.N_1);
      float f = (float)(var4.i() - var3.M);
      float f1 = (float)(var4.M() - var3.B);
      float f2 = (float)(var4.R() - var3.Z);
      float f3 = (float)(var4.N() - var3.M);
      float f4 = (float)(var4.y() - var3.B);
      float f5 = (float)(var4.u() - var3.Z);
      N(var0, var2, f, f1, f2, f3, f4, f5, class11300.N(var5, (int)(class11300.y(var5) * 0.196F * 2.0F)));
      int i = class11300.N(var5, 0.7F);
      N(var1, var0, f, f1, f2, f, f1, f5, i, i, 1.0F);
      N(var1, var0, f, f1, f5, f3, f1, f5, i, i, 1.0F);
      N(var1, var0, f3, f1, f5, f3, f1, f2, i, i, 1.0F);
      N(var1, var0, f3, f1, f2, f, f1, f2, i, i, 1.0F);
      N(var1, var0, f, f4, f2, f, f4, f5, i, i, 1.0F);
      N(var1, var0, f, f4, f5, f3, f4, f5, i, i, 1.0F);
      N(var1, var0, f3, f4, f5, f3, f4, f2, i, i, 1.0F);
      N(var1, var0, f3, f4, f2, f, f4, f2, i, i, 1.0F);
      N(var1, var0, f, f1, f2, f, f4, f2, i, i, 1.0F);
      N(var1, var0, f, f1, f5, f, f4, f5, i, i, 1.0F);
      N(var1, var0, f3, f1, f5, f3, f4, f5, i, i, 1.0F);
      N(var1, var0, f3, f1, f2, f3, f4, f2, i, i, 1.0F);
   }

   public static void N(Matrix4f var0, class11213 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      N(var1, (class09087)class09063.N_0);
      class11184 class11184 = var1.M();
      int i = class11184.i();
      class11184.N(var0, var2, var3, var4).y(var8).y();
      class11184.N(var0, var2, var3, var7).y(var8).y();
      class11184.N(var0, var5, var3, var7).y(var8).y();
      class11184.N(var0, var5, var3, var4).y(var8).y();
      class11184.N(var0, var2, var6, var4).y(var8).y();
      class11184.N(var0, var2, var6, var7).y(var8).y();
      class11184.N(var0, var5, var6, var7).y(var8).y();
      class11184.N(var0, var5, var6, var4).y(var8).y();
      class11178 class11178 = var1.N();
      class11178.N(i);
      class11178.N(i + 1);
      class11178.N(i + 2);
      class11178.N(i);
      class11178.N(i + 2);
      class11178.N(i + 3);
      class11178.N(i + 4);
      class11178.N(i + 7);
      class11178.N(i + 6);
      class11178.N(i + 4);
      class11178.N(i + 6);
      class11178.N(i + 5);
      class11178.N(i);
      class11178.N(i + 4);
      class11178.N(i + 5);
      class11178.N(i);
      class11178.N(i + 5);
      class11178.N(i + 1);
      class11178.N(i + 3);
      class11178.N(i + 2);
      class11178.N(i + 6);
      class11178.N(i + 3);
      class11178.N(i + 6);
      class11178.N(i + 7);
      class11178.N(i);
      class11178.N(i + 3);
      class11178.N(i + 7);
      class11178.N(i);
      class11178.N(i + 7);
      class11178.N(i + 4);
      class11178.N(i + 1);
      class11178.N(i + 5);
      class11178.N(i + 6);
      class11178.N(i + 1);
      class11178.N(i + 6);
      class11178.N(i + 2);
   }
}
