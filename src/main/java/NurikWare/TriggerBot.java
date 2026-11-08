package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class04477;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06543;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class08172;

@class11080(
   L = "TriggerBot",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class TriggerBot extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object i_7;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public boolean M_init;
   public static Object B_0;
   public static Object B_1;

   private boolean L(class07049 var1) {
      this.T();
      if (!this.n()) {
         return false;
      } else if (!(Boolean)this.M_0) {
         return false;
      } else {
         class11915 class11915 = class11899.N(1);
         return !(((class04453)((class06202)super.y_0).T_4).field_6017 > 1.0)
               || (!class11915.u().R() || !(((class04453)((class06202)super.y_0).T_4).field_6017 > 1.5)) && !class11915.u().L()
            ? this.N(class11915, var1, class11895.N(var1), ((class04453)((class06202)super.y_0).T_4).method_55755())
            : false;
      }
   }

   private void T() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = 0;
         this.L_5 = 0;
         this.L_6 = false;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = false;
         this.M_1 = 0;
         this.M_2 = false;
      }
   }

   private void Q() {
      for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
         if (class04477 instanceof class10401) {
            class11907.N((class10401)class04477, true);
         }
      }
   }

   public TriggerBot() {
      super();
      this.T();
      this.u_0 = new class11785("invisible", false);
      this.u_1 = new class11786("naked", true);
      this.u_2 = new class11793("bot", true);
      this.u_3 = new class11809<>(
         class11791.B().and(class11791.N()).and(class11791.u().negate()).and((class11786)this.u_1).and((class11793)this.u_2).and((class11785)this.u_0),
         "players",
         true
      );
      this.i_0 = new class11809<>(class11791.L().and(class11791.N()).and(class11791.R().negate()), "animals", true);
      this.i_1 = new class11809<>(class11791.U().and(class11791.N()).and(class11791.R().negate()), "monsters", true);
      this.i_2 = new class11809<>(class11791.R().and(class11791.N()), "villagers", true);
      this.i_3 = class11524.y(this, "targets", (class11809)this.u_3, (class11809)this.i_0, (class11809)this.i_1, (class11809)this.i_2);
      this.i_4 = (class11523)class11524.y(this, "target-condition", (class11785)this.u_0, (class11786)this.u_1, (class11793)this.u_2).N(var1 -> {
         this.T();
         return ((class11809)this.u_3).U();
      });
      this.i_5 = class11524.y(
         this, "do-not-attack", class11160.u(false), class11160.N(false), class11160.L(false), class11160.y(false), class11160.R(false), class11160.i(false)
      );
      this.i_6 = new class11535("critical-disabled", true);
      this.i_7 = new class11535("critical-always", false);
      this.R_0 = new class11535("critical-only-space", false);
      this.R_1 = class11524.N(this, "critical-hit", (class11535)this.i_6, (class11535)this.i_7, (class11535)this.R_0);
      this.R_2 = new class11535("disable", true);
      this.R_3 = new class11535("default", false);
      this.R_4 = new class11535("fast", false);
      this.R_5 = (class11517)class11524.N(this, "reset-sprint", (class11535)this.R_2, (class11535)this.R_3, (class11535)this.R_4).N(var1 -> {
         this.T();
         return !((class11535)this.i_6).U();
      });
      this.R_6 = class11524.N(this, "shield-break", true);
      this.R_7 = class11524.N(this, "auto-mace", true);
   }

   static {
      l();
   }

   private void s() {
      if (class11892.N((class04453)((class06202)super.y_0).T_4, ((class04453)((class06202)super.y_0).T_4).method_55755(), true, this::y) instanceof class06145 class06145
         )
       {
         class07049 class07049 = class06145.L();
         if (this.y(class07049) && this.N(class07049)) {
            this.N(class07049, null);
         }
      }
   }

   private boolean n() {
      this.T();
      if (((class04453)((class06202)super.y_0).T_4).method_6047().L(class02484.c)) {
         return false;
      } else if (((class11535)this.i_6).U()) {
         return false;
      } else {
         return !((class11535)this.R_0).U()
            ? true
            : ((class04474)((class04453)((class06202)super.y_0).T_4).L_1).field_54155.i() || !((class04453)((class06202)super.y_0).T_4).method_24828();
      }
   }

   private static void l() {
      B_0 = 10;
      B_1 = 2;
   }

   public boolean m() {
      this.T();
      Iterator iterator = ((List)((class11523)this.i_5).i()).iterator();

      while (iterator.hasNext()) {
         if (((class11160)iterator.next()).test((class06202)super.y_0)) {
            return true;
         }
      }

      return false;
   }

   private void t() {
      for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
         if (class04477 instanceof class10401) {
            class11907.y((class10401)class04477);
         }
      }
   }

   private boolean v() {
      this.T();
      if (((class04453)((class06202)super.y_0).T_4).method_6047().N(class06570.Gm)) {
         return true;
      } else {
         return ((class04453)((class06202)super.y_0).T_4).field_6017 < 1.0
            ? false
            : ((class11507)this.R_7).i() && class11281.N(class11281.R(class06570.Gm)).isPresent();
      }
   }

   private void u(int var1) {
      this.T();
      if (var1 == (Integer)this.L_1) {
         this.L_2 = (Integer)this.L_2 + 1;
      } else {
         this.L_1 = var1;
         this.L_2 = 0;
      }

      if ((Integer)this.L_2 >= 2) {
         this.L_0 = Math.max(0, var1 - 10 + 1);
         this.L_1 = 0;
         this.L_2 = 0;
      } else {
         this.L_0 = 0;
      }
   }

   private boolean y(class07049 var1) {
      this.T();
      if (var1 == null) {
         return false;
      } else if (!class07042.B.test(var1)) {
         return false;
      } else {
         Iterator iterator = ((List)((class11523)this.i_3).i()).iterator();

         while (iterator.hasNext()) {
            if (((class11809)iterator.next()).test(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   private void N(class08172 var1) {
      class06543 class06543 = ((class04453)((class06202)super.y_0).T_4).method_76693();
      this.Q();

      try {
         if (!(
            class11892.N(
               (class04453)((class06202)super.y_0).T_4,
               (Float)((class04453)((class06202)super.y_0).T_4).R_1,
               (Float)((class04453)((class06202)super.y_0).T_4).R_2,
               class06543.y((class04453)((class06202)super.y_0).T_4),
               false,
               this::y
            ) instanceof class06145 class06145
         )) {
            return;
         }

         class07049 class07049 = class06145.L();
         if (!this.y(class07049) || !this.N(class07049)) {
            return;
         }

         if (!class06543.N((class04453)((class06202)super.y_0).T_4, class06145.y())) {
            return;
         }

         if (class11892.N(((class04453)((class06202)super.y_0).T_4).method_33571(), class06145.y(), class05849.field_17558, class05835.field_1348)) {
            this.N(class07049, var1);
            return;
         }
      } finally {
         this.t();
      }
   }

   @class11782
   public void N(class11373 var1) {
      this.T();
      if (((class11507)this.R_7).i() && (Boolean)this.M_2) {
         this.M_2 = false;
         class11322.i();
      }
   }

   private boolean N(class11915 var1, class07049 var2, class06889 var3, double var4) {
      this.T();
      if (((class04453)((class06202)super.y_0).T_4).method_6047().N(class06570.Gm) && var1.i() < 1.0) {
         return true;
      } else if (var1.i() < 1.0) {
         return false;
      } else {
         if ((Boolean)((class04453)((class06202)super.y_0).T_4).R_6) {
            this.L_3 = 1;
         }

         this.L_4 = 3;
         class07438 class07438 = var1.u().i();
         class06889 class06889 = class07438.method_33571();
         if (!class11892.N(class06889, var3, class05849.field_17558, class05835.field_1348)) {
            return false;
         } else {
            class00734 class00734 = class07438.method_5829().L(var1.u().N()).M(0.1);
            if (((class03448)((class06202)super.y_0).T_3).u(class00734)) {
               return false;
            } else {
               double d0 = var2.method_23317() - var2.field_6014;
               double d1 = var2.method_23318() - var2.field_6036;
               double d2 = var2.method_23321() - var2.field_5969;
               return var2.method_5829().u(d0, d1, d2).y(class06889, var3.y(d0, d1, d2)).map(var3x -> var3x.R(class06889) < var4).orElse(true);
            }
         }
      }
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class11385 var1) {
      this.T();
      if ((Integer)this.L_3 > 0) {
         this.L_3 = (Integer)this.L_3 - 1;
         var1.B(false);
      }

      if ((Integer)this.L_4 > 0) {
         this.L_4 = (Integer)this.L_4 - 1;
         var1.M(false);
      }
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11380 var1) {
      this.T();
      if ((class04453)((class06202)super.y_0).T_4 != null && !this.m()) {
         if ((Integer)this.M_1 > 0) {
            this.M_1 = (Integer)this.M_1 - 1;
         }

         this.M_0 = this.v();
         class08172 class08172 = (class08172)((class04453)((class06202)super.y_0).T_4).method_6047().method_58694(class02484.c);
         if (class08172 != null) {
            this.N(class08172);
         } else {
            this.s();
         }
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.T();
      if (((class11507)this.R_7).i() && !(((class04453)((class06202)super.y_0).T_4).field_6017 < 1.0)) {
         int i = class11281.R(class06570.Gm);
         if (!class11281.y(i)) {
            class11322.N(i);
            this.M_2 = true;
         }
      }
   }

   private boolean N(class07049 var1) {
      this.T();
      if ((Boolean)this.L_6 && var1 instanceof class07438 class07438 && class11907.N(class07438, (class04453)((class06202)super.y_0).T_4)) {
         return true;
      } else if (((class04453)((class06202)super.y_0).T_4).method_75202(((class04453)((class06202)super.y_0).T_4).method_6047(), 0)) {
         return false;
      } else if (class11315.N(this.Y())) {
         return false;
      } else {
         boolean flag = class11315.y();
         if (this.n() && flag && !(Boolean)this.M_0) {
            if (((class04453)((class06202)super.y_0).T_4).field_6017 == 0.0) {
               return false;
            }

            if (!((class11535)this.R_2).U()) {
               class11915 class11915 = class11899.N(1);
               if (this.N(class11915)) {
                  if (((class11535)this.R_4).U()) {
                     this.L_4 = 1;
                     ((class04453)((class06202)super.y_0).T_4).method_5728(false);
                  } else {
                     this.L_3 = 1;
                  }
               }

               if ((Boolean)((class04453)((class06202)super.y_0).T_4).R_6) {
                  return false;
               }
            }
         }

         if (class11315.N(this.n()) && flag) {
            return false;
         } else {
            boolean flag1 = (Boolean)this.M_0 && ((class04453)((class06202)super.y_0).T_4).field_6017 > 1.3F && (Integer)this.M_1 <= 0;
            return !flag1 && class11315.L() ? false : !this.L(var1);
         }
      }
   }

   private void N(class07049 var1, class08172 var2) {
      this.T();
      int i = class11315.N();
      if ((Boolean)this.L_6) {
         this.L_6 = false;
         if (var1 instanceof class07438 class07438 && class11907.N(class07438, (class04453)((class06202)super.y_0).T_4)) {
            class11907.y(class07438);
            return;
         }
      }

      if (((class04453)((class06202)super.y_0).T_4).method_6039()) {
         ((class03443)((class06202)super.y_0).T_2).y((class04453)((class06202)super.y_0).T_4);
      }

      boolean flag = ((class04453)((class06202)super.y_0).T_4).method_6047().N(class06570.Gm);
      if (var2 != null) {
         if (((class03443)((class06202)super.y_0).T_2).Z()) {
            return;
         }

         ((class03443)((class06202)super.y_0).T_2).N(var2);
      } else {
         ((class03443)((class06202)super.y_0).T_2).N((class04453)((class06202)super.y_0).T_4, var1);
      }

      ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
      this.L_5 = (Integer)this.L_5 + 1;
      if (var1 instanceof class07438) {
         TargetEsp.N((class07438)var1, 15);
         if (((class11507)this.R_6).i()) {
            this.L_6 = true;
         }
      }

      if (flag) {
         this.M_1 = 20;
      }

      this.u(i);
   }

   public boolean N(class11915 var1) {
      return (Boolean)((class04453)((class06202)super.y_0).T_4).R_6 && !class11315.N(this.Y() - 1) && var1.i() > 0.0 && !class11315.N(1.5F);
   }

   private int Y() {
      this.T();
      return 10 + (Integer)this.L_0;
   }
}
