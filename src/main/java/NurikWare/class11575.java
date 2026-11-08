package NurikWare;

import fun.crashsystem.jdrpc.DiscordIPC;
import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.activity.ActivityType;
import fun.crashsystem.jdrpc.activity.Activity.Builder;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11575 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public void L() {
      if (((AtomicBoolean)this.y_2).compareAndSet(false, true)) {
         ((ScheduledExecutorService)this.y_4).shutdownNow();

         try {
            ((DiscordIPC)this.y_3).close();
         } catch (Exception exception) {
            ((Logger)N_0).warn("Failed to close Discord RPC: {}", exception.getMessage());
         }
      }
   }

   public class11575() {
      super();
      this.W();
      this.y_0 = new AtomicBoolean(false);
      this.y_1 = new AtomicBoolean(false);
      this.y_2 = new AtomicBoolean(false);
      this.y_3 = DiscordIPC.create(
         DiscordIPCConfig.builder()
            .clientId(1228305955943612468L)
            .reconnectBaseDelayMs(30000L)
            .reconnectMaxDelayMs(30000L)
            .preferredBuilds(List.of(DiscordBuild.ANY))
            .reconnect(true)
            .build()
      );
      this.y_4 = Executors.newSingleThreadScheduledExecutor(var0 -> {
         Thread thread = new Thread(var0, "DiscordActivity-Retry");
         thread.setDaemon(true);
         return thread;
      });
      ((DiscordIPC)this.y_3).addListener(new class11558(this));
      this.E();
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = null;
      N_1 = 30L;
      N_2 = 1228305955943612468L;
   }

   private void z() {
      if (!((AtomicBoolean)this.y_2).get()) {
         try {
            ((ScheduledExecutorService)this.y_4).schedule(this::E, 30L, TimeUnit.SECONDS);
         } catch (Exception exception) {
         }
      }
   }

   public void y() {
      ((AtomicBoolean)this.y_0).set(false);
      if (((DiscordIPC)this.y_3).isConnected()) {
         try {
            ((DiscordIPC)this.y_3).clearActivityAsync();
         } catch (Exception exception) {
            ((Logger)N_0).warn("Failed to clear RPC: {}", exception.getMessage());
         }
      }
   }

   private void E() {
      if (!((AtomicBoolean)this.y_2).get()) {
         if (((AtomicBoolean)this.y_1).compareAndSet(false, true)) {
            ((DiscordIPC)this.y_3).connectAsync().whenComplete((var1, var2) -> {
               ((AtomicBoolean)this.y_1).set(false);
               if (!((AtomicBoolean)this.y_2).get()) {
                  if (var2 != null) {
                     this.z();
                  }
               }
            });
         }
      }
   }

   public void N() {
      ((AtomicBoolean)this.y_0).set(true);
      if (((DiscordIPC)this.y_3).isConnected()) {
         this.R();
      }
   }

   private void W() {
   }

   void R() {
      if (!((AtomicBoolean)this.y_2).get()) {
         try {
            long i = (System.currentTimeMillis() - ManagementFactory.getRuntimeMXBean().getUptime()) / 1000L;
            ((DiscordIPC)this.y_3)
               .setActivityAsync(
                  new Builder()
                     .setType(ActivityType.PLAYING)
                     .setState("UID: " + ((class11472)class11938.L_2).M())
                     .setDetails("Build: 1.21.11")
                     .setStartTimestamp(i)
                     .setLargeImage("https://github.com/CrashSystemZ/nursultan-gif/blob/main/RPC.gif?raw=true", ((class11472)class11938.L_2).Z())
                     .addButton("Website", "https://nurikware.fun")
                     .addButton("News", "https://t.me/nurikware_mc")
                     .build()
               );
         } catch (Exception exception) {
            ((Logger)N_0).warn("Failed to set RPC activity: {}", exception.getMessage());
         }
      }
   }
}
