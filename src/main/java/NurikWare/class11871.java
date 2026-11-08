package NurikWare;

import java.util.function.Consumer;
import java.util.function.Supplier;

public record class11871(
   class11494 value, class11494 minMax, float increment, Supplier<String> postfix, Consumer<class11494> onChange, class09785<Boolean> wasMove
) {

   public float L() {
      return this.N() - this.u();
   }

   public float M() {
      return this.increment;
   }

   public class11871(class11494 value, class11494 minMax, float increment, Supplier<String> postfix, Consumer<class11494> onChange, class09785<Boolean> wasMove) {
      super();
      this.value = value;
      this.minMax = minMax;
      this.increment = increment;
      this.postfix = postfix;
      this.onChange = onChange;
      this.wasMove = wasMove;
   }

   public class11494 B() {
      return this.value;
   }

   public Supplier<String> Z() {
      return this.postfix;
   }

   public class09785<Boolean> i() {
      return this.wasMove;
   }

   public float U() {
      return (this.value.N() - this.u()) / this.L();
   }

   public class11494 z() {
      return this.minMax;
   }

   public float u() {
      return this.minMax.N();
   }

   public float y() {
      return (this.value.L() - this.u()) / this.L();
   }

   public float N() {
      return this.minMax.L();
   }

   public Consumer<class11494> R() {
      return this.onChange;
   }
}
