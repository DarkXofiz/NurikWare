package NurikWare;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01022;
import minecraft.class05946;

public class class09431 implements class01022 {
   public class09431(class00751 var1) {
      super();
      this.L = var1;
   }

   public <T> Optional<class00751<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return this.L.M(var1);
   }

   public Stream<class01012<?>> method_40311() {
      return this.L.Z().stream().map(class01012::N);
   }

   public class01022 method_40316() {
      return this;
   }
}
