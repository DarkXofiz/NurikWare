package NurikWare;

import minecraft.class01317;
import minecraft.class04782;
import minecraft.class05538;
import minecraft.class07438;
import minecraft.class07549;
import minecraft.class07883;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class10719 implements class01317 {
   private final class07549 N;

   public class10719(class07549 var1) {
      super();
      this.N = var1;
   }

   public boolean method_18303(@Nullable class07438 var1, class04782 var2) {
      return (var1 instanceof class08036 || var1 instanceof class07883 || var1 instanceof class05538) && var1.method_5858(this.N) > 9.0;
   }
}
