package NurikWare;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;
import minecraft.class01289;
import minecraft.class01491;
import minecraft.class04206;
import minecraft.class05378;

public final class class10536<U> {
   private final class05378<U> N;
   private final Optional<? extends class01491<U>> y;

   class10536(class05378<U> var1, Optional<? extends class01491<U>> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public <T> void N(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.N.N().ifPresent(var3 -> this.y.ifPresent(var4 -> var2.add(class04206.k.T().encodeStart(var1, this.N), var3.encodeStart(var1, var4))));
   }

   public void N(class01289<?> var1) {
      var1.y(this.N, this.y);
   }

   public static <U> class10536<U> N(class05378<U> var0, Optional<? extends class01491<?>> var1) {
      return new class10536<>(var0, var1);
   }
}
