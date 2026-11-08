package NurikWare;

import java.util.Arrays;

public enum class09378 {
   FRIENDS(0),
   WAYPOINTS(1),
   MACROS(2),
   NUKER(3),
   CLIENT_SETTINGS(4);

   public Integer fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0;
   public boolean fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init;

   private static void L() {
   }

   private class09378(int var3) {
      this.y();
      this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 = var3;
   }

   static {
      L();
   }

   private void y() {
      if (!this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init) {
         this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init = true;
         this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 = 0;
      }
   }

   public static class09378 N(int var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 == var0).findFirst().orElse(null);
   }

   public int N() {
      return this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0;
   }
}
