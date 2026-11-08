package NurikWare;

public class class11527 extends class11536<class12002> {
   public Object N_0;
   public boolean N_init;

   public int L() {
      this.R();
      return (Integer)this.N_0;
   }

   public class11527(class12018 var1, class12002 var2) {
      super(var1, var2);
      this.R();
   }

   @Override
   public void u() {
      this.R();
      this.N_0 = 0;
      super.u();
   }

   public boolean N(class11389 var1) {
      this.R();
      return var1.y(this.i(), (Integer)this.N_0);
   }

   public void N(class12002 var1, int var2) {
      this.R();
      this.N_0 = var2;
      this.N(var1);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   @Override
   public boolean c_() {
      this.R();
      return (Integer)this.N_0 != 0 || super.c_();
   }
}
