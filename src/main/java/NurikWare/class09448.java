package NurikWare;

import java.util.Collection;
import java.util.Map;
import minecraft.class01208;
import minecraft.class01214;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public class class09448<T> implements class01208<T> {
   @Nullable
   public T method_43948(class01894 var1, boolean var2) {
      return (T)this.y.N.get(var1, var2).orElse(null);
   }

   @Nullable
   public Collection<T> method_43949(class01894 var1) {
      return (Collection<T>)this.N.get(var1);
   }

   public class09448(class01214 var1, Map var2) {
      super();
      this.y = var1;
      this.N = var2;
   }
}
