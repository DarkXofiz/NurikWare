package NurikWare;

record class09739(int type, double[] c) {
   class09739(int type, double[] c) {
      super();
      this.type = type;
      this.c = c;
   }

   public double[] y() {
      return this.c;
   }

   public int N() {
      return this.type;
   }
}
