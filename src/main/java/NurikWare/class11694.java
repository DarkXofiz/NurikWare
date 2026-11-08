package NurikWare;

import java.util.function.Predicate;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07078;
import minecraft.class07517;

public class class11694 extends class11697 {
   public Object N_0;

   private void M() {
   }

   public class11694(String var1, boolean var2) {
      super(var1, var2);
      this.M();
   }

   private Predicate<class07517> u() {
      return var1 -> {
         class06889 class06889x = var1.method_18798();
         if (class06889x.B() == 0.0) {
            return false;
         } else {
            class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_73189().u(var1.method_73189()).u();
            return class06889x.u().y(class06889x) > 0.5 && !var1.u && var1.R == 0;
         }
      };
   }

   @Override
   public boolean N() {
      this.M();
      return !((class03448)((class06202)super.y_0).T_3)
         .method_18023(class07078.yo, ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class11504)this.N_0).i().floatValue()), this.u())
         .isEmpty();
   }

   public void N(AutoTotem var1) {
      this.M();
      this.N_0 = (class11504)class11524.N(var1, "distance-to-trident", 5.0F, 5.0F, 40.0F, 1.0F).N(var1x -> this.U());
   }
}
