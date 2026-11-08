package NurikWare;

record class09732(int[] glyphs) {
   class09732(int[] glyphs) {
      super();
      this.glyphs = glyphs;
   }

   boolean N(int var1) {
      int i = 0;
      int j = this.glyphs.length - 1;

      while (i <= j) {
         int k = i + j >>> 1;
         if (this.glyphs[k] < var1) {
            i = k + 1;
         } else {
            if (this.glyphs[k] <= var1) {
               return true;
            }

            j = k - 1;
         }
      }

      return false;
   }

   public int[] N() {
      return this.glyphs;
   }
}
