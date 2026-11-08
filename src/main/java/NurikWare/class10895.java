package NurikWare;

import java.util.Comparator;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;

public class class10895 extends class11807<WallClimb> {
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class10895(WallClimb var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.N();
   }

   @Override
   public void y(Object var1) {
      this.N();
      if (!(var1 instanceof class10992)) {
         if (var1 instanceof WallClimb) {
            this.y_1 = null;
            this.y_0 = 0;
            if ((class04453)((class06202)super.N_0).T_4 != null) {
               class11322.i();
            }
         }
      } else {
         this.y_0 = (Integer)this.y_0 - 1;
         if ((class11499)this.y_1 != null && (Integer)this.y_0 > 0) {
            class11534.y((class11499)this.y_1);
         } else if ((Integer)this.y_0 == 0) {
            this.y_1 = null;
            class11322.i();
         }

         if (((class04453)((class06202)super.N_0).T_4).method_18798().B > 0.0 || ((class04453)((class06202)super.N_0).T_4).method_24828()) {
            return;
         }

         class07050 class07050 = null;
         if (this.N(((class04453)((class06202)super.N_0).T_4).method_6079())) {
            class07050 = class07050.field_5810;
         } else {
            Optional<class11297> optional = class11281.i(this::N).min(Comparator.comparingInt(var1x -> {
               int k = ((class04453)((class06202)super.N_0).T_4).method_31548().N();
               int l = Math.abs(var1x.y() - k);
               return l == 8 ? 1 : l;
            }));
            if (optional.isPresent()) {
               class11297 class11297 = optional.get();
               class07050 = class07050.field_5808;
               class11322.u(class11297.y());
            }
         }

         if (class07050 == null) {
            return;
         }

         class06584 class06584 = ((class04453)((class06202)super.N_0).T_4).method_5998(class07050);
         if (class06584.B() instanceof class06918 class06918) {
            class11915 class11915 = class11899.N(1);
            class06889 class06889x = ((class04453)((class06202)super.N_0).T_4).method_33571();
            class06889 class06889x = ((class04453)((class06202)super.N_0).T_4).method_73189();

            for (int i = -1; i <= 0; i++) {
               class07209[] aclass07209 = this.N(class07209.method_49638(new class06889(class06889x.M, class06889x.B - i - 0.5, class06889x.Z)));

               for (int j = 0; j < 2; j++) {
                  if (this.N(
                     (class12010)class06918,
                     aclass07209,
                     new class06889(class06889x.M, Math.floor(class06889x.B) + 0.9 - i - j, class06889x.Z),
                     class06889x,
                     class07050,
                     class06584,
                     class11915
                  )) {
                     return;
                  }

                  if (this.N(
                     (class12010)class06918,
                     aclass07209,
                     new class06889(class06889x.M, Math.floor(class06889x.B) + 0.1 - i - j, class06889x.Z),
                     class06889x,
                     class07050,
                     class06584,
                     class11915
                  )) {
                     return;
                  }
               }
            }
         }
      }
   }

   private class06183 N(class11499 var1, class06889 var2, class00494 var3, class07209 var4) {
      class06889 class06889 = var2.i(var1.U().L(((class04453)((class06202)super.N_0).T_4).method_55754()));
      return var3.method_1092(var2, class06889, var4);
   }

   private boolean N(class12010 var1, class07050 var2, class06584 var3, class06183 var4, class11915 var5) {
      class06942 class06942 = new class06942((class03448)((class06202)super.N_0).T_3, (class04453)((class06202)super.N_0).T_4, var2, var3, var4);
      if (!class06942.N()) {
         return false;
      } else {
         class00500 class00500 = var1.N(class06942);
         if (class00500 == null) {
            return false;
         } else {
            class00494 class00494 = class00500.M((class03448)((class06202)super.N_0).T_3, class06942.method_8037());
            if (class00494.method_1110()) {
               return false;
            } else if (class00494.method_1107().N(class06942.method_8037()).L(var5.u().i().method_5829())) {
               class11907.N(var2, var4);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private void N() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   private boolean N(class12010 var1, class07209[] var2, class06889 var3, class06889 var4, class07050 var5, class06584 var6, class11915 var7) {
      this.N();

      for (class07209 class07209 : var2) {
         class00494 class00494 = ((class03448)((class06202)super.N_0).T_3).method_8320(class07209).R((class03448)((class06202)super.N_0).T_3, class07209);
         Optional<class06889> optional = class00494.method_66507(class07209).method_33661(var3);
         if (!optional.isEmpty()) {
            class11499 class11499xx = class11505.N();
            class11499 class11499x = class11505.N(class11499xx, optional.get());
            class11499 class11499xx = class11499xx.N(class11499x).N(true).u(true);
            class06183 class06183x = this.N(class11499xx, var4, class00494, class07209);
            if (class06183x != null && class06183x.N() != class07113.field_1333) {
               if ((class11499)this.y_1 != null) {
                  class06183 class06183x = this.N((class11499)this.y_1, var4, class00494, class07209);
                  if (class06183x != null
                     && class06183x.N() != class07113.field_1333
                     && class06183x.u().equals(class06183x.u())
                     && class06183x.i().equals(class06183x.i())) {
                     class11499xx = (class11499)this.y_1;
                     class06183x = class06183x;
                  }
               }

               if (this.N(var1, var5, var6, class06183x, var7)) {
                  class11534.y(class11499xx);
                  this.y_1 = class11499xx;
                  this.y_0 = 10;
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean N(class06584 var1) {
      class06581 class06581 = var1.B();
      return class06581 instanceof class06918
         && !((class06918)class06581).L().W().M((class03448)((class06202)super.N_0).T_3, class07209.field_10980).method_1110();
   }

   private class07209[] N(class07209 var1) {
      class07209[] aclass07209 = new class07209[5];

      for (int i = 0; i < 4; i++) {
         aclass07209[i] = var1.method_10093(class07211.N(((class04453)((class06202)super.N_0).T_4).method_36454() % 360.0F + i * 90));
      }

      aclass07209[4] = var1;
      return aclass07209;
   }
}
