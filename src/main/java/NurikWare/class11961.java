package NurikWare;

import java.util.function.Supplier;

public record class11961(Supplier<? extends class11951<?>> supplier, int since, int untilExclusive) {

   public int L() {
      return this.untilExclusive;
   }

   class11961(Supplier<? extends class11951<?>> supplier, int since, int untilExclusive) {
      super();
      this.supplier = supplier;
      this.since = since;
      this.untilExclusive = untilExclusive;
   }

   public int y() {
      return this.since;
   }

   boolean y(int var1) {
      return var1 >= this.since && var1 < this.untilExclusive;
   }

   public Supplier<? extends class11951<?>> N() {
      return this.supplier;
   }
}
