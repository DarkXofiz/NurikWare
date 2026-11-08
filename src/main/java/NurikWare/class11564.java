package NurikWare;

import minecraft.class06937;

public record class11564(class06937 slot, long cost) {

   public class11564(class06937 slot, long cost) {
      super();
      this.slot = slot;
      this.cost = cost;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class11564 class11564 ? this.slot.u == class11564.slot.u : false;
      }
   }

   public class06937 y() {
      return this.slot;
   }

   public long N() {
      return this.cost;
   }
}
