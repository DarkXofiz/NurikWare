package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00869;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08052;

@class11080(
   L = "AutoDripstone",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoDripstone extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0;
      }
   }

   public AutoDripstone() {
      super();
      this.P();
   }

   @Override
   public boolean i() {
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         class11322.i();
      }

      return super.i();
   }

   private class10916 s() {
      ArrayList arraylist = new ArrayList();

      for (class07209 class07209 : class07209.method_62671(
         ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class04453)((class06202)super.y_0).T_4).method_55754())
      )) {
         class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(class07209);
         if (class00500.i() instanceof class00624 class00624 && this.N(class07209, class00500, class00624)) {
            arraylist.add(
               new class10916(
                  class00500,
                  class00500.R((class03448)((class06202)super.y_0).T_3, class07209)
                     .method_1096(class07209.method_10263(), class07209.method_10264(), class07209.method_10260()),
                  class07209.method_10062(),
                  (Boolean)class00500.L(class00624.y)
               )
            );
         }
      }

      class06889 class06889 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      return arraylist.stream().min(Comparator.comparingDouble(var1x -> class06889.M(var1x.L().method_46558()))).orElse(null);
   }

   private void j() {
      if (!this.N(((class04453)((class06202)super.y_0).T_4).method_6047())) {
         class11281.N(class11281.R(class06570.wC)).ifPresent(class11322::u);
      }
   }

   private boolean N(class07209 var1, class00500 var2, class00624 var3) {
      if (!((class11066)var3).am_().L()) {
         return false;
      } else if (var2.L(class00624.L) != class08052.field_12617) {
         return false;
      } else {
         for (int i = 1; i <= 2; i++) {
            class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1.method_10087(i));
            if (!class00500.P() && class00500.i() != class00869.vp) {
               return false;
            }
         }

         return true;
      }
   }

   private void N(class10916 var1) {
      this.P();
      class06889 class06889xx = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class06889 class06889x = var1.N().method_33661(((class04453)((class06202)super.y_0).T_4).method_33571()).orElse(class06889xx);
      class11499 class11499 = class11505.N().N(class11505.N(class11505.N(), class06889x)).u(true).N(true);
      class06889 class06889xx = class11499.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()).i(class06889xx);
      class06183 class06183 = var1.y().R((class03448)((class06202)super.y_0).T_3, var1.L()).method_1092(class06889xx, class06889xx, var1.L());
      if (class06183 != null && class06183.N() != class07113.field_1333) {
         class11534.y(class11499);
         class11907.N(class07050.field_5808, class06183);
         this.L_0 = false;
      }
   }

   private boolean N(class06584 var1) {
      return var1.N(class06570.wC);
   }

   public boolean N(class06584 var1, class06183 var2, class07050 var3) {
      if (var1.B() instanceof class06918 class06918) {
         class06942 class06942 = new class06942((class03448)((class06202)super.y_0).T_3, (class04453)((class06202)super.y_0).T_4, var3, var1, var2);
         if (!class06942.N()) {
            return false;
         } else {
            return ((class03448)((class06202)super.y_0).T_3).method_31606(class06942.method_8037()) ? false : ((class12010)class06918).N(class06942) != null;
         }
      } else {
         return false;
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.P();
      class10916 class10916 = this.s();
      if (class10916 != null) {
         this.j();
         if (class10916.u()) {
            this.N(class10916);
         } else if (((class03448)((class06202)super.y_0).T_3).method_8320(class10916.L().method_10074()).i() == class00869.vp) {
            this.N(class10916);
         } else if ((Integer)this.L_1 + 5 <= class11938.j().y()) {
            for (class07050 class07050 : class07050.values()) {
               if (this.N(((class04453)((class06202)super.y_0).T_4).method_5998(class07050))) {
                  this.N(class10916, class07050);
                  break;
               }
            }
         }
      }
   }

   private void N(class10916 var1, class07050 var2) {
      this.P();
      class06889 class06889xxx = ((class04453)((class06202)super.y_0).T_4).method_33571();

      for (class07211 class07211 : List.of(
         class07211.field_11043, class07211.field_11034, class07211.field_11039, class07211.field_11035, class07211.field_11036
      )) {
         class07209 class07209x = var1.L().method_10074();
         class07209 class07209x = class07209x.method_10093(class07211);
         class00494 class00494 = ((class03448)((class06202)super.y_0).T_3).method_8320(class07209x).R((class03448)((class06202)super.y_0).T_3, class07209x);
         if (!class00494.method_1110()) {
            class06889 class06889x = class07209x.method_46558();
            class06889 class06889xx = class00494.method_1096(class07209x.method_10263(), class07209x.method_10264(), class07209x.method_10260())
               .method_33661(class06889x)
               .orElse(class06889x);
            class11499 class11499 = class11505.N().N(class11505.N(class11505.N(), class06889xx)).u(true).N(true);
            class06889 class06889xxx = class11499.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()).i(class06889xxx);
            class06183 class06183 = class00494.method_1092(class06889xxx, class06889xxx, class07209x);
            if (class06183 != null
               && class06183.N() != class07113.field_1333
               && class06183.i() == class07211.b()
               && this.N(((class04453)((class06202)super.y_0).T_4).method_5998(var2), class06183, var2)) {
               if (!((class04453)((class06202)super.y_0).T_4).method_5715()) {
                  this.L_0 = true;
               } else {
                  class11534.y(class11499);
                  class11907.N(var2, class06183);
                  this.L_1 = class11938.j().y();
               }
               break;
            }
         }
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.P();
      if ((Boolean)this.L_0 != null) {
         var1.y((Boolean)this.L_0);
         if ((Boolean)this.L_0 && ((class04453)((class06202)super.y_0).T_4).method_31549().y) {
            var1.i(true);
         }

         this.L_0 = null;
      }
   }
}
