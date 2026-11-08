package NurikWare;

public record class09985(float left, float right, float top, float bottom) {
   public static final class09985 N = N(0.0F);

   public float L() {
      return this.left;
   }

   public class09985(float left, float right, float top, float bottom) {
      super();
      this.left = left;
      this.right = right;
      this.top = top;
      this.bottom = bottom;
   }

   public float i() {
      return this.top;
   }

   public float u() {
      return this.right;
   }

   public float y() {
      return Math.max(0.0F, this.top) + Math.max(0.0F, this.bottom);
   }

   public static class09985 N(float var0, float var1, float var2, float var3) {
      return new class09985(Math.max(0.0F, var0), Math.max(0.0F, var1), Math.max(0.0F, var2), Math.max(0.0F, var3));
   }

   public static class09985 N(float var0, float var1) {
      float f = Math.max(0.0F, var0);
      float f1 = Math.max(0.0F, var1);
      return new class09985(f, f, f1, f1);
   }

   public float N() {
      return Math.max(0.0F, this.left) + Math.max(0.0F, this.right);
   }

   public static class09985 N(float var0) {
      float f = Math.max(0.0F, var0);
      return new class09985(f, f, f, f);
   }

   public float R() {
      return this.bottom;
   }
}
