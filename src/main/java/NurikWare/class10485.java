package NurikWare;

import minecraft.class04993;

public class class10485 {
   public static final byte N = 0;
   private static final int y = 0;
   private static final int L = 26;
   private static final byte u = 32;
   private static final byte i = 31;

   public static class04993 L(byte var0) {
      if (var0 == 0) {
         return class04993.field_44724;
      } else {
         return N(var0) ? class04993.field_44726 : class04993.field_44725;
      }
   }

   protected class10485() {
      super();
   }

   public static int y(byte var0) {
      return var0 & 31;
   }

   public static boolean N(byte var0) {
      return (var0 & 32) != 0;
   }

   public static byte N(byte var0, int var1) {
      if (var1 >= 0 && var1 <= 26) {
         return (byte)(var0 & -32 | var1 & 31);
      } else {
         throw new IllegalArgumentException("Neighbor count was not within range [0; 26]");
      }
   }

   public static byte N(byte var0, boolean var1) {
      return (byte)(var1 ? var0 | 32 : var0 & -33);
   }
}
