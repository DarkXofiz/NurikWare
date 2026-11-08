package NurikWare;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11094 implements Predicate<class07049> {
   public Object N_0;

   class11094(AttackAura var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   static {
      N();
   }

   private void y() {
   }

   public boolean test(class07049 var1) {
      if (var1 == null
         || var1.method_73183() != (class03448)AttackAura.y((AttackAura)this.N_0).T_3
         || !var1.method_5805()
         || var1 == ((class04453)AttackAura.L((AttackAura)this.N_0).T_4).method_5854()) {
         return false;
      } else if (var1 instanceof class07438 class07438) {
         if (((List)((class11523)((AttackAura)this.N_0).L_1).i()).stream().noneMatch(var1x -> var1x.test((class07049)class07438))) {
            return false;
         } else if (!((AttackAura)this.N_0).N(class07438)) {
            return false;
         } else {
            double d0 = ((AttackAura)this.N_0).d();
            class06889 class06889xx = ((class11079)((class11517)((AttackAura)this.N_0).L_3).i()).N(class07438, d0);
            class06889 class06889x = ((class04453)AttackAura.N((AttackAura)this.N_0).T_4).method_33571();
            class06889 class06889xx = class11505.N(class06889xx).U().L(d0).i(class06889x);
            return class11892.N(class06889x, class06889xx, var1) ? false : ((AttackAura)this.N_0).l() || !((AttackAura)this.N_0).N(class06889xx, var1);
         }
      } else {
         return false;
      }
   }

   private static void N() {
   }
}
