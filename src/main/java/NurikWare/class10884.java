package NurikWare;

import java.util.concurrent.Executor;
import minecraft.class08199;

public class class10884 implements class08199<Runnable> {
   public class10884(String var1, Executor var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return this.N;
   }

   public Runnable y(Runnable var1) {
      return var1;
   }

   public void N(Runnable var1) {
      this.y.execute(var1);
   }

   public String as_() {
      return this.N;
   }
}
