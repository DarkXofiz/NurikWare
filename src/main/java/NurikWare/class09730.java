package NurikWare;

import java.util.Iterator;
import java.util.List;

public final class class09730 {
   private static final int N = 4;
   private final int y;
   private final List<List<class09729>> L;

   class09730(int var1, List<List<class09729>> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public int y() {
      return this.y;
   }

   public int N(int var1, int var2) {
      int i = 0;
      Iterator<List<class09729>> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         Iterator<class09729> iterator1 = iterator.next().iterator();

         while (iterator1.hasNext()) {
            int j = iterator1.next().N(var1, var2);
            if (j != Integer.MIN_VALUE) {
               i += j;
               break;
            }
         }
      }

      return i;
   }

   public boolean N() {
      return this.L.isEmpty();
   }

   public static class09730 N(byte[] var0) {
      try {
         return new class09754(var0).N();
      } catch (RuntimeException runtimeexception) {
         return new class09730(1000, List.of());
      }
   }
}
