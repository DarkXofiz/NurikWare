package NurikWare;

import java.util.Arrays;
import java.util.Objects;

public enum class11106 {
   AUTO("auto"),
   HELPER("helper"),
   INTERFACE("interface"),
   TRACKERS("trackers"),
   CLIENT("client"),
   BASE("base"),
   FIGHTING("fighting"),
   TOOLS("tools"),
   OTHER("other"),
   WORLD("world"),
   SCREEN("screen");
   // $VF: synthetic field
   private static final class11106[] $VALUES = i();
   public class12018 fields_0558c6655b04e3482a1b2216879a231f8_0;

   private class11106(String var3) {
      this.y();
      this.fields_0558c6655b04e3482a1b2216879a231f8_0 = new class12018("sub").N(var3);
   }

   static {
      R();
   }

   private void y() {
   }

   public class12018 N() {
      return this.fields_0558c6655b04e3482a1b2216879a231f8_0;
   }

   public static class11106 N(String var0) {
      return Arrays.stream(values()).filter(var1 -> Objects.equals(var1.fields_0558c6655b04e3482a1b2216879a231f8_0.N(), var0)).findFirst().orElse(null);
   }

   private static void R() {
   }
}
