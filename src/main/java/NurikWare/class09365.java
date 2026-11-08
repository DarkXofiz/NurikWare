package NurikWare;

import minecraft.class00381;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00638;
import minecraft.class07878;

public record class09365<T extends class00638>(T listener, class00381<T> packet) {
   public class00381<T> L() {
      return this.packet;
   }

   public class09365(T listener, class00381<T> packet) {
      super();
      this.listener = (T)listener;
      this.packet = packet;
   }

   public T y() {
      return this.listener;
   }

   public void N() {
      if (this.listener.method_52413(this.packet)) {
         try {
            this.packet.method_65081(this.listener);
         } catch (Exception exception) {
            if (exception instanceof class07878 && ((class07878)exception).getCause() instanceof OutOfMemoryError) {
               throw class00417.N(exception, this.packet, this.listener);
            }

            this.listener.method_59807(this.packet, exception);
         }
      } else {
         class00458.N.debug("Ignoring packet due to disconnection: {}", this.packet);
      }
   }
}
