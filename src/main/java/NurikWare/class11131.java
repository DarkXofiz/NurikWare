package NurikWare;

import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06202;
import minecraft.class07050;

public abstract class class11131 extends class11798<ItemRelease> implements BiPredicate<class06202, class07050> {
   public class11131(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public abstract void y(class06202 var1, class07050 var2);

   public abstract boolean N(class06202 var1, class07050 var2, Function<class11223, Boolean> var3);
}
