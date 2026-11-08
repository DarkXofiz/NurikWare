package NurikWare;

final class class09905 {
   private boolean N;
   private boolean y;
   private float L;
   private float u;
   private float i;
   private float R;
   private float M;
   private int B;

   private boolean L(class09887 var1, float var2) {
      if (this.y == (var1 == null)) {
         return true;
      } else {
         return var1 != null && this.N(var1) ? true : !N(this.M, var2);
      }
   }

   class09905() {
      super();
   }

   private void y(class09887 var1, float var2) {
      this.N = true;
      this.y = var1 != null;
      if (var1 != null) {
         this.L = var1.y();
         this.u = var1.L();
         this.i = var1.u();
         this.R = var1.i();
      }

      this.M = var2;
   }

   private static boolean N(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   private boolean N(class09887 var1) {
      return !N(this.L, var1.y()) || !N(this.u, var1.L()) || !N(this.i, var1.u()) || !N(this.R, var1.i());
   }

   int N(class09887 var1, float var2) {
      if (!this.N || this.L(var1, var2)) {
         this.y(var1, var2);
         this.B++;
      }

      return this.B;
   }
}
