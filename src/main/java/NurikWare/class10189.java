package NurikWare;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import minecraft.class03340;

public class class10189 extends LongLinkedOpenHashSet {
   public class10189(class03340 var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.y = var1;
      this.N = var4;
   }

   protected void rehash(int var1) {
      if (var1 > this.N) {
         super.rehash(var1);
      }
   }
}
