package NurikWare;

import com.google.common.base.Suppliers;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import minecraft.class02362;

public class class09701<B, T> implements class02362<B, T> {
   private final Supplier<class02362<B, T>> y;

   public class09701(UnaryOperator var1) {
      super();
      this.N = var1;
      this.y = Suppliers.memoize(() -> var1x.apply(this));
   }

   public T decode(B var1) {
      return (T)this.y.get().decode(var1);
   }

   public void encode(B var1, T var2) {
      this.y.get().encode(var1, var2);
   }
}
