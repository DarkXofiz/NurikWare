package NurikWare;

import java.util.Map;

record class09748(Map<Long, Integer> pairs) implements class09729 {

   @Override
   public int N(int var1, int var2) {
      Integer integer = this.pairs.get((long)var1 << 32 | var2 & 4294967295L);
      return integer == null ? Integer.MIN_VALUE : integer;
   }

   public Map<Long, Integer> N() {
      return this.pairs;
   }
}
