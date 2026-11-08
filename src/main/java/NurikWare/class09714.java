package NurikWare;

record class09714(int[] start, int[] end, int[] cls) {
   public int[] L() {
      return this.cls;
   }

   class09714(int[] start, int[] end, int[] cls) {
      super();
      this.start = start;
      this.end = end;
      this.cls = cls;
   }

   public int[] y() {
      return this.end;
   }

   public int[] N() {
      return this.start;
   }

   int N(int var1) {
      int i = 0;
      int j = this.start.length - 1;

      while (i <= j) {
         int k = i + j >>> 1;
         if (var1 < this.start[k]) {
            j = k - 1;
         } else {
            if (var1 <= this.end[k]) {
               return this.cls[k];
            }

            i = k + 1;
         }
      }

      return 0;
   }
}
