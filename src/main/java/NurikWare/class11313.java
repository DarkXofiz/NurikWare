package NurikWare;

import java.util.Comparator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11313 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;

   private static void M() {
      N_0 = null;
      N_1 = "default";
   }

   private class11313() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      M();
   }

   private static class11290 u() {
      byte[] abyte = class11280.N(class11938.u().NN());
      class11290 class11290 = new class11290(
         class11309.N(), 0L, "default", ((class11472)class11938.L_2).Z(), System.currentTimeMillis(), 0L, 0L, class11296.LOCAL, 1, true, abyte
      );
      class11938.G().N(class11290);
      class11938.I().y(class11290);
      return class11290;
   }

   public static void y() {
      class11521 class11521 = class11938.M().N(class11521.class);
      class11325 class11325 = class11938.G();
      UUID uuid = class11521.y();
      if (uuid == null || !class11325.N(uuid).isPresent()) {
         class11290 class11290 = class11325.L()
            .stream()
            .filter(var0x -> var0x.M() != class11296.DELETING)
            .max(Comparator.comparingLong(class11290::B))
            .orElse(null);
         if (class11290 == null) {
            class11290 = u();
         }

         class11521.N(class11290.u());
         class11519.y(class11521.class);
      }
   }

   public static void N() {
      if (class11938.B().N()) {
         UUID uuid = class11938.M().N(class11521.class).y();
         if (uuid != null) {
            class11290 class11290 = class11938.G().N(uuid).orElse(null);
            if (class11290 != null) {
               try {
                  byte[] abyte = class11280.N(class11938.u().NN());
                  class11290.N(abyte);
                  class11290.N(true);
                  class11290.N(1);
                  class11290.N(System.currentTimeMillis());
                  if (class11290.M() == class11296.SYNCED) {
                     class11290.N(class11296.DIRTY);
                  }

                  class11938.G().N(class11290);
               } catch (Exception exception) {
                  ((Logger)N_0).error("auto-save selected preset failed", exception);
               }
            }
         }
      }
   }
}
