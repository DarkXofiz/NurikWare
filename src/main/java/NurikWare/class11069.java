package NurikWare;

import minecraft.class00734;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07438;

public class class11069 extends class11079 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0;
      }
   }

   public class11069(AttackAura var1, String var2) {
      super(var1, var2);
      this.P();
      this.L_2 = new class11087();
      this.L_3 = new class11095();
      this.N_0 = new class09146();
      this.N_1 = new class09152();
      this.N_2 = new class09127();
      this.N_3 = new class11076();
      this.N_4 = Integer.MIN_VALUE;
   }

   @Override
   public void u(class07438 var1) {
      this.P();
      super.u(var1);
      this.L_1 = (Integer)this.L_1 + 1;
      ((AttackAura)super.y_1).y(class11908.N(0, 2));
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)((AttackAura)super.y_1).m());
   }

   @Override
   public boolean y() {
      class00734 class00734x = ((class04453)((class06202)super.y_0).T_4).method_5829().u(0.0, 0.1F, 0.0);
      class00734 class00734x = ((class04453)((class06202)super.y_0).T_4).method_5829().u(0.0, -0.5, 0.0);
      boolean flag = ((class03448)((class06202)super.y_0).T_3).method_8600((class04453)((class06202)super.y_0).T_4, class00734x).iterator().hasNext();
      boolean flag1 = ((class03448)((class06202)super.y_0).T_3).method_8600((class04453)((class06202)super.y_0).T_4, class00734x).iterator().hasNext();
      return flag && flag1 && this.N() == 13 ? false : super.y();
   }

   static boolean y(class07438 var0, class11499 var1, float var2) {
      class06202 class06202 = (class06202)class11087.N_0;
      if ((class04453)class06202.T_4 != null && (class03448)class06202.T_3 != null && var0 != null && var1 != null && !(var2 <= 0.0F)) {
         class06889 class06889xxx = ((class04453)class06202.T_4).method_33571();
         class06889 class06889x = ((class04453)class06202.T_4).method_5631(var1.R(), var1.y());
         class06889 class06889xx = class06889xxx.i(class06889x.L(var2));
         class00734 class00734x = new class00734(class06889xxx, class06889xxx).y(class06889x.L(var2)).M(1.0);
         class07049 class07049x = null;
         double d0 = var2 * var2;

         for (class07049 class07049x : ((class03448)class06202.T_3)
            .method_8333((class04453)class06202.T_4, class00734x, var0x -> !var0x.method_7325() && var0x.method_5863())) {
            class00734 class00734x = class07049x == var0
               ? class11064.u(class07049x)
               : class11064.L(class07049x).M(Math.max(1.0E-4, (double)class07049x.method_5871()));
            class06889 class06889xxx = class00734x.u(class06889xxx) ? class06889xxx : (class06889)class00734x.y(class06889xxx, class06889xx).orElse(null);
            if (class06889xxx != null) {
               double d1 = class06889xxx.M(class06889xxx);
               if (class07049x == null || !(d1 >= d0)) {
                  class07049x = class07049x;
                  d0 = d1;
               }
            }
         }

         class06183 class06183 = ((class03448)class06202.T_3)
            .N(new class05862(class06889xxx, class06889xx, class05849.field_17558, class05835.field_1348, (class04453)class06202.T_4));
         boolean flag = class06183 != null && class06183.N() == class07113.field_1332 && class06889xxx.M(class06183.y()) <= d0;
         return !flag && class07049x == var0;
      } else {
         return false;
      }
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      this.P();
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)var3, var2, true);
      if ((class04453)((class06202)super.y_0).T_4 != null && var1 != null) {
         class11499 class11499 = class11505.N();
         if ((Integer)this.N_4 != var1.method_5628()) {
            this.N_4 = var1.method_5628();
            ((class11095)this.L_3).N();
            ((class09146)this.N_0).N();
            ((class09152)this.N_1).N(class11499);
            ((class09127)this.N_2).N(class11499);
            ((class11076)this.N_3).N();
            ((class11087)this.L_2).y_4 = System.currentTimeMillis();
         }

         boolean flag = ((class11087)this.L_2).N();
         boolean flag1 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, var1);
         boolean flag2 = (class03443)((class06202)super.y_0).T_2 != null && ((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 2;
         class11097 class11097 = ((class11095)this.L_3)
            .N(
               (class11087)this.L_2,
               var1,
               class11499,
               new class11499(((class04453)((class06202)super.y_0).T_4).field_5982, ((class04453)((class06202)super.y_0).T_4).field_6004),
               flag,
               flag2,
               flag1
            );
         class09160 class09160 = ((class09146)this.N_0).N((class11087)this.L_2, class11499, class11097, flag, flag2, flag1);
         class11499 class11499x = new class11499(class11097.y().y() + class09160.y(), class11097.y().R() + class09160.R());
         class09123 class09123 = ((class09152)this.N_1)
            .N(
               (class11087)this.L_2,
               var1,
               class11499,
               class11499x,
               class09160.u(),
               class09160.N(),
               class09160.i(),
               class11097.N(),
               class11097.z() && !class11097.R() && !class09160.L()
            );
         return ((class09127)this.N_2)
            .N(
               (class11087)this.L_2,
               var1,
               class11499,
               class09123.y(),
               class09123.N(),
               class09123.L(),
               flag && flag1,
               flag2,
               class09160.i(),
               class11097.N(),
               class11097.z(),
               class11097.M() || class11097.R() || class09160.L()
            )
            .L()
            .N(true)
            .u(true);
      } else {
         class11499 class11499xx = class11505.L();
         this.N(class11499xx);
         return class11499xx;
      }
   }

   @Override
   public void N(class07438 var1) {
      super.y_2 = this.u();
      class11499 class11499 = this.y(var1, false, ((AttackAura)super.y_1).d());
      if (this.L(var1) && !this.N(var1, class11499)) {
         this.u(var1);
      }

      class11534.y(class11499.y(((AttackAura)super.y_1).b()));
   }

   @Override
   public int N() {
      this.P();
      return super.N() + ((Integer)this.L_1 % 4 == 0 ? 3 : 0);
   }

   static class06889 N(class07438 var0, class11499 var1, float var2) {
      class06202 class06202 = (class06202)class11087.N_0;
      if ((class04453)class06202.T_4 != null && var0 != null) {
         class00734 class00734 = class11064.L(var0);
         double d0 = (class00734.N + class00734.u) * 0.5;
         double d1 = (class00734.L + class00734.R) * 0.5;
         double d2 = Math.max(0.015, class00734.y() * 0.18);
         double d3 = Math.max(0.015, class00734.u() * 0.18);
         double d4 = class00734.N + d2;
         double d5 = class00734.u - d2;
         double d6 = class00734.L + d3;
         double d7 = class00734.R - d3;
         class06889 class06889x = class11064.N(var0);
         double d8 = class04995.u(0.28, class00734.y, class00734.i);
         double d9 = class04995.u(0.18, class00734.y, class00734.i);
         double d10 = class04995.u(0.38, class00734.y, class00734.i);
         double d11 = class04995.u(0.46, class00734.y, class00734.i);
         class06889[] aclass06889 = new class06889[]{
            new class06889(d0, d8, d1),
            new class06889(class04995.N(class06889x.M, d4, d5), class04995.N(class06889x.B, d9, d10), class04995.N(class06889x.Z, d6, d7)),
            new class06889(d4, d8, d1),
            new class06889(d5, d8, d1),
            new class06889(d0, d8, d6),
            new class06889(d0, d8, d7),
            new class06889(d0, d9, d1),
            new class06889(d0, d10, d1),
            new class06889(d0, d11, d1)
         };
         class06889 class06889x = aclass06889[0];
         double d12 = Double.MAX_VALUE;
         class06889 class06889xx = ((class04453)class06202.T_4).method_33571();

         for (class06889 class06889xxx : aclass06889) {
            class11499 class11499 = class09170.N(class06889xxx);
            if (y(var0, class11499, var2)) {
               double d13 = Math.abs(class09170.N(var1.y(), class11499.y()));
               double d14 = Math.abs(var1.R() - class11499.R());
               double d15 = Math.max(0.0, class06889xxx.B - d10) * 3.8;
               double d16 = d13 * 0.86 + d14 * 4.2 + d15 + class06889xx.M(class06889xxx) * 0.01;
               if (d16 < d12) {
                  class06889x = class06889xxx;
                  d12 = d16;
               }
            }
         }

         return class06889x;
      } else {
         return null;
      }
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      this.P();
      class11087.N_0 = (class06202)super.y_0;
      ((class11087)this.L_2).N((float)var2, false, false);
      if ((class04453)((class06202)super.y_0).T_4 != null && var1 != null) {
         class11499 class11499 = class11505.N();
         boolean flag = ((class11087)this.L_2).N(var1, class11499);
         boolean flag1 = ((class11087)this.L_2).N();
         boolean flag2 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, var1);
         return ((class11076)this.N_3).N(class11064.u(var1), var1, flag, flag1, flag2);
      } else {
         return var1 == null ? class06889.L : var1.method_33571();
      }
   }

   @Override
   public boolean N(class07438 var1, class11499 var2) {
      this.P();
      if (super.N(var1, var2)) {
         this.L_0 = 0;
         return true;
      } else {
         int i = (Integer)this.L_0 + 1;
         this.L_0 = i;
         return i < (((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 15 ? 3 : 4);
      }
   }

   private void N(class11499 var1) {
      this.P();
      this.N_4 = Integer.MIN_VALUE;
      ((class11095)this.L_3).N();
      ((class09146)this.N_0).N();
      ((class09152)this.N_1).N(var1);
      ((class09127)this.N_2).N(var1);
      ((class11076)this.N_3).N();
      ((class11087)this.L_2).y_4 = System.currentTimeMillis();
   }
}
