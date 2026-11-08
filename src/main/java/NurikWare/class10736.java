package NurikWare;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class10736 extends AbstractSpliterator<class07321> {
   @Nullable
   private class07321 i;

   @Override
   public boolean tryAdvance(Consumer<? super class07321> var1) {
      if (this.i == null) {
         this.i = this.N;
      } else {
         int ix = this.i.B;
         int j = this.i.Z;
         if (ix == this.y.B) {
            if (j == this.y.Z) {
               return false;
            }

            this.i = new class07321(this.N.B, j + this.L);
         } else {
            this.i = new class07321(ix + this.u, j);
         }
      }

      var1.accept(this.i);
      return true;
   }

   public class10736(long var1, int var3, class07321 var4, class07321 var5, int var6, int var7) {
      super(var1, var3);
      this.N = var4;
      this.y = var5;
      this.L = var6;
      this.u = var7;
   }
}
