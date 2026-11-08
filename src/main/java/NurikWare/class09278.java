package NurikWare;

public class class09278 implements class11951<class09263> {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
      }
   }

   public class09278(String var1, float var2) {
      super();
      this.L();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class09278() {
      super();
      this.L();
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.P();
      this.N_1 = var1.Z();
   }

   public String y() {
      return (String)this.N_0;
   }

   public float N() {
      return (Float)this.N_1;
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   @Override
   public void N(class11940 var1) {
      var1.N((String)this.N_0);
      var1.N((Float)this.N_1);
   }
}
