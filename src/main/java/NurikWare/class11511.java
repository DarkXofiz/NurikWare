package NurikWare;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11511 extends class11488 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11511(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = null;
   }

   private BlockESP y() {
      return class11938.u().N();
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      Collection<class11025> collection = this.y().m();
      var1.packArrayHeader(collection.size());

      for (class11025 class11025 : collection) {
         var1.packString(class04206.i.y(class11025.N()).toString());
         var1.packInt(class11025.y());
      }
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int i = var2.unpackArrayHeader();
      ArrayList arraylist = new ArrayList(i);

      for (int j = 0; j < i; j++) {
         try {
            String s = var2.unpackString();
            int k = var2.unpackInt();
            class01894 class01894 = class01894.L(s);
            if (class01894 != null && class04206.i.u(class01894)) {
               arraylist.add(new class11025((class00891)class04206.i.N(class01894), k));
            } else {
               ((Logger)N_0).warn("Unknown block id '{}' in {}, skipped", s, this.u());
            }
         } catch (Exception exception) {
            ((Logger)N_0).warn("Skipped corrupt record #{} in {}: {}", j, this.u(), exception.getMessage());
         }
      }

      this.y().y(arraylist);
   }

   @Override
   public boolean d_() {
      return this.y().m().isEmpty();
   }
}
