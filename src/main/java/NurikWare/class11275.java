package NurikWare;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class05021;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11275 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   public boolean L() {
      return this.N() && !((ChannelGroup)this.N_0).isEmpty();
   }

   public class11275() {
      super();
      this.E();
      this.N_0 = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
      this.N_1 = new AtomicBoolean(false);
   }

   static {
      U();
   }

   public void i() {
      if (!((AtomicBoolean)this.N_1).compareAndSet(true, false)) {
         ((Logger)y_0).warn("AutoBuy server is not running - stop has been skipped");
      } else {
         ((Logger)y_0).info("AutoBuy server stopped");

         try {
            if ((Channel)this.N_5 != null && ((Channel)this.N_5).isOpen()) {
               ((Channel)this.N_5).close();
            }

            if ((EventLoopGroup)this.N_3 != null) {
               ((EventLoopGroup)this.N_3).shutdownGracefully();
            }

            if ((EventLoopGroup)this.N_4 != null) {
               ((EventLoopGroup)this.N_4).shutdownGracefully();
            }
         } catch (Exception exception) {
            class11303.y(class11921.N("auto-buy-error", exception.getMessage()));
            ((Logger)y_0).error("AutoBuy server error during stop: {}", exception.getMessage(), exception);
         }
      }
   }

   private static void U() {
      y_0 = null;
   }

   public void u() {
      if (!((AtomicBoolean)this.N_1).compareAndSet(false, true)) {
         ((Logger)y_0).warn("AutoBuy server is already running - start has been skipped");
      } else {
         Thread thread = new Thread(
            () -> {
               this.N_3 = new NioEventLoopGroup(1);
               this.N_4 = new NioEventLoopGroup();

               try {
                  ServerBootstrap serverbootstrap = new ServerBootstrap();
                  ((ServerBootstrap)((ServerBootstrap)serverbootstrap.group((EventLoopGroup)this.N_3, (EventLoopGroup)this.N_4)
                           .channel(NioServerSocketChannel.class))
                        .option(ChannelOption.SO_BACKLOG, 16))
                     .childOption(ChannelOption.SO_KEEPALIVE, true)
                     .childHandler(new class11161(this));
                  ChannelFuture channelfuture = serverbootstrap.bind("127.0.0.1", (Integer)this.N_2).sync();
                  this.N_5 = channelfuture.channel();
                  class11303.y(class11921.N("auto-buy-server-started", (Integer)this.N_2));
                  ((Logger)y_0).info("AutoBuy server started on port: {}", (Integer)this.N_2);
                  ((Channel)this.N_5).closeFuture().sync();
               } catch (InterruptedException interruptedexception) {
                  ((Logger)y_0).error("AutoBuy server interrupted: {}", interruptedexception.getMessage(), interruptedexception);
               } catch (Exception exception) {
                  class11303.y(class11921.N("auto-buy-server-error", exception.getMessage()));
                  ((Logger)y_0).error("AutoBuy server error during start: {}", exception.getMessage(), exception);
               } finally {
                  ((AtomicBoolean)this.N_1).set(false);
                  if ((EventLoopGroup)this.N_3 != null) {
                     ((EventLoopGroup)this.N_3).shutdownGracefully();
                  }

                  if ((EventLoopGroup)this.N_4 != null) {
                     ((EventLoopGroup)this.N_4).shutdownGracefully();
                  }
               }
            },
            "AutoBuy-WebSocket-Server"
         );
         thread.setDaemon(true);
         thread.start();
      }
   }

   public void y() {
      if (this.N()) {
         ((Logger)y_0).warn("AutoBuy server is already running on port {}", (Integer)this.N_2);
      } else {
         try {
            this.N_2 = class05021.N();
            N((Integer)this.N_2);
         } catch (IOException ioexception) {
            class11303.y(ioexception.getMessage());
            return;
         }

         this.u();
      }
   }

   private void E() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public void N(Channel var1, String var2) {
      if (var1 != null && var1.isActive()) {
         var1.writeAndFlush(new TextWebSocketFrame(var2));
      }
   }

   private static void N(int var0) throws IOException {
      try {
         File file1 = (File)class06202.Nq().l_1;
         Path path = file1.toPath().resolve("port.tmp");
         if (!Files.exists(path)) {
            Files.createFile(path);
         }

         Path path1 = path.getParent();
         if (path1 != null && !Files.exists(path1)) {
            Files.createDirectories(path1);
         }

         Files.writeString(path, Integer.toString(var0), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
      } catch (IOException ioexception) {
         ((Logger)y_0).error("Failed to write port to file: {}", ioexception.getMessage(), ioexception);
         throw new IOException(class12020.N("auto-buy-error").formatted(ioexception.getMessage()));
      }
   }

   public void N(String var1) {
      ((ChannelGroup)this.N_0).forEach(var2 -> this.N(var2, var1));
   }

   public boolean N() {
      return ((AtomicBoolean)this.N_1).get() && (Channel)this.N_5 != null && ((Channel)this.N_5).isOpen() && ((Channel)this.N_5).isActive();
   }
}
