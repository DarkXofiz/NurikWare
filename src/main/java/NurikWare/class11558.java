package NurikWare;

import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;

public class class11558 implements DiscordEventListener {
   public Object N_0;

   private void L() {
   }

   public class11558(class11575 var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   public void onDisconnect(int var1, String var2) {
      ((Logger)class11575.N_0).info("Discord RPC disconnected: {} (code {})", var2, var1);
   }

   public void onError(int var1, String var2) {
      ((Logger)class11575.N_0).warn("Discord RPC error: {} (code {})", var2, var1);
   }

   public void onReady(User var1) {
      try {
         ((class11472)class11938.L_2).N(var1);
         if (((AtomicBoolean)((class11575)this.N_0).y_0).get()) {
            ((class11575)this.N_0).R();
         }
      } catch (Exception exception) {
         ((Logger)class11575.N_0).warn("Discord onReady handler failed: {}", exception.getMessage());
      }
   }
}
