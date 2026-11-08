package NurikWare;

import minecraft.class07438;

public class class11120 extends class11126 {
   public class11120(String var1) {
      super(var1, false);
   }

   public int compare(class07438 var1, class07438 var2) {
      float f = class11505.N(class11505.L(), var1.method_73189()).M().lengthSquared();
      float f1 = class11505.N(class11505.L(), var2.method_73189()).M().lengthSquared();
      return Float.compare(f, f1);
   }
}
