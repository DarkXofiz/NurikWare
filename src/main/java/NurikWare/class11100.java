package NurikWare;

import minecraft.class00381;

public record class11100(class00381<?> packet, long timestamp) {

   class11100(class00381<?> packet, long timestamp) {
      super();
      this.packet = packet;
      this.timestamp = timestamp;
   }

   public class00381<?> y() {
      return this.packet;
   }

   public long N() {
      return this.timestamp;
   }
}
