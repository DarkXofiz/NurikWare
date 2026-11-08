package NurikWare;

public class class09290 implements class11951<class09263> {
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
      }
   }

   public class09290(long var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   public class09290() {
      super();
      this.L();
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.M();
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public long N() {
      return (Long)this.N_0;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Long)this.N_0);
   }
}
