package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.IntConsumer;
import minecraft.class07340;
import minecraft.class07348;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper.LithiumBlockCounter;

public class class10738 implements IntConsumer {
   int N;

   public class10738(class07348 var1, IntConsumer var2, LithiumBlockCounter var3, Int2IntOpenHashMap var4, class07340 var5) {
      super();
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.N = 0;
   }

   @Override
   public void accept(int var1) {
      this.y.accept(var1);
      this.N++;
      if (this.N % 248 == 0 || this.N == 4096) {
         this.L.finishedCountingMinisection(this.u, this.i);
      }
   }
}
