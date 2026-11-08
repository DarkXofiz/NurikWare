package NurikWare;

import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01631;
import minecraft.class03383;
import minecraft.class03404;
import minecraft.class03417;
import minecraft.class03933;

public class class10192 extends class03404 {
   private static final int y = 12;
   private static final int L = 4;
   private final class00392 u;
   private final Supplier<class01631> i;
   private final boolean R;

   public class10192(class03383 var1, GameProfile var2, class00392 var3, boolean var4) {
      super();
      this.N = var1;
      this.u = var3;
      this.R = var4;
      this.i = class03383.N(var1).yP().N(var2, true);
   }

   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.method_73380() - 12 + 4;
      int j = this.method_73382() + (this.method_73384() - 12) / 2;
      class03933.N(var1, this.i.get(), ix, j, 12);
      int k = this.method_73382() + 1 + (this.method_73384() - 9) / 2;
      var1.y(class03417.z(this.N.y), this.u, ix + 12 + 4, k, this.R ? -1 : -1593835521);
   }
}
