package NurikWare;

import java.util.Objects;
import java.util.function.UnaryOperator;

final class class09840<T> implements class09785<T> {
   T N;
   class09783 y;
   final boolean L;
   private final Runnable u;

   @Override
   public T L() {
      return this.N;
   }

   class09840(T var1, class09783 var2, boolean var3, Runnable var4) {
      super();
      this.N = (T)var1;
      this.y = var2;
      this.L = var3;
      this.u = Objects.requireNonNull(var4, "requestRender");
   }

   @Override
   public void y() {
      this.u.run();
   }

   @Override
   public void N(UnaryOperator<T> var1) {
      Objects.requireNonNull(var1, "update");
      this.N((T)var1.apply(this.N));
   }

   @Override
   public void N(T var1) {
      this.N = (T)var1;
      this.y();
   }
}
