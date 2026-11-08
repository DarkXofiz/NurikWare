package NurikWare;

public class class11802 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11802(String var1) {
      super();
      this.i();
      this.N_0 = var1;
      class11828 class11828 = class11828.N(var1);
      this.N_1 = class11828 == null ? 0 : class11828.N();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   public String y() {
      return (String)this.N_0;
   }

   public int N() {
      return (Integer)this.N_1;
   }
}
