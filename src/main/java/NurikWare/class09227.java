package NurikWare;

import java.util.function.Function;

public class class09227 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   private void L() {
   }

   private class09227(Function<class09211, class09991> var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   public class09991 N(class09211 var1) {
      if (var1 != (class09211)this.N_1) {
         this.N_1 = var1;
         this.N_2 = (class09991)((Function)this.N_0).apply(var1);
      }

      return (class09991)this.N_2;
   }

   public static class09227 N(Function<class09211, class09991> var0) {
      return new class09227(var0);
   }
}
