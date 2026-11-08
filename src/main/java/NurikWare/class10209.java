package NurikWare;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00751;
import minecraft.class01929;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class05946;

public final class class10209 implements class03542 {
   private final class01929 N;
   private final Map<class05946<? extends class00751<?>>, Optional<? extends class03515<?>>> y = new ConcurrentHashMap<>();

   public class10209(class01929 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class10209 class10209 && this.N.equals(class10209.N);
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }

   private Optional<class03515<Object>> y(class05946<? extends class00751<?>> var1) {
      return this.N.method_46759(var1).map(class03515::N);
   }

   public <E> Optional<class03515<E>> N(class05946<? extends class00751<? extends E>> var1) {
      return (Optional<class03515<E>>)this.y.computeIfAbsent(var1, this::y);
   }
}
