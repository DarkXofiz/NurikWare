package NurikWare;

public class class11474 extends class11462 {
   public Object N_0;
   public Object N_1;

   @Override
   public boolean L() {
      return false;
   }

   public class11474(int var1, int var2, Runnable var3) {
      super(var1, var3);
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void i() {
      this.N_0 = 0;
      this.N_1 = 0;
   }

   @Override
   public boolean u() {
      this.i();
      int i = (Integer)this.N_1 - 1;
      this.N_1 = i;
      if (i < 0 && super.u()) {
         super.y_0 = (Integer)this.N_0;
      }

      return false;
   }
}
