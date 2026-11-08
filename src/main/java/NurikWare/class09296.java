package NurikWare;

public class class09296 implements class11951<class09263> {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class09296() {
      super();
      this.R();
   }

   public class09296(String var1, long var2) {
      super();
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.P();
      this.N_1 = var1.M();
   }

   public String y() {
      return (String)this.N_0;
   }

   public long N() {
      return (Long)this.N_1;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((String)this.N_0);
      var1.N((Long)this.N_1);
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
      }
   }
}
