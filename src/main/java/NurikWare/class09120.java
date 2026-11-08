package NurikWare;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class09120 {
   private static String[] L;
   public static Object N_0;

   private static void L() {
      N_0 = (byte)1;
   }

   private class09120() {
      super();
      throw new UnsupportedOperationException(L[1]);
   }

   static {
      y();
      L();
   }

   private static void y() {
      L = new String[2];
      L[0] = "Unable to write Microsoft account data.";
      L[1] = "This is a utility class and cannot be instantiated";
   }

   public static String N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         try {
            String s;
            try (DataInputStream datainputstream = new DataInputStream(new ByteArrayInputStream(var0))) {
               datainputstream.readByte();
               s = datainputstream.readUTF();
            }

            return s;
         } catch (IOException ioexception) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static byte[] N(String var0) {
      try {
         byte[] abyte;
         try (
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
         ) {
            dataoutputstream.writeByte(1);
            dataoutputstream.writeUTF(var0);
            abyte = bytearrayoutputstream.toByteArray();
         }

         return abyte;
      } catch (IOException ioexception) {
         throw new IllegalStateException(L[0], ioexception);
      }
   }
}
