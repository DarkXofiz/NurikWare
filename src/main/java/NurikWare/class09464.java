package NurikWare;

import com.google.common.collect.AbstractIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import minecraft.class01289;
import net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior;
import org.jspecify.annotations.Nullable;

public class class09464<E> extends AbstractIterator<E> {
   public class09464(class01289 var1, Iterator var2) {
      super();
      this.N = var2;
   }

   @Nullable
   protected E computeNext() {
      while (this.N.hasNext()) {
         Pair pair = (Pair)this.N.next();
         if (pair.getSecond() != LithiumEmptyBehavior.EMPTY_BEHAVIOR_SENTINEL) {
            return (E)pair;
         }
      }

      return (E)((Pair)this.endOfData());
   }
}
