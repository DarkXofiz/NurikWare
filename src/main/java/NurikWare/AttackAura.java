package NurikWare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07113;
import minecraft.class07438;

@class11080(
   L = "AttackAura",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class AttackAura extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public boolean R_init;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object B_3;
   public Object Z_0;
   public Object Z_1;
   public Object Z_2;
   public Object Z_3;
   public Object Z_4;
   public Object Z_5;
   public Object z_0;
   public Object z_1;
   public Object z_2;
   public Object z_3;
   public Object z_4;
   public Object z_5;
   public Object z_6;
   public static Object U_0;

   public void L(int var1) {
      this.Y();
      this.R_3 = var1;
   }

   private boolean L(boolean var1) {
      this.Y();
      if (!((class11507)this.Z_3).i() || (class04453)((class06202)super.y_0).T_4 == null || (Integer)this.R_6 > 0) {
         return false;
      } else if ((class07438)this.R_2 == null || !((class11079)((class11517)this.L_3).i()).y() || !class11315.y()) {
         return false;
      } else {
         return !(((class04453)((class06202)super.y_0).T_4).field_6017 <= 0.0) && !var1 ? !class11315.N(((class11079)((class11517)this.L_3).i()).N()) : false;
      }
   }

   public class11517<class11079> P() {
      this.Y();
      return (class11517<class11079>)this.L_3;
   }

   public boolean T() {
      this.Y();
      Iterator iterator = ((List)((class11523)this.B_0).i()).iterator();

      while (iterator.hasNext()) {
         if (((class11160)iterator.next()).test((class06202)super.y_0)) {
            return true;
         }
      }

      return false;
   }

   private void Q() {
      this.Y();
      if (((class11079)((class11517)this.L_3).i()).L()) {
         for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
            if (class04477 instanceof class10401) {
               class11907.N((class10401)class04477);
            }
         }
      }
   }

   public AttackAura() {
      super();
      this.Y();
      this.u_0 = new class11084(this, "ft", true);
      this.u_1 = new class11103(this, "grim");
      this.u_2 = new class11069(this, "spooky-time");
      this.u_3 = new class11071(this, "noise");
      this.u_4 = new class11091(this, "hw");
      this.u_5 = new class11143("smart", true);
      this.u_6 = new class11159("distance");
      this.z_0 = new class11120("fov");
      this.z_1 = new class11155("health");
      this.z_2 = new class11785("invisible", true);
      this.z_3 = new class11786("naked", true);
      this.z_4 = new class11793("bot", false);
      this.z_5 = new class11809<>(
         class11791.B().and(class11791.N()).and(class11791.u().negate()).and((class11786)this.z_3).and((class11793)this.z_4).and((class11785)this.z_2),
         "players",
         true
      );
      this.z_6 = new class11809<>(class11791.i().and(class11791.N()).and(class11791.R().negate()), "mobs", true);
      this.L_0 = new class11809<>(class11791.R().and(class11791.N()), "villagers", true);
      this.L_1 = class11524.y(this, "targets", (class11809)this.z_5, (class11809)this.z_6, (class11809)this.L_0);
      this.L_2 = (class11523)class11524.y(this, "target-condition", (class11785)this.z_2, (class11786)this.z_3, (class11793)this.z_4).N(var1 -> {
         this.Y();
         return ((class11809)this.z_5).U();
      });
      this.L_3 = class11524.N(this, "mode", (class11084)this.u_0, (class11103)this.u_1, (class11069)this.u_2, (class11071)this.u_3, (class11091)this.u_4);
      this.L_4 = class11524.N(this, "sort", (class11159)this.u_6, (class11143)this.u_5, (class11120)this.z_0, (class11155)this.z_1);
      this.L_5 = new class09164(this, false, "lite", true);
      this.L_6 = (class11517)class11524.N(
            this, "move-correction", new class11122(this, "target-follow", false), new class09164(this, true, "strong", false), (class09164)this.L_5
         )
         .N(((class11084)this.u_0)::U, (class09164)this.L_5)
         .N(var1 -> {
            this.Y();
            return !((class11084)this.u_0).U();
         });
      this.B_0 = class11524.y(
         this, "do-not-attack", class11160.u(false), class11160.N(false), class11160.L(false), class11160.y(false), class11160.R(false), class11160.i(false)
      );
      this.B_1 = new class11535("default", true);
      this.B_2 = (class11517)class11524.N(this, "sprint-mode", (class11535)this.B_1, new class11535("fast", false))
         .N(((class11084)this.u_0)::U, (class11535)this.B_1)
         .N(var1 -> {
            this.Y();
            return !((class11084)this.u_0).U();
         });
      this.B_3 = new class11535("critical-disabled", true);
      this.Z_0 = new class11535("critical-always", false);
      this.Z_1 = new class11535("critical-only-space", false);
      this.Z_2 = class11524.N(this, "critical-hit", (class11535)this.B_3, (class11535)this.Z_0, (class11535)this.Z_1);
      this.Z_3 = (class11507)class11524.N(this, "increase-crit-accuracy", false).N(var1 -> {
         this.Y();
         return !((class11535)this.B_3).U();
      });
      this.Z_4 = class11524.N(this, "fov", 180.0F, 1.0F, 180.0F, 1.0F).N((Supplier<String>)class11502.N_1);
      this.Z_5 = (class11504)class11524.N(this, "additional-range", 0.0F, 0.0F, 3.0F, 0.1F).N(((class11084)this.u_0)::U, 0.0F).N(var1 -> {
         this.Y();
         return !((class11084)this.u_0).U();
      });
      this.i_0 = class11524.N(this, "aim-range", 1.0F, 0.0F, 10.0F, 0.1F);
      this.i_1 = new class11110(this, "disabled", false, false);
      this.i_2 = class11524.N(this, "through-walls", (class11110)this.i_1, new class11110(this, "always", true, true), new class11121(this, "ft", false));
      this.i_3 = class11524.N(this, "shield-break", true);
      this.i_4 = class11524.N(this, "auto-mace", true);
      this.i_5 = (class11507)class11524.N(this, "swap-damage", true).N(((class11084)this.u_0)::U, false).N(var1 -> {
         this.Y();
         return !((class11084)this.u_0).U();
      });
      this.M_0 = new class11061();
      this.M_1 = new class11094(this);
      this.M_2 = Comparator.comparingInt(var0 -> var0.method_5864() == class07078.Ly ? 0 : 1);
      this.R_0 = Comparator.comparingInt(var1 -> this.N(class11895.N(var1), this.m()) ? 1 : 0);
      this.R_1 = new LinkedList();
   }

   static {
      J();
   }

   private static void J() {
      U_0 = 80L;
   }

   public boolean b() {
      this.Y();
      return ((class09164)((class11517)this.L_6).i()).N();
   }

   public boolean s() {
      this.Y();
      return (class07438)this.R_2 != null;
   }

   public boolean n() {
      this.Y();
      if (!((class11507)this.Z_3).i()) {
         return false;
      } else {
         synchronized ((List)this.R_1) {
            return !((List)this.R_1).isEmpty();
         }
      }
   }

   public boolean l() {
      this.Y();
      return ((class11110)((class11517)this.i_2).i()).N();
   }

   public double d() {
      this.Y();
      class11810 class11810 = class11810.y(((class11504)this.i_0).i());
      class11938.L().L(class11810);
      return this.m() + class11810.N();
   }

   public double m() {
      this.Y();
      return ((class04453)((class06202)super.y_0).T_4).method_55755() + ((class11504)this.Z_5).i().floatValue();
   }

   private void o() {
      this.Y();
      if (((class11079)((class11517)this.L_3).i()).L()) {
         for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
            if (class04477 instanceof class10401) {
               class11907.y((class10401)class04477);
            }
         }
      }
   }

   public void t() {
      this.Y();
      ((class11061)this.M_0).M();
   }

   public class07438 v() {
      this.Y();
      return (class07438)this.R_2;
   }

   @Override
   public void j() {
      this.Y();
      if (((class11507)this.i_5).i()) {
         ((class11061)this.M_0).R();
      }
   }

   @Override
   public void y() {
      this.Y();
      this.R_2 = null;
      this.N(0);
      this.R_5 = false;
      if ((Boolean)this.R_7) {
         class11322.i();
         this.R_7 = false;
      }

      ((class11061)this.M_0).L();
      super.y();
   }

   public static boolean y(boolean var0) {
      AttackAura attackaura = class11938.u().C();
      return var0 && ((class07438)attackaura.R_2 == null || !attackaura.U());
   }

   public void y(int var1) {
      this.Y();
      this.R_4 = var1;
   }

   @class11782
   public void y(class11385 var1) {
      this.Y();
      ((class09164)((class11517)this.L_6).i()).y(var1);
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class10965 var1) {
      this.Y();
      if ((Boolean)this.R_5 && !var1.y() && (Integer)this.R_6 <= 0) {
         var1.N();
         synchronized ((List)this.R_1) {
            ((List)this.R_1).add(new class11100(var1.L(), System.currentTimeMillis()));
         }
      } else {
         this.N(0);
      }
   }

   @class11782
   public void N(class09331 var1) {
      this.Y();
      ((class11110)((class11517)this.i_2).i()).y(var1);
   }

   @class11782
   public void N(class11355 var1) {
      this.Y();
      ((class11110)((class11517)this.i_2).i()).y(var1);
      this.R_5 = this.L(var1.R());
   }

   @class11782
   public void N(class11382 var1) {
      this.Y();
      if (((class11507)this.i_4).i() && !(((class04453)((class06202)super.y_0).T_4).field_6017 < 1.0)) {
         if (!(var1.L() instanceof class07438 class07438 && !((class11079)((class11517)this.L_3).i()).y(class07438))) {
            int i = class11281.R(class06570.Gm);
            if (!class11281.y(i)) {
               class11322.N(i);
               this.R_7 = true;
            }
         }
      }
   }

   public boolean N(class06889 var1, double var2) {
      return var1.R(((class04453)((class06202)super.y_0).T_4).method_33571()) > var2;
   }

   public void N(int var1) {
      this.Y();
      synchronized ((List)this.R_1) {
         if ((class04453)((class06202)super.y_0).T_4 == null) {
            ((List)this.R_1).clear();
            return;
         }

         Iterator iterator = ((List)this.R_1).iterator();

         while (iterator.hasNext()) {
            class11910.N(((class11100)iterator.next()).y());
         }

         ((List)this.R_1).clear();
      }

      this.R_6 = var1;
   }

   boolean N(class06889 var1, class07049 var2) {
      class06889 class06889 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class06183 class06183 = class11892.N(
         new class05862(class06889, var1, class05849.field_17559, class05835.field_1348, (class04453)((class06202)super.y_0).T_4)
      );
      return class06183.N() == class07113.field_1333
         ? false
         : class11892.y(class06889, var1, var2).map(var2x -> var2x.R(class06889) > class06183.y().R(class06889)).orElse(true);
   }

   @class11782
   public void N(class10992 var1) {
      this.Y();
      ((class11110)((class11517)this.i_2).i()).y(var1);
      this.Q();
      if (!((class11094)this.M_1).test((class07049)((class07438)this.R_2))) {
         this.R_2 = this.O();
      }

      if ((class07438)this.R_2 != null) {
         ((class11079)((class11517)this.L_3).i()).N((class07438)this.R_2);
         TargetEsp.L((class07438)this.R_2);
      }

      this.o();
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class11380 var1) {
      this.Y();
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         ((class11061)this.M_0).i();
         if ((Integer)this.R_6 > 0) {
            this.R_6 = (Integer)this.R_6 - 1;
            this.R_5 = false;
         }

         synchronized ((List)this.R_1) {
            long i = System.currentTimeMillis();
            Iterator iterator = ((List)this.R_1).iterator();

            while (iterator.hasNext()) {
               class11100 class11100 = (class11100)iterator.next();
               if (i - class11100.N() >= 80L) {
                  class11910.N(class11100.y());
                  iterator.remove();
               }
            }
         }
      }
   }

   public boolean N(class07438 var1) {
      this.Y();
      if (((class11504)this.Z_4).i() == 180.0F) {
         return true;
      } else {
         class11499 class11499 = class11505.L();
         return !class11892.N(class11499, this.m(), var1) || class11499.N(class11895.N(var1, class11499, false, this.m())) < ((class11504)this.Z_4).i();
      }
   }

   @class11782
   public void N(class11373 var1) {
      this.Y();
      ((class11061)this.M_0).M();
      if (((class11507)this.i_4).i() && (Boolean)this.R_7) {
         this.R_7 = false;
         class11322.i();
      }
   }

   @class11782
   public void N(class11359 var1) {
      this.Y();
      ((class11061)this.M_0).N();
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class11385 var1) {
      this.Y();
      if (((class11535)this.B_1).U()) {
         if ((Integer)this.R_3 > 0) {
            var1.B(false);
         }

         if ((Integer)this.R_4 > 0) {
            var1.M(false);
         }
      } else if ((Integer)this.R_3 > 0 || (Integer)this.R_4 > 0) {
         var1.M(false);
         ((class04453)((class06202)super.y_0).T_4).method_5728(false);
      }

      this.R_3 = (Integer)this.R_3 - 1;
      this.R_4 = (Integer)this.R_4 - 1;
   }

   private class07438 O() {
      this.Y();
      return ((class03448)((class06202)super.y_0).T_3)
         .method_8333((class04453)((class06202)super.y_0).T_4, ((class04453)((class06202)super.y_0).T_4).method_5829().M(this.d() + 2.0), (class11094)this.M_1)
         .stream()
         .map(var0 -> (class07438)var0)
         .min(((Comparator)this.R_0).thenComparing((Comparator)this.M_2).thenComparing((Comparator)((class11517)this.L_4).i()))
         .orElse(null);
   }

   public boolean G() {
      this.Y();
      return !((class11507)this.i_5).i() || ((class11061)this.M_0).y();
   }

   private void Y() {
      if (!this.R_init) {
         this.R_init = true;
         this.R_3 = 0;
         this.R_4 = 0;
         this.R_5 = false;
         this.R_6 = 0;
         this.R_7 = false;
      }
   }
}
