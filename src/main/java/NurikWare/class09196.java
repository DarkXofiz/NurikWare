package NurikWare;

public record class09196(float deltaH, float ratioS, float ratioL, int alpha) {
   public static Object i_0;

   public float L() {
      return this.deltaH;
   }


   static {
      Z();
   }

   private static void Z() {
      i_0 = 0.001F;
   }

   public float u() {
      return this.ratioL;
   }

   public int y() {
      return this.alpha;
   }

   public int N(int var1) {
      float[] afloat = class11300.L(var1);
      float f = afloat[0] + this.deltaH;
      float f1 = Math.clamp(afloat[1] * this.ratioS, 0.0F, 1.0F);
      float f2 = Math.clamp(afloat[2] * this.ratioL, 0.0F, 1.0F);
      int i = class11300.y(f, f1, f2);
      return this.alpha << 24 | i & 16777215;
   }

   public static class09196 N(int var0, int var1) {
      float[] afloat = class11300.L(var0);
      float[] afloat1 = class11300.L(var1);
      float f = afloat1[0] - afloat[0];
      float f1 = afloat[1] > 0.001F ? afloat1[1] / afloat[1] : afloat1[1];
      float f2 = afloat[2] > 0.001F ? afloat1[2] / afloat[2] : afloat1[2];
      int i = var1 >>> 24 & 0xFF;
      return new class09196(f, f1, f2, i);
   }

   public float N() {
      return this.ratioS;
   }
}
