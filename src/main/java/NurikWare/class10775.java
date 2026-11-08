package NurikWare;

import minecraft.class07042;
import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07637;

public class class10775<T extends class07438> extends class07464<T> {
   private final class07637 Z;

   public class10775(class07637 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6, class07042.R);
      this.Z = var1;
   }

   public boolean N() {
      return this.Z.I() && this.Z.No() && super.N();
   }
}
