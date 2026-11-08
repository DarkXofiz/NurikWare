package NurikWare;

public record class11637(String normalizedRef, int width, int height, byte[] rgbaPixels, byte[] alphaMask, String failureReason) {

   public byte[] L() {
      return this.alphaMask;
   }

   private class11637(String normalizedRef, int width, int height, byte[] rgbaPixels, byte[] alphaMask, String failureReason) {
      super();
      this.normalizedRef = normalizedRef;
      this.width = width;
      this.height = height;
      this.rgbaPixels = rgbaPixels;
      this.alphaMask = alphaMask;
      this.failureReason = failureReason;
   }

   public int i() {
      return this.height;
   }

   public byte[] u() {
      return this.rgbaPixels;
   }

   public String y() {
      return this.failureReason;
   }

   static class11637 N(String var0, String var1) {
      return new class11637(var0, 0, 0, null, null, var1);
   }

   static class11637 N(String var0, int var1, int var2, byte[] var3, byte[] var4) {
      return new class11637(var0, var1, var2, var3, var4, null);
   }

   public String N() {
      return this.normalizedRef;
   }

   public int R() {
      return this.width;
   }
}
