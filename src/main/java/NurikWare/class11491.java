package NurikWare;

import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11491 extends class11488 {
   public Object N_0;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void M() {
      this.B();
      class09250 class09250 = class11938.s().L((UUID)this.N_0).orElse(null);
      if (class09250 != null) {
         try {
            class09303.N(class09250);
         } catch (RuntimeException runtimeexception) {
            ((Logger)y_0).error("Failed to apply selected account {}", class09250.u(), runtimeexception);
         }
      }
   }

   public class11491(String var1, int var2) {
      super(var1, var2, null);
      this.B();
   }

   static {
      Z();
   }

   private void B() {
   }

   private static void Z() {
      y_0 = null;
   }

   public UUID y() {
      this.B();
      return (UUID)this.N_0;
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      this.B();
      if ((UUID)this.N_0 == null) {
         var1.packBoolean(false);
      } else {
         var1.packBoolean(true);
         var1.packLong(((UUID)this.N_0).getMostSignificantBits());
         var1.packLong(((UUID)this.N_0).getLeastSignificantBits());
      }
   }

   public class11491 N(UUID var1) {
      this.B();
      this.N_0 = var1;
      return this;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.B();
      if (!var2.unpackBoolean()) {
         this.N_0 = null;
      } else {
         this.N_0 = new UUID(var2.unpackLong(), var2.unpackLong());
         this.M();
      }
   }

   @Override
   public boolean d_() {
      this.B();
      return (UUID)this.N_0 == null;
   }
}
