package NurikWare;

record class09725(class09732 cov, class09714 c1, class09714 c2, int[][] adv) implements class09729 {
   public class09714 L() {
      return this.c2;
   }

   class09725(class09732 cov, class09714 c1, class09714 c2, int[][] adv) {
      super();
      this.cov = cov;
      this.c1 = c1;
      this.c2 = c2;
      this.adv = adv;
   }

   public int[][] u() {
      return this.adv;
   }

   public class09714 y() {
      return this.c1;
   }

   @Override
   public int N(int var1, int var2) {
      if (!this.cov.N(var1)) {
         return Integer.MIN_VALUE;
      } else {
         int i = this.c1.N(var1);
         int j = this.c2.N(var2);
         return i < this.adv.length && j < this.adv[i].length ? this.adv[i][j] : 0;
      }
   }

   public class09732 N() {
      return this.cov;
   }
}
