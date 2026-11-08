package NurikWare;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01284;
import minecraft.class01338;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;

public class class09468 extends class01284 {
   public class09468(class01338 var1, class07209 var2, boolean var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   public Optional<Float> N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5) {
      return var3.equals(this.N) && this.y ? Optional.of(class00869.K.R()) : super.N(var1, var2, var3, var4, var5);
   }
}
