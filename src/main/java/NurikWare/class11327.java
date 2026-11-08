package NurikWare;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11327 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   private static void M() {
      N_0 = null;
      N_1 = -1L;
   }

   public class11327() {
      super();
      this.y();
      this.y_0 = -1L;
   }

   static {
      M();
   }

   private void y() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
         this.y_1 = 0;
      }
   }

   public synchronized void N() {
      class11405 class11405 = class11938.z();
      if (class11405.R()) {
         class11405.N(new class11947());
      }
   }

   public synchronized void N(long var1) {
      if ((Long)this.y_0 == -1L) {
         this.y_0 = var1;
      } else if (var1 > (Long)this.y_0) {
         if (!class11938.g().y((Integer)this.y_1)) {
            ((Logger)N_0).info("Client update revision {} is ahead of session baseline {}", var1, (Long)this.y_0);
            this.y_1 = class11938.g().i().L().R().N(new class11877("icon:hud/arrows")).N(new class11857(class12020.N("update.restart-required"))).N();
         }
      }
   }
}
