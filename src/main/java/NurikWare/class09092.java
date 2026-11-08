package NurikWare;

import it.unimi.dsi.fastutil.ints.IntList;

public record class09092(int fromInclusive, int toInclusive) {

   public class09092(int fromInclusive, int toInclusive) {
      super();
      if (!Character.isValidCodePoint(fromInclusive)) {
         throw new IllegalArgumentException("Invalid fromInclusive code point: " + fromInclusive);
      } else if (!Character.isValidCodePoint(toInclusive)) {
         throw new IllegalArgumentException("Invalid toInclusive code point: " + toInclusive);
      } else if (fromInclusive > toInclusive) {
         throw new IllegalArgumentException("fromInclusive must be <= toInclusive");
      } else {
         this.fromInclusive = fromInclusive;
         this.toInclusive = toInclusive;
      }
   }

   public int y() {
      return this.toInclusive;
   }

   public static class09092 N(int var0, int var1) {
      return new class09092(var0, var1);
   }

   public int N() {
      return this.fromInclusive;
   }

   public void N(IntList var1) {
      for (int i = this.fromInclusive; i <= this.toInclusive; i++) {
         var1.add(i);
      }
   }

   public static class09092 N(int var0) {
      return new class09092(var0, var0);
   }
}
