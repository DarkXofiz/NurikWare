package NurikWare;

import baritone.api.BaritoneAPI;
import baritone.api.selection.ISelection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00891;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;

@class11080(
   L = "Nuker",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class Nuker extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   public void P() {
      this.b();
      if (!((Set)this.L_3).isEmpty()) {
         ((Set)this.L_3).clear();
         class11938.L().L(class11364.N(class09378.NUKER));
      }
   }

   public Nuker() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "break-only-allowed-blocks", false);
      this.L_1 = class11524.N(this, "break-only-in-selection", false);
      this.L_2 = class11524.N(this, "height-range", new class11494(-1.0F, 4.0F), new class11494(0.0F, 2.0F), 1.0F);
      this.L_3 = new HashSet();
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_4 = false;
      }
   }

   public Set<class00891> m() {
      this.b();
      return (Set<class00891>)this.L_3;
   }

   private class07209 t() {
      this.b();
      class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_33571();
      if (((class05630)((class06202)super.y_0).i_7).I.R()) {
         class06183 class06183 = class11892.N(
            new class05862(
               class06889x,
               class11505.L().U().L(((class04453)((class06202)super.y_0).T_4).method_55754()).i(class06889x),
               class05849.field_17559,
               class05835.field_1348,
               (class04453)((class06202)super.y_0).T_4
            )
         );
         if (class06183.N() != class07113.field_1333) {
            return class06183.u();
         }
      }

      float f = 4.5F;
      class11494 class11494 = ((class11525)this.L_2).i();
      class06889 class06889x = new class06889(
         ((class04453)((class06202)super.y_0).T_4).method_23317(),
         Math.ceil(((class04453)((class06202)super.y_0).T_4).method_23318()),
         ((class04453)((class06202)super.y_0).T_4).method_23321()
      );
      class00734 class00734 = new class00734(class06889x, class06889x).L(f, class11494.L(), f).u(0.0, class11494.L() + class11494.N(), 0.0);
      HashSet hashset = new HashSet();

      for (class07209 class07209xx : class07209.method_62671(class00734)) {
         if (!this.N(class07209xx)) {
            hashset.add(class07209xx.method_10062());
         }
      }

      class07209 class07209x = class07209.method_49638(class06889x);
      class07209 class07209xx = class07209.method_49638(class06889x).method_10074();
      return hashset.stream()
         .min(
            Comparator.<class07209>comparingDouble(var1x -> var1x.method_10264() > class07209.method_10264() ? 0.0 : 1.0)
               .thenComparing(var1x -> var1x.method_10262(class07209x))
         )
         .orElse(null);
   }

   private boolean y(class07209 var1) {
      this.b();
      return !((class11507)this.L_1).i()
         ? false
         : Arrays.stream(BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)((class06202)super.y_0).T_4).getSelectionManager().getSelections())
            .noneMatch(var1x -> var1x.aabb().y(var1));
   }

   @Override
   public void y() {
      this.b();
      if (((Set)this.L_3).isEmpty()) {
         class11303.y(class11921.N("nuker.allowed-blocks-empty", (Character)class10626.N_1).N(class06541.field_1080));
      }

      this.L_4 = false;
      this.L_5 = null;
      super.y();
   }

   public boolean y(class00891 var1) {
      this.b();
      if (((Set)this.L_3).removeIf(var1x -> var1x == var1)) {
         class11938.L().L(class11364.N(class09378.NUKER));
         return true;
      } else {
         return false;
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      this.L_4 = false;
      if (!((class04453)((class06202)super.y_0).T_4).method_6115()) {
         if (!this.N((class07209)this.L_5) || (this.L_5 = this.t()) != null) {
            class06889 class06889x = (class06889)((class03448)((class06202)super.y_0).T_3)
               .method_8320((class07209)this.L_5)
               .R((class03448)((class06202)super.y_0).T_3, (class07209)this.L_5)
               .method_1096(((class07209)this.L_5).method_10263(), ((class07209)this.L_5).method_10264(), ((class07209)this.L_5).method_10260())
               .method_33661(((class04453)((class06202)super.y_0).T_4).method_33571())
               .get();
            class11499 class11499 = class11505.N().N(class11505.N(class11505.N(), class06889x)).u(true).N(true);
            if (Math.abs(class11499.R()) == 90.0F) {
               class11499 = new class11499(((class04453)((class06202)super.y_0).T_4).method_36454(), class11499.R()).u(true).N(true);
            }

            class06889 class06889x = class11499.U()
               .L(((class04453)((class06202)super.y_0).T_4).method_55754())
               .i(((class04453)((class06202)super.y_0).T_4).method_33571());
            class06183 class06183 = class11892.N(
               new class05862(
                  ((class04453)((class06202)super.y_0).T_4).method_33571(),
                  class06889x,
                  class05849.field_17559,
                  class05835.field_1348,
                  (class04453)((class06202)super.y_0).T_4
               )
            );
            if (class06183.N() != class07113.field_1333) {
               class11534.y(class11499);
               if (((class03443)((class06202)super.y_0).T_2).y(class06183.u(), class06183.i())) {
                  this.L_4 = true;
                  ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
               }
            }
         }
      }
   }

   @class11782
   public void N(class11397 var1) {
      this.b();
      if ((Boolean)this.L_4) {
         var1.N();
      }
   }

   private boolean N(class07209 var1) {
      this.b();
      if (var1 == null) {
         return true;
      } else if (this.y(var1)) {
         return true;
      } else {
         class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
         if (!class00500.P() && class00500.i((class03448)((class06202)super.y_0).T_3, var1) != -1.0F) {
            if (((class04453)((class06202)super.y_0).T_4)
               .method_21701((class03448)((class06202)super.y_0).T_3, var1, ((class03443)((class06202)super.y_0).T_2).U())) {
               return true;
            } else if (((class11507)this.L_0).i() && !((Set)this.L_3).contains(class00500.i())) {
               return true;
            } else {
               class00494 class00494 = class00500.R((class03448)((class06202)super.y_0).T_3, var1);
               if (class00494.method_1110()) {
                  return true;
               } else {
                  Optional<class06889> optional = class00494.method_1096(var1.method_10263(), var1.method_10264(), var1.method_10260())
                     .method_33661(((class04453)((class06202)super.y_0).T_4).method_33571());
                  return optional.isEmpty()
                     || optional.get().R(((class04453)((class06202)super.y_0).T_4).method_33571()) > ((class04453)((class06202)super.y_0).T_4).method_55754();
               }
            }
         } else {
            return true;
         }
      }
   }

   public boolean N(class00891 var1) {
      this.b();
      if (((Set)this.L_3).add(var1)) {
         class11938.L().L(class11364.N(class09378.NUKER));
         return true;
      } else {
         return false;
      }
   }
}
