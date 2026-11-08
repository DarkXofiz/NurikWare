package NurikWare;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class01289;
import minecraft.class01491;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class05378;
import org.apache.commons.lang3.mutable.MutableObject;

public class class09462<E> extends MapCodec<class01289<E>> {
   public class09462(Collection var1, Collection var2, MutableObject var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public <T> DataResult<class01289<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      MutableObject mutableobject = new MutableObject(DataResult.success(ImmutableList.builder()));
      var2.entries().forEach(var3x -> {
         DataResult dataresult = class04206.k.T().parse(var1, var3x.getFirst()).flatMap(var3xx -> this.N(var3xx, var1, var3x.getSecond()));
         mutableobject.setValue(((DataResult)mutableobject.get()).apply2(Builder::add, dataresult));
      });
      ImmutableList immutablelist = ((DataResult)mutableobject.get())
         .resultOrPartial(class01289.N::error)
         .<ImmutableList>map(Builder::build)
         .orElseGet(ImmutableList::of);
      return DataResult.success(new class01289(this.N, this.y, immutablelist, this.L));
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.N.stream().flatMap(var0 -> var0.N().map(var1x -> class04206.k.y(var0)).stream()).map(var1x -> (T)var1.createString(var1x.toString()));
   }

   private <T, U> DataResult<class10536<U>> N(class05378<U> var1, DynamicOps<T> var2, T var3) {
      return var1.N()
         .<DataResult>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + var1))
         .flatMap(var2x -> var2x.parse(var2, var3))
         .map(var1x -> new class10536(var1, Optional.of(var1x)));
   }

   public <T> RecordBuilder<T> encode(class01289<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      var1.N().forEach(var2x -> var2x.N(var2, var3));
      return var3;
   }
}
