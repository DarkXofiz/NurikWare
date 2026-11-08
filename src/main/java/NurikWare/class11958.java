package NurikWare;

public class class11958 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;

   public class11958() {
      super();
      this.i();
   }

   public class11958(class11966 var1, String var2) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void i() {
   }

   public String y() {
      return (String)this.N_1;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.N(class11966.class);
      this.N_1 = var1.P();
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   public class11966 N() {
      return (class11966)this.N_0;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((class11966)this.N_0);
      var1.N((String)this.N_1);
   }
}
