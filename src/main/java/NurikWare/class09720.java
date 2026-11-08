package NurikWare;

record class09720(class09726 newPage, class09726 oldPage, int width, int height, int[] cp, int[] x, int[] y, int[] w, int[] h, int count) implements class09724 {
   public int L() {
      return this.width;
   }

   public int[] M() {
      return this.y;
   }

   class09720(class09726 newPage, class09726 oldPage, int width, int height, int[] cp, int[] x, int[] y, int[] w, int[] h, int count) {
      super();
      this.newPage = newPage;
      this.oldPage = oldPage;
      this.width = width;
      this.height = height;
      this.cp = cp;
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      this.count = count;
   }

   public int[] B() {
      return this.w;
   }

   public int[] Z() {
      return this.h;
   }

   public int[] i() {
      return this.cp;
   }

   public int z() {
      return this.count;
   }

   public int u() {
      return this.height;
   }

   public class09726 y() {
      return this.oldPage;
   }

   public class09726 N() {
      return this.newPage;
   }

   public int[] R() {
      return this.x;
   }
}
