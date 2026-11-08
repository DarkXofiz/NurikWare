package NurikWare;

import java.util.Objects;
import minecraft.class00442;
import minecraft.class00455;
import org.jspecify.annotations.Nullable;

class class10692<T> {
   private final class10696<T> y;
   @Nullable
   T N;

   class10692(class10696<T> var1) {
      super();
      this.y = var1;
   }

   @Nullable
   public class00442<T> N(class00455<T> var1) {
      Object object = this.y.get();
      if (!Objects.equals(object, this.N)) {
         this.N = (T)object;
         return var1.N(object);
      } else {
         return null;
      }
   }
}
