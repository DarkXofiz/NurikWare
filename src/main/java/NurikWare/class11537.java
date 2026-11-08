package NurikWare;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11537 extends class11488 implements class11531 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class11537(String var1, int var2) {
      super(var1, var2, class09378.NUKER);
      this.M();
   }

   static {
      Z();
   }

   private Nuker B() {
      return class11938.u().b();
   }

   private static void Z() {
      y_0 = null;
   }

   public class11537 N(boolean var1) {
      this.M();
      this.N_0 = var1;
      return this;
   }

   @Override
   public boolean y() {
      this.M();
      return (Boolean)this.N_0;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      Set<class00891> set = this.B().m();
      int i = var2.unpackArrayHeader();
      HashSet hashset = new HashSet(i);

      for (int j = 0; j < i; j++) {
         try {
            String s = var2.unpackString();
            class01894 class01894 = class01894.L(s);
            if (class01894 != null && class04206.i.u(class01894)) {
               hashset.add((class00891)class04206.i.N(class01894));
            } else {
               ((Logger)y_0).warn("Unknown block id '{}' in {}, skipped", s, this.u());
            }
         } catch (Exception exception) {
            ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", j, this.u(), exception.getMessage());
         }
      }

      set.removeIf(var1x -> !hashset.contains(var1x));
      set.addAll(hashset);
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      Set<class00891> set = this.B().m();
      var1.packArrayHeader(set.size());

      for (class00891 class00891 : set) {
         var1.packString(class04206.i.y(class00891).toString());
      }
   }

   @Override
   public boolean d_() {
      return this.B().m().isEmpty();
   }
}
