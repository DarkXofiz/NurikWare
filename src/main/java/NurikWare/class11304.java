package NurikWare;

import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public class class11304 {
   private void L(MessageUnpacker var1) throws IOException {
      int i = var1.unpackArrayHeader();

      for (int j = 0; j < i; j++) {
         this.N(var1);
      }
   }

   public class11304() {
      super();
   }

   static {
      N();
   }

   private void u() {
      for (class11067 class11067 : class11938.u().NN()) {
         class11067.N(false);
         class11067.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);

         for (class11536<?> class11536 : class11067.w().values()) {
            this.N(class11536);
         }
      }
   }

   private void y(MessageUnpacker var1) throws IOException {
      int i = var1.unpackArrayHeader();

      for (int j = 0; j < i; j++) {
         int k = var1.unpackArrayHeader();
         String s = var1.unpackString();
         String s1 = var1.unpackString();
         boolean flag = var1.unpackBoolean();
         int l = var1.unpackInt();
         var1.unpackValue();
         int i1 = k >= 6 ? var1.unpackInt() : 0;
         class11938.b().N(s).ifPresent(var4x -> var4x.N(class12002.y(l), i1, class09045.N(s1), flag));
      }
   }

   private void N(class11536<?> var1) {
      var1.s();

      for (class11536<?> class11536 : var1.w().values()) {
         this.N(class11536);
      }
   }

   private void N(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      String s = var1.unpackString();
      boolean flag = var1.unpackBoolean();
      var1.unpackValue();
      ImmutableValue immutablevalue = var1.unpackValue();
      class11938.u().N(s).ifPresent(var3x -> {
         try {
            if (flag) {
               var3x.N(true);
            }
         } catch (Exception exception) {
         }

         if (!immutablevalue.isNilValue()) {
            this.N(var3x, immutablevalue.asArrayValue());
         }
      });
   }

   public void N(byte[] var1) throws IllegalStateException {
      if (var1 != null && var1.length != 0) {
         byte[] abyte = class11509.N(var1);
         this.u();

         try {
            MessageUnpacker messageunpacker = MessagePack.newDefaultUnpacker(abyte);

            try {
               int i = messageunpacker.unpackArrayHeader();
               messageunpacker.unpackInt();
               this.L(messageunpacker);
               if (i >= 3) {
                  this.y(messageunpacker);
               }
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
         } catch (IOException ioexception) {
            throw new IllegalStateException("Failed to deserialize preset (v1)", ioexception);
         }
      }
   }

   private void N(class11512 var1, ArrayValue var2) {
      Iterator<Value> iterator = var2.iterator();

      while (iterator.hasNext()) {
         ArrayValue arrayvalue = iterator.next().asArrayValue();
         String s = arrayvalue.get(0).asStringValue().asString();
         Value value = arrayvalue.get(1);
         Value value1 = arrayvalue.get(2);
         this.N(var1, s).ifPresent(var3x -> {
            try {
               class11530.N((class11536<?>)var3x, value);
            } catch (Exception exception) {
            }

            if (!value1.isNilValue()) {
               this.N(var3x, value1.asArrayValue());
            }
         });
      }
   }

   private static void N() {
   }

   private Optional<class11536<?>> N(class11512 var1, String var2) {
      for (class11536<?> class11536 : var1.w().values()) {
         if (class11536.P().N().equals(var2)) {
            return Optional.of(class11536);
         }

         Optional<class11536<?>> optional = this.N(class11536, var2);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }
}
