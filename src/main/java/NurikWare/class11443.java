package NurikWare;

public class class11443 extends class11535 {
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   public class11443(String var1, int var2, boolean var3) {
      super(var1, var3);
      this.L();
      this.N_0 = var2;
   }

   public int N() {
      this.L();
      return (Integer)this.N_0;
   }
}
