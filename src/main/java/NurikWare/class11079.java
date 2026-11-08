package NurikWare;

import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06543;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class08172;

public abstract class class11079 extends class11535 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;

   public boolean L() {
      return class11938.u().p().U();
   }

   public boolean L(class07438 var1) {
      this.W();
      if (((AttackAura)this.y_1).T()) {
         return false;
      } else if ((Boolean)this.y_3 && class11907.N(var1, (class04453)((class06202)this.y_0).T_4)) {
         return true;
      } else if (class11315.N(this.N())) {
         return false;
      } else if (((class04453)((class06202)this.y_0).T_4).method_75202(((class04453)((class06202)this.y_0).T_4).method_6047(), 0)) {
         return false;
      } else {
         double d0 = ((AttackAura)this.y_1).m();
         class06889 class06889 = this.N(var1, d0);
         if (!this.N(var1, class06889, d0)) {
            return false;
         } else {
            if (!((class04453)((class06202)this.y_0).T_4).method_24828()
               && !class11315.N(this.N() - 4)
               && !class11315.N(4.5F)
               && (!this.y() || class11899.N(2).i() > 0.0)) {
               ((AttackAura)this.y_1).j();
            }

            boolean flag = class11315.y()
               || !((class11507)((AttackAura)this.y_1).Z_3).i() && ((class04453)((class06202)this.y_0).T_4).method_6059(class07047.Y);
            if (this.y() && flag && !(Boolean)this.y_2) {
               if (this.N(class11899.N(1))) {
                  ((AttackAura)this.y_1).L(1);
               }

               if ((Boolean)((class04453)((class06202)this.y_0).T_4).R_6) {
                  return false;
               }
            }

            if ((!(Boolean)this.y_2 || !(((class04453)((class06202)this.y_0).T_4).field_6017 > 1.3F) || (Integer)this.y_4 > 0) && class11315.N(0.5F)) {
               return false;
            } else if (this.y(var1, class06889, d0)) {
               return false;
            } else if (this.y() && (((class04453)((class06202)this.y_0).T_4).field_6017 == 0.0 || !((AttackAura)this.y_1).n() && class11891.N()) && flag) {
               return false;
            } else {
               if (!((class04453)((class06202)this.y_0).T_4).method_24828()) {
                  ((AttackAura)this.y_1).j();
               }

               return ((AttackAura)this.y_1).G();
            }
         }
      }
   }

   public class11079(AttackAura var1, String var2, boolean var3) {
      super(var2, var3);
      this.W();
      this.y_0 = class06202.Nq();
      this.y_1 = var1;
   }

   public class11079(AttackAura var1, String var2) {
      this(var1, var2, false);
   }

   public boolean u() {
      this.W();
      if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm)) {
         return true;
      } else {
         return ((class04453)((class06202)this.y_0).T_4).field_6017 < 1.0
            ? false
            : ((class11507)((AttackAura)this.y_1).i_4).i() && class11281.N(class11281.R(class06570.Gm)).isPresent();
      }
   }

   public void u(class07438 var1) {
      this.W();
      if ((Boolean)this.y_3) {
         this.y_3 = false;
         if (class11907.N(var1, (class04453)((class06202)this.y_0).T_4)) {
            class11907.y(var1);
            this.y_5 = 5;
            return;
         }
      }

      if (((class04453)((class06202)this.y_0).T_4).method_6039()) {
         ((class03443)((class06202)this.y_0).T_2).y((class04453)((class06202)this.y_0).T_4);
      }

      ((AttackAura)this.y_1).N(10);
      class06584 class06584 = ((class04453)((class06202)this.y_0).T_4).method_6047();
      class08172 class08172 = (class08172)class06584.method_58694(class02484.c);
      if (class08172 != null) {
         if (((class03443)((class06202)this.y_0).T_2).Z()) {
            return;
         }

         ((class03443)((class06202)this.y_0).T_2).N(class08172);
         ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
         ((AttackAura)this.y_1).t();
      } else {
         ((class03443)((class06202)this.y_0).T_2).N((class04453)((class06202)this.y_0).T_4, var1);
         ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
      }

      if (((class11507)((AttackAura)this.y_1).i_3).i() && (Integer)this.y_5 <= 0 && class11907.N(var1, (class04453)((class06202)this.y_0).T_4)) {
         this.y_3 = true;
      }

      if (class06584.N(class06570.Gm)) {
         this.y_4 = 20;
      }
   }

   public boolean y(class07438 var1) {
      this.W();
      return !((class11507)((AttackAura)this.y_1).i_3).i() || !(Boolean)this.y_3;
   }

   public boolean y(class11915 var1) {
      this.W();
      return ((class04453)((class06202)this.y_0).T_4).field_6017 <= 1.0
         ? false
         : var1.u().R() && ((class04453)((class06202)this.y_0).T_4).field_6017 > 1.5 || var1.u().L();
   }

   public boolean y() {
      this.W();
      if (((class04453)((class06202)this.y_0).T_4).method_6047().L(class02484.c)) {
         return false;
      } else if (((class11535)((AttackAura)this.y_1).B_3).U()) {
         return false;
      } else {
         return !((class11535)((AttackAura)this.y_1).Z_1).U()
            ? true
            : ((class04474)((class04453)((class06202)this.y_0).T_4).L_1).field_54155.i() || !((class04453)((class06202)this.y_0).T_4).method_24828();
      }
   }

   public boolean y(class07438 var1, class06889 var2, double var3) {
      this.W();
      if (this.y() && (Boolean)this.y_2) {
         class11915 class11915 = class11899.N(1);
         if (this.y(class11915)) {
            this.y_6 = 0;
            return false;
         } else if (!this.N(class11915, var1, var2, var3)) {
            this.y_6 = 0;
            return false;
         } else {
            int i = (Integer)this.y_6 + 1;
            this.y_6 = i;
            if (i >= 10) {
               this.y_6 = 0;
               return false;
            } else {
               return true;
            }
         }
      } else {
         this.y_6 = 0;
         return false;
      }
   }

   public class11499 y(class07438 var1, boolean var2, double var3) {
      class11499 class11499 = this.N(var1, var2, var3);
      class11820 class11820 = class11820.N(var1, class11499, var2);
      class11938.L().L(class11820);
      return class11820.N();
   }

   public abstract class06889 N(class07438 var1, double var2);

   public int N() {
      return 10;
   }

   public boolean N(class11915 var1, class07438 var2, class06889 var3, double var4) {
      this.W();
      double d0 = 2.0;
      double d1 = (var2.method_23317() - var2.field_6014) * d0;
      double d2 = (var2.method_23318() - var2.field_6036) * d0;
      double d3 = (var2.method_23321() - var2.field_5969) * d0;
      double d4 = var2.method_23318() - ((class04453)((class06202)this.y_0).T_4).method_23318();
      if (d4 > 0.0 && d4 <= 1.5 && d2 < 0.0) {
         return false;
      } else if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm) && var1.i() < 1.0) {
         return true;
      } else if (var1.i() < 1.0) {
         return false;
      } else {
         if ((Boolean)((class04453)((class06202)this.y_0).T_4).R_6 && this.y(class11899.N(2))) {
            ((AttackAura)this.y_1).L(1);
            ((AttackAura)this.y_1).y(1);
         }

         class07438 class07438 = var1.u().i();
         class06889 class06889x = class07438.method_33571();
         class06889 class06889x = var3.y(d1, d2, d3);
         if (!((AttackAura)this.y_1).l() && !class11892.N(class06889x, class06889x, class05849.field_17558, class05835.field_1348)) {
            return false;
         } else {
            class00734 class00734 = class07438.method_5829().L(var1.u().N()).M(0.1);
            return ((class03448)((class06202)this.y_0).T_3).u(class00734)
               ? false
               : var2.method_5829().u(d1, d2, d3).y(class06889x, class06889x).map(var3x -> var3x.R(class06889x) < var4).orElse(false);
         }
      }
   }

   public boolean N(class11915 var1) {
      this.W();
      return (Boolean)((class04453)((class06202)this.y_0).T_4).R_6 && !class11315.N(this.N() - 1) && var1.i() > 0.0 && !class11315.N(1.5F);
   }

   public boolean N(class07438 var1, class06889 var2, double var3) {
      this.W();
      class06889 class06889x = ((class04453)((class06202)this.y_0).T_4).method_33571();
      class06889 class06889x = class11505.N(var2).U().L(var3).i(class06889x);
      return !class11892.N(class06889x, class06889x, var1);
   }

   public void N(class07438 var1) {
      this.W();
      if ((Integer)this.y_4 > 0) {
         this.y_4 = (Integer)this.y_4 - 1;
      }

      if ((Integer)this.y_5 > 0) {
         this.y_5 = (Integer)this.y_5 - 1;
      }

      this.y_2 = this.u();
      if ((Boolean)this.y_2 && (Integer)this.y_5 <= 0 && class11907.N(var1, (class04453)((class06202)this.y_0).T_4)) {
         this.y_3 = true;
      }

      class11499 class11499;
      if (this.L(var1)) {
         class11499 = this.y(var1, true, ((AttackAura)this.y_1).m());
         if (!this.N(var1, class11499)) {
            this.u(var1);
         }
      } else {
         class11499 = this.y(var1, false, ((AttackAura)this.y_1).d());
      }

      class11534.y(class11499.y(((AttackAura)this.y_1).b()));
   }

   public abstract class11499 N(class07438 var1, boolean var2, double var3);

   public boolean N(class07438 var1, class11499 var2) {
      this.W();
      class06889 class06889xx = ((class04453)((class06202)this.y_0).T_4).method_33571();
      class06889 class06889x = var2.U().L(((AttackAura)this.y_1).m()).i(class06889xx);
      class06889 class06889xx = class11892.y(class06889xx, class06889x, var1).orElse(null);
      if (class06889xx == null) {
         return true;
      } else {
         class06584 class06584 = ((class04453)((class06202)this.y_0).T_4).method_6047();
         if (class06584.L(class02484.c)) {
            return false;
         } else {
            class06543 class06543 = (class06543)class06584.method_58694(class02484.I);
            return class06543 != null && !class06543.N((class04453)((class06202)this.y_0).T_4, class06889xx);
         }
      }
   }

   private void W() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = false;
         this.y_3 = false;
         this.y_4 = 0;
         this.y_5 = 0;
         this.y_6 = 0;
      }
   }
}
