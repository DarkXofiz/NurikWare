package NurikWare;

import java.util.Arrays;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07050;
import minecraft.class07438;

public class class11143 extends class11126 {
   public static Object N_0 = List.of(class06570.Gw, class06570.la);

   public class11143(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      N();
   }

   private float N(class07438 var1) {
      float f = 0.0F;
      f += ((class04453)class06202.Nq().T_4).method_5739(var1) / 3.0F;
      f += var1.method_6032() / 20.0F;
      long i = Arrays.stream(class07050.values()).filter(var1x -> ((List)N_0).contains(var1.method_5998(var1x).B())).count();
      return f + (float)i / 2.0F;
   }

   public int compare(class07438 var1, class07438 var2) {
      return Float.compare(this.N(var1), this.N(var2));
   }

   private static void N() {
      N_0 = null;
   }
}
