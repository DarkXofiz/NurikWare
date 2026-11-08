package NurikWare;

import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;

public class class09146 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private float L(int var1) {
      return class04995.N((float)Math.sqrt(Math.max(400.0F, (float)var1) / 800.0F), 0.7F, 2.0F);
   }

   private float L(long var1) {
      if ((Long)this.N_1 <= 0L) {
         this.N_1 = var1;
         return 1.0F;
      } else {
         float f = class04995.N((float)(var1 - (Long)this.N_1) / 50.0F, 0.35F, 1.8F);
         this.N_1 = var1;
         return f;
      }
   }

   private float M() {
      if ((class05630)((class06202)class11087.N_0).i_7 == null) {
         return 1.0F;
      } else {
         double d0 = (Double)((class05630)((class06202)class11087.N_0).i_7).u().method_41753() * 0.6 + 0.2;
         return class04995.N((float)(0.64 + d0 * d0 * 1.72), 0.62F, 1.72F);
      }
   }

   public class09146() {
      super();
      this.i();
      this.L_0 = new class09172();
      this.L_1 = new class09125();
      this.L_2 = new class09140();
      this.L_3 = new class09165();
      this.L_4 = new class09159();
      this.N_0 = new class09156();
      this.N_7 = 1.0F;
      this.y_0 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = class09139.N(0.0, Math.PI * 2);
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0L;
         this.N_4 = 0L;
         this.N_5 = 0.0F;
         this.N_6 = 0.0F;
         this.N_7 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }
   }

   public class09160 N(class11087 var1, class11499 var2, class11097 var3, boolean var4, boolean var5, boolean var6) {
      long i = System.currentTimeMillis();
      float f4 = this.L(i);
      this.N(i, var5);
      float f5 = (float)Math.max(class09170.N(), 0.035F);
      float f6 = var3.U();
      float f7 = var3.L();
      class09141 class09141 = ((class09172)this.L_0).N(var3, var4, var5, var6, var1.y().y());
      class09143 class09143 = ((class09125)this.L_1).N(var3, f5, var5);
      boolean flag = var3.z() && !var3.M() && !var3.R() && !var3.B() && !var5 && !var4 && f6 <= 7.2F && f7 <= 3.1F;
      boolean flag1 = this.N(i, var3, var4, var6);
      boolean flag2 = var3.B() || flag1 || class09141.y();
      float f8 = this.M();
      float f9 = this.L(var1.i());
      float f10 = f8 * f9;
      float f11 = this.N(f6, f5, f10, flag2, true);
      float f3 = var3.N() ? f5 : this.N(f7, f5, f10 * 0.64F, flag2, false);
      if (flag2) {
         f11 = Math.max(f11, f6 * class09139.N(0.54, 0.78) * (Float)this.N_7);
         f3 = var3.N() ? f5 : Math.max(f3, f7 * class09139.N(0.34, 0.54) * (Float)this.N_7);
      }

      if (var3.B()) {
         f11 = Math.max(f11, f6 * class09139.N(0.92, 1.06));
         f3 = var3.N() ? f5 : Math.max(f3, f7 * class09139.N(0.68, 0.9));
      }

      if (class09141.y()) {
         f11 = Math.max(f11, f6 * class09141.u() * class09141.i() * class09139.N(1.06, 1.18));
         f3 = var3.N() ? f5 : Math.max(f3, f7 * class09141.B() * class09141.M() * class09139.N(1.02, 1.12));
      }

      if (class09141.N()) {
         f11 = Math.max(f11, Math.abs(class09141.R()) * class09139.N(0.92, 1.18));
         f3 = var3.N() ? f5 : Math.max(f3, Math.abs(class09141.z()) * class09139.N(0.75, 1.05));
      }

      if (class09143.L()) {
         float f12 = class04995.B(class09143.u(), 1.0F, class09143.N());
         f11 = Math.max(f11, f6 * class09139.N(0.82, 1.04) * f12);
         f3 = var3.N() ? f5 : Math.max(f3, f7 * class09139.N(0.54, 0.82) * f12);
      }

      if (flag && !class09141.y()) {
         f11 = Math.max(f5, Math.min(f11, f6 * 0.62F + f5 * 1.4F));
         f3 = var3.N() ? f5 : Math.max(f5, Math.min(f3, f7 * 0.56F + f5 * 1.2F));
      } else {
         f11 = ((class09165)this.L_3).N(f11, f6, f5, flag2, var3.M(), true);
         f3 = var3.N() ? f5 : ((class09165)this.L_3).N(f3, f7, f5, flag2, var3.M(), false);
      }

      if (var3.z() && f6 < 1.15F && f7 < 0.72F) {
         f11 = Math.min(f11, f5 * class09139.N(1.2, 3.3));
         f3 = var3.N() ? f5 : Math.min(f3, f5 * class09139.N(0.8, 1.9));
      }

      f11 = this.N(f11, f6, f5, flag2);
      f3 = this.N(f3, f7, f5, flag2);
      float f2 = class09143.L()
         ? class09139.N(0.86, 1.0)
         : (
            class09141.y()
               ? class09141.L()
               : (var3.B() ? class09139.N(0.82, 1.0) : (flag1 ? class09139.N(0.82, 1.0) : (var3.z() ? class09139.N(0.42, 0.66) : class09139.N(0.66, 0.9))))
         );
      float f1 = class09143.L()
         ? class09139.N(0.72, 0.94)
         : (
            class09141.y()
               ? Math.max(0.78F, class09141.L() * 0.72F)
               : (var3.B() ? class09139.N(0.68, 0.92) : (flag1 ? class09139.N(0.64, 0.86) : (var3.z() ? class09139.N(0.28, 0.46) : class09139.N(0.48, 0.7))))
         );
      if (flag && !class09141.y()) {
         f2 = Math.min(f2, 0.34F);
         f1 = Math.min(f1, 0.26F);
      }

      class09136 class09136 = ((class09159)this.L_4).N(var3, f3, f1, f5, flag2);
      f3 = class09136.y();
      f1 = class09136.N();
      this.N_5 = (Float)this.N_5 + (f11 - (Float)this.N_5) * class04995.N(f2 * f4, 0.0F, 1.0F);
      this.N_6 = (Float)this.N_6 + (f3 - (Float)this.N_6) * class04995.N(f1 * f4, 0.0F, 1.0F);
      if (class09141.y() || class09143.L()) {
         float f13 = class04995.N(class09139.N(class09143.L() ? 0.42 : 0.28, class09143.L() ? 0.68 : 0.48) * f4, 0.0F, class09143.L() ? 0.78F : 0.62F);
         this.N_5 = class04995.B(f13, (Float)this.N_5, f11);
         if (!var3.N()) {
            float f14 = class04995.N(f13 * class09139.N(0.58, 0.82), 0.0F, 0.48F);
            this.N_6 = class04995.B(f14, (Float)this.N_6, f3);
         }

         float f18 = class09143.L() ? class09139.N(0.68, 0.92) : class09141.u();
         float f15 = class09143.L() ? class09139.N(0.44, 0.7) : class09141.B();
         this.N_5 = Math.max((Float)this.N_5, this.N(f6 * f18 * 0.94F, f6, f5, true));
         if (!var3.N()) {
            this.N_6 = Math.max((Float)this.N_6, this.N(f7 * f15 * 0.82F, f7, f5, true));
         }
      }

      float f17 = (float)Math.sin(i * 0.018 + ((Float)this.y_2).floatValue()) * f5 * 0.72F * (Float)this.y_0;
      float f = var3.M() ? 1.24F : (class09141.N() ? 1.12F : 1.0F);
      if (flag && !class09141.y()) {
         f *= 0.14F;
      }

      if (flag && !class09141.y()) {
         f17 *= 0.18F;
      }

      float f19 = (float)Math.cos(i * 0.014 + (Float)this.y_2 * 0.61F) * f5 * 0.28F * (Float)this.y_1 * f;
      float f20 = Math.max(f5, (Float)this.N_5 + f17);
      class09168 class09168 = ((class09156)this.N_0).N(f20, f6, f5, flag2, flag, class09141.y());
      f20 = class09168.y();
      class09148 class09148 = ((class09140)this.L_2).N(var1, var2, var3, f20, f5, flag2 || class09168.N(), class09141.y() || class09143.L(), var6);
      f20 = class09148.N();
      float f16 = Math.max(f5, (Float)this.N_6 + (var3.N() ? 0.0F : f19));
      return new class09160(
         this.N(f20, f6, f5, flag2 || class09168.N() || class09148.y()),
         var3.N() ? f5 : this.N(f16, f7, f5, flag2),
         flag2 || class09168.N() || class09148.y(),
         class09141.R(),
         class09141.z(),
         class09141.N()
      );
   }

   private boolean N(long var1, class11097 var3, boolean var4, boolean var5) {
      boolean flag1 = var3.B() || var3.Z() && (!var3.z() || var3.U() > 8.2F || var3.L() > 3.5F) || var5 && var4 && (var3.U() > 4.0F || var3.L() > 2.25F);
      boolean flag = var1 < (Long)this.N_3;
      if (flag1 && var1 >= (Long)this.N_2 && var1 >= (Long)this.N_3) {
         this.N_7 = class09139.N(1.04, var3.U() > 18.0F ? 1.46 : 1.28);
         this.N_3 = var1 + (long)class09139.N(55.0, 138.0);
         this.N_2 = var1 + (long)class09139.N(230.0, 620.0);
         flag = true;
      }

      if (!flag) {
         this.N_7 = 1.0F;
      }

      return flag1 || flag;
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      if (var2 <= var3 * 2.4F) {
         return Math.max(var3, var1);
      } else {
         float f = var4 ? 0.95F : 1.55F;
         float f1 = var3 * f;
         return class04995.N(var1, var3, Math.max(var3, var2 - f1));
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (var1 <= 1.0E-4F) {
         return var2;
      } else {
         float f = var1 / var2;
         float f1 = var4 ? (var5 ? 0.76F : 0.69F) : (var5 ? 0.62F : 0.56F);
         float f2 = (float)Math.pow(Math.max(1.0F, f), f1) * var2 * var3 * (var4 ? (var5 ? 2.35F : 1.55F) : (var5 ? 1.24F : 0.82F));
         float f3 = var4 ? (var5 ? 0.76F : 0.58F) : (var5 ? 0.42F : 0.3F);
         float f4 = var1 * f3;
         float f5 = Math.max(f2, f4);
         float f6 = var5 ? (var4 ? 58.0F : 28.0F) : (var4 ? 12.0F : 6.6F);
         return class04995.N(f5, var2, f6);
      }
   }

   private void N(long var1, boolean var3) {
      if (var1 >= (Long)this.N_4) {
         this.y_0 = class09139.N(var3 ? 0.9 : 0.78, var3 ? 1.28 : 1.16);
         this.y_1 = class09139.N(0.72, var3 ? 1.18 : 1.06);
         this.y_2 = class09139.N(0.0, Math.PI * 2);
         this.N_4 = var1 + (long)class09139.N(var3 ? 85.0 : 160.0, var3 ? 210.0 : 420.0);
      }
   }

   public void N() {
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0L;
      this.N_4 = 0L;
      this.N_5 = 0.0F;
      this.N_6 = 0.0F;
      this.N_7 = 1.0F;
      this.y_0 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = class09139.N(0.0, Math.PI * 2);
      ((class09172)this.L_0).N();
      ((class09125)this.L_1).N();
      ((class09140)this.L_2).N();
      ((class09165)this.L_3).N();
      ((class09159)this.L_4).N();
      ((class09156)this.N_0).N();
   }
}
