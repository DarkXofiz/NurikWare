package NurikWare;

import minecraft.class00500;
import minecraft.class03421;
import minecraft.class03460;
import minecraft.class03875;
import org.jspecify.annotations.Nullable;

public class class10202 implements class03460 {
   public class10202(class03421 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   public class00500 N(class03875 var1, double var2) {
      return var2 > 0.0 ? null : this.N.computeFluid(var1.y(), var1.L(), var1.u()).N(var1.L());
   }

   public boolean N() {
      return false;
   }
}
