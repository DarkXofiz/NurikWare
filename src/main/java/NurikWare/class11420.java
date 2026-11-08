package NurikWare;

public class class11420 extends class11535 {
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class11420(String var1, boolean var2, boolean var3) {
      super(var1, var3);
      this.L();
      this.N_0 = var2;
   }

   public boolean N() {
      this.L();
      return (Boolean)this.N_0;
   }
}
