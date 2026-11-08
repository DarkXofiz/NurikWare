package NurikWare;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public abstract class class11488 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public static Object u_0 = LogManager.getLogger(String.class);

   public class11488(String var1, int var2, class09378 var3) {
      super();
      this.Z();
      this.L_0 = var1;
      this.L_1 = var2;
      this.L_2 = var3;
   }

   static {
      z();
   }

   private void Z() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0;
      }
   }

   public class09378 i() {
      return (class09378)this.L_2;
   }

   private static void z() {
      u_0 = null;
   }

   public String u() {
      return (String)this.L_0;
   }

   public void y(MessageBufferPacker var1) throws IOException {
      var1.packInt((Integer)this.L_1);
      if (this instanceof class11531 class11531) {
         var1.packBoolean(class11531.y());
      }

      this.N(var1);
   }

   public abstract void N(int var1, MessageUnpacker var2) throws IOException;

   public abstract void N(MessageBufferPacker var1) throws IOException;

   public void N(MessageUnpacker var1) throws IOException {
      int i = var1.unpackInt();
      if (!this.N(i)) {
         ((Logger)u_0).warn("Unknown schema version {} in {}", i, (String)this.L_0);
      } else {
         if (this instanceof class11531) {
            ((class11531)this).N(var1.unpackBoolean());
         }

         this.N(i, var1);
      }
   }

   public boolean N(int var1) {
      return var1 == (Integer)this.L_1;
   }

   public int R() {
      return (Integer)this.L_1;
   }

   public abstract boolean d_();
}
