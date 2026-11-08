package NurikWare;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;

public class class11325 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = ((Path)class11518.N_0).resolve("presets");

   private static byte[] L(UUID var0) {
      byte[] abyte = new byte[16];
      long i = var0.getMostSignificantBits();
      long j = var0.getLeastSignificantBits();

      for (int k = 0; k < 8; k++) {
         abyte[k] = (byte)(i >>> 8 * (7 - k));
         abyte[8 + k] = (byte)(j >>> 8 * (7 - k));
      }

      return abyte;
   }

   public Collection<class11290> L() {
      return List.copyOf(((Map)this.N_1).values());
   }

   public class11325() {
      super();
      this.U();
      this.N_0 = ((Path)y_4).resolve(String.valueOf(((class11472)class11938.L_2).M()));
      this.N_1 = new LinkedHashMap();
      this.N_2 = new AtomicLong();
   }

   static {
      z();
   }

   private void U() {
   }

   private static void z() {
      y_0 = null;
      y_1 = 50;
      y_2 = 1;
      y_3 = ".preset";
      y_4 = null;
   }

   public void u() {
      if (Files.isDirectory((Path)this.N_0)) {
         try (DirectoryStream<Path> directorystream = Files.newDirectoryStream((Path)this.N_0, "*.preset")) {
            for (Path path : directorystream) {
               class11290 class11290 = this.N(path);
               if (class11290 != null) {
                  ((Map)this.N_1).put(class11290.u(), class11290);
               }
            }
         } catch (IOException ioexception) {
            ((Logger)y_0).error("Failed to enumerate preset directory", ioexception);
         }
      }
   }

   public int y() {
      return ((Map)this.N_1).size();
   }

   public void y(UUID var1) {
      if (((Map)this.N_1).remove(var1) != null) {
         ((AtomicLong)this.N_2).incrementAndGet();
      }

      Path path = ((Path)this.N_0).resolve(var1 + ".preset");

      try {
         Files.deleteIfExists(path);
      } catch (IOException ioexception) {
         ((Logger)y_0).error("Failed to delete preset file {}", var1, ioexception);
      }
   }

   private static UUID N(byte[] var0) {
      long i = 0L;
      long j = 0L;

      for (int k = 0; k < 8; k++) {
         i = i << 8 | var0[k] & 255L;
         j = j << 8 | var0[8 + k] & 255L;
      }

      return new UUID(i, j);
   }

   public Optional<class11290> N(long var1) {
      return var1 <= 0L ? Optional.empty() : ((Map)this.N_1).values().stream().filter(var2 -> var2.Z() == var1).findFirst();
   }

   public void N(class11290 var1) {
      Path path = ((Path)this.N_0).resolve(var1.u() + ".preset");
      Path path1 = ((Path)this.N_0).resolve(var1.u() + ".preset." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.N_0);
         class11290 class11290 = this.N(var1, path);
         MessageBufferPacker messagebufferpacker = MessagePack.newDefaultBufferPacker();

         byte[] abyte;
         try {
            this.N(messagebufferpacker, class11290);
            abyte = messagebufferpacker.toByteArray();
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
         ((Map)this.N_1).put(class11290.u(), class11290);
         ((AtomicLong)this.N_2).incrementAndGet();
      } catch (IOException ioexception1) {
         ((Logger)y_0).error("Failed to save preset {}", var1.u(), ioexception1);
      } finally {
         try {
            Files.deleteIfExists(path1);
         } catch (IOException ioexception) {
         }
      }
   }

   private class11290 N(Path var1) {
      try {
         byte[] abyte = Files.readAllBytes(var1);
         MessageUnpacker messageunpacker = MessagePack.newDefaultUnpacker(class11498.N(abyte));

         class11290 class11290;
         try {
            class11290 = this.N(messageunpacker);
         } catch (Throwable throwable1) {
            if (messageunpacker != null) {
               try {
                  messageunpacker.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (messageunpacker != null) {
            messageunpacker.close();
         }

         return class11290;
      } catch (Exception exception) {
         ((Logger)y_0).warn("Skipped unreadable preset file {}: {}", var1.getFileName(), exception.getMessage());
         return null;
      }
   }

   private void N(MessageBufferPacker var1, class11290 var2) throws IOException {
      var1.packArrayHeader(3);
      var1.packInt(1);
      var1.packArrayHeader(10);
      var1.packBinaryHeader(16);
      var1.writePayload(L(var2.u()));
      var1.packLong(var2.Z());
      var1.packString(var2.i());
      var1.packString(var2.z());
      var1.packLong(var2.B());
      var1.packLong(var2.y());
      var1.packLong(var2.R());
      var1.packString(var2.M().N());
      var1.packInt(var2.L());
      var1.packBoolean(var2.N());
      if (var2.N() && var2.U() != null) {
         var1.packBinaryHeader(var2.U().length);
         var1.writePayload(var2.U());
      } else {
         var1.packBinaryHeader(0);
      }
   }

   public long N() {
      return ((AtomicLong)this.N_2).get();
   }

   private class11290 N(class11290 var1, Path var2) {
      if (!var1.N() && var1.U() == null && Files.exists(var2)) {
         class11290 class11290 = this.N(var2);
         if (class11290 != null && class11290.N() && class11290.U() != null) {
            if (!class11290.u().equals(var1.u())) {
               return var1;
            } else if (class11290.R() != var1.R() && !class11290.E()) {
               return var1;
            } else {
               var1.N(class11290.L());
               var1.N(class11290.U());
               var1.N(true);
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public Optional<class11290> N(UUID var1) {
      return Optional.ofNullable((class11290)((Map)this.N_1).get(var1));
   }

   private class11290 N(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      int i = var1.unpackInt();
      if (i != 1) {
         ((Logger)y_0).warn("Unknown preset file schema version {}", i);
         return null;
      } else {
         ArrayValue arrayvalue = var1.unpackValue().asArrayValue();
         UUID uuid = N(arrayvalue.get(0).asBinaryValue().asByteArray());
         long j = arrayvalue.get(1).asIntegerValue().asLong();
         String s = arrayvalue.get(2).asStringValue().asString();
         String s1 = arrayvalue.get(3).asStringValue().asString();
         long k = arrayvalue.get(4).asIntegerValue().asLong();
         long l = arrayvalue.get(5).asIntegerValue().asLong();
         long i1 = arrayvalue.get(6).asIntegerValue().asLong();
         class11296 class11296 = class11296.N(arrayvalue.get(7).asStringValue().asString());
         if (class11296 == null) {
            return null;
         } else {
            int j1 = arrayvalue.get(8).asIntegerValue().asInt();
            boolean flag = arrayvalue.get(9).asBooleanValue().getBoolean();
            byte[] abyte = var1.unpackValue().asBinaryValue().asByteArray();
            if (!flag || abyte.length == 0) {
               abyte = null;
               flag = false;
            }

            return new class11290(uuid, j, s, s1, k, l, i1, class11296, j1, flag, abyte);
         }
      }
   }
}
