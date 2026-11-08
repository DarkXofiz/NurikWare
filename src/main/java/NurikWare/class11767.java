package NurikWare;

import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import minecraft.class00189;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class08893;

public class class11767 {
   private static String[] M;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class06202.Nq();
   public static Object N_3 = new YggdrasilAuthenticationService(((class06202)N_2).NJ()).createMinecraftSessionService();
   public static Object N_4 = new ConcurrentHashMap();
   public static Object N_5 = class11213.N((class09087)class09063.N_2, 4, 6);
   public static Object N_6 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.y_0).N(4).N()).N((class11213)N_5).N();

   private static Supplier<class01631> L(UUID var0) {
      AtomicReference atomicreference = new AtomicReference<>(class00189.N(var0));
      CompletableFuture.<ProfileResult>supplyAsync(() -> ((MinecraftSessionService)N_3).fetchProfile(var0, false), class07536.Z())
         .thenCompose(var0x -> var0x != null ? ((class06202)N_2).yP().N(var0x.profile()) : CompletableFuture.completedFuture(Optional.empty()))
         .thenAccept(var1x -> var1x.ifPresent(atomicreference::set))
         .exceptionally(var0x -> null);
      return atomicreference::get;
   }

   private static void L() {
      M = new String[5];
      M[0] = "u_projection";
      M[1] = "u_view";
      M[2] = "u_size";
      M[3] = "u_radius";
      M[4] = "texture_in";
   }

   private class11767() {
      super();
   }

   static {
      y();
      L();
      N();
   }

   private static void y() {
   }

   public static void N(UUID var0, String var1, float var2, float var3, float var4, float var5) {
      class01894 class01894 = N(var0, var1);
      if (class01894 != null) {
         if (((class06202)N_2).NO().y(class01894).method_68004() instanceof class08893 class08893) {
            int i = class08893.N();
            class11176.N((class11213)N_5, var2, var3, var4, var5, 0.0F, 0.0F, 1.0F, 1.0F, -1);
            ((class11174)N_6).N(var3x -> {
               var3x.z(M[0]).N(class11925.L());
               var3x.z(M[1]).N(RenderSystem.getModelViewMatrix());
               var3x.R(M[2]).N(var4, var5);
               var3x.i(M[3]).N(6.0F * class09222.L());
               var3x.M(M[4]).N(i);
            });
         }
      }
   }

   private static class01894 N(UUID var0, String var1) {
      class01631 class01631;
      if (var0.version() == 4) {
         class01631 = ((Map)N_4).computeIfAbsent(var0, var0x -> L(var0x)).get();
      } else {
         class01631 = class00189.N(var0);
      }

      return class01631 != null ? class01631.N().y() : null;
   }

   private static void N() {
      N_0 = 32;
      N_1 = 6.0F;
   }
}
