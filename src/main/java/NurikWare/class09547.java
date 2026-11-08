package NurikWare;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class05946;

public class class09547 implements class01929 {
   public class09547(Map var1) {
      super();
      this.N = var1;
   }

   public Stream<class05946<? extends class00751<?>>> y() {
      return this.N.keySet().stream();
   }

   public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return Optional.ofNullable((class01921<T>)this.N.get(var1));
   }
}
