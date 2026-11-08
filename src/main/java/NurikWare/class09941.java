package NurikWare;

final class class09941 {
   private class09941() {
      super();
   }

   static int N(int var0) {
      if (var0 <= 1) {
         return 1;
      } else if (var0 > 1073741824) {
         throw new IllegalArgumentException("value is too large for power-of-two rounding: " + var0);
      } else {
         return Integer.highestOneBit(var0 - 1) << 1;
      }
   }
}
