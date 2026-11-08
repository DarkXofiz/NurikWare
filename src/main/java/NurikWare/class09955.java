package NurikWare;

import java.util.List;
import java.util.Locale;
import minecraft.class02796;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07305;

public class class09955 implements class05706 {
   public class09955(class02796 var1, List var2, class07305 var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   public <T> void N(class06839<T> var1) {
      this.N.add(String.format(Locale.ROOT, "%s=%s\n", var1.y(), this.y.y(var1)));
   }
}
