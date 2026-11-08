package NurikWare;

import java.util.function.Function;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07050;

public class class11147 extends class11131 {
   public Object y_0;

   private void L() {
   }

   public class11147(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
      this.y_0 = new class11249((class11225)class11225.L_1, class11264.N);
   }

   @Override
   public void y(class06202 var1, class07050 var2) {
      ((class03443)var1.T_2).y((class04453)var1.T_4);
   }

   public boolean test(class06202 var1, class07050 var2) {
      return ((class04453)var1.T_4).method_5998(var2).N(class06570.db) ? ((class04453)var1.T_4).method_6048() >= 10 : false;
   }

   @Override
   public boolean N(class06202 var1, class07050 var2, Function<class11223, Boolean> var3) {
      this.L();
      return new class11266(
            new class06889(
               (Double)((class04453)var1.T_4).M_1,
               (Double)((class04453)var1.T_4).M_2 + ((class04453)var1.T_4).method_18381(((class04453)var1.T_4).method_18376()),
               (Double)((class04453)var1.T_4).R_0
            ),
            Trajectory.N(
               (class04453)var1.T_4, ((class04453)var1.T_4).method_60478(), (Float)((class04453)var1.T_4).R_2, (Float)((class04453)var1.T_4).R_1, 0.0F, 2.5F
            ),
            (class11228)this.y_0
         )
         .y()
         .N()
         .<Boolean>map(var3)
         .orElse(false);
   }
}
