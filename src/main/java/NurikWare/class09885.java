package NurikWare;

import minecraft.class02418;

public final class class09885<T> implements AutoCloseable {
   public final class02418<T> N;
   public final T y;
   public int L;

   public class09885(class02418<T> var1, T var2, int var3) {
      super();
      this.N = var1;
      this.y = (T)var2;
      this.L = var3;
   }

   @Override
   public void close() {
      this.N.N(this.y);
   }
}
