package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class class11843 {
   public Object N_0;

   private void L() {
   }

   public class11843() {
      super();
      this.L();
      this.N_0 = new Int2ObjectOpenHashMap();
      this.N(0, new class11438());
   }

   public class11448 N(int var1) {
      return (class11448)((Int2ObjectOpenHashMap)this.N_0).get(var1);
   }

   public void N(int var1, class11448 var2) {
      ((Int2ObjectOpenHashMap)this.N_0).put(var1, var2);
   }
}
