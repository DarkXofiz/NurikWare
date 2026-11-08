package NurikWare;

import java.util.Objects;
import minecraft.class04568;
import minecraft.class04585;

public class class11930 extends class04568 {
   public class11930(String var1, String var2, class04585 var3) {
      super(var1, var2, var3);
   }

   public boolean equals(Object var1) {
      return !(var1 instanceof class11930 class11930) ? false : Objects.equals(this.y, class11930.y) && Objects.equals(this.N, class11930.N);
   }

   public int hashCode() {
      return Objects.hash(this.y, this.N);
   }
}
