package NurikWare;

public record class10009(class09997 mode, float value) {
   public static final class10009 N = new class10009(class09997.FIXED, 0.0F);
   public static final class10009 y = new class10009(class09997.AUTO, 0.0F);

   public boolean L() {
      return this.mode == class09997.FIXED;
   }

   public class10009(class09997 mode, float value) {
      super();
      mode = mode == null ? class09997.FIXED : mode;
      value = mode == class09997.AUTO ? 0.0F : y(value);
      this.mode = mode;
      this.value = value;
   }

   public class09997 i() {
      return this.mode;
   }

   public float u() {
      return this.L() ? this.value : 0.0F;
   }

   private static float y(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.max(0.0F, var0);
   }

   public boolean y() {
      return this.mode == class09997.AUTO;
   }

   public static class10009 N() {
      return y;
   }

   public static class10009 N(float var0) {
      float f = y(var0);
      return f == 0.0F ? N : new class10009(class09997.FIXED, f);
   }

   public float R() {
      return this.value;
   }
}
