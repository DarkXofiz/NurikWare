package NurikWare;

public class class11461 extends class11462 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   @Override
   public boolean L() {
      this.z();
      return (Boolean)this.N_2 ? true : (Integer)this.N_0 <= 0 && super.L();
   }

   public class11461(int var1, int var2, Runnable var3) {
      super(var1, var3);
      this.z();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class11461(int var1, Runnable var2) {
      super(var1, var2);
      this.z();
      this.N_0 = 0;
      this.N_1 = 0;
   }

   public void i() {
      this.z();
      this.N_2 = true;
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = false;
      }
   }

   @Override
   public boolean u() {
      this.z();
      if ((Boolean)this.N_2) {
         return false;
      } else if ((Integer)this.N_0 <= 0) {
         return super.u();
      } else {
         int i = (Integer)this.N_1 - 1;
         this.N_1 = i;
         if (i < 0 && super.u()) {
            super.y_0 = (Integer)this.N_0;
         }

         return false;
      }
   }

   public boolean y() {
      this.z();
      return (Boolean)this.N_2;
   }

   public int N() {
      this.z();
      return (Integer)this.N_1;
   }

   public int R() {
      this.z();
      return (Integer)this.N_0;
   }
}
