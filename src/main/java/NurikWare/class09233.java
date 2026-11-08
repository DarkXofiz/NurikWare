package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06584;

public class class09233 {
   public Object N_0;

   private class09233() {
      super();
      this.i();
      this.N_0 = new ArrayList();
   }

   private void i() {
   }

   public static class09233 y() {
      return new class09233();
   }

   public List<class10879<?>> N() {
      return List.copyOf((List)this.N_0);
   }

   public <T> class09233 N(String var1, Function<class06584, T> var2, BiPredicate<T, T> var3) {
      ((List)this.N_0).add(new class10879(var1, var2, var3));
      return this;
   }
}
