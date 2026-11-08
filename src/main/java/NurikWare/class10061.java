package NurikWare;

final class class10061 {
   float N;
   float y;
   float L;
   float u;
   float i;
   float R;
   float M;
   float B;
   String Z;
   private boolean U;
   private boolean E;
   int z = -1;

   float L(class10036 var1) {
      return var1 == class10036.WIDTH ? this.N : this.y;
   }

   void L(class10036 var1, float var2) {
      if (var1 == class10036.WIDTH) {
         this.i = Math.max(0.0F, var2);
      } else {
         this.R = Math.max(0.0F, var2);
      }
   }

   class10061() {
      super();
   }

   void i(class10036 var1) {
      float f = this.L(var1);
      this.L(var1, Math.min(f, this.N(var1)));
      float f1 = this.R(var1) ? f : Math.min(f, this.y(var1));
      this.u(var1, f1);
   }

   float u(class10036 var1) {
      return var1 == class10036.WIDTH ? this.L : this.u;
   }

   void u(class10036 var1, float var2) {
      if (var1 == class10036.WIDTH) {
         this.M = Math.max(0.0F, var2);
      } else {
         this.B = Math.max(0.0F, var2);
      }
   }

   float y(class10036 var1) {
      return var1 == class10036.WIDTH ? this.M : this.B;
   }

   void y(class10036 var1, float var2) {
      if (var1 == class10036.WIDTH) {
         this.L = Math.max(0.0F, var2);
      } else {
         this.u = Math.max(0.0F, var2);
      }
   }

   void N() {
      this.N = 0.0F;
      this.y = 0.0F;
      this.L = 0.0F;
      this.u = 0.0F;
      this.i = 0.0F;
      this.R = 0.0F;
      this.M = 0.0F;
      this.B = 0.0F;
      this.Z = null;
      this.U = false;
      this.E = false;
   }

   void N(class10036 var1, boolean var2) {
      if (var1 == class10036.WIDTH) {
         this.U = var2;
      } else {
         this.E = var2;
      }
   }

   void N(class10036 var1, float var2) {
      if (var1 == class10036.WIDTH) {
         this.N = Math.max(0.0F, var2);
      } else {
         this.y = Math.max(0.0F, var2);
      }
   }

   float N(class10036 var1) {
      return var1 == class10036.WIDTH ? this.i : this.R;
   }

   private boolean R(class10036 var1) {
      return var1 == class10036.WIDTH ? this.U : this.E;
   }
}
