package NurikWare;

import java.util.List;
import org.joml.Vector4f;

public class class11617 {
   private static String[] L;
   private static String[] R;
   private static String[] v;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3 = List.of();
   public static Object N_4 = List.of();
   public static Object y_0;
   public static Object y_1;
   public static Object y_2 = class11213.N((class09087)class09063.N_6, 65536);
   public static Object y_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_2).N(4).N()).N((class11213)y_2).N(6).N();
   public static Object y_4 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_3).N(4).N()).N((class11213)y_2).N(6).N();

   private class11617() {
      super();
   }

   static {
      N();
      u();
      y();
   }

   private static void i() {
      if ((Integer)N_0 != 0 && ((class11213)y_2).M().i() != 0) {
         int i = Math.min(Math.min(((List)N_3).size(), ((List)N_4).size()), 64);
         boolean flag = i > 1;
         (flag ? (class11174)y_4 : (class11174)y_3).y(var2 -> {
            var2.z(R[0]).N(class11925.L());
            var2.M(R[1]).N((Integer)N_0);
            var2.i(v[0]).N((Float)N_1);
            var2.i(v[1]).N((Float)N_2);
            var2.N(L[0]).N(1.0F, 1.0F, 1.0F, 1.0F);
            var2.N(L[1]).N(1.0F, 1.0F, 1.0F, 0.0F);
            if (!flag) {
               if (i == 1) {
                  Vector4f vector4f2 = (Vector4f)((List)N_3).getFirst();
                  Vector4f vector4f3 = (Vector4f)((List)N_4).getFirst();
                  var2.L(L[2]).N(1);
                  var2.N(L[3]).N(vector4f2.x(), vector4f2.y(), vector4f2.z(), vector4f2.w());
                  var2.N(L[4]).N(vector4f3.x(), vector4f3.y(), vector4f3.z(), vector4f3.w());
               } else {
                  var2.L(L[5]).N(0);
               }
            } else {
               var2.L(L[6]).N(i);
               var2.L(L[7]).N(0);

               for (int j = 0; j < i; j++) {
                  Vector4f vector4f = (Vector4f)((List)N_3).get(j);
                  Vector4f vector4f1 = (Vector4f)((List)N_4).get(j);
                  var2.N("u_clip_rects[" + j + "]").N(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
                  var2.N("u_clip_rounds[" + j + "]").N(vector4f1.x(), vector4f1.y(), vector4f1.z(), vector4f1.w());
               }
            }
         });
      }
   }

   private static void u() {
      R = new String[2];
      R[0] = "u_projection";
      R[1] = "texture_in";
      v = new String[2];
      v[0] = "u_mask_start";
      v[1] = "u_mask_end";
      L = new String[8];
      L[0] = "u_mask_start_color";
      L[1] = "u_mask_end_color";
      L[2] = "u_clip_flags";
      L[3] = "u_clip_rect";
      L[4] = "u_clip_round";
      L[5] = "u_clip_flags";
      L[6] = "u_clip_count";
      L[7] = "u_clip_flags";
   }

   private static void y() {
      y_0 = 64;
      y_1 = 1;
      N_0 = 0;
      N_1 = 0.0F;
      N_2 = 0.0F;
   }

   private static void y(class09093 var0, class09084 var1) {
      int i = var0.u(var1.j());
      if ((Integer)N_0 != 0 && (Integer)N_0 != i) {
         i();
      }

      N_0 = i;
      float f = var1.y() / Math.max(1, var1.M());
      float f1 = var1.y() / Math.max(1, var1.W());
      ((class11213)y_2).M().N(var1.m()).N(var1.b()).N(var1.s()).N(var1.N()).N(var1.L()).N(var1.z()).N(var1.i()).N(var1.R()).y(var1.Z()).N(f).N(f1).y(0).y();
   }

   public static void N(
      String var0, int var1, float var2, class09079 var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      class09093 class09093 = class09080.u();
      if (class09093 != null && var0 != null && !var0.isEmpty()) {
         float f = var10 / Math.max(1.0F, var4);
         float f1 = Math.max(1.0F, (float)Math.round(var2 * f));
         float f2 = class09093.N(f1, var3, false);
         float f3 = Math.round(var8 + var5 * f);
         float f4 = Math.round(var9 + (var11 - f2) / 2.0F);
         N_1 = var8 + var6 * f;
         N_2 = var8 + var7 * f;
         class11635 class11635 = class11620.y();
         N_3 = class11635.N();
         N_4 = class11635.y();
         N_0 = 0;
         class09093.u();
         class09093.N(var0, f3, f4, f1, 1.0F, var3, false, var1, var1x -> y(class09093, var1x));
         i();
         N_3 = List.of();
         N_4 = List.of();
      }
   }

   private static void N() {
   }
}
