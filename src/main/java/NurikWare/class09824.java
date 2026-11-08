package NurikWare;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import minecraft.class02709;
import minecraft.class04111;
import minecraft.class04129;

public class class09824 extends class04111<class09824> {
   private final Builder<class04129> N = ImmutableList.builder();

   public class09824 L(class04111<?> var1) {
      this.N.add(var1.y());
      return this;
   }

   public class09824(class04111<?>... var1) {
      super();

      for (class04111 class04111 : var1) {
         this.N.add(class04111.y());
      }
   }

   public class04129 y() {
      return new class02709(this.N.build(), this.i());
   }

   protected class09824 L() {
      return this;
   }
}
