package NurikWare;

final class class09892 {
   private boolean N = true;
   private float y;
   private float L;
   private float u;
   private float i;

   private void L(float var1, float var2, float var3, float var4) {
      if (!(var3 <= var1) && !(var4 <= var2)) {
         if (this.N) {
            this.y = var1;
            this.L = var2;
            this.u = var3;
            this.i = var4;
            this.N = false;
         } else {
            this.y = Math.min(this.y, var1);
            this.L = Math.min(this.L, var2);
            this.u = Math.max(this.u, var3);
            this.i = Math.max(this.i, var4);
         }
      }
   }

   class09916 L() {
      return this.N ? new class09916(0.0F, 0.0F, 0.0F, 0.0F) : new class09916(this.y, this.L, this.u - this.y, this.i - this.L);
   }

   class09892() {
      super();
   }

   void y(float var1, float var2, float var3, float var4) {
      if (!this.N) {
         this.y = Math.max(this.y, var1);
         this.L = Math.max(this.L, var2);
         this.u = Math.min(this.u, var3);
         this.i = Math.min(this.i, var4);
         if (this.u <= this.y || this.i <= this.L) {
            this.N = true;
         }
      }
   }

   boolean y() {
      return this.N;
   }

   void N() {
      this.N = true;
      this.y = 0.0F;
      this.L = 0.0F;
      this.u = 0.0F;
      this.i = 0.0F;
   }

   void N(float var1, float var2, float var3, float var4) {
      if (Float.isFinite(var1) && Float.isFinite(var2) && Float.isFinite(var3) && Float.isFinite(var4)) {
         if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
            this.L(var1, var2, var1 + var3, var2 + var4);
         }
      }
   }

   void N(class09892 var1) {
      if (!var1.N) {
         this.L(var1.y, var1.L, var1.u, var1.i);
      }
   }

   void N(float var1, float var2) {
      if (!this.N && (var1 != 0.0F || var2 != 0.0F)) {
         this.y += var1;
         this.L += var2;
         this.u += var1;
         this.i += var2;
      }
   }
}
