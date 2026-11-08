package NurikWare;

import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class06202;

public interface class12040 extends Consumer<class06202>, Predicate<class06202> {
   void accept(class06202 var1);

   default boolean test(class06202 var1) {
      return true;
   }
}
