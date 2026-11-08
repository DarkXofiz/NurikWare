package NurikWare;

public class class11978 implements class11951<class09276> {
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
      }
   }

   public class11978() {
      super();
      this.L();
   }

   public class11978(long var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.M();
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Long)this.N_0);
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   public long N() {
      return (Long)this.N_0;
   }
}
