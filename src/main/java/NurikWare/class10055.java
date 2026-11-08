package NurikWare;

final class class10055 {
   private final class10052 N;

   class10055(class10052 var1) {
      super();
      this.N = var1;
   }

   private int N(class10021 var1, class09980 var2) {
      if (!var2.T()) {
         return var2.b();
      } else {
         return var2.s() != class09969.FLOATING ? 0 : 1000 + this.N.M();
      }
   }

   private void N(class10021 var1, int var2) {
      this.N.i().N++;
      var1.y(var2);
      var1.c().N(this.N(var1, var1.o()));

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021 = var1.N(i);
         this.N(class10021, var2 + 1);
      }
   }

   void N() {
      this.N(this.N.N(), 0);
   }
}
