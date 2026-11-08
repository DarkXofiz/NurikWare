package NurikWare;

import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07879;
import minecraft.class07897;

public class class10853<T extends class07438> extends class07464<T> {
   private final class07879 Z;

   public class10853(class07879 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6);
      this.Z = var1;
   }

   public boolean N() {
      return this.Z.v() != class07897.field_41567 && super.N();
   }
}
