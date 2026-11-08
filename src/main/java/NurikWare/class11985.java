package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public record class11985(
   Supplier<Channel> channelSupplier,
   BiConsumer<class11951<?>, ChannelFutureListener> writer,
   int maxPending,
   Consumer<class11989> onOverflow,
   Consumer<Throwable> onError
) {

   public Consumer<class11989> L() {
      return this.onOverflow;
   }

   public class11985(
      Supplier<Channel> channelSupplier,
      BiConsumer<class11951<?>, ChannelFutureListener> writer,
      int maxPending,
      Consumer<class11989> onOverflow,
      Consumer<Throwable> onError
   ) {
      super();
      if (channelSupplier == null || writer == null || onOverflow == null || onError == null) {
         throw new IllegalArgumentException("StatefulPacketGatewayConfig: all callbacks must be non-null");
      } else if (maxPending <= 0) {
         throw new IllegalArgumentException("StatefulPacketGatewayConfig: maxPending must be positive");
      } else {
         this.channelSupplier = channelSupplier;
         this.writer = writer;
         this.maxPending = maxPending;
         this.onOverflow = onOverflow;
         this.onError = onError;
      }
   }

   public Supplier<Channel> i() {
      return this.channelSupplier;
   }

   public BiConsumer<class11951<?>, ChannelFutureListener> u() {
      return this.writer;
   }

   public Consumer<Throwable> y() {
      return this.onError;
   }

   public int N() {
      return this.maxPending;
   }
}
