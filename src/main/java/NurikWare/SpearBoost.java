package NurikWare;

import java.util.Comparator;
import minecraft.class02484;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07314;
import minecraft.class07463;
import minecraft.class08044;
import minecraft.class08172;

@class11080(
   L = "SpearBoost",
   y = class11072.MOVEMENT,
   N = class11106.TOOLS
)
public class SpearBoost extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public Object u_0;
   public Object u_1;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public boolean R_init;

   private double L(class06584 var1) {
      return ((class02833)var1.a_(class02484.b, class02833.N))
         .y()
         .stream()
         .filter(var0 -> var0.N() == class05298.R && var0.L().y(class07085.field_6173) && var0.y().L() == class07463.field_6328)
         .mapToDouble(var0 -> var0.y().y())
         .sum();
   }

   private void P() {
      this.s();
      int i = class11281.y((class11328)this.R_1);
      if (!class11281.y(i)) {
         class08172 class08172 = (class08172)((class04453)((class06202)super.y_0).T_4).method_31548().method_5438(i).method_58694(class02484.c);
         if (class08172 != null) {
            if (((class11507)this.u_0).i()) {
               this.R_2 = true;
            }

            class11322.u(i);
            this.i_0 = true;
            ((class03443)((class06202)super.y_0).T_2).N(class08172);
            ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
            this.i_1 = true;
            this.R_4 = false;
            this.i_3 = 0;
         }
      }
   }

   private boolean T() {
      this.s();
      int i = class11281.y((class11328)this.R_1);
      if (class11281.y(i)) {
         return false;
      } else {
         class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_31548().method_5438(i);
         return !((class04453)((class06202)super.y_0).T_4).method_75202(class06584, 0);
      }
   }

   public SpearBoost() {
      super();
      this.s();
      this.u_0 = class11524.N(this, "auto-jump", true);
      this.u_1 = class11524.N(this, "rapid", false);
      this.R_0 = class11524.N(this, "boost-key", class12002.UNKNOWN);
      this.R_1 = (class11328)var0 -> var0.L(class02484.c) && class11929.N(var0, class07314.X) > 0;
   }

   static {
      t();
   }

   @Override
   public boolean i() {
      this.s();
      this.R_2 = false;
      this.R_3 = false;
      this.R_4 = false;
      this.i_1 = false;
      this.i_2 = 0;
      this.i_3 = 0;
      this.m();
      return true;
   }

   private void s() {
      if (!this.R_init) {
         this.R_init = true;
         this.R_2 = false;
         this.R_3 = false;
         this.R_4 = false;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = false;
         this.i_1 = false;
         this.i_2 = 0;
         this.i_3 = 0;
      }
   }

   private boolean n() {
      this.s();
      return !this.l() ? false : ((class11507)this.u_1).i() || this.T();
   }

   private boolean l() {
      this.s();
      return (class04453)((class06202)super.y_0).T_4 != null
         && ((class04453)((class06202)super.y_0).T_4).method_76458()
         && !class11281.y(class11281.y((class11328)this.R_1));
   }

   private void m() {
      this.s();
      if ((Boolean)this.i_0) {
         this.i_0 = false;
         class11322.i();
      }
   }

   private static void t() {
      L_0 = 2;
      L_1 = 30;
   }

   private void v() {
      this.s();
      int i = this.y(class11281.y((class11328)this.R_1));
      if (!class11281.y(i)) {
         class11322.u(i);
         this.i_0 = true;
      }
   }

   private int y(int var1) {
      int i = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
      return class11281.i((class11328)(var0 -> true))
         .filter(var1x -> var1x.y() != var1)
         .max(Comparator.<class11297>comparingInt(var2x -> -this.N(var2x.y(), i)).thenComparingDouble(var1x -> this.L(var1x.N())))
         .map(class11297::y)
         .orElse(-1);
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.s();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null) {
         if (var1.y(((class11527)this.R_0).i(), ((class11527)this.R_0).L())) {
            this.R_3 = true;
            this.R_4 = true;
         } else if (var1.N(((class11527)this.R_0).i())) {
            this.R_3 = false;
         }
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.s();
      if ((Boolean)this.R_2 || (Boolean)this.R_3) {
         if (((class11507)this.u_0).i()) {
            var1.i(true);
         }

         this.R_2 = false;
      }
   }

   private int N(int var1, int var2) {
      int i = Math.abs(var1 - var2);
      return Math.min(i, class08044.L() - i);
   }

   @class11782
   public void N(class10992 var1) {
      this.s();
      if (((Boolean)this.R_3 || (Boolean)this.R_4 || (Integer)this.i_2 != 0) && this.l()) {
         if ((Boolean)this.R_4 && !(Boolean)this.R_3) {
            this.i_3 = (Integer)this.i_3 + 1;
            if ((Integer)this.i_3 > 30) {
               this.R_4 = false;
            }
         } else {
            this.i_3 = 0;
         }

         if (!(Boolean)this.i_1) {
            if (this.l() && this.T()) {
               this.P();
               this.i_2 = 0;
               return;
            }

            this.i_1 = true;
         }

         if ((Integer)this.i_2 == 0) {
            this.v();
         } else if (this.n()) {
            this.P();
         }

         this.i_2 = ((Integer)this.i_2 + 1) % 2;
      } else {
         this.m();
         this.i_1 = false;
         this.R_4 = false;
         this.i_2 = 0;
         this.i_3 = 0;
      }
   }
}
