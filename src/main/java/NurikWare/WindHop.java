package NurikWare;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;

@class11080(
   L = "WindHop",
   y = class11072.MOVEMENT,
   N = class11106.TOOLS
)
public class WindHop extends class11067 {
   public Object L_0;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public static Object i_0;
   public static Object i_1;
   public static Object i_2;
   public static Object i_3;
   public static Object i_4;

   public WindHop() {
      super();
      this.m();
      this.u_0 = class11524.N(this, "auto-jump", true);
      this.u_1 = class11524.N(this, "jump-key", class12002.UNKNOWN);
      this.u_2 = class11524.N(this, "combo-key", class12002.UNKNOWN);
      this.u_3 = class11328.N(class06570.Gz);
      this.u_4 = class11328.N(class06570.nz);
      this.u_5 = new ArrayDeque();
   }

   static {
      v();
   }

   @Override
   public boolean i() {
      this.m();
      ((Deque)this.u_5).clear();
      this.L_0 = null;
      this.u_6 = false;
      this.u_7 = false;
      class11322.i();
      return true;
   }

   private void n() {
      this.m();
      class10890 class10890 = (class10890)((Deque)this.u_5).poll();
      if (class10890 != null) {
         this.N(class10890);
      }
   }

   private void m() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_6 = false;
         this.u_7 = false;
      }
   }

   private static void v() {
      i_0 = 90;
      i_1 = -90;
      i_2 = 5;
      i_3 = 10;
      i_4 = 2;
   }

   private void N(class10890 var1) {
      this.m();
      class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_6079();
      if (var1.y().test(class06584) && !((class04453)((class06202)super.y_0).T_4).method_7357().N(class06584)) {
         this.L_0 = new class10908(-1, -1, class07050.field_5810, var1.L(), var1.N(), var1.u());
      } else {
         class11297 class11297 = class11281.N(var1.y());
         if (class11297 != null && !((class04453)((class06202)super.y_0).T_4).method_7357().N(class11297.N())) {
            int i = class11297.y();
            if (class11281.u(i)) {
               this.L_0 = new class10908(i, -1, class07050.field_5808, var1.L(), var1.N(), var1.u());
            } else {
               int j = ((class04453)((class06202)super.y_0).T_4).method_31548().M();
               class11938.m().N(0, i, j, class07510.field_7791).y((class12040)(var4x -> {
                  this.m();
                  this.L_0 = new class10908(j, i, class07050.field_5808, var1.L(), var1.N(), var1.u());
               })).y();
            }
         } else {
            ((Deque)this.u_5).clear();
            this.u_7 = false;
         }
      }
   }

   private void N(class07050 var1) {
      ((class03443)((class06202)super.y_0).T_2)
         .N(
            (class03448)((class06202)super.y_0).T_3,
            var2 -> new class07843(
               var1, var2, ((class04453)((class06202)super.y_0).T_4).method_36454(), ((class04453)((class06202)super.y_0).T_4).method_36455()
            )
         );
      ((class04453)((class06202)super.y_0).T_4).method_6104(var1);
   }

   @class11782
   public void N(class10992 var1) {
      this.m();
      if ((class10908)this.L_0 != null) {
         class11534.N(new class11499(class11505.N().y(), ((class10908)this.L_0).N()).N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0).u(true));
         if (!(Math.abs(((class04453)((class06202)super.y_0).T_4).method_36455() - ((class10908)this.L_0).N()) > 5.0F)) {
            if (((class10908)this.L_0).y()) {
               class11938.Z().N(() -> {
                  this.m();
                  this.u_6 = true;
               });
            }

            int i = ((class10908)this.L_0).i();
            if (i != -1) {
               class11322.N(i);
            }

            this.N(((class10908)this.L_0).L());
            int j = ((class10908)this.L_0).u();
            class11938.Z().y(4, () -> {
               class11322.i();
               if (j != -1 && i != -1) {
                  class11938.m().N(0, j, i, class07510.field_7791).y();
               }
            });
            int k = ((class10908)this.L_0).R();
            this.L_0 = null;
            if (((Deque)this.u_5).isEmpty()) {
               this.u_7 = false;
            } else {
               class11938.Z().y(Math.max(1, k), this::n);
            }
         }
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.m();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null) {
         if ((class10908)this.L_0 == null && ((Deque)this.u_5).isEmpty()) {
            if (((class11527)this.u_1).N(var1)) {
               ((Deque)this.u_5).add(new class10890((class11328)this.u_3, 90, true, 0));
               class11938.Z().N(this::n);
            } else {
               if (((class11527)this.u_2).N(var1)) {
                  this.u_7 = true;
                  ((Deque)this.u_5).add(new class10890((class11328)this.u_3, 90, true, 10));
                  ((Deque)this.u_5).add(new class10890((class11328)this.u_4, -90, false, 1));
                  ((Deque)this.u_5).add(new class10890((class11328)this.u_3, -90, false, 0));
                  class11938.Z().N(this::n);
               }
            }
         }
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.m();
      if ((Boolean)this.u_7) {
         var1.B(false);
         var1.u(false);
         var1.L(false);
         var1.R(false);
         var1.M(false);
         var1.y(false);
      }

      if ((Boolean)this.u_6) {
         if (((class11507)this.u_0).i()) {
            var1.i(true);
            this.u_6 = false;
         }
      }
   }
}
