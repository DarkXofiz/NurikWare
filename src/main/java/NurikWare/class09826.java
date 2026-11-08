package NurikWare;

import com.google.common.collect.Sets;
import java.util.Set;
import minecraft.class02477;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09826 implements class02695 {
   @Nullable
   public <T> T method_58694(class02477<? extends T> var1) {
      Object object = this.L.method_58694(var1);
      return (T)(object != null ? object : this.u.method_58694(var1));
   }

   public class09826(class02695 var1, class02695 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public Set<class02477<?>> y() {
      return Sets.union(this.u.y(), this.L.y());
   }
}
