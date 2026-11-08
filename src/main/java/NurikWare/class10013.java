package NurikWare;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class02818;
import org.jspecify.annotations.Nullable;

public record class10013<T>(Supplier<String> error) implements class02818<T> {
   public Supplier<String> L() {
      return this.error;
   }

   public class10013(Supplier<String> error) {
      super();
      this.error = error;
   }

   public <E extends Throwable> T y(Supplier<E> var1) throws E {
      throw (Throwable)var1.get();
   }

   public String y() {
      return this.error.get();
   }

   @Nullable
   public T y(@Nullable T var1) {
      return (T)var1;
   }

   public <R> class02818<R> N_11(Function<T, R> var1) {
      return new class10013(this.error);
   }

   public boolean N() {
      return false;
   }

   public class02818<T> N_36(Consumer<T> var1) {
      return this;
   }
}
