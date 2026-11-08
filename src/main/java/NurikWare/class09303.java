package NurikWare;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class02051;
import minecraft.class03323;
import minecraft.class03409;
import minecraft.class03415;
import minecraft.class03448;
import minecraft.class03930;
import minecraft.class04453;
import minecraft.class04771;
import minecraft.class05463;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class09303 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private class09303() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
      N();
   }

   private static void y() {
   }

   public static boolean N(class09250 var0) {
      return switch (var0.i()) {
         case class11991 class11991 -> N(class11991.u(), class11991.y());
         case class11166 class11166 -> N(var0, class11166);
         default -> throw new MatchException(null, null);
      };
   }

   private static void N() {
      N_0 = null;
   }

   public static boolean N(String var0, UUID var1) {
      class06202 class06202 = class06202.Nq();
      if ((class03448)class06202.T_3 == null && (class04453)class06202.T_4 == null && class06202.NE() == null) {
         class04771 class04771 = new class04771(var0, var1, "", Optional.empty(), Optional.empty());
         class03930 class03930 = class03930.N(YggdrasilAuthenticationService.createOffline(class06202.NJ()), (File)class06202.l_1);
         UserApiService userapiservice = UserApiService.OFFLINE;

         UserProperties userproperties;
         try {
            userproperties = userapiservice.fetchProperties();
         } catch (Throwable throwable) {
            userproperties = UserApiService.OFFLINE_PROPERTIES;
         }

         class05463 class05463 = new class05463(class06202, userapiservice);
         class03323 class03323 = new class03323(class06202, userapiservice, class04771);
         class02051 class02051 = class02051.N(userapiservice, class04771, ((File)class06202.l_1).toPath());
         class03409 class03409 = class03409.N(class03415.N(), userapiservice);
         UserProperties userproperties1 = userproperties;
         Runnable runnable = () -> {
            class11995 class11995 = (class11995)class06202;
            class06202.i_2 = class04771;
            class11995.N(class03930);
            class11995.N(CompletableFuture.completedFuture(null));
            class11995.N(userapiservice);
            class11995.y(CompletableFuture.completedFuture(userproperties1));
            class11995.N(class05463);
            class11995.N(class03323);
            class11995.N(class02051);
            class11995.N(class03409);
            class06202.yZ();
            ((Logger)N_0).info("Switched offline account to {} ({})", var0, var1);
         };
         if (class06202.E_()) {
            runnable.run();
         } else {
            class06202.execute(runnable);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean N(class09250 var0, class11166 var1) {
      class06202 class06202 = class06202.Nq();
      if ((class03448)class06202.T_3 == null && (class04453)class06202.T_4 == null && class06202.NE() == null) {
         String s = class09120.N(var1.R());
         if (s == null) {
            ((Logger)N_0).warn("Microsoft account {} has no stored token", var1.u());
            return false;
         } else {
            UUID uuid = var1.y();
            class11723.N(uuid);
            Thread thread = new Thread(() -> {
               try {
                  class10885 class10885 = class11108.N(s);
                  class11540 class11540 = class11108.N(class10885);
                  byte[] abyte = class09120.N(class11540.u());
                  class09250 class09250 = new class09250(new class11166(var1.i(), class11540.N(), class11540.i(), abyte), var0.y(), var0.M());
                  class06202.execute(() -> {
                     class11938.s().L(class09250);
                     N(class11540.i(), class11540.N(), class11540.y(), class11540.L());
                     class11723.L(uuid);
                  });
               } catch (Throwable throwable) {
                  ((Logger)N_0).error("Microsoft re-authentication failed", throwable);
                  String s1 = throwable instanceof class11001 class11001 ? class11001.N() : "account.modal.microsoft.error.generic";
                  class11723.N(uuid, s1);
                  class11303.y("Microsoft: " + class12020.N(s1));
               }
            }, "NurikWare-MS-Reauth");
            thread.setDaemon(true);
            thread.start();
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean N(String var0, UUID var1, String var2, String var3) {
      class06202 class06202 = class06202.Nq();
      if ((class03448)class06202.T_3 == null && (class04453)class06202.T_4 == null && class06202.NE() == null) {
         class04771 class04771 = new class04771(var0, var1, var2, Optional.ofNullable(var3), Optional.empty());
         YggdrasilAuthenticationService yggdrasilauthenticationservice = new YggdrasilAuthenticationService(class06202.NJ());
         class03930 class03930 = class03930.N(yggdrasilauthenticationservice, (File)class06202.l_1);

         UserApiService userapiservice;
         try {
            userapiservice = yggdrasilauthenticationservice.createUserApiService(var2);
         } catch (Throwable throwable1) {
            userapiservice = UserApiService.OFFLINE;
         }

         UserProperties userproperties;
         try {
            userproperties = userapiservice.fetchProperties();
         } catch (Throwable throwable) {
            userproperties = UserApiService.OFFLINE_PROPERTIES;
         }

         class05463 class05463 = new class05463(class06202, userapiservice);
         class03323 class03323 = new class03323(class06202, userapiservice, class04771);
         class02051 class02051 = class02051.N(userapiservice, class04771, ((File)class06202.l_1).toPath());
         class03409 class03409 = class03409.N(class03415.N(), userapiservice);
         UserApiService userapiservice1 = userapiservice;
         UserProperties userproperties1 = userproperties;
         Runnable runnable = () -> {
            class11995 class11995 = (class11995)class06202;
            class06202.i_2 = class04771;
            class11995.N(class03930);
            class11995.N(CompletableFuture.completedFuture(null));
            class11995.N(userapiservice1);
            class11995.y(CompletableFuture.completedFuture(userproperties1));
            class11995.N(class05463);
            class11995.N(class03323);
            class11995.N(class02051);
            class11995.N(class03409);
            class06202.yZ();
            ((Logger)N_0).info("Switched Microsoft account to {} ({})", var0, var1);
         };
         if (class06202.E_()) {
            runnable.run();
         } else {
            class06202.execute(runnable);
         }

         return true;
      } else {
         return false;
      }
   }
}
