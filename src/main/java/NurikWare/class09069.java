package NurikWare;

public record class09069(int count, int glType, boolean normalized, int divisor) {

   public boolean L() {
      return this.normalized;
   }

   public int M() {
      return this.divisor;
   }

   public class09069(int count, int glType, boolean normalized, int divisor) {
      super();
      this.count = count;
      this.glType = glType;
      this.normalized = normalized;
      this.divisor = divisor;
   }

   public int i() {
      return this.glType;
   }

   public int u() {
      return this.count;
   }

   public static class09069 y(int var0) {
      return new class09069(var0, 5124, false, 0);
   }

   public static class09069 y() {
      return new class09069(4, 5121, true, 0);
   }

   public static class09069 N(int var0) {
      return new class09069(var0, 5126, false, 0);
   }

   public int N() {
      return this.count * switch (this.glType) {
         case 5120, 5121 -> 1;
         case 5122, 5123 -> 2;
         case 5124, 5125, 5126 -> 4;
         default -> throw new IllegalArgumentException("Unsupported GL type: " + this.glType);
      };
   }

   public class09069 R() {
      return new class09069(this.count, this.glType, this.normalized, 1);
   }
}
