package NurikWare;

record class09859(class10021 viewport, float grabOffsetY, float accumulatedOffsetY) {
   public float L() {
      return this.accumulatedOffsetY;
   }

   class09859(class10021 viewport, float grabOffsetY, float accumulatedOffsetY) {
      super();
      this.viewport = viewport;
      this.grabOffsetY = grabOffsetY;
      this.accumulatedOffsetY = accumulatedOffsetY;
   }

   public float y() {
      return this.grabOffsetY;
   }

   public class10021 N() {
      return this.viewport;
   }
}
