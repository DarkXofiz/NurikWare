package NurikWare;

import minecraft.class04995;

public class class09129 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class09129() {
      super();
      this.R();
   }

   private float y(boolean var1) {
      return var1 ? (Float)this.N_0 : (Float)this.N_1;
   }

   private void y(boolean var1, float var2) {
      if (var1) {
         this.N_0 = var2;
      } else {
         this.N_1 = var2;
      }
   }

   private float N(boolean var1) {
      return var1 ? (Float)this.N_2 : (Float)this.N_3;
   }

   private float N(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float f = var3 ? 1.0F : 0.62F;
      float f1 = var4 ? 7.4F : (var5 ? 1.85F : 3.25F);
      float f2 = var4 ? 0.58F : (var5 ? 0.24F : 0.36F);
      return var1 * f * f1 + Math.abs(var2) * f2;
   }

   public void N() {
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 0.0F;
   }

   private void N(boolean var1, float var2) {
      if (var1) {
         this.N_2 = var2;
      } else {
         this.N_3 = var2;
      }
   }

   private float N(float var1, float var2, double var3, float var5, boolean var6, boolean var7, boolean var8) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float f3 = Math.signum(var1);
         float f4 = this.N(var6);
         if (Math.signum(f4) != f3) {
            f4 = 0.0F;
            this.y(var6, 0.0F);
         }

         float f;
         float f1;
         float f2;
         if (Math.abs(f2 = f4 + class04995.N((f1 = f3 * Math.min(Math.abs(var2), Math.abs(var1))) - f4, -(f = this.N(var5, f1, var6, var7, var8)), f))
            > Math.abs(var1)) {
            f2 = var1;
         }

         float f5 = this.N(f2, var1, var3, var5, var6, var7);
         this.N(var6, f5);
         return f5;
      } else {
         this.N(var6, this.N(var6) * 0.35F);
         this.y(var6, this.y(var6) * 0.45F);
         return 0.0F;
      }
   }

   private float N(float var1, float var2, double var3, float var5, boolean var6, boolean var7) {
      if (var3 <= 1.0E-5) {
         return var1;
      } else {
         float f = var1 + this.y(var6);
         if (Math.abs(f) <= 1.0E-4F) {
            return 0.0F;
         } else {
            float f1 = Math.signum(f);
            int i = Math.round(Math.abs(f) / (float)var3);
            boolean flag = Math.signum(var2) == f1 && Math.abs(var2) > var5 * (var7 ? 0.62F : 1.08F) && Math.abs(var1) > var5 * 0.48F;
            if (i == 0 && flag) {
               i = 1;
            }

            if (i == 0) {
               this.y(var6, class04995.N(f, -var5 * 1.35F, var5 * 1.35F));
               return 0.0F;
            } else {
               float f2 = f1 * i * (float)var3;
               if (Math.signum(var2) == f1 && Math.abs(f2) > Math.abs(var2) && Math.abs(var2) > var5 * 0.65F) {
                  f2 = var2;
               }

               this.y(var6, class04995.N(f - f2, -var5 * 1.65F, var5 * 1.65F));
               return f2;
            }
         }
      }
   }

   public class09130 N(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8, boolean var9) {
      float f = (float)Math.max(var5, 0.035F);
      float f1 = this.N(var1, var3, var5, f, true, var8, var9);
      float f2 = var7 ? 0.0F : this.N(var2, var4, var5, f, false, var8, var9);
      return new class09130(f1, f2);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
      }
   }
}
