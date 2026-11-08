package NurikWare;

import com.github.luben.zstd.Zstd;

public class class11509 {
   public static Object N_0;

   private class11509() {
      super();
   }

   static {
      y();
   }

   private static void y() {
      N_0 = 9;
   }

   public static byte[] y(byte[] var0) {
      return Zstd.compress(var0, 9);
   }

   public static byte[] N(byte[] var0) {
      long i = Zstd.getFrameContentSize(var0);
      return i <= 0L ? Zstd.decompress(var0, (int)Math.max(var0.length * 10L, 4096L)) : Zstd.decompress(var0, (int)i);
   }
}
