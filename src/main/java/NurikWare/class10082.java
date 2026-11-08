package NurikWare;

import java.util.Optional;
import minecraft.class02968;

public record class10082<T>(class02968<T> type, T value) {
   public class10082(class02968<T> type, T value) {
      super();
      this.type = type;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public class02968<T> N() {
      return this.type;
   }

   public <U> Optional<U> N(class02968<U> var1) {
      return var1 == this.type ? Optional.of(this.value) : Optional.empty();
   }
}
