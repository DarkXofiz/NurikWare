package NurikWare;

import minecraft.class01128;
import org.jspecify.annotations.Nullable;

public class class09438<B, T> implements class01128<B, T> {
   public class09438(Class var1) {
      super();
      this.N = var1;
   }

   public Class<? extends B> s() {
      return this.N;
   }

   @Nullable
   public T N(B var1) {
      return (T)(this.N.equals(var1.getClass()) ? var1 : null);
   }
}
