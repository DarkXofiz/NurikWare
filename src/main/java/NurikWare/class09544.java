package NurikWare;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import minecraft.class01927;
import minecraft.class04111;
import minecraft.class04129;

public class class09544 extends class04111<class09544> {
   private final Builder<class04129> N = ImmutableList.builder();

   public class09544(class04111<?>... var1) {
      super();

      for (class04111 class04111 : var1) {
         this.N.add(class04111.y());
      }
   }

   public class04129 y() {
      return new class01927(this.N.build(), this.i());
   }

   public class09544 y(class04111<?> var1) {
      this.N.add(var1.y());
      return this;
   }

   protected class09544 L() {
      return this;
   }
}
