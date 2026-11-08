package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class11081 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public class11081() {
      super();
      this.y();
      this.N_5 = class11060.IDLE;
   }

   private float y(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 2.25);
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.N_4 = 0.0F;
      this.N_5 = class11060.IDLE;
   }

   private boolean N(class11499 var1, class11499 var2) {
      float f = Math.abs(class09170.N(var1.y(), var2.y()));
      float f1 = Math.abs(var2.R() - var1.R());
      return !(f > 2.6F) && !(f1 > 1.3F) ? Math.random() < 0.42 : false;
   }

   private float N(float var1) {
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private void N(long var1) {
      this.N_5 = class11060.IDLE;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.N_4 = 0.0F;
      if (var1 >= (Long)this.N_0) {
         this.N_0 = var1 + (long)class09139.N(220.0, 520.0);
      }
   }

   public class11096 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      long i = System.currentTimeMillis();
      if (var5 && !var7 && (!var6 || !var8)) {
         if ((class11060)this.N_5 == class11060.IDLE && i >= (Long)this.N_0 && this.N(var3, var4)) {
            this.N(i, var3, var4);
         }

         if ((class11060)this.N_5 == class11060.IDLE) {
            return new class11096(var4, false);
         } else {
            float f = class04995.N((float)(i - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2), 0.0F, 1.0F);
            if (f >= 1.0F) {
               if ((class11060)this.N_5 != class11060.OUT) {
                  this.N(i);
                  return new class11096(var4, false);
               }

               this.N_5 = class11060.RETURN;
               this.N_1 = i;
               this.N_2 = (long)class09139.N(95.0, 185.0);
               f = 0.0F;
            }

            float f1 = (class11060)this.N_5 == class11060.OUT ? this.y(f) : 1.0F - this.N(f);
            class11499 class11499 = new class11499(var4.y() + (Float)this.N_3 * f1, class04995.N(var4.R() + (Float)this.N_4 * f1, -90.0F, 90.0F));
            return new class11096(class11499, true);
         }
      } else {
         this.N(i);
         return new class11096(var4, false);
      }
   }

   private void N(long var1, class11499 var3, class11499 var4) {
      float f = class09170.N(var3.y(), var4.y());
      float f1 = Math.abs(f) > 0.12F ? Math.signum(f) : (Math.random() > 0.5 ? 1.0F : -1.0F);
      this.N_3 = f1 * class09139.N(1.35, 4.65) + (float)(Math.random() * 8.1371E-4);
      this.N_4 = class09139.N(-0.52, 0.52) + (float)(Math.random() * 2.7193E-4);
      this.N_5 = class11060.OUT;
      this.N_1 = var1;
      this.N_2 = (long)class09139.N(70.0, 135.0);
      this.N_0 = var1 + (long)class09139.N(430.0, 980.0);
   }
}
