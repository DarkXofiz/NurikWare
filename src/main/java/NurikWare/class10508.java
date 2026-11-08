package NurikWare;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.BitSet;
import java.util.Optional;
import minecraft.class01296;
import minecraft.class05374;
import minecraft.class05474;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYCoord;

public class class10508<R> extends AbstractIterator<R> {
   private int R;

   public class10508(class05374 var1, BitSet var2, Long2ObjectMap var3, int var4, class05474 var5, int var6) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
      this.i = var6;
      this.R = this.N.nextSetBit(0);
   }

   protected R computeNext() {
      while (this.R >= 0) {
         Optional optional = (Optional)this.y.get(class01296.y(this.L, SectionYCoord.fromSectionIndex(this.u, this.R), this.i));
         this.R = this.N.nextSetBit(this.R + 1);
         if (optional.isPresent()) {
            return (R)optional.get();
         }
      }

      return (R)this.endOfData();
   }
}
