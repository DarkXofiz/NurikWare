package NurikWare;

import java.util.function.Supplier;

public class class11504 extends class11536<Float> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public Supplier<String> L() {
      this.b();
      return (Supplier<String>)this.N_3;
   }

   public float M() {
      this.b();
      return (Float)this.N_0;
   }

   public float T() {
      this.b();
      return (Float)this.N_2;
   }

   public class11504(class12018 var1, float var2, float var3, float var4, float var5) {
      super(var1, var2);
      this.b();
      this.N_3 = (Supplier<>)() -> "";
      this.N_0 = var3;
      this.N_1 = var4;
      this.N_2 = var5;
   }

   private void b() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }
   }

   public void N(Float var1) {
      this.b();
      if (!(var1 < (Float)this.N_0) && !(var1 > (Float)this.N_1)) {
         super.N(var1);
      } else {
         throw new IllegalArgumentException(String.format("Value %f is out of range [%f, %f]", var1, (Float)this.N_0, (Float)this.N_1));
      }
   }

   public class11504 N(Supplier<String> var1) {
      this.b();
      this.N_3 = var1 == null ? () -> "" : var1;
      return this;
   }

   public float R() {
      this.b();
      return (Float)this.N_1;
   }
}
