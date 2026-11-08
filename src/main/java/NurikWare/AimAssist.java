package NurikWare;

import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

@class11080(
   L = "AimAssist",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class AimAssist extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public static Object u_0;
   public static Object u_1;

   private static void T() {
      u_0 = 0.008333333333333333;
      u_1 = 0.05;
   }

   public AimAssist() {
      super();
      this.v();
      this.L_0 = class11524.N(this, "fov", 180.0F, 1.0F, 180.0F, 1.0F);
      this.L_1 = class11524.N(this, "aim-range", 4.0F, 0.1F, 10.0F, 0.1F);
      this.L_2 = class11524.N(this, "speed", 4.0F, 0.1F, 10.0F, 0.1F);
   }

   static {
      T();
   }

   private void v() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = 0;
         this.L_5 = 0L;
         this.L_6 = 0.0;
         this.L_7 = 0.0;
      }
   }

   @Override
   public void y() {
      this.v();
      this.L_3 = 0;
      this.L_4 = null;
      this.L_5 = 0L;
      this.L_6 = 0.0;
      this.L_7 = 0.0;
      super.y();
   }

   private boolean y(class07438 var1) {
      this.v();
      if (!var1.method_5805()) {
         return false;
      } else if (class11791.u().test(var1)) {
         return false;
      } else {
         return class11895.N(var1, true, ((class04453)((class06202)super.y_0).T_4).method_55755()).R(((class04453)((class06202)super.y_0).T_4).method_33571())
               > ((class11504)this.L_1).i().floatValue()
            ? false
            : this.N(var1);
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.v();
      this.N(((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_3));
   }

   private void N(class07049 var1) {
      this.v();
      if (var1 instanceof class07438 class07438) {
         if (!this.y(class07438)) {
            this.L_4 = null;
         } else {
            class11499 class11499 = class11505.N();
            TargetEsp.N(class07438, 15);
            if (class11892.N(class11499, (double)((class11504)this.L_1).i().floatValue(), class07438.method_5829().B(0.2))) {
               class06889 class06889 = class11895.N(
                  class07438, class11499, true, ((class04453)((class06202)super.y_0).T_4).method_55755(), var0 -> var0.B(0.21)
               );
               if (!class11892.N(((class04453)((class06202)super.y_0).T_4).method_33571(), class06889, class05849.field_17559, class05835.field_1348)) {
                  this.L_4 = null;
               } else {
                  this.L_4 = class11505.N(class06889);
               }
            } else {
               this.L_4 = null;
            }
         }
      } else {
         this.L_4 = null;
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.v();
      this.L_3 = var1.L().method_5628();
   }

   @class11782
   public void N(class11384 var1) {
      this.v();
      if ((class11499)this.L_4 == null) {
         this.L_5 = 0L;
         this.L_6 = 0.0;
         this.L_7 = 0.0;
      } else {
         long i = System.nanoTime();
         double d0 = (Long)this.L_5 == 0L ? 0.008333333333333333 : (i - (Long)this.L_5) / 1.0E9;
         this.L_5 = i;
         double d1 = class04995.N(d0, 0.0, 0.05) / 0.008333333333333333;
         class11499 class11499 = class11505.N();
         float f = class11499.R() - ((class11499)this.L_4).R();
         float f1 = class04995.R(class11499.y() - ((class11499)this.L_4).y());
         double d2 = Math.hypot(f, f1);
         if (d2 < 1.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
         } else if (var1.u() == 0.0 && var1.L() == 0.0 && d2 > 5.0) {
            this.L_6 = 0.0;
            this.L_7 = 0.0;
         } else {
            double d3 = class04995.u(f, f1) * 180.0F / (float)Math.PI - 90.0;
            double d4 = ((class11504)this.L_2).i().floatValue() * Math.max(0.5, Math.min(d2, 10.0) * 0.1F) * d1;
            double d5 = Math.min(d4, (double)Math.abs(f1));
            double d6 = Math.min(d4, (double)Math.abs(f));
            this.L_6 = (Double)this.L_6 + Math.sin(d3 * (float) (Math.PI / 180.0)) * d5;
            this.L_7 = (Double)this.L_7 + -Math.cos(d3 * (float) (Math.PI / 180.0)) * d6;
            double d7 = Math.round((Double)this.L_6);
            double d8 = Math.round((Double)this.L_7);
            this.L_6 = (Double)this.L_6 - d7;
            this.L_7 = (Double)this.L_7 - d8;
            double d9 = class11302.N(var1.u());
            double d10 = class11302.N(var1.L());
            var1.N(class11302.y(d9 + d7));
            var1.y(class11302.y(d10 + d8));
         }
      }
   }

   public boolean N(class07438 var1) {
      this.v();
      if (((class11504)this.L_0).i() == 180.0F) {
         return true;
      } else {
         class11499 class11499 = class11505.L();
         return !class11892.N(class11499, ((class04453)((class06202)super.y_0).T_4).method_55755(), var1)
            || class11499.N(class11895.N(var1, class11499, false, ((class04453)((class06202)super.y_0).T_4).method_55755())) < ((class11504)this.L_0).i();
      }
   }
}
