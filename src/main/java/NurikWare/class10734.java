package NurikWare;

import java.util.function.BiFunction;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

public class class10734 implements BiFunction<class05862, class07209, class06183> {
   int N;
   int y;
   class08050 L;
   final boolean u;

   public class10734(class07290 var1, class05862 var2) {
      super();
      this.R = var1;
      this.i = var2;
      this.N = Integer.MIN_VALUE;
      this.y = Integer.MIN_VALUE;
      this.L = null;
      this.u = ((ClipContextAccessor)this.i).getFluidHandling() != class05835.field_1348;
   }

   public class06183 apply(class05862 var1, class07209 var2) {
      class00500 class00500 = this.N((class05487)this.R, var2);
      class06889 class06889x = var1.y();
      class06889 class06889x = var1.N();
      class00494 class00494 = var1.N(class00500, this.R, var2);
      class06183 class06183x = this.R.N(class06889x, class06889x, var2, class00494, class00500);
      double d0 = class06183x == null ? Double.MAX_VALUE : var1.y().M(class06183x.y());
      double d1 = Double.MAX_VALUE;
      class06183 class06183x = null;
      if (this.u) {
         class04688 class04688 = class00500.Y();
         class06183x = var1.N(class04688, this.R, var2).method_1092(class06889x, class06889x, var2);
         d1 = class06183x == null ? Double.MAX_VALUE : var1.y().M(class06183x.y());
      }

      return d0 <= d1 ? class06183x : class06183x;
   }

   private class00500 N(class05487 var1, class07209 var2) {
      if (var1.method_31601(var2.method_10264())) {
         return class00869.mh.W();
      } else {
         int ix = ChunkCoord.fromBlockCoord(var2.method_10263());
         int j = ChunkCoord.fromBlockCoord(var2.method_10260());
         if (this.N != ix || this.y != j) {
            this.L = var1.method_8392(ix, j);
            this.N = ix;
            this.y = j;
         }

         class08050 class08050 = this.L;
         if (class08050 != null) {
            class00554 class00554 = class08050.u()[SectionYIndex.fromBlockCoord(class08050, var2.method_10264())];
            if (class00554 != null && !class00554.L()) {
               return class00554.N(var2.method_10263() & 15, var2.method_10264() & 15, var2.method_10260() & 15);
            }
         }

         return class00869.N.W();
      }
   }
}
