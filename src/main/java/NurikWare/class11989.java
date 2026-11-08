package NurikWare;

import io.netty.channel.ChannelFutureListener;

public record class11989(class11951<?> packet, class11959 requiredState, ChannelFutureListener listener) {

   public ChannelFutureListener L() {
      return this.listener;
   }

   public class11989(class11951<?> packet, class11959 requiredState, ChannelFutureListener listener) {
      super();
      this.packet = packet;
      this.requiredState = requiredState;
      this.listener = listener;
   }

   public class11959 y() {
      return this.requiredState;
   }

   public class11951<?> N() {
      return this.packet;
   }
}
