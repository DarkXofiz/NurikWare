package NurikWare;

import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01338;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07113;
import minecraft.class07209;

@class11080(
   L = "AutoExplosion",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class AutoExplosion extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;

   private void L(class07209 var1, class11499 var2) {
      this.b();
      if (this.N(var1)) {
         class11534.y(var2);
         class06183 class06183 = this.N(var1, var2);
         if (class06183 != null && class06183.N() == class07113.field_1332) {
            if (((class04453)((class06202)super.y_0).T_4).method_6079().N(class06570.ln)) {
               this.N(class06183, class07050.field_5810);
               this.L_2 = new class00734(var1.method_10084()).M(0.5);
            } else {
               class11281.N(class11281.R(class06570.ln)).ifPresent(var3x -> {
                  this.b();
                  class11322.u(var3x);
                  this.N(class06183);
                  this.L_2 = new class00734(var1.method_10084()).M(0.5);
                  if (((class11507)this.u_4).i()) {
                     class11322.i();
                  }
               });
            }
         }
      }
   }

   private void P() {
      this.b();
      class11499 class11499xx = class11505.N();

      for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3)
         .method_8333((class04453)((class06202)super.y_0).T_4, (class00734)this.L_2, var0 -> var0.method_5864() == class07078.S)) {
         class11499 class11499x = class11505.N(class11499xx, class11895.N(class07049, true, ((class04453)((class06202)super.y_0).T_4).method_55755()));
         class11499 class11499xx = class11499xx.N(class11499x).N(true).u(true);
         if (!class11892.N(class11499xx, ((class04453)((class06202)super.y_0).T_4).method_55755(), class07049)) {
            ((class03443)((class06202)super.y_0).T_2).N((class04453)((class06202)super.y_0).T_4, class07049);
            ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
            class11534.y(class11499xx);
            this.L_2 = null;
            break;
         }
      }
   }

   public AutoExplosion() {
      super();
      this.b();
      this.u_0 = new class11535("crystals", true);
      this.u_1 = new class11535("anchor", true);
      this.u_2 = class11524.y(this, "triggers", (class11535)this.u_0, (class11535)this.u_1);
      this.u_3 = class11524.N(this, "any-item-click", false);
      this.u_4 = class11524.N(this, "reset-slot", false);
   }

   private void b() {
   }

   private int n() {
      int i = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
      if (this.N(((class04453)((class06202)super.y_0).T_4).method_31548().method_5438(i))) {
         return i;
      } else {
         int j = class11281.y(this::N);
         return class11281.y(j) ? class11281.y((class11328)(var0 -> !var0.N(class06570.Mu))) : j;
      }
   }

   private void y(class07209 var1, class11499 var2) {
      this.b();
      if (!(Boolean)((class03448)((class06202)super.y_0).T_3).method_75728().N(class00608.O, var1)) {
         class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
         if (class00500.i() == class00869.TE) {
            int i = (Integer)class00500.L(class01338.u);
            if (!((class04453)((class06202)super.y_0).T_4).method_6079().N(class06570.Mu) || i >= 4) {
               class11534.y(var2);
               class06183 class06183 = this.N(var1, var2);
               if (class06183 != null && class06183.N() == class07113.field_1332) {
                  int j = this.n();
                  if (!class11281.y(j)) {
                     if (i == 0) {
                        int k = class11281.R(class06570.Mu);
                        if (class11281.y(k)) {
                           return;
                        }

                        class11322.u(k);
                        this.N(class06183);
                     }

                     class11322.u(j);
                     this.N(class06183);
                     if (((class11507)this.u_4).i()) {
                        class11322.i();
                     }
                  }
               }
            }
         }
      }
   }

   private boolean N(class07209 var1) {
      class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
      if (!class00500.N(class00869.LV) && !class00500.N(class00869.q)) {
         return false;
      } else {
         class07209 class07209 = var1.method_10084();
         if (!((class03448)((class06202)super.y_0).T_3).R(class07209)) {
            return false;
         } else {
            double d0 = class07209.method_10263();
            double d1 = class07209.method_10264();
            double d2 = class07209.method_10260();
            return ((class03448)((class06202)super.y_0).T_3).N_70(null, new class00734(d0, d1, d2, d0 + 1.0, d1 + 2.0, d2 + 1.0)).isEmpty();
         }
      }
   }

   @class11782
   public void N(class11360 var1) {
      this.b();
      class00891 class00891 = var1.N().i();
      if (((class11535)this.u_0).U() && class00891 == class00869.LV) {
         this.L_0 = var1.y();
         this.L_1 = class11505.L();
      } else if (((class11535)this.u_1).U() && class00891 == class00869.TE) {
         this.L_3 = var1.y();
         this.L_4 = class11505.L();
      }
   }

   @class11782
   public void N(class11393 var1) {
      this.b();
      class07209 class07209 = var1.L().u();
      class00891 class00891 = ((class03448)((class06202)super.y_0).T_3).method_8320(class07209).i();
      class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(var1.u());
      if (((class11535)this.u_0).U() && (class00891 == class00869.LV || class00891 == class00869.q)) {
         if (class06584.N(class06570.ln) && this.N(class07209)) {
            this.L_2 = new class00734(class07209.method_10084()).M(0.5);
         } else if (((class11507)this.u_3).i()) {
            this.L_0 = class07209;
            this.L_1 = class11505.L();
         }
      } else if (((class11535)this.u_1).U() && class00891 == class00869.TE && (class06584.N(class06570.Mu) || ((class11507)this.u_3).i())) {
         this.L_3 = class07209;
         this.L_4 = class11505.L();
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      if ((class07209)this.L_0 != null && (class11499)this.L_1 != null) {
         this.L((class07209)this.L_0, (class11499)this.L_1);
         this.L_0 = null;
         this.L_1 = null;
      } else if ((class00734)this.L_2 != null) {
         this.P();
      } else if ((class07209)this.L_3 != null && (class11499)this.L_4 != null) {
         this.y((class07209)this.L_3, (class11499)this.L_4);
         this.L_3 = null;
         this.L_4 = null;
      }
   }

   private boolean N(class06584 var1) {
      return !var1.N(class06570.Mu) && !(var1.B() instanceof class06918);
   }

   private class06183 N(class07209 var1, class11499 var2) {
      class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class06889 class06889x = class06889x.i(var2.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()));
      return ((class03448)((class06202)super.y_0).T_3)
         .method_8320(var1)
         .R((class03448)((class06202)super.y_0).T_3, var1)
         .method_1092(class06889x, class06889x, var1);
   }

   private void N(class06183 var1) {
      this.N(var1, class07050.field_5808);
   }

   private void N(class06183 var1, class07050 var2) {
      class07082 class07082 = ((class03443)((class06202)super.y_0).T_2).N((class04453)((class06202)super.y_0).T_4, var2, var1);
      if (class07082 instanceof class07041 && ((class07041)class07082).i() == class07064.field_52427) {
         ((class04453)((class06202)super.y_0).T_4).method_6104(var2);
      }
   }
}
