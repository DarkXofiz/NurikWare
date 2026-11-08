package NurikWare;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class02195;
import minecraft.class02484;
import minecraft.class02680;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07324;
import minecraft.class07769;
import org.jspecify.annotations.Nullable;

public class class10534 implements class05663 {
   private final int N;
   private final class03530<class04748> y;
   private final String L;
   private final class03556<class02195> u;
   private final int i;
   private final int R;

   public class10534(int var1, class03530<class04748> var2, String var3, class03556<class02195> var4, int var5, int var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
   }

   @Nullable
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class07209 class07209 = var1.method_8487(this.y, var2.method_24515(), 100, true);
      if (class07209 != null) {
         class06584 class06584 = class06548.N(var1, class07209.method_10263(), class07209.method_10260(), (byte)2, true, true);
         class06548.N(var1, class06584);
         class07769.N(class06584, class07209, "+", this.u);
         class06584.N(class02484.U, class00392.L(this.L));
         return new class07324(new class02680(class06570.Ty, this.N), Optional.of(new class02680(class06570.jJ)), class06584, this.i, this.R, 0.2F);
      } else {
         return null;
      }
   }
}
