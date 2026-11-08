package NurikWare;

import org.joml.Matrix4f;
import org.joml.Vector2fc;
import org.joml.Vector4fc;

public class class11176 {
   public static Object N_0;
   public static Object N_1;

   private class11176() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
   }

   public static void y(class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      N(var0, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 1.0F, 1.0F, var7);
   }

   private static void y() {
      N_0 = 4;
      N_1 = -1442182646;
   }

   public static void y(class11213 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      N(var0, (Matrix4f)class11925.y_3, var1, var2, var3, var4, var5, 0.0F, 0.0F, 1.0F, 1.0F, var6);
   }

   public static void N(
      class11213 var0,
      Vector2fc var1,
      Vector2fc var2,
      Vector2fc var3,
      Vector2fc var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      float var13,
      int var14,
      int var15,
      Vector4fc var16,
      Vector4fc var17,
      int var18
   ) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13, 0.0F, var12, 0, var14, var15, var16, var17, var18);
   }

   public static void N(class11213 var0, Matrix4f var1, float var2, float var3, float var4, int var5) {
      N(var0, (class09087)class09063.N_0);
      var2 = (float)Math.floor(var2) + 0.5F;
      var3 = (float)Math.floor(var3) + 0.5F;
      float f = var4 / 2.0F;
      class11184 class11184 = var0.M();
      int i = class11184.i();
      class11184.N(var1, var2, var3 - f, 0.0F).y(var5).y();
      class11184.N(var1, var2 + f, var3, 0.0F).y(var5).y();
      class11184.N(var1, var2, var3 + f, 0.0F).y(var5).y();
      class11184.N(var1, var2 - f, var3, 0.0F).y(var5).y();
      var0.N().y(i);
   }

   public static void N(class11213 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      N(var0, (Matrix4f)class11925.y_3, var1, var2, 0.0F, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void N(
      class11213 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      N(var0, (class09087)class09063.N_4);
      var0.M().N(var1).N(var2).N(var3).N(var4).N(var5).N(var6).N(var8).N(var9).N(var7).y(var10).y(var11).y();
   }

   public static void N(class11213 var0, float var1, float var2, float var3, float var4, int var5) {
      N(var0, (Matrix4f)class11925.y_3, var1, var2, var3, var4, var5, var5);
   }

   public static void N(class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      N(var0, (class09087)class09063.N_0);
      class11184 class11184 = var0.M();
      int i = class11184.i();
      class11184.N(var1, var2 + var4, var3, 0.0F).y(var6).y();
      class11184.N(var1, var2, var3, 0.0F).y(var6).y();
      class11184.N(var1, var2, var3 + var5, 0.0F).y(var7).y();
      class11184.N(var1, var2 + var4, var3 + var5, 0.0F).y(var7).y();
      var0.N().y(i);
   }

   public static void N(
      class11213 var0,
      Vector2fc var1,
      Vector2fc var2,
      Vector2fc var3,
      Vector2fc var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15,
      int var16,
      int var17,
      Vector4fc var18,
      Vector4fc var19,
      int var20
   ) {
      N(var0, (class09087)class09063.N_5);
      var0.M()
         .N(var1.x())
         .N(var1.y())
         .N(var2.x() - var1.x())
         .N(var2.y() - var1.y())
         .N(var4.x() - var1.x())
         .N(var4.y() - var1.y())
         .y(var5)
         .N(var6)
         .N(var7)
         .N(var8)
         .N(var9)
         .N(var10)
         .N(var11)
         .N(var12)
         .N(var13)
         .y(var14)
         .y(var15)
         .N(var16)
         .N(var17)
         .N(var20)
         .N(var18.x())
         .N(var18.y())
         .N(var18.z())
         .N(var18.w())
         .N(var19.x())
         .N(var19.y())
         .N(var19.z())
         .N(var19.w())
         .y();
   }

   public static void N(class09093 var0, String var1, int var2, float var3, float var4) {
      float f = var2;
      float f1 = var0.N(f, class09079.REGULAR, false);
      float f2 = var0.y(var1, f, class09079.REGULAR, false) + 8.0F;
      float f3 = f1 + 8.0F;
      float f4 = var3 - f2 / 2.0F;
      float f5 = var4 - f3 / 2.0F;
      var0.y(var1).N(f4 + 4.0F, f5 + (f3 - f1) / 2.0F).N(f).N(class09079.REGULAR).i(-1).y(-1442182646).u(4.0F).L();
   }

   public static void N(
      class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      N(var0, (class09087)class09063.N_2);
      class11184 class11184 = var0.M();
      int i = class11184.i();
      class11184.N(var1, var2 + var5, var3, var4).N(var9, var8).y(var11).y();
      class11184.N(var1, var2, var3, var4).N(var7, var8).y(var11).y();
      class11184.N(var1, var2, var3 + var6, var4).N(var7, var10).y(var11).y();
      class11184.N(var1, var2 + var5, var3 + var6, var4).N(var9, var10).y(var11).y();
      var0.N().y(i);
   }

   public static void N(class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      N(var0, var1, var2, var3, var4, var5, var6, 0.0F, 1.0F, 1.0F, 0.0F, var7);
   }

   public static void N(class11213 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      N(var0, (Matrix4f)class11925.y_3, var1, var2, var3, var4, var5, 0.0F, 1.0F, 1.0F, 0.0F, var6);
   }

   public static void N(class09093 var0, String var1, float var2, float var3, float var4, int var5, int var6) {
      var0.y(var1).N(var2 + 1.0F, var3 + 1.0F).N(var4).N(class09079.REGULAR).i(var6).L();
      var0.y(var1).N(var2, var3).N(var4).N(class09079.REGULAR).i(var5).L();
   }

   public static void N(
      class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      N(var0, var1, var2, var3, 0.0F, var4, var5, var6, var7, var8, var9, var10);
   }

   private static void N(class11213 var0, class09087 var1) {
      if (var0.R() != var1) {
         throw new IllegalStateException("mismatch format");
      }
   }

   public static void N(class11213 var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6) {
      N(var0, var1, var2, var3, var4, var5, var6, var6);
   }
}
