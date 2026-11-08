package NurikWare;

import java.util.function.Consumer;

public record class11780<T>(Class<?> eventType, class11777 priority, boolean ignoreCancelled, class11826<T> eventListener) implements class11808 {

   @Override
   public class11777 L() {
      return this.priority;
   }

   public class11780(Class<?> eventType, class11777 priority, boolean ignoreCancelled, class11826<T> eventListener) {
      super();
      this.eventType = eventType;
      this.priority = priority;
      this.ignoreCancelled = ignoreCancelled;
      this.eventListener = eventListener;
   }

   public Class<?> B() {
      return this.eventType;
   }

   public class11826<T> Z() {
      return this.eventListener;
   }

   @Override
   public boolean i() {
      return this.ignoreCancelled;
   }

   @Override
   public Class<?> u() {
      return this.eventType;
   }

   @Override
   public Consumer<Object> N() {
      return var1 -> this.eventListener.listen((T)var1);
   }
}
