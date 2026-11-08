package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09127 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;

   public class09127() {
      super();
      this.u();
      this.L_0 = new class09129();
      this.L_1 = new class09145();
      this.L_2 = new class09137();
      this.L_3 = new class09157();
      this.L_4 = new class09135();
      this.L_5 = new class09162();
      this.y_0 = new class09158();
      this.y_1 = new class11058();
      this.y_2 = new class09128();
      this.y_3 = new class09142();
      this.y_4 = new class11098();
      this.y_5 = new class09161();
      this.N_3 = 1.0F;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.N_0) {
         float f = (var4 ? 0.35F : 0.0F) + (var5 ? 0.45F : 0.0F) + (var6 ? 0.55F : 0.0F);
         this.N_1 = class09139.N((double)(-var3 * (0.46F + f * 0.42F)), (double)(var3 * (0.58F + f * 0.68F)));
         this.N_2 = class09139.N((double)(-var3 * (0.18F + f * 0.16F)), (double)(var3 * (0.18F + f * 0.16F)));
         this.N_3 = class09139.N((double)(0.97F - f * 0.02F), (double)(1.03F + f * 0.035F));
         this.N_0 = var1 + (long)class09139.N(var6 ? 88.0 : 130.0, var5 ? 220.0 : 380.0);
      }
   }

   public boolean N() {
      return ((class11058)this.y_1).y();
   }

   private float N(float var1, double var2, float var4) {
      if (Math.abs(var1) <= var4) {
         return 0.0F;
      } else if (var2 <= 1.0E-5) {
         return var1;
      } else {
         int i = Math.round(var1 / (float)var2);
         if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         return i * (float)var2;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float f = Math.abs(var2) > 1.0E-4F ? Math.signum(var2) : (Math.random() > 0.5 ? 1.0F : -1.0F);
      float f1 = var1 + f * var3 * class09139.N(0.22F, var4 ? 0.92F : 0.58F);
      if (Math.abs(var2) > var3 * 3.0F) {
         float f2 = Math.max(var3, Math.abs(var2) - var3 * class09139.N(1.6F, 3.4F));
         f1 = class04995.N(f1, -f2, f2);
      }

      return f1;
   }

   private float N(float var1, double var2, boolean var4, boolean var5) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float f = Math.signum(var1);
         float f1 = Math.abs(var1) / (float)var2;
         int j = Math.max(1, (int)Math.floor(f1));
         int k = Math.max(j, (int)Math.ceil(f1));
         int i = Math.random() < class04995.N(f1 - j, 0.0F, 1.0F) ? k : j;
         if (var5) {
            int l = var4 ? (Integer)this.N_4 : (Integer)this.N_5;
            if (i == Math.abs(l) && i > 1) {
               i += Math.random() > 0.5 ? 1 : -1;
            }
         }

         return f * i * (float)var2;
      } else {
         return var1;
      }
   }

   public class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12
   ) {
      double d0 = class09170.N();
      float f = (float)Math.max(d0, 0.035F);
      long i = System.currentTimeMillis();
      class09122 class09122 = ((class11058)this.y_1).N(var1, var2, var3, var4, var5, var6, d0, var10, var11, var12, var9, var8, var7);
      var4 = class09122.B();
      var5 = class09122.u();
      var6 = class09122.y();
      var10 = class09122.M();
      var12 = class09122.R();
      var9 = class09122.z();
      if (class09122.L()) {
         return this.N(var1, var2, var3, var4, var5, var6, d0, var11, var12, var9, var8, class09122.Z(), class09122.U());
      } else {
         float f1 = class09170.N(var3.y(), var4.y());
         float f2 = var4.R() - var3.R();
         float f3 = var10 ? 0.0F : f2;
         float f4 = class04995.N(f1, -var5, var5);
         float f5 = var10 ? 0.0F : class04995.N(f3, -var6, var6);
         boolean flag1 = var11 && !var12 && !var9 && !var8 && !var7 && Math.abs(f1) <= Math.max(f * 18.0F, 2.2F) && Math.abs(f3) <= Math.max(f * 12.0F, 1.1F);
         if (flag1) {
            class09130 class09130 = ((class09129)this.L_0).N(f1, f3, f4, f5, d0, var10, false, true);
            float f14 = class09130.y();
            float f15 = var10 ? 0.0F : class09130.N();
            class09126 class09126 = ((class09162)this.L_5).N(f1, f3, f14, f15, f, var10, false, var8, var11, var12);
            f14 = class09126.y();
            f15 = var10 ? 0.0F : class09126.N();
            class09169 class09169 = ((class09158)this.y_0).N(var1, var2, var3, f1, f2, f14, f15, var5, var6, d0, var10, false, var8, var11, var12);
            f14 = class09169.y();
            f15 = class09169.u();
            var10 = class09169.i();
            float f16 = class09169.L() / Math.max(f, var5);
            float f17 = class09169.N() / Math.max(f, var6);
            class11499 class11499x = new class11499(var3.y() + f14, class04995.N(var3.R() + f15, -90.0F, 90.0F));
            class11499x = ((class09145)this.L_1).N(var1, var2, var3, var4, class11499x, d0, var10, var11, var12);
            class11499x = ((class09137)this.L_2).N(var1, var2, var3, var4, class11499x, d0, var11, var12);
            if (var10 && class11499x.R() != var3.R()) {
               class11499x = new class11499(class11499x.y(), var3.R());
            }

            class11499x = ((class09157)this.L_3).N(var1, var2, var3, var4, class11499x, d0, var10, var11, var12, false, var8);
            boolean flag3 = class09122.N() || class09122.i();
            class09149 class09149 = ((class09128)this.y_2)
               .N(var1, var2, var3, var4, class11499x, d0, var10, var11, var12, var5, var6, flag3, class09122.Z(), class09122.U());
            class11499x = class09149.L();
            class09151 class09151 = ((class09142)this.y_3)
               .N(var1, var2, var3, var4, class11499x, d0, var10, var11, var12, class09149.y(), class09149.N(), flag3, var8, class09122.i());
            class11499x = class09151.y();
            class09134 class09134 = ((class11098)this.y_4)
               .N(var1, var2, var3, var4, class11499x, d0, var11, var12, flag3, class09122.U(), false, var8, class09151.N(), class09151.u());
            class11499x = class09134.L();
            var10 = var10 && !flag3 && !class09122.U();
            f14 = class09170.N(var3.y(), class11499x.y());
            f15 = class11499x.R() - var3.R();
            int l = this.N(f14, f);
            int i1 = this.N(f15, f);
            this.N_4 = l;
            this.N_5 = i1;
            this.N_6 = 0;
            float f18 = this.N(Math.max(Math.abs(f14), class09134.N()), d0, true);
            float f19 = this.N(Math.max(Math.abs(f15), class09134.y()), d0, false);
            class09153 class09153 = ((class09135)this.L_4).N(var1, var2, var3, class11499x, d0, var10, var11, var12, false, var8, f18, f19);
            return this.N(var1, var2, var3, var4, class09153.L(), d0, var10, var11, var12, false, var8, class09153.y(), class09153.N());
         } else {
            this.N(i, f, var7, var8, var9);
            boolean flag = var11 && Math.abs(f1) <= f * 3.5F && Math.abs(f3) <= f * 2.0F;
            if (!flag) {
               f4 += (Float)this.N_1;
               if (!var10) {
                  f5 += (Float)this.N_2;
               }
            } else if (var8) {
               f4 += (Float)this.N_1 * 0.34F;
               if (!var10) {
                  f5 += (Float)this.N_2 * 0.18F;
               }
            }

            class09130 class09130x = ((class09129)this.L_0).N(f1, f3, f4, f5, d0, var10, var9, false);
            float f6 = class09130x.y();
            float f7 = var10 ? 0.0F : class09130x.N();
            class09126 class09126x = ((class09162)this.L_5).N(f1, f3, f6, f7, f, var10, var9, var8, var11, var12);
            f6 = class09126x.y();
            f7 = var10 ? 0.0F : class09126x.N();
            class09169 class09169x = ((class09158)this.y_0).N(var1, var2, var3, f1, f2, f6, f7, var5, var6, d0, var10, var9, var8, var11, var12);
            f6 = class09169x.y();
            f7 = class09169x.u();
            var10 = class09169x.i();
            float f8 = class09169x.L() / Math.max(f, var5);
            float f9 = class09169x.N() / Math.max(f, var6);
            int j = this.N(f6, f);
            int k = this.N(f7, f);
            int j1;
            if (j != (Integer)this.N_4 || k != (Integer)this.N_5 || j == 0 && k == 0) {
               j1 = 0;
            } else {
               int k1 = (Integer)this.N_6 + 1;
               j1 = k1;
               this.N_6 = k1;
            }

            this.N_6 = j1;
            if ((Integer)this.N_6 >= 6 && !var11) {
               f6 = this.N(f6, f1, f, var9);
               if (!var10) {
                  f7 = this.N(f7, f3, f * 0.55F, false);
               }

               f6 = this.N(f6, d0, true, true);
               f7 = var10 ? 0.0F : this.N(f7, d0, false, true);
               j = this.N(f6, f);
               k = this.N(f7, f);
            }

            class11499 class11499 = new class11499(var3.y() + f6, class04995.N(var3.R() + f7, -90.0F, 90.0F));
            class11499 = this.N(var1, var2, var3, var4, class11499, var11, var12, d0, Math.abs(f6), Math.abs(f7), flag);
            class11499 = ((class09145)this.L_1).N(var1, var2, var3, var4, class11499, d0, var10, var11, var12);
            class11499 = ((class09137)this.L_2).N(var1, var2, var3, var4, class11499, d0, var11, var12);
            if (var10 && class11499.R() != var3.R()) {
               class11499 = new class11499(class11499.y(), var3.R());
            }

            class11499 = ((class09157)this.L_3).N(var1, var2, var3, var4, class11499, d0, var10, var11, var12, var9, var8);
            boolean flag2 = class09122.N() || class09122.i();
            class09149 class09149x = ((class09128)this.y_2)
               .N(var1, var2, var3, var4, class11499, d0, var10, var11, var12, var5, var6, flag2, class09122.Z(), class09122.U());
            class11499 = class09149x.L();
            class09151 class09151x = ((class09142)this.y_3)
               .N(var1, var2, var3, var4, class11499, d0, var10, var11, var12, class09149x.y(), class09149x.N(), flag2, var8, class09122.i());
            class11499 = class09151x.y();
            class09134 class09134x = ((class11098)this.y_4)
               .N(var1, var2, var3, var4, class11499, d0, var11, var12, flag2, class09122.U(), var9, var8, class09151x.N(), class09151x.u());
            class11499 = class09134x.L();
            var10 = var10 && !flag2 && !class09122.U();
            float f10 = Math.abs(class09170.N(var3.y(), class11499.y()));
            float f11 = Math.abs(class11499.R() - var3.R());
            j = this.N(class09170.N(var3.y(), class11499.y()), f);
            k = this.N(class11499.R() - var3.R(), f);
            float f12 = this.N(Math.max(f10, class09134x.N()), d0, true);
            float f13 = this.N(Math.max(f11, class09134x.y()), d0, false);
            this.N_4 = j;
            this.N_5 = k;
            class09153 class09153x = ((class09135)this.L_4).N(var1, var2, var3, class11499, d0, var10, var11, var12, var9, var8, f12, f13);
            return this.N(var1, var2, var3, var4, class09153x.L(), d0, var10, var11, var12, var9, var8, class09153x.y(), class09153x.N());
         }
      }
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      boolean var6,
      boolean var7,
      double var8,
      float var10,
      float var11,
      boolean var12
   ) {
      if (var5 != null && !var1.N(var2, var5) && var6 && !var7) {
         float f = class09170.N(var3.y(), var5.y());
         float f1 = var5.R() - var3.R();

         for (float f2 : new float[]{0.86F, 0.68F, 0.5F, 0.34F, 0.18F}) {
            class11499 class11499x = new class11499(
               var3.y() + this.N(f * f2, var8, true, true), class04995.N(var3.R() + this.N(f1 * f2, var8, false, true), -90.0F, 90.0F)
            );
            if (var1.N(var2, class11499x)) {
               return class11499x;
            }
         }

         class11499 class11499 = this.N(var3, var4, var8, var10, var11);
         if (var1.N(var2, class11499)) {
            return class11499;
         } else {
            return var12 ? var3 : var5;
         }
      } else {
         return var5;
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float f = var4 ? 0.35F : 0.25F;
         return Math.max(1, Math.round(Math.max(f, var1) / (float)var2)) * (float)var2;
      }
   }

   private class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      float var14
   ) {
      class09131 class09131 = ((class09161)this.y_5).N(var1, var2, var3, var4, var5, var6, var8, var9, var10, var11, var12, var13, var14);
      return new class09121(class09131.L(), class09131.N(), class09131.y());
   }

   public void N(class11499 var1) {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = 0;
      ((class09129)this.L_0).N();
      ((class09145)this.L_1).N();
      ((class09137)this.L_2).N();
      ((class09157)this.L_3).N();
      ((class09135)this.L_4).N();
      ((class09162)this.L_5).N();
      ((class09158)this.y_0).N();
      ((class11058)this.y_1).N();
      ((class09128)this.y_2).N();
      ((class09142)this.y_3).N();
      ((class11098)this.y_4).N();
      ((class09161)this.y_5).N();
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, float var6) {
      float f = class04995.N(class09170.N(var1.y(), var2.y()), -var5, var5);
      float f1 = class04995.N(var2.R() - var1.R(), -var6, var6);
      f = this.N(f, var3, true, true);
      f1 = this.N(f1, var3, false, true);
      return new class11499(var1.y() + f, class04995.N(var1.R() + f1, -90.0F, 90.0F));
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private class09121 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      double var7,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      boolean var14
   ) {
      float f = (float)Math.max(var7, 0.035F);
      float f1 = class09170.N(var3.y(), var4.y());
      float f2 = var4.R() - var3.R();
      float f3 = this.N(class04995.N(f1, -var5, var5), var7, true, true);
      float f4 = this.N(class04995.N(f2, -var6, var6), var7, false, true);
      if (Math.abs(f3) <= f && Math.abs(f1) > f * 2.0F) {
         f3 = Math.signum(f1) * f * class09139.N(2.27362837, 4.83737733);
         f3 = this.N(f3, var7, true, true);
      }

      class11499 class11499 = new class11499(var3.y() + f3, class04995.N(var3.R() + f4, -90.0F, 90.0F));
      class11499 = this.N(var1, var2, var3, var4, class11499, var9, var10, var7, Math.abs(f3), Math.abs(f4), false);
      class11499 = ((class09145)this.L_1).N(var1, var2, var3, var4, class11499, var7, false, var9, var10);
      class11499 = ((class09137)this.L_2).N(var1, var2, var3, var4, class11499, var7, var9, var10);
      class11499 = ((class09157)this.L_3).N(var1, var2, var3, var4, class11499, var7, false, var9, var10, true, var12);
      class09149 class09149 = ((class09128)this.y_2).N(var1, var2, var3, var4, class11499, var7, false, var9, var10, var5, var6, true, var13, var14);
      class11499 = class09149.L();
      class09151 class09151 = ((class09142)this.y_3)
         .N(var1, var2, var3, var4, class11499, var7, false, var9, var10, class09149.y(), class09149.N(), true, var12, false);
      class11499 = class09151.y();
      class09134 class09134 = ((class11098)this.y_4)
         .N(var1, var2, var3, var4, class11499, var7, var9, var10, true, var14, var11, var12, class09151.N(), class09151.u());
      class11499 = class09134.L();
      float f5 = Math.abs(class09170.N(var3.y(), class11499.y()));
      float f6 = Math.abs(class11499.R() - var3.R());
      int i = this.N(class09170.N(var3.y(), class11499.y()), f);
      int j = this.N(class11499.R() - var3.R(), f);
      this.N_6 = 0;
      this.N_4 = i;
      this.N_5 = j;
      float f7 = this.N(Math.max(f5, class09134.N()), var7, true);
      float f8 = this.N(Math.max(f6, class09134.y()), var7, false);
      class09153 class09153 = ((class09135)this.L_4).N(var1, var2, var3, class11499, var7, false, var9, var10, var11, var12, f7, f8);
      return this.N(var1, var2, var3, var4, class09153.L(), var7, false, var9, var10, var11, var12, class09153.y(), class09153.N());
   }
}
