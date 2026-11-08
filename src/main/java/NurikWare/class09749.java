package NurikWare;

public record class09749(float min, float def, float max) {
   public float L() {
      return this.max;
   }

   public class09749(float min, float def, float max) {
      super();
      this.min = min;
      this.def = def;
      this.max = max;
   }

   public float y() {
      return this.def;
   }

   public float N() {
      return this.min;
   }
}
