package NurikWare;

public final class class09712 {
   private class09712() {
      super();
   }

   public static float N(float var0, float var1, float var2) {
      float f = class09693.N(var2);
      return var0 + (var1 - var0) * f;
   }

   public static int N(int var0, int var1, float var2) {
      return class09662.N(var0, var1, class09693.N(var2));
   }
}
