package NurikWare;

import java.util.function.Consumer;
import minecraft.class00381;

public enum class11920 {
   private static String[] strings_024517ede86c7388489d2ebaa4ff49c2b;
   private static byte[] bytes_124517ede86c7388489d2ebaa4ff49c2b;
   public static Object[] staticFields_024517ede86c7388489d2ebaa4ff49c2b;
   public class11889 fields_024517ede86c7388489d2ebaa4ff49c2b_0;

   private static void L() {
      bytes_124517ede86c7388489d2ebaa4ff49c2b = new byte[1];
      bytes_124517ede86c7388489d2ebaa4ff49c2b[0] = 5;
   }

   private void M() {
   }

   private class11920(class11889 var3) {
      this.M();
      this.fields_024517ede86c7388489d2ebaa4ff49c2b_0 = var3;
   }

   static {
      L();
      Z();
      u();
      staticFields_024517ede86c7388489d2ebaa4ff49c2b[0] = new class11920(new class11931());
      staticFields_024517ede86c7388489d2ebaa4ff49c2b[1] = new class11920(new class11912());
      staticFields_024517ede86c7388489d2ebaa4ff49c2b[2] = new class11920(new class11928());
      staticFields_024517ede86c7388489d2ebaa4ff49c2b[3] = new class11920(null);
      staticFields_024517ede86c7388489d2ebaa4ff49c2b[4] = R();
   }

   private static void Z() {
      strings_024517ede86c7388489d2ebaa4ff49c2b = new String[4];
      strings_024517ede86c7388489d2ebaa4ff49c2b[0] = "HUB";
      strings_024517ede86c7388489d2ebaa4ff49c2b[1] = "GRIEF";
      strings_024517ede86c7388489d2ebaa4ff49c2b[2] = "ANARCHY";
      strings_024517ede86c7388489d2ebaa4ff49c2b[3] = "NONE";
   }

   private static void u() {
      staticFields_024517ede86c7388489d2ebaa4ff49c2b = new Object[bytes_124517ede86c7388489d2ebaa4ff49c2b[0]];
   }

   public class11889 y() {
      return this.fields_024517ede86c7388489d2ebaa4ff49c2b_0;
   }

   public static void N(class00381<?> var0, Consumer<class11920> var1) {
      for (class11920 class11920 : values()) {
         if (class11920 != (class11920)staticFields_024517ede86c7388489d2ebaa4ff49c2b[3] && class11920.fields_024517ede86c7388489d2ebaa4ff49c2b_0.N(var0)) {
            var1.accept(class11920);
            break;
         }
      }
   }

   public boolean N() {
      return this == (class11920)staticFields_024517ede86c7388489d2ebaa4ff49c2b[0];
   }
}
