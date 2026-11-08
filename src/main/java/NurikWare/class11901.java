package NurikWare;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Optional;

public enum class11901 {
   public static Object[] staticFields_0ec612a2dc0263a258b66e8d510834aaf;
   private static String[] strings_0ec612a2dc0263a258b66e8d510834aaf;
   private static byte[] bytes_1ec612a2dc0263a258b66e8d510834aaf;
   public String fields_0ec612a2dc0263a258b66e8d510834aaf_0;

   private class11901(String var3) {
      this.y();
      this.fields_0ec612a2dc0263a258b66e8d510834aaf_0 = var3;
   }

   static {
      i();
      u();
      B();
      staticFields_0ec612a2dc0263a258b66e8d510834aaf[0] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[1]);
      staticFields_0ec612a2dc0263a258b66e8d510834aaf[1] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[3]);
      staticFields_0ec612a2dc0263a258b66e8d510834aaf[2] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[5]);
      staticFields_0ec612a2dc0263a258b66e8d510834aaf[3] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[7]);
      staticFields_0ec612a2dc0263a258b66e8d510834aaf[4] = R();
   }

   private static void B() {
      staticFields_0ec612a2dc0263a258b66e8d510834aaf = new Object[bytes_1ec612a2dc0263a258b66e8d510834aaf[0]];
   }

   private static void i() {
      bytes_1ec612a2dc0263a258b66e8d510834aaf = new byte[1];
      bytes_1ec612a2dc0263a258b66e8d510834aaf[0] = 5;
   }

   private static void u() {
      strings_0ec612a2dc0263a258b66e8d510834aaf = new String[8];
      strings_0ec612a2dc0263a258b66e8d510834aaf[0] = "ENABLE";
      strings_0ec612a2dc0263a258b66e8d510834aaf[1] = "enable.ogg";
      strings_0ec612a2dc0263a258b66e8d510834aaf[2] = "DISABLE";
      strings_0ec612a2dc0263a258b66e8d510834aaf[3] = "disable.ogg";
      strings_0ec612a2dc0263a258b66e8d510834aaf[4] = "IRC";
      strings_0ec612a2dc0263a258b66e8d510834aaf[5] = "irc.ogg";
      strings_0ec612a2dc0263a258b66e8d510834aaf[6] = "PLAYER_PING";
      strings_0ec612a2dc0263a258b66e8d510834aaf[7] = "playerping.ogg";
   }

   private void y() {
   }

   public static Optional<class11901> N(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_0ec612a2dc0263a258b66e8d510834aaf_0.startsWith(var0)).findFirst().or(Optional::empty);
   }

   public InputStream N() throws IOException {
      return class11911.L("sounds/" + this.fields_0ec612a2dc0263a258b66e8d510834aaf_0).method_14482();
   }
}
