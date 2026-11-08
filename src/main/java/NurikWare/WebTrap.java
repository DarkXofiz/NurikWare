package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class08036;

@class11080(
   L = "WebTrap",
   y = class11072.COMBAT,
   N = class11106.TOOLS
)
public class WebTrap extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public Object u_0;
   public Object u_1;
   public boolean u_init;

   private class07209 L(class07438 var1) {
      class06889 class06889xxx = this.N(var1);
      class06889 class06889x = new class06889(class06889xxx.M - var1.field_6014, 0.0, class06889xxx.Z - var1.field_5969);
      class06889 class06889xx = class06889xxx.i(class06889x.L(6.0));
      class00734 class00734 = var1.method_5829().L(class06889xx.u(class06889xxx));
      class06889 class06889xxx = this.N(class00734).stream().min(Comparator.comparingDouble(var1x -> var1x.M(class06889x))).orElse(null);
      return class06889xxx == null ? null : class07209.method_49638(class06889xxx);
   }

   private class07438 T() {
      return (class07438)(class11938.u().C().v() instanceof class08036 class08036 && !class11791.u().test(class08036)
         ? class08036
         : ((class03448)((class06202)super.y_0).T_3)
            .N(
               class08036.class,
               ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class04453)((class06202)super.y_0).T_4).method_55754() + 1.0),
               var1x -> var1x != (class04453)((class06202)super.y_0).T_4 && !class11791.u().test(var1x)
            )
            .stream()
            .min(Comparator.comparingDouble(var1x -> var1x.method_73189().M(((class04453)((class06202)super.y_0).T_4).method_73189())))
            .orElse(null));
   }

   public WebTrap() {
      super();
      this.v();
      this.u_0 = class11524.N(this, "place-key", class12002.UNKNOWN);
   }

   static {
      n();
   }

   private void s() {
      this.v();
      this.u_1 = 0;
      class11322.i();
   }

   private static void n() {
      L_0 = 20;
      L_1 = 6.0;
   }

   private void v() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_1 = 0;
      }
   }

   private Supplier<List<class07209>> y(class07209 var1) {
      return () -> List.of(var1.method_10084(), var1);
   }

   private void y(class07438 var1) {
      this.v();
      class07209 class07209x = this.L(var1);
      if (class07209x != null) {
         int i = class11281.R(class06570.Lf);
         boolean flag = ((class04453)((class06202)super.y_0).T_4).method_6079().B() == class06570.Lf;
         if (!class11281.y(i) || flag) {
            class07050 class07050 = flag ? class07050.field_5810 : class07050.field_5808;
            if (!flag && ((class04453)((class06202)super.y_0).T_4).method_31548().N() != i) {
               class11322.N(i);
            }

            class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(class07050);

            for (class07209 class07209x : this.y(class07209x).get()) {
               if (this.N(class07209x, class07050, class06584)) {
                  this.u_1 = 0;
                  break;
               }
            }
         }
      }
   }

   @Override
   public void y() {
      this.s();
      super.y();
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.v();
      if (((class11527)this.u_0).N(var1)) {
         this.u_1 = 20;
      }
   }

   private boolean N(class07209 var1, class07050 var2, class06584 var3) {
      class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
      if (!class00500.N(class00869.yw) && class00500.d()) {
         if (((class04453)((class06202)super.y_0).T_4).method_5829().L(new class00734(var1))) {
            return false;
         } else {
            class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_33571();
            double d0 = ((class04453)((class06202)super.y_0).T_4).method_55754();

            for (class07211 class07211 : class07211.values()) {
               class07209 class07209 = var1.method_10093(class07211.b());
               class00494 class00494 = ((class03448)((class06202)super.y_0).T_3).method_8320(class07209).R((class03448)((class06202)super.y_0).T_3, class07209);
               if (!class00494.method_1110()) {
                  class06889 class06889x = class06889.y(class07209).i(class06889.N(class07211.E()).L(0.5));
                  if (!(class06889x.M(class06889x) > d0 * d0) && this.N(class06889x, class06889x, class07211)) {
                     class11499 class11499x = class11505.N();
                     class11499 class11499x = class11499x.N(class11505.N(class11499x, class06889x)).N(true).u(true);
                     class06183 class06183x = this.N(class11499x, class06889x, class00494, class07209);
                     if (class06183x != null && class06183x.N() != class07113.field_1333 && class06183x.i() == class07211) {
                        class06183 class06183x = this.N(class11499x, class06889x, class00494, class07209);
                        if (this.N(class06183x, class06183x)) {
                           class11499x = class11499x;
                           class06183x = class06183x;
                        }

                        class06942 class06942 = new class06942(
                           (class03448)((class06202)super.y_0).T_3, (class04453)((class06202)super.y_0).T_4, var2, var3, class06183x
                        );
                        if (class06942.N() && class06942.method_8037().equals(var1)) {
                           class11907.N(var2, class06183x);
                           class11534.y(class11499x.N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0));
                           return true;
                        }
                     }
                  }
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean N(class06889 var1, class06889 var2, class07211 var3) {
      return var1.u(var2).y(class06889.N(var3.E())) > 0.0;
   }

   private class06889 N(class07438 var1) {
      return var1.method_73189();
   }

   private boolean N(class06183 var1, class06183 var2) {
      return var1 != null
         && var2 != null
         && var1.N() != class07113.field_1333
         && var2.N() != class07113.field_1333
         && var1.u().equals(var2.u())
         && var1.i() == var2.i();
   }

   @class11782(
      L = {AttackAura.class}
   )
   public void N(class10992 var1) {
      this.v();
      if ((Integer)this.u_1 > 0) {
         this.u_1 = (Integer)this.u_1 - 1;
         class07438 class07438 = this.T();
         if (class07438 == null) {
            this.s();
         } else {
            if (((class11799)((class03443)((class06202)super.y_0).T_2)).N() >= 3) {
               this.y(class07438);
            }

            if ((Integer)this.u_1 <= 0) {
               this.s();
            }
         }
      }
   }

   private List<class06889> N(class00734 var1) {
      ArrayList arraylist = new ArrayList();
      int i = (int)Math.floor(var1.N);
      int j = (int)Math.floor(var1.u);
      int k = (int)Math.floor(var1.L);
      int l = (int)Math.floor(var1.R);

      for (int i1 = i; i1 <= j; i1++) {
         for (int j1 = k; j1 <= l; j1++) {
            arraylist.add(new class06889(i1 + 0.5, var1.y, j1 + 0.5));
         }
      }

      return arraylist;
   }

   private class06183 N(class11499 var1, class06889 var2, class00494 var3, class07209 var4) {
      class06889 class06889 = var2.i(var1.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()));
      return var3.method_1092(var2, class06889, var4);
   }
}
