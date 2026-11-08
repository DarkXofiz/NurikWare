package NurikWare;

import minecraft.class01818;
import minecraft.class04037;
import minecraft.class04042;
import minecraft.class04043;
import minecraft.class04995;
import minecraft.class06069;

public class class10296 implements class01818 {
   private final long N;
   private final long y;

   public class10296(long var1, long var3) {
      super();
      this.N = var1;
      this.y = var3;
   }

   public void N(StringBuilder var1) {
      var1.append("seedLo: ").append(this.N).append(", seedHi: ").append(this.y);
   }

   public class06069 N(long var1) {
      return new class04042(var1 ^ this.N, var1 ^ this.y);
   }

   public class06069 N(String var1) {
      class04037 class04037 = class04043.N(var1);
      return new class04042(class04037.N(this.N, this.y));
   }

   public class06069 N(int var1, int var2, int var3) {
      long i = class04995.y(var1, var2, var3) ^ this.N;
      return new class04042(i, this.y);
   }
}
