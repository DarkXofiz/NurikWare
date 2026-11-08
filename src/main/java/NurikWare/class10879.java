package NurikWare;

import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06584;

public record class10879<T>(String name, Function<class06584, T> getter, BiPredicate<T, T> equals) {

   public Function<class06584, T> L() {
      return this.getter;
   }

   class10879(String name, Function<class06584, T> getter, BiPredicate<T, T> equals) {
      super();
      this.name = name;
      this.getter = getter;
      this.equals = equals;
   }

   public String y() {
      return this.name;
   }

   public boolean N(class06584 var1, class06584 var2) {
      Object object = this.getter.apply(var1);
      Object object1 = this.getter.apply(var2);
      if (object == null && object1 == null) {
         return true;
      } else {
         return object != null && object1 != null ? this.equals.test((T)object, (T)object1) : false;
      }
   }

   public BiPredicate<T, T> N() {
      return this.equals;
   }
}
