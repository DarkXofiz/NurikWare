package NurikWare;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11330 {
   private static String[] u;
   public static Object N_0;

   private byte[] L(Iterable<class11067> var1) throws IOException {
      ArrayList arraylist = new ArrayList();

      for (class11067 class11067x : var1) {
         if (this.N(class11067x)) {
            arraylist.add(class11067x);
         }
      }

      List<class09173> list = this.y(var1);
      MessageBufferPacker messagebufferpacker = MessagePack.newDefaultBufferPacker();

      byte[] abyte;
      try {
         messagebufferpacker.packArrayHeader(3);
         messagebufferpacker.packInt(1);
         messagebufferpacker.packArrayHeader(arraylist.size());

         for (class11067 class11067x : arraylist) {
            this.N(messagebufferpacker, class11067x);
         }

         messagebufferpacker.packArrayHeader(list.size());

         for (class09173 class09173 : list) {
            this.N(messagebufferpacker, class09173);
         }

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

      return abyte;
   }

   public class11330() {
      super();
   }

   static {
      N();
      y();
      u();
   }

   private static void u() {
      N_0 = 1;
   }

   private static void y() {
      u = new String[1];
      u[0] = "Failed to serialize preset (v1)";
   }

   private List<class09173> y(Iterable<class11067> var1) {
      ArrayList arraylist = new ArrayList();

      for (class11067 class11067 : var1) {
         this.N(arraylist, class11067.R());
         this.N(class11067, arraylist);
      }

      return arraylist;
   }

   private void N(class11512 var1, List<class09173> var2) {
      for (class11536<?> class11536 : var1.w().values()) {
         this.N(class11536, var2);
      }
   }

   private void N(MessageBufferPacker var1, class11536<?> var2) throws IOException {
      List<class11536<?>> list = var2.w().values().stream().filter(this::N).toList();
      var1.packArrayHeader(3);
      var1.packString(var2.P().N());
      class11530.N(var1, var2);
      if (list.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(list.size());

         for (class11536<?> class11536 : list) {
            this.N(var1, class11536);
         }
      }
   }

   private boolean N(class11067 var1) {
      if (var1.U()) {
         return true;
      } else {
         for (class11536<?> class11536 : var1.w().values()) {
            if (this.N(class11536)) {
               return true;
            }
         }

         return false;
      }
   }

   private void N(MessageBufferPacker var1, class11067 var2) throws IOException {
      List<class11536<?>> list = var2.w().values().stream().filter(this::N).toList();
      var1.packArrayHeader(4);
      var1.packString(var2.N());
      var1.packBoolean(var2.U());
      var1.packNil();
      if (list.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(list.size());

         for (class11536<?> class11536 : list) {
            this.N(var1, class11536);
         }
      }
   }

   private static void N() {
   }

   private void N(List<class09173> var1, class09173 var2) {
      if (!var2.B()) {
         var1.add(var2);
      }
   }

   private boolean N(class11536<?> var1) {
      if (var1.N()) {
         return false;
      } else if (var1.c_()) {
         return true;
      } else {
         for (class11536<?> class11536 : var1.w().values()) {
            if (this.N(class11536)) {
               return true;
            }
         }

         return false;
      }
   }

   private void N(MessageBufferPacker var1, class09173 var2) throws IOException {
      var1.packArrayHeader(6);
      var1.packString(var2.L());
      var1.packString(var2.i().N());
      var1.packBoolean(var2.N());
      var1.packInt(var2.y().L());
      if (var2.R() == null) {
         var1.packNil();
      } else {
         var1.packString(var2.R());
      }

      var1.packInt(var2.Z());
   }

   public byte[] N(Iterable<class11067> var1) {
      try {
         byte[] abyte = this.L(var1);
         return class11509.y(abyte);
      } catch (IOException ioexception) {
         throw new IllegalStateException(u[0], ioexception);
      }
   }
}
