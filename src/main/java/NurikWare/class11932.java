package NurikWare;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class class11932 {
   public static Object N_0;
   public Object y_0;
   public Object y_1;

   private void L() {
   }

   public class11932() {
      super();
      this.L();
      this.y_0 = new class11926();
      this.y_1 = new class11485();
   }

   static {
      i();
      byte[] abyte = new byte[]{79, 103, 103, 83};
      N_0 = abyte;
   }

   private static void i() {
   }

   public class11885 N(InputStream var1) throws Exception {
      BufferedInputStream bufferedinputstream = var1 instanceof BufferedInputStream ? (BufferedInputStream)var1 : new BufferedInputStream(var1);
      return (this.N(bufferedinputstream) ? (class11463)this.y_0 : (class11463)this.y_1).N(bufferedinputstream);
   }

   private boolean N(BufferedInputStream var1) throws IOException {
      var1.mark(((byte[])N_0).length);
      byte[] abyte = new byte[((byte[])N_0).length];
      int i = var1.readNBytes(abyte, 0, abyte.length);
      var1.reset();
      return i == ((byte[])N_0).length && Arrays.equals(abyte, (byte[])N_0);
   }
}
