package NurikWare;

import java.util.Map;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class05946;

public class class10081 implements class03542 {
   public class10081(Map var1) {
      super();
      this.N = var1;
   }

   public <T> Optional<class03515<T>> N(class05946<? extends class00751<? extends T>> var1) {
      return Optional.ofNullable((class03515<T>)this.N.get(var1));
   }
}
