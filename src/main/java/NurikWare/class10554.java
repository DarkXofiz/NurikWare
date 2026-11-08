package NurikWare;

import minecraft.class01818;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06075;

public class class10554 implements class01818 {
   private final long N;

   public class10554(long var1) {
      super();
      this.N = var1;
   }

   public void N(StringBuilder var1) {
      var1.append("LegacyPositionalRandomFactory{").append(this.N).append("}");
   }

   public class06069 N(long var1) {
      return new class06075(var1);
   }

   public class06069 N(String var1) {
      int i = var1.hashCode();
      return new class06075(i ^ this.N);
   }

   public class06069 N(int var1, int var2, int var3) {
      long i = class04995.y(var1, var2, var3) ^ this.N;
      return new class06075(i);
   }
}
