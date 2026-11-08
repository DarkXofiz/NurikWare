package NurikWare;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07681;

public class class10783 implements class04348 {
   public class10783(class01929 var1) {
      super();
      this.N = var1;
   }

   public Stream<class05946<? extends class00751<?>>> y() {
      return this.N.y();
   }

   public class03767 N() {
      return class03794.i.N();
   }

   private <T> class01903<T> N(class01921<T> var1) {
      return new class07681(this, var1);
   }

   public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return this.N.method_46759(var1).map(this::N);
   }
}
