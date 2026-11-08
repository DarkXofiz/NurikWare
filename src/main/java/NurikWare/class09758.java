package NurikWare;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class class09758 {
   private static final int N = 1095123249;
   private static final int y = 2;

   private class09758() {
      super();
   }

   static void N(Path var0, long var1, class09734 var3, class09752 var4, class09726 var5) throws IOException {
      int i = var3.y().N();

      try (DataOutputStream dataoutputstream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(var0)))) {
         dataoutputstream.writeInt(1095123249);
         dataoutputstream.writeInt(2);
         dataoutputstream.writeLong(var1);
         dataoutputstream.writeInt(var3.y().ordinal());
         dataoutputstream.writeDouble(var3.L());
         dataoutputstream.writeDouble(var3.u());
         dataoutputstream.writeDouble(var3.M());
         dataoutputstream.writeInt(i);
         int j = var4.N();
         dataoutputstream.writeInt(j);
         byte[] abyte = null;

         for (int k = 0; k < j; k++) {
            dataoutputstream.writeInt(var4.u(k));
            dataoutputstream.writeFloat(var4.i(k));
            dataoutputstream.writeFloat(var4.R(k));
            dataoutputstream.writeFloat(var4.M(k));
            dataoutputstream.writeFloat(var4.B(k));
            dataoutputstream.writeFloat(var4.Z(k));
            int l = var4.E(k);
            int i1 = var4.W(k);
            dataoutputstream.writeInt(l);
            dataoutputstream.writeInt(i1);
            if (l > 0 && i1 > 0) {
               int j1 = l * i1 * i;
               if (abyte == null || abyte.length < j1) {
                  abyte = new byte[j1];
               }

               var5.N(var4.z(k), var4.U(k), l, i1, abyte);
               dataoutputstream.write(abyte, 0, j1);
            }
         }
      }
   }

   static class09746 N(Path var0) {
      if (var0 != null && Files.isReadable(var0)) {
         try {
            class09746 class09746;
            try (DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(Files.newInputStream(var0)))) {
               if (datainputstream.readInt() != 1095123249 || datainputstream.readInt() != 2) {
                  return null;
               }

               long i = datainputstream.readLong();
               int j = datainputstream.readInt();
               double d0 = datainputstream.readDouble();
               double d1 = datainputstream.readDouble();
               double d2 = datainputstream.readDouble();
               int k = datainputstream.readInt();
               int l = datainputstream.readInt();
               if (l < 0) {
                  return null;
               }

               int[] aint = new int[l];
               class09761[] aclass09761 = new class09761[l];

               for (int i1 = 0; i1 < l; i1++) {
                  aint[i1] = datainputstream.readInt();
                  float f = datainputstream.readFloat();
                  float f1 = datainputstream.readFloat();
                  float f2 = datainputstream.readFloat();
                  float f3 = datainputstream.readFloat();
                  float f4 = datainputstream.readFloat();
                  int j1 = datainputstream.readInt();
                  int k1 = datainputstream.readInt();
                  byte[] abyte;
                  if (j1 > 0 && k1 > 0) {
                     abyte = new byte[j1 * k1 * k];
                     datainputstream.readFully(abyte);
                  } else {
                     abyte = new byte[0];
                  }

                  aclass09761[i1] = new class09761(abyte, j1, k1, k, f, f1, f2, f3, f4);
               }

               class09746 = new class09746(i, j, d0, d1, d2, k, aint, aclass09761);
            }

            return class09746;
         } catch (IOException ioexception) {
            System.err.println("[FontAtlas] ignoring unreadable atlas cache " + var0 + ": " + ioexception);
            return null;
         }
      } else {
         return null;
      }
   }
}
