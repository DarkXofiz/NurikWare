package NurikWare;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;

public class class11514 extends class11488 implements class11531 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class12023 L() {
      this.z();
      return (class12023)this.y_0;
   }

   public class11514(String var1, int var2) {
      super(var1, var2, class09378.CLIENT_SETTINGS);
      this.z();
      this.y_0 = class11938.B();
   }

   static {
      U();
   }

   private static void U() {
      N_0 = null;
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = false;
      }
   }

   @Override
   public boolean y() {
      this.z();
      return (Boolean)this.y_1;
   }

   public class11514 N(boolean var1) {
      this.z();
      this.y_1 = var1;
      return this;
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      this.z();
      ArrayList arraylist = new ArrayList();

      for (class11536<?> class11536 : ((class12023)this.y_0).w().values()) {
         if (class11536.c_() && !class11536.N()) {
            arraylist.add(class11536);
         }
      }

      var1.packArrayHeader(arraylist.size());

      for (class11536 class11536x : arraylist) {
         var1.packArrayHeader(2);
         var1.packString(class11536x.P().N());
         class11530.N(var1, class11536x);
      }

      var1.packInt(((class11472)class11938.L_2).L());
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.z();
      int i = var2.unpackArrayHeader();

      for (int j = 0; j < i; j++) {
         var2.unpackArrayHeader();
         String s = var2.unpackString();
         ImmutableValue immutablevalue = var2.unpackValue();
         class11536 class11536 = ((class12023)this.y_0).L(s);
         if (class11536 == null) {
            ((Logger)N_0).warn("Unknown client setting '{}' in {}, skipped", s, this.u());
         } else {
            try {
               class11530.N(class11536, immutablevalue);
            } catch (Exception exception) {
               ((Logger)N_0).warn("Skipped corrupt client setting '{}' in {}: {}", s, this.u(), exception.getMessage());
            }
         }
      }

      if (var2.hasNext()) {
         ((class11472)class11938.L_2).L(var2.unpackInt());
      }
   }

   @Override
   public boolean d_() {
      this.z();
      return ((class11472)class11938.L_2).L() == -1 && ((class12023)this.y_0).w().values().stream().noneMatch(class11536::c_);
   }
}
