package NurikWare;

final class class09855 {
   private static final float N = 1.0E-6F;
   private float y;
   private float L;

   boolean L(float var1) {
      return this.L() ? true : this.y(var1) > 0.0F;
   }

   private boolean L() {
      return this.y <= 1.0E-6F;
   }

   class09855(float var1) {
      super();
      this.N(var1);
   }

   private static float u(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) && !(var0 <= 1.0E-6F) ? var0 : 0.0F;
   }

   float y(float var1) {
      float f = Math.max(0.0F, var1);
      if (this.L()) {
         return f;
      } else {
         this.L += f;
         float f1 = 1.0F / this.y;
         int i = (int)(this.L / f1);
         if (i <= 0) {
            return 0.0F;
         } else {
            float f2 = i * f1;
            this.L -= f2;
            return f2;
         }
      }
   }

   void y() {
      this.L = 0.0F;
   }

   public float N() {
      return this.y;
   }

   public void N(float var1) {
      this.y = u(var1);
   }
}
