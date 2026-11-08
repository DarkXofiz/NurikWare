package NurikWare;

public class class11994 extends class11535 {
   public Object N_0;
   public boolean N_init;

   public class11994(String var1, boolean var2, float var3) {
      super(var1, var2);
      this.i();
      this.N_0 = var3;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
      }
   }

   public float N() {
      this.i();
      return (Float)this.N_0;
   }
}
