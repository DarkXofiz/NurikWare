package NurikWare;

import io.netty.buffer.ByteBuf;
import java.io.IOException;

public class class11968 implements class11951<class09276> {
   private static String[] u;
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   private static void M() {
      u = new String[1];
      u[0] = "Payload may not be larger than 32767 bytes";
   }

   public class11968() {
      super();
      this.L();
   }

   public class11968(int var1, class11940 var2) {
      super();
      this.L();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   static {
      M();
   }

   public int y() {
      return (Integer)this.N_0;
   }

   @Override
   public void y(class11940 var1) throws IOException {
      this.N_0 = Integer.valueOf(var1.E());
      int i = var1.y();
      if (i >= 0 && i <= 32767) {
         this.N_1 = new class11940(var1.N(i), var1.z());
      } else {
         throw new IOException(u[0]);
      }
   }

   public class11940 N() {
      return (class11940)this.N_1;
   }

   @Override
   public void N(class11940 var1) {
      var1.L((Integer)this.N_0);
      ByteBuf bytebuf = ((class11940)this.N_1).W();
      var1.N(bytebuf, bytebuf.readerIndex(), bytebuf.readableBytes());
   }

   public void N(class09276 var1) {
      try {
         var1.N(this);
      } finally {
         if ((class11940)this.N_1 != null && ((class11940)this.N_1).W().refCnt() > 0) {
            ((class11940)this.N_1).s();
         }
      }
   }
}
