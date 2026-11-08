package NurikWare;

import java.util.function.Consumer;
import java.util.function.Supplier;

public record class11830(float value, float min, float max, float increment, Supplier<String> postfix, Consumer<Float> onChange, class09785<Boolean> wasMove) {

   public float L() {
      return this.max - this.min;
   }

   public class09785<Boolean> M() {
      return this.wasMove;
   }

   public class11830(float value, float min, float max, float increment, Supplier<String> postfix, Consumer<Float> onChange, class09785<Boolean> wasMove) {
      super();
      this.value = value;
      this.min = min;
      this.max = max;
      this.increment = increment;
      this.postfix = postfix;
      this.onChange = onChange;
      this.wasMove = wasMove;
   }

   public float B() {
      return this.value;
   }

   public Consumer<Float> Z() {
      return this.onChange;
   }

   public float i() {
      return this.min;
   }

   public Supplier<String> u() {
      return this.postfix;
   }

   public float y() {
      return this.increment;
   }

   public float N() {
      return (this.value - this.min) / this.L();
   }

   public float R() {
      return this.max;
   }
}
