package NurikWare;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;

public class class11054 {
   private static String[] u;
   public static Object N_0 = new AtomicReference();
   public static Object N_1;

   private class11054() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      B();
      i();
   }

   private static void B() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }

   private static void i() {
      N_1 = false;
   }

   private static void u() {
      N_1 = false;
      UUID uuid = (UUID)((AtomicReference)N_0).getAndSet(null);
      if (uuid != null) {
         class11938.s().L(uuid).ifPresent(var0x -> {
            class11938.M().N(class11491.class).N(var0x.R());
            class11519.y(class11491.class);
            class09303.N(var0x);
         });
      }
   }

   public static boolean y(UUID var0) {
      return var0 != null && var0.equals(((AtomicReference)N_0).get());
   }

   public static void y() {
      ((AtomicReference)N_0).set(null);
   }

   public static void N(UUID var0) {
      ((AtomicReference)N_0).compareAndSet(var0, null);
   }

   private static boolean N(class06202 var0) {
      return var0 != null && (class03448)var0.T_3 == null && (class04453)var0.T_4 == null && var0.NE() == null;
   }

   public static void N(class09250 var0) {
      ((AtomicReference)N_0).set(var0.R());
      if (!(Boolean)N_1) {
         N_1 = true;
         class11938.Z().N(class11054::N, class11054::u);
      }
   }

   public static UUID N() {
      return (UUID)((AtomicReference)N_0).get();
   }
}
