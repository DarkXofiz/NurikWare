package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00381;
import minecraft.class03253;
import minecraft.class03257;
import org.jspecify.annotations.Nullable;

public class class10168<T> implements class03257 {
   private final List<class00381<? super T>> y;

   public class10168(class03253 var1) {
      super();
      this.N = var1;
      this.y = new ArrayList<>();
   }

   @Nullable
   public class00381<?> N(class00381<?> var1) {
      if (var1 == this.N.L) {
         return (class00381<?>)this.N.u.apply(this.y);
      } else if (this.y.size() >= 4096) {
         throw new IllegalStateException("Too many packets in a bundle");
      } else {
         this.y.add(var1);
         return null;
      }
   }
}
