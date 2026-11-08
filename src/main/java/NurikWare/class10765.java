package NurikWare;

import minecraft.class07536;

public class class10765 extends Thread {
   public class10765(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException interruptedexception) {
            class07536.N.warn("Timer hack thread interrupted, that really should not happen");
            return;
         }
      }
   }
}
