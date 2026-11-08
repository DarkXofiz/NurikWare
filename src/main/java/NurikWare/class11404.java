package NurikWare;

import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class06202;
import minecraft.class07536;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11404 {
   private static String[] i;
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1 = new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0, null, null);
   public static Object N_2 = new AtomicReference<>(N_1);
   public static Object N_3;

   public static void L() {
      if (!(Boolean)N_3) {
         N_3 = true;
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1, i[0], null));
         Thread thread = new Thread(class11404::M, i[1]);
         thread.setDaemon(true);
         thread.start();
      }
   }

   private static void M() {
      try (class11222 class11222 = new class11222()) {
         class11222.u();
         class06202 class06202 = class06202.Nq();
         String s1 = class11222.N();
         class06202.execute(() -> class07536.m().N(URI.create(s1)));
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2, i[2], null));
         String s2 = class11222.L().get(5L, TimeUnit.MINUTES);
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3, i[3], null));
         class11540 class11540 = class11108.N(class11108.N(s2, class11222.y()));
         byte[] abyte = class09120.N(class11540.u());
         class09250 class09250 = new class09250(new class11166(true, class11540.N(), class11540.i(), abyte), false, System.currentTimeMillis());
         class06202.execute(() -> {
            class11938.s().L(class09250);
            class11938.M().N(class11491.class).N(class09250.R());
            class11519.y(class11491.class);
            class09303.N(class11540.i(), class11540.N(), class11540.y(), class11540.L());
         });
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4, null, class11540.i()));
      } catch (Throwable throwable1) {
         Throwable throwable = N(throwable1);
         ((Logger)N_0).error(i[4], throwable);
         String s = throwable instanceof class11001 class11001 ? class11001.N() : i[5];
         ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5, s, null));
      } finally {
         N_3 = false;
      }
   }

   private class11404() {
      super();
      throw new UnsupportedOperationException(i[6]);
   }

   static {
      u();
      Z();
   }

   private static void Z() {
      N_3 = false;
   }

   private static void u() {
      i = new String[7];
      i[0] = "account.modal.microsoft.requesting";
      i[1] = "NurikWare-MS-Login";
      i[2] = "account.modal.microsoft.waiting";
      i[3] = "account.modal.microsoft.processing";
      i[4] = "Microsoft login failed";
      i[5] = "account.modal.microsoft.error.timeout";
      i[6] = "This is a utility class and cannot be instantiated";
   }

   public static void y() {
      ((AtomicReference)N_2).set((class11593)N_1);
   }

   public static class11593 N() {
      return (class11593)((AtomicReference)N_2).get();
   }

   private static Throwable N(Throwable var0) {
      Throwable throwable = var0.getCause();
      return throwable != null && var0 instanceof ExecutionException ? throwable : var0;
   }
}
