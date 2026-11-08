package NurikWare;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class02477;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09822 implements class02695 {
   @Nullable
   public <T> T method_58694(class02477<? extends T> var1) {
      return (T)(this.L.test(var1) ? this.u.method_58694(var1) : null);
   }

   public class09822(class02695 var1, Predicate var2) {
      super();
      this.u = var1;
      this.L = var2;
   }

   public Set<class02477<?>> y() {
      return Sets.filter(this.u.y(), this.L::test);
   }
}
