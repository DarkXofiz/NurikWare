package NurikWare;

import minecraft.class06025;
import minecraft.class06029;

public final class class10552<S> implements class06025<S> {
   private final S N;

   public class10552(S var1) {
      super();
      this.N = (S)var1;
   }

   public <T> T apply(class06029<? super S, T> var1) {
      return (T)var1.N(this.N);
   }
}
