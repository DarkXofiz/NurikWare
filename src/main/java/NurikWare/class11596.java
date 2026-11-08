package NurikWare;

public record class11596(
   int textureId, float u0, float v0, float u1, float v1, int width, int height, boolean available, class11612 kind, float pxRange, float iconAspect
) {
   public static Object E_0 = new class11596(0, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0, false, class11612.REGULAR, 0.0F, 1.0F);

   public float L() {
      return this.u1;
   }

   public float M() {
      return this.pxRange;
   }

   private static void P() {
      E_0 = null;
   }


   static {
      P();
   }

   public int B() {
      return this.height;
   }

   public boolean Z() {
      return this.available;
   }

   public float i() {
      return this.v0;
   }

   public class11612 U() {
      return this.kind;
   }

   public float z() {
      return this.u0;
   }

   public int u() {
      return this.textureId;
   }

   public static class11596 y(int var0, int var1, int var2) {
      return var0 <= 0 ? (class11596)E_0 : new class11596(var0, 0.0F, 1.0F, 1.0F, 0.0F, var1, var2, true, class11612.REGULAR, 0.0F, 1.0F);
   }

   public int y() {
      return this.width;
   }

   public static class11596 N(int var0, int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return var0 <= 0 ? (class11596)E_0 : new class11596(var0, var3, var4, var5, var6, var1, var2, true, class11612.MTSDF, var7, var8);
   }

   public float N() {
      return this.iconAspect;
   }

   public static class11596 N(int var0, int var1, int var2, float var3, float var4, float var5, float var6) {
      return var0 <= 0 ? (class11596)E_0 : new class11596(var0, var3, var4, var5, var6, var1, var2, true, class11612.REGULAR, 0.0F, 1.0F);
   }

   public static class11596 N(int var0, int var1, int var2) {
      return var0 <= 0 ? (class11596)E_0 : new class11596(var0, 0.0F, 0.0F, 1.0F, 1.0F, var1, var2, true, class11612.REGULAR, 0.0F, 1.0F);
   }

   public float R() {
      return this.v1;
   }
}
