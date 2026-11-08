package NurikWare;

import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02042;
import minecraft.class03530;
import minecraft.class03535;
import minecraft.class03556;
import minecraft.class05946;

public record class10213<T>(T value) implements class03556<T> {
   public Stream<class03530<T>> L() {
      return Stream.of();
   }

   public class10213(T value) {
      super();
      this.value = (T)value;
   }

   @Override
   public String toString() {
      return "Direct{" + this.value + "}";
   }

   public Optional<class05946<T>> i() {
      return Optional.empty();
   }

   public Either<class05946<T>, T> u() {
      return Either.right(this.value);
   }

   public boolean y() {
      return true;
   }

   public boolean N(class05946<T> var1) {
      return false;
   }

   public boolean N(class02042<T> var1) {
      return true;
   }

   public boolean N(class01894 var1) {
      return false;
   }

   public T N() {
      return this.value;
   }

   public boolean N(Predicate<class05946<T>> var1) {
      return false;
   }

   public boolean N(class03556<T> var1) {
      return this.value.equals(var1.N());
   }

   public boolean N(class03530<T> var1) {
      return false;
   }

   public class03535 R() {
      return class03535.field_36447;
   }
}
