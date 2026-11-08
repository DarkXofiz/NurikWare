package NurikWare;

import java.util.Comparator;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07050;
import minecraft.class07510;

public class class11591 extends class11142 {
   public class11591(ClickAction var1) {
      super(var1, "throw-key");
   }

   static {
      i();
      N();
   }

   private static void i() {
   }

   private boolean y() {
      if (((class04453)((class06202)super.N_0).T_4).method_6079().B() == class06570.nz) {
         class11907.N(class07050.field_5810);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void y(class11389 var1) {
      class11938.Z()
         .N(
            () -> {
               if (!((class04453)((class06202)super.N_0).T_4).method_7357().N(class06570.nz.E()) && !this.y()) {
                  class11281.N(class11281.i(class06570.nz).min(Comparator.comparingInt(var0 -> var0.N().I() ? 1 : 0)).map(class11297::y).orElse(-1))
                     .ifPresent(var1x -> {
                        if (class11281.u(var1x)) {
                           class11322.N(var1x);
                           class11907.N(class07050.field_5808);
                           class11938.Z().y(3, class11322::i);
                        } else {
                           this.N(var1x);
                        }
                     });
               }
            }
         );
   }

   private static void N() {
   }

   private void N(int var1) {
      int i = ((class04453)((class06202)super.N_0).T_4).method_31548().N();
      class11938.m().N(0, var1, i, class07510.field_7791).y((class12040)(var2x -> {
         class11907.N(class07050.field_5808);
         class11938.Z().y(4, () -> class11938.m().N(0, var1, i, class07510.field_7791).y());
      })).y();
   }
}
