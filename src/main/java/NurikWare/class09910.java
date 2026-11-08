package NurikWare;

final class class09910 {
   private class09915 N;
   private boolean y;
   private int L;

   class09910() {
      super();
      this.N = class09915.N;
   }

   int N(class09915 var1) {
      class09915 class09915 = var1 == null ? class09915.N : var1;
      if (!this.y || !this.N.equals(class09915)) {
         this.N = class09915;
         this.y = true;
         this.L++;
      }

      return this.L;
   }
}
