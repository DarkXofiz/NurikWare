package NurikWare;

import io.netty.buffer.ByteBuf;

public class class11952 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;

   private class11952() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      i();
   }

   private static void i() {
      N_0 = 5;
      N_1 = 127;
      N_2 = 128;
      N_3 = 7;
   }

   public static int N(ByteBuf var0) {
      int i = 0;
      int j = 0;

      byte b0;
      do {
         b0 = var0.readByte();
         i |= (b0 & 127) << j * 7;
         if (++j > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while (N(b0));

      return i;
   }

   public static boolean N(byte var0) {
      return (var0 & 128) == 128;
   }

   public static ByteBuf N(ByteBuf var0, int var1) {
      while ((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
      return var0;
   }
}
