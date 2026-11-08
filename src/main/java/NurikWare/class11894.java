package NurikWare;

import com.mojang.serialization.Dynamic;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import minecraft.class03448;
import minecraft.class03519;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07742;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11894 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public static void L(Path var0) {
      try {
         if (!Files.isDirectory(var0)) {
            ((Logger)N_0).error("Path {} is not a directory", var0);
         } else if (!Files.exists(var0)) {
            ((Logger)N_0).error("Path {} does not exist", var0);
         } else {
            try (DirectoryStream<Path> directorystream = Files.newDirectoryStream(var0)) {
               for (Path path : directorystream) {
                  if (!path.getFileName().toString().endsWith(".nbt")) {
                     ((Logger)N_0).info("Skipping non-NBT file: {}", path);
                  } else {
                     class07001 class07001 = u(path);
                     if (class07001 != null) {
                        if (class07001.y("count")) {
                           class07001.b("count");
                        }

                        if (class07001.y("components")) {
                           class07001.W("components").ifPresent(var0x -> {
                              if (var0x.y("minecraft:damage")) {
                                 var0x.b("minecraft:damage");
                              }

                              if (var0x.y("minecraft:repair_cost")) {
                                 var0x.b("minecraft:repair_cost");
                              }

                              if (var0x.y("minecraft:tooltip_display")) {
                                 var0x.b("minecraft:tooltip_display");
                              }

                              if (var0x.y("minecraft:custom_data")) {
                                 var0x.b("minecraft:custom_data");
                              }
                           });
                        }

                        class07742.y(class07001, path);
                        ((Logger)N_0).info("Cleaned NBT file: {}", path);
                     }
                  }
               }
            } catch (Exception exception) {
               ((Logger)N_0).error("Error cleaning parsed items", exception);
            }
         }
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   private static void L() {
   }

   public static Path L(class06584 var0) {
      try {
         return y(y(var0));
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   private class11894() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
      y();
   }

   public static class07001 u(Path var0) {
      try {
         return class07742.N(var0);
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   public static Path y(class07001 var0) {
      try {
         Path path = ((File)class06202.Nq().l_1).toPath().resolve("parsed-item");
         if (Files.notExists(path)) {
            Files.createDirectories(path);
         }

         Path path1 = Path.of(path.toString(), "item0.nbt");
         int i = 0;

         while (Files.exists(path1)) {
            path1 = Path.of(path.toString(), "item%s.nbt".formatted(++i));
         }

         class07742.y(var0, path1);
         ((class03448)class06202.Nq().T_3).method_67392(class04909.yx, class04911.field_15250, 2.0F, 0.5F);
         return path1;
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   public static class07001 y(class06584 var0) {
      return (class07001)class06584.R.encodeStart(class11917.y(), var0).getOrThrow();
   }

   public static class06584 y(Path var0) {
      try {
         return (class06584)class06584.R.parse(new Dynamic(N(), class07742.N(var0))).getOrThrow();
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   private static void y() {
      N_0 = null;
   }

   public static class06584 N(Path var0) {
      try {
         return N(class07742.N(var0));
      } catch (Throwable throwable) {
         throw throwable;
      }
   }

   public static class03519<class07709> N() {
      return ((class03448)class06202.Nq().T_3).method_30349().N(class07713.N);
   }

   public static class07001 N(class06584 var0) {
      return (class07001)class06584.R.encodeStart(N(), var0).getOrThrow();
   }

   public static class06584 N(class07001 var0) {
      return (class06584)class06584.R.parse(new Dynamic(class11917.y(), var0)).getOrThrow();
   }
}
