package NurikWare;

import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11521 extends class11488 {
   public Object N_0;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void L() {
      this.B();
      class11290 class11290 = class11938.G().N((UUID)this.N_0).orElse(null);
      if (class11290 != null && class11290.N() && class11290.U() != null) {
         try {
            new class11291().N(class11290.L(), class11290.U());
         } catch (RuntimeException runtimeexception) {
            ((Logger)y_0).error("Failed to apply selected preset {}", class11290.i(), runtimeexception);
         }
      }
   }

   public class11521(String var1, int var2) {
      super(var1, var2, null);
      this.B();
   }

   static {
      U();
   }

   private void B() {
   }

   private static void U() {
      y_0 = null;
   }

   public UUID y() {
      this.B();
      return (UUID)this.N_0;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.B();
      if (!var2.unpackBoolean()) {
         this.N_0 = null;
      } else {
         long i = var2.unpackLong();
         long j = var2.unpackLong();
         this.N_0 = new UUID(i, j);
         this.L();
      }
   }

   public class11521 N(UUID var1) {
      this.B();
      this.N_0 = var1;
      return this;
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

   @Override
   public boolean d_() {
      this.B();
      return (UUID)this.N_0 == null;
   }
}
