package NurikWare;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class11498 {
   private class11498() {
      super();
   }

   private static byte[] N(long var0) {
      try {
         return MessageDigest.getInstance("SHA-256").digest(("nurikware-storage-xor-v1:" + var0).getBytes());
      } catch (NoSuchAlgorithmException nosuchalgorithmexception) {
         throw new IllegalStateException("SHA-256 unavailable", nosuchalgorithmexception);
      }
   }

   public static byte[] N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         byte[] abyte = N(((class11472)class11938.L_2).M());
         byte[] abyte1 = new byte[var0.length];

         for (int i = 0; i < var0.length; i++) {
            abyte1[i] = (byte)(var0[i] ^ abyte[i % abyte.length]);
         }

         return abyte1;
      } else {
         return var0;
      }
   }
}
