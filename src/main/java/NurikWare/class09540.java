package NurikWare;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class03529;
import minecraft.class05946;

public class class09540<T> implements class01903<T> {
   public class09540(class01921 var1, Predicate var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public Stream<class03529<T>> z() {
      return this.N().z().filter(var1 -> var0.test(var1.N()));
   }

   public Optional<class03529<T>> N(class05946<T> var1) {
      return this.N().N(var1).filter(var1x -> var0.test(var1x.N()));
   }

   public class01921<T> N() {
      return this.y;
   }
}
