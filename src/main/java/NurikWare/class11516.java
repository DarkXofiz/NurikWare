package NurikWare;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;

public class class11516 extends class11488 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11516(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      B();
   }

   private static void B() {
      N_0 = null;
   }

   private static List<class11536<?>> y(class11882 var0) {
      ArrayList arraylist = new ArrayList();

      for (class11536<?> class11536 : var0.w().values()) {
         if (class11536.c_() && !class11536.N()) {
            arraylist.add(class11536);
         }
      }

      return arraylist;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int i = var2.unpackArrayHeader();

      for (int j = 0; j < i; j++) {
         var2.unpackArrayHeader();
         String s = var2.unpackString();
         boolean flag = var2.unpackBoolean();
         int k = var2.unpackArrayHeader();
         class11882 class11882 = class11938.n().N(s).orElse(null);
         if (class11882 == null) {
            ((Logger)N_0).warn("Unknown autobuy item '{}' in {}, skipped", s, this.u());
         } else {
            class11882.N(flag);
         }

         for (int l = 0; l < k; l++) {
            var2.unpackArrayHeader();
            String s1 = var2.unpackString();
            ImmutableValue immutablevalue = var2.unpackValue();
            if (class11882 != null) {
               class11536 class11536 = class11882.L(s1);
               if (class11536 == null) {
                  ((Logger)N_0).warn("Unknown autobuy setting '{}' for '{}' in {}, skipped", s1, s, this.u());
               } else {
                  try {
                     class11530.N(class11536, immutablevalue);
                  } catch (Exception exception) {
                     ((Logger)N_0).warn("Skipped corrupt autobuy setting '{}' in {}: {}", s1, this.u(), exception.getMessage());
                  }
               }
            }
         }
      }
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      List<class11882> list = class11938.n().L().filter(class11516::N).toList();
      var1.packArrayHeader(list.size());

      for (class11882 class11882 : list) {
         List<class11536<?>> list1 = y(class11882);
         var1.packArrayHeader(3);
         var1.packString(class11882.L().N());
         var1.packBoolean(class11882.M());
         var1.packArrayHeader(list1.size());

         for (class11536<?> class11536 : list1) {
            var1.packArrayHeader(2);
            var1.packString(class11536.P().N());
            class11530.N(var1, class11536);
         }
      }
   }

   private static boolean N(class11882 var0) {
      return var0.M() || var0.w().values().stream().anyMatch(class11536::c_);
   }

   @Override
   public boolean d_() {
      return class11938.n().L().noneMatch(class11516::N);
   }
}
