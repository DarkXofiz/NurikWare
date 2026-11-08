package NurikWare;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import minecraft.class01296;
import minecraft.class06153;

public class class09460 extends AbstractSpliterator<class01296> {
   final class06153 N;

   @Override
   public boolean tryAdvance(Consumer<? super class01296> var1) {
      if (this.N.N()) {
         var1.accept(new class01296(this.N.y(), this.N.L(), this.N.u()));
         return true;
      } else {
         return false;
      }
   }

   public class09460(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.y = var4;
      this.L = var5;
      this.u = var6;
      this.i = var7;
      this.R = var8;
      this.M = var9;
      this.N = new class06153(this.y, this.L, this.u, this.i, this.R, this.M);
   }
}
