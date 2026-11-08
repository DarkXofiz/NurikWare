package NurikWare;

public class class11984 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public String L() {
      return (String)this.N_1;
   }

   public class11984(String var1, String var2, int var3) {
      super();
      this.u();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
   }

   public class11984() {
      super();
      this.u();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public String y() {
      return (String)this.N_0;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.P();
      this.N_1 = var1.P();
      this.N_2 = var1.R();
   }

   public int N() {
      return (Integer)this.N_2;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((String)this.N_0);
      var1.N((String)this.N_1);
      var1.y((Integer)this.N_2);
   }

   public void N(class09276 var1) {
      var1.N(this);
   }
}
