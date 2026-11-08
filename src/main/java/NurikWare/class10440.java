package NurikWare;

import java.util.Arrays;
import java.util.List;
import minecraft.class04523;
import minecraft.class04537;

public class class10440<E> implements class04537<E> {
   private final Object[] N;

   public class10440(List<class04523<E>> var1, int var2) {
      super();
      this.N = new Object[var2];
      int i = 0;

      for (class04523 class04523 : var1) {
         int j = class04523.y();
         Arrays.fill(this.N, i, i + j, class04523.N());
         i += j;
      }
   }

   public E N(int var1) {
      return (E)this.N[var1];
   }
}
