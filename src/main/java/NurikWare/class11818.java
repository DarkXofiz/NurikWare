package NurikWare;

import java.util.function.Consumer;

public record class11818(class11808[] handlers, Consumer<Object>[] invokers) {

   class11818(class11808[] handlers, Consumer<Object>[] invokers) {
      super();
      this.handlers = handlers;
      this.invokers = invokers;
   }

   public class11808[] y() {
      return this.handlers;
   }

   public Consumer<Object>[] N() {
      return this.invokers;
   }
}
