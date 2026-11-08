package NurikWare;

public class class09273 implements class11951<class09263> {
   public Object N_0;
   public boolean N_init;

   public class09273() {
      super();
      this.u();
   }

   public class09273(long var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
      }
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.M();
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Long)this.N_0);
   }

   public long N() {
      return (Long)this.N_0;
   }

   public void N(class09263 var1) {
      var1.N(this);
   }
}
