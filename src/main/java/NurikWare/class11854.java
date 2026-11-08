package NurikWare;

public enum class11854 {
   COMBAT(class11072.COMBAT),
   MOVEMENT(class11072.MOVEMENT),
   VISUAL(class11072.VISUAL),
   PLAYER(class11072.PLAYER),
   MISC(class11072.MISC),
   CONFIGS(null),
   AUTO_BUY(null),
   ACCOUNTS(null);
   public class11072 fields_0f20a130fa3103c9f92e009459f1b1f98_0;

   private static void M() {
   }

   private class11854(class11072 var3) {
      this.R();
      this.fields_0f20a130fa3103c9f92e009459f1b1f98_0 = var3;
   }

   static {
      M();
   }

   public class11072 N() {
      return this.fields_0f20a130fa3103c9f92e009459f1b1f98_0;
   }

   public static class11854 N(class11072 var0) {
      for (class11854 class11854 : values()) {
         if (class11854.fields_0f20a130fa3103c9f92e009459f1b1f98_0 == var0) {
            return class11854;
         }
      }

      return null;
   }

   private void R() {
   }
}
