package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;

final class class09848<T> {
   private T N;
   T y;
   Supplier<T> L;
   class09805<T> u;

   class09848(T var1, Supplier<T> var2, class09805<T> var3) {
      super();
      this.N = (T)var1;
      this.y = (T)var1;
      this.L = Objects.requireNonNull(var2, "snapshotSupplier");
      this.u = Objects.requireNonNull(var3, "changeDetector");
   }

   void y() {
      this.N = this.y;
   }

   boolean N() {
      Object object = this.L.get();
      return this.u.changed(this.N, (T)object);
   }
}
