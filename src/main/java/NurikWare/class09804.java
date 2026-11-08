package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;

public final class class09804<T> {
   private final Supplier<T> N;
   private final boolean y;

   class09804(Supplier<T> var1) {
      super();
      this.N = Objects.requireNonNull(var1, "defaultValue");
      this.y = true;
   }

   class09804(T var1) {
      super();
      this.N = () -> (T)var1;
      this.y = true;
   }

   class09804() {
      super();
      this.N = null;
      this.y = false;
   }

   public T y() {
      if (!this.y) {
         throw new class09775("Context has no default value: " + this);
      } else {
         return this.N.get();
      }
   }

   public boolean N() {
      return this.y;
   }
}
