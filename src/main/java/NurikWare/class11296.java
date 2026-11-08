package NurikWare;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum class11296 {
   SYNCED("synced"),
   DIRTY("dirty"),
   LOCAL("local"),
   DELETING("deleting");

   public String fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0;
   public static Object staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4;

   private void L() {
   }

   private class11296(String var3) {
      this.L();
      this.fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0 = var3;
   }

   static {
      Stream stream = Arrays.stream(values());
      Function function = class11296::N;
      staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4 = stream.collect(Collectors.toMap(function, Function.identity()));
   }

   private static void u() {
      SYNCED = null;
      DIRTY = null;
      LOCAL = null;
      DELETING = null;
      staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4 = null;
   }

   public static class11296 N(String var0) {
      return (class11296)((Map)staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4).get(var0);
   }

   public String N() {
      return this.fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0;
   }
}
