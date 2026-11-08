package NurikWare;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03767;
import minecraft.class04348;
import minecraft.class05946;

public class class10339 implements class04348 {
   public class10339(class01929 var1, class03767 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public Stream<class05946<? extends class00751<?>>> y() {
      return this.N.y();
   }

   public class03767 N() {
      return this.y;
   }

   public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return this.N.method_46759(var1).map(var1x -> var1x.N(var0));
   }
}
