package NurikWare;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import minecraft.class05715;

public class class10535<A> implements Codec<A> {
   public class10535(class05715 var1, Codec var2, int var3, DataFixer var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
      int i = var1.get(var2, "DataVersion").flatMap(var1::getNumberValue).map(Number::intValue).result().orElse(this.y);
      Dynamic dynamic = new Dynamic(var1, var1.remove(var2, "DataVersion"));
      Dynamic dynamic1 = this.u.N(this.L, dynamic, i);
      return this.N.decode(dynamic1);
   }

   public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
      return this.N.encode(var1, var2, var3).flatMap(var1x -> var2.mergeToMap(var1x, var2.createString("DataVersion"), var2.createInt(class05715.N())));
   }
}
