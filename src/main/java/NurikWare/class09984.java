package NurikWare;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToIntFunction;

final class class09984 {
   private class09984() {
      super();
   }

   static <T> BiPredicate<class09980, class09980> N(Function<class09980, T> var0) {
      return (var1, var2) -> !Objects.equals(var0.apply(var1), var0.apply(var2));
   }

   static BiPredicate<class09980, class09980> N(ToIntFunction<class09980> var0) {
      return (var1, var2) -> var0.applyAsInt(var1) != var0.applyAsInt(var2);
   }

   static BiPredicate<class09980, class09980> N(class09987 var0) {
      return (var1, var2) -> Float.compare(var0.get(var1), var0.get(var2)) != 0;
   }
}
