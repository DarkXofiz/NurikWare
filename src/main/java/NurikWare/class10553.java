package NurikWare;

import minecraft.class06025;
import minecraft.class06029;

public final class class10553<S> implements class06025<S> {
   private final S N;
   private final S y;

   public class10553(S var1, S var2) {
      super();
      this.N = (S)var1;
      this.y = (S)var2;
   }

   public <T> T apply(class06029<? super S, T> var1) {
      return (T)var1.N(this.N, this.y);
   }
}
