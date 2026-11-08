package NurikWare;

public class class09266 implements class11951<class09263> {
   public Object N_0;

   public class09266() {
      super();
      this.u();
   }

   public class09266(class09295[] var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   private void u() {
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = new class09295[i];

      for (int j = 0; j < i; j++) {
         String s = var1.P();
         String s1 = var1.P();
         boolean flag = var1.B();
         ((class09295[])this.N_0)[j] = new class09295(s, s1, flag);
      }
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public class09295[] N() {
      return (class09295[])this.N_0;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class09295[])this.N_0).length);

      for (class09295 class09295 : (class09295[])this.N_0) {
         var1.N(class09295.y());
         var1.N(class09295.N());
         var1.N(class09295.L());
      }
   }
}
