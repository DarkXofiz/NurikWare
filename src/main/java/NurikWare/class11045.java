package NurikWare;

import minecraft.class01054;
import minecraft.class02834;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class class11045<T extends class07438> extends class11051<T> {
   public class11045(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public void y(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      float f = ((EntityESP)super.N_0).m().i();
      float f1 = (f - 4.0F) / 4.0F;
      float f2 = var2.N(f, class09079.REGULAR, false) + f1 * 2.0F;
      float f3 = var3.x() + (var3.z() - var3.x()) * 0.5F;
      float f4 = var3.w() + f1 + 1.0F;

      for (class06584 class06584 : new class06584[]{var4.method_6047(), var4.method_6079()}) {
         if (!class06584.R()) {
            class05216 class05216 = this.N(class06584);
            float f5 = var2.y(class05216, f, class09079.REGULAR, false);
            var2.y(class05216).N(f3 - f5 / 2.0F, f4).N(f).y(this.u((T)var4)).u(f1).N(class09079.REGULAR).i(this.y((T)var4)).L();
            f4 += f2;
         }
      }

      var3.w = f4;
   }

   public class05216 L(T var1) {
      return super.L((T)var1).i(" ").i(class06541.field_1080 + "[" + class06541.field_1061 + Math.round(var1.method_6032()) + class06541.field_1080 + "]");
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5, int var6) {
      float f = var3.x;
      float f1 = var3.y;
      float f2 = var3.w - f1;
      int i = -1291187702;
      float f3 = var4.method_6032();
      float f4 = class04995.N(f3 / Math.max(var4.method_6063(), f3), 0.0F, 1.0F);
      float f5 = f4 * f2;
      int j = class11300.N(var6, var5, f4);
      class11174 class11174 = (class11174)class11190.y_3;
      class11176.N(class11174.u(), f - 5.0F, f1 - 1.0F, 3.0F, f2 + 2.0F, i);
      class11176.N(class11174.u(), (Matrix4f)class11925.y_3, f - 4.0F, f1 + f2 - f5, 1.0F, f5, j, var6);
      if (!((class11535)((EntityESP)super.N_0).L_2).U()) {
         var3.y = Math.round(var3.y - 4.0F);
      }
   }

   private class05216 N(class06584 var1) {
      class05216 class05216 = var1.d().L();
      return var1.c() <= 1 ? class05216 : class05216.i(class06541.field_1080 + " x" + var1.c());
   }

   public void L(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      int i = (Integer)((class11007)((class11517)((EntityESP)super.N_0).B_2).i()).N_0;
      int j = 0;
      boolean flag = false;

      for (class02834 class02834 : new class02834[]{class02834.field_49224, class02834.field_49219}) {
         for (class07085 class07085 : class02834.N()) {
            if (class07085.N() == class07043.field_6178 || class07085.N() == class07043.field_6177) {
               class06584 class06584x = var4.method_6118(class07085);
               if (!class06584x.R()) {
                  j += 16 * i;
                  flag = true;
               }
            }
         }
      }

      if (flag) {
         float f1 = var3.x();
         float f2 = var3.y();
         float f3 = var3.z();
         float f4 = f1 + (f3 - f1) * 0.5F;
         float f5 = Math.round(f4 - j / 2.0F);
         float f6 = ((EntityESP)super.N_0).m().i();
         float f7 = (f6 - 4.0F) / 4.0F;
         int k = 20 * i;
         float f = Math.round(f2 - f7 - (k - 4));
         class11176.N(((class11174)class11190.y_3).u(), f5 - 2.0F, f - 1.0F, j + 4, k - 3, this.u((T)var4));
         j = 0;
         class02834[] aclass02834 = new class02834[]{class02834.field_49224, class02834.field_49219};
         int l = aclass02834.length;

         for (int i1 = 0; i1 < l; i1++) {
            for (class07085 class07085x : aclass02834[i1].N()) {
               if (class07085x.N() == class07043.field_6178 || class07085x.N() == class07043.field_6177) {
                  class06584 class06584 = var4.method_6118(class07085x);
                  if (!class06584.R()) {
                     class11938.k().N(class06584, f5 + j, f, 16 * i);
                     j += 16 * i;
                  }
               }
            }
         }
      }
   }

   public boolean test(class07049 var1) {
      return var1 instanceof class07438;
   }
}
