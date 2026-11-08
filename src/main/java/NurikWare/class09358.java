package NurikWare;

import java.util.Set;
import minecraft.class00394;
import minecraft.class02477;
import minecraft.class02666;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09358 implements class02666 {
   @Nullable
   public <T> T method_58694(class02477<? extends T> var1) {
      this.N.add(var1);
      return (T)this.y.method_58694(var1);
   }

   public class09358(class00394 var1, Set var2, class02695 var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   public <T> T a_(class02477<? extends T> var1, T var2) {
      this.N.add(var1);
      return (T)this.y.a_(var1, var2);
   }
}
