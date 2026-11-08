package NurikWare;

import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07438;

public class class11055 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;

   private void L(long var1) {
      float f = Math.random() > 0.5 ? 1.0F : -1.0F;
      float f1 = Math.random() > 0.5 ? 1.0F : -1.0F;
      boolean flag = Math.random() < 0.16;
      this.y_0 = f * class09139.N(flag ? 0.72 : 0.32, flag ? 1.45 : 0.92);
      this.N_3 = f1 * class09139.N(0.12, flag ? 0.82 : 0.48);
      this.y_1 = class09139.N(0.82, flag ? 1.32 : 1.12);
      this.y_2 = class09139.N(0.0, Math.PI * 2);
      this.y_3 = f * class09139.N(flag ? 0.08 : 0.035, flag ? 0.28 : 0.14);
      this.N_1 = var1;
      this.N_2 = var1 + (long)class09139.N(flag ? 135.0 : 110.0, flag ? 265.0 : 225.0);
      this.N_0 = var1 + (long)class09139.N(flag ? 720.0 : 560.0, flag ? 1750.0 : 1350.0);
      this.y_4 = true;
   }

   public class11055() {
      super();
      this.B();
      this.y_1 = 1.0F;
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = false;
      }
   }

   private boolean y(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if (var5 && !var6 && !var7 && !var8) {
         long i = var1.y().y();
         if (i >= 42L && i <= 500L) {
            float f1 = Math.abs(class09170.N(var3.y(), var4.y()));
            float f2 = Math.abs(var4.R() - var3.R());
            if (!(f1 > 4.5F) && !(f2 > 2.35F)) {
               if (((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y(var2)) > var1.N(var2) + 0.9F) {
                  return false;
               } else {
                  float f = i < 180L ? 0.055F : 0.09F;
                  if (f1 < 1.7F && f2 < 0.65F) {
                     f += 0.025F;
                  }

                  return Math.random() < f;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public class11086 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      long i = System.currentTimeMillis();
      if (this.N(var1, var6, var7)) {
         this.y_4 = false;
      }

      if (i >= (Long)this.N_2) {
         this.y_4 = false;
      }

      if (!(Boolean)this.y_4 && i >= (Long)this.N_0 && this.y(var1, var2, var3, var4, var5, var6, var7, var8)) {
         this.L(i);
      }

      if (!(Boolean)this.y_4) {
         return class11086.u();
      } else {
         float f = class04995.N((float)(i - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
         float f1 = (float)Math.sin(f * Math.PI);
         float f2 = 1.0F + (float)Math.sin(f * Math.PI * 2.0 + ((Float)this.y_2).floatValue()) * 0.18F;
         float f3 = class04995.N((float)Math.pow(f1, ((Float)this.y_1).floatValue()) * f2, 0.0F, 1.0F);
         float f4 = (Float)this.N_3 * f3;
         float f5 = (Float)this.y_0 * f3 + (float)Math.sin(f * Math.PI * 3.35F + ((Float)this.y_2).floatValue()) * (Float)this.y_3 * f3;
         boolean flag = f3 > 0.18F;
         return new class11086(true, f4, f5, flag);
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.y_0 = 0.0F;
      this.y_1 = 1.0F;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = false;
   }

   private boolean N(class11087 var1, boolean var2, boolean var3) {
      return var2 || var3 || var1.y().y() > 530L;
   }
}
