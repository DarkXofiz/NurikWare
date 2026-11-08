package NurikWare;

import java.util.function.Supplier;

public class class11525 extends class11536<class11494> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public Supplier<String> L() {
      this.v();
      return (Supplier<String>)this.N_2;
   }

   public class11494 M() {
      this.v();
      return (class11494)this.N_0;
   }

   public class11525(class12018 var1, class11494 var2, class11494 var3, float var4) {
      super(var1, N(var2, var3));
      this.v();
      this.N_2 = (Supplier<>)() -> "";
      var2.y();
      this.N_0 = var2;
      this.N_1 = var4;
   }

   private void v() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
      }
   }

   public void N(class11494 var1) {
      this.v();
      super.N(N((class11494)this.N_0, var1));
   }

   public class11525 N(Supplier<String> var1) {
      this.v();
      this.N_2 = var1 == null ? () -> "" : var1;
      return this;
   }

   private static class11494 N(class11494 var0, class11494 var1) {
      float f = Math.clamp(var1.N(), var0.N(), var0.L());
      float f1 = Math.clamp(var1.L(), var0.N(), var0.L());
      class11494 class11494 = new class11494(f, f1);
      class11494.N(var0);
      return class11494;
   }

   public float R() {
      this.v();
      return (Float)this.N_1;
   }
}
