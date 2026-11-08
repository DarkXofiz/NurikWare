package NurikWare;

record class09746(long fontHash, int fieldType, double baseSize, double pxRange, double weight, int channels, int[] cp, class09761[] cells) {
   public double L() {
      return this.baseSize;
   }

   public int[] M() {
      return this.cp;
   }

   class09746(long fontHash, int fieldType, double baseSize, double pxRange, double weight, int channels, int[] cp, class09761[] cells) {
      super();
      this.fontHash = fontHash;
      this.fieldType = fieldType;
      this.baseSize = baseSize;
      this.pxRange = pxRange;
      this.weight = weight;
      this.channels = channels;
      this.cp = cp;
      this.cells = cells;
   }

   public class09761[] B() {
      return this.cells;
   }

   public double i() {
      return this.weight;
   }

   public double u() {
      return this.pxRange;
   }

   public int y() {
      return this.fieldType;
   }

   public long N() {
      return this.fontHash;
   }

   public int R() {
      return this.channels;
   }
}
