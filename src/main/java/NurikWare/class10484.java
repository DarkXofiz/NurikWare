package NurikWare;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import minecraft.class05010;

public class class10484 extends Long2ByteOpenHashMap {
   public class10484(class05010 var1, int var2, float var3, int var4) {
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
