package NurikWare;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.LogManager;

public class class11405 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;

   public AtomicBoolean L() {
      return (AtomicBoolean)this.L_3;
   }

   public class11864 M() {
      return (class11864)this.L_0;
   }

   private void P() {
   }

   public class11405() {
      super();
      this.P();
      this.L_0 = new class11864();
      this.L_1 = new class11876();
      this.L_2 = new class11880();
      this.L_3 = new AtomicBoolean(true);
      this.L_4 = new AtomicReference();
      this.L_5 = new AtomicReference();
      this.y_0 = new AtomicReference();
      this.y_1 = new class11850(((AtomicReference)this.L_4)::get);
      this.y_2 = new AtomicBoolean(false);
   }

   static {
      s();
   }

   public class11876 B() {
      return (class11876)this.L_1;
   }

   public void Z() {
   }

   public class11850 i() {
      return (class11850)this.y_1;
   }

   private static void s() {
      N_0 = null;
   }

   public void m() {
   }

   private void t() {
   }

   public AtomicReference<class11407> U() {
      return (AtomicReference<class11407>)this.L_5;
   }

   public void z() {
   }

   public AtomicReference<class11841> u() {
      return (AtomicReference<class11841>)this.y_0;
   }

   public class11880 y() {
      return (class11880)this.L_2;
   }

   public List<String> E() {
      return ((class11864)this.L_0).N();
   }

   public void N(class11951<?> var1, class11959 var2, ChannelFutureListener var3) {
   }

   public void N(class11951<class09276> var1) {
   }

   private Bootstrap N(EventLoopGroup var1, class11436 var2, class11423 var3) {
      class11831 class11831 = new class11831(var2, new class11842(), () -> new class11410(this), ((AtomicReference)this.L_4)::set, () -> {});
      return (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(var1)).channel(NioSocketChannel.class))
            .option(ChannelOption.TCP_NODELAY, true))
         .handler(class11831);
   }

   public AtomicBoolean N() {
      return (AtomicBoolean)this.y_2;
   }

   public void N(class11951<?> var1, class11959 var2) {
   }

   public AtomicReference<class11410> W() {
      return (AtomicReference<class11410>)this.L_4;
   }

   public boolean R() {
      return true;
   }
}
