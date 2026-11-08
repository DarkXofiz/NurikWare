package NurikWare;

import java.util.List;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00486;
import minecraft.class00524;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;
import minecraft.class08082;

public class class11112 extends class11127 {
   public class11112(AutoJoin var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   private void B() {
      int i = class11281.R(class06570.jJ);
      if (!class11281.y(i)) {
         class11322.i(i);
         class11499 class11499 = class11505.N();
         ((class03443)((class06202)super.N_0).T_2)
            .N((class03448)((class06202)super.N_0).T_3, var1x -> new class07843(class07050.field_5808, var1x, class11499.y(), class11499.R()));
      }
   }

   private void y(class00524 var1) {
      if ((class04453)((class06202)super.N_0).T_4 != null && (class03443)((class06202)super.N_0).T_2 != null) {
         List<class06584> list = var1.L();

         for (int i = 0; i < list.size(); i++) {
            if (list.get(i).d().getString().equals("⚔ Дуэли 1.16.5 ⚔")) {
               ((class03443)((class06202)super.N_0).T_2).N(var1.N(), i, 0, class07510.field_7790, (class04453)((class06202)super.N_0).T_4);
               break;
            }
         }
      }
   }

   @Override
   public void y(Object var1) {
      switch (var1) {
         case class10990 class10990:
            this.N(class10990);
            break;
         case class10996 class10996:
            if (((class04453)((class06202)super.N_0).T_4).field_6012 % 10 == 0) {
               this.B();
            }
            break;
         default:
      }
   }

   private void N(class10990 var1) {
      class00381 class00381 = var1.u();
      Objects.requireNonNull(class00381);
      class00381<?> class00381x = class00381;
      switch (class00381x) {
         case class08082 class08082:
            if (!((class08082)class00381x).N().getString().contains("Хаб")) {
               ((class06202)super.N_0).execute(() -> ((AutoJoin)super.y_0).N(false));
            }
            break;
         case class00486 class00486:
            ((class06202)super.N_0).execute(() -> {
               if ((class04453)((class06202)super.N_0).T_4 != null) {
                  this.B();
               }
            });
            break;
         case class00524 class00524:
            ((class06202)super.N_0).execute(() -> this.y(class00524));
            break;
         default:
      }
   }
}
