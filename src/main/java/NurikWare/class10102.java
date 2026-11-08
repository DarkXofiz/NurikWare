package NurikWare;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class03068;

public class class10102 implements class03068 {
   public class10102(Executor var1) {
      super();
      this.y = var1;
   }

   public <T> void N(CompletableFuture<T> var1, Consumer<T> var2) {
      var1.thenAcceptAsync(var2, this.y).exceptionally(var0 -> {
         N.error("Task failed", var0);
         return null;
      });
   }
}
