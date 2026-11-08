package NurikWare;

public class class11983 implements class11951<class09276> {
   public Object N_0;
   public boolean N_init;

   public class11983(int var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   public class11983() {
      super();
      this.u();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = Integer.valueOf(var1.E());
   }

   @Override
   public void N(class11940 var1) {
      var1.L((Integer)this.N_0);
   }

   public int N() {
      return (Integer)this.N_0;
   }

   public void N(class09276 var1) {
      var1.N(this);
   }
}
