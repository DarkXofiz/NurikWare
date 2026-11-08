package NurikWare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11519 {
   public Object N_0;
   public Object N_1;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1 = ((Path)class11518.N_0).resolve("configs");
   public static Object y_2;

   public Path L() {
      return (Path)this.N_0;
   }

   public void L(Class<? extends class11488> var1) {
      ((List)this.N_1).stream().filter(var1x -> var1x.getClass() == var1).findFirst().ifPresent(this::N);
   }

   private void M() {
   }

   public class11519() {
      super();
      this.M();
      this.N_0 = ((Path)y_1).resolve(String.valueOf(((class11472)class11938.L_2).M()));
      this.N_1 = List.of(
         new class11493("friends.dat", 1),
         new class11329("waypoints.dat", 1),
         new class11506("macros.dat", 1),
         new class11537("nuker.dat", 1),
         new class11521("selected-preset.dat", 1),
         new class11495("accounts.dat", 1),
         new class11491("selected-account.dat", 1),
         new class11514("client-settings.dat", 1),
         new class11292("ui-layout.dat", 1),
         new class11516("autobuy.dat", 1),
         new class11511("blockesp.dat", 1)
      );
   }

   static {
      R();
   }

   public List<class11488> i() {
      return (List<class11488>)this.N_1;
   }

   public void u() {
      ((List)this.N_1).forEach(this::y);
   }

   public void y() {
      ((List)this.N_1).forEach(this::N);
   }

   public void y(class11488 var1) {
      Path path = ((Path)this.N_0).resolve(var1.u());
      Path path1 = ((Path)this.N_0).resolve(var1.u() + "." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.N_0);
         MessageBufferPacker messagebufferpacker = MessagePack.newDefaultBufferPacker();

         byte[] abyte;
         try {
            var1.y(messagebufferpacker);
            abyte = class11509.y(messagebufferpacker.toByteArray());
         } catch (Throwable throwable1) {
            if (messagebufferpacker != null) {
               try {
                  messagebufferpacker.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (messagebufferpacker != null) {
            messagebufferpacker.close();
         }

         Files.write(path1, class11498.N(abyte), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
         Files.move(path1, path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
      } catch (IOException ioexception1) {
         ((Logger)y_0).error("Failed to save config {}", var1.u(), ioexception1);
      } finally {
         try {
            Files.deleteIfExists(path1);
         } catch (IOException ioexception) {
         }
      }
   }

   public static void y(Class<? extends class11488> var0) {
      class11519 class11519 = class11938.M();
      ((List)class11519.N_1).stream().filter(var1x -> var1x.getClass() == var0).findFirst().ifPresent(class11519::y);
   }

   public <T extends class11488> T N(Class<T> var1) {
      return ((List)this.N_1)
         .stream()
         .filter(var1::isInstance)
         .map(var1::cast)
         .findFirst()
         .orElseThrow(() -> new IllegalStateException("Config " + var1.getSimpleName() + " not registered"));
   }

   public Optional<class11531> N(class09378 var1) {
      return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).filter(var1x -> var1x.i() == var1).findFirst();
   }

   public void N(class11488 var1) {
      Path path = ((Path)this.N_0).resolve(var1.u());
      if (Files.exists(path)) {
         try {
            byte[] abyte = Files.readAllBytes(path);
            class11529.N(var1, class11498.N(abyte));
         } catch (Exception exception) {
            ((Logger)y_0).error("Failed to load config {}", var1.u(), exception);
         }
      }
   }

   public List<class11531> N() {
      return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).toList();
   }

   private static void R() {
      y_0 = null;
      y_1 = null;
      y_2 = 1;
   }
}
