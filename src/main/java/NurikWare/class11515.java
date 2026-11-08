package NurikWare;

public class class11515 extends class11536<Integer> {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public boolean L() {
      this.M();
      return (Boolean)this.N_1;
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
         this.N_1 = false;
      }
   }

   public class11515(class12018 var1, int var2) {
      super(var1, var2);
      this.M();
      this.N_0 = true;
   }

   public boolean y() {
      this.M();
      return (Boolean)this.N_0;
   }

   public class11515 y(boolean var1) {
      this.M();
      this.N_1 = var1;
      return this;
   }

   public class11515 N(boolean var1) {
      this.M();
      this.N_0 = var1;
      return this;
   }
}
