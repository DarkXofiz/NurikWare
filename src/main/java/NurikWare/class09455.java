package NurikWare;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

public class class09455<T> implements ListBuilder<T> {
   private final ListBuilder<T> y;

   public class09455(ListBuilder<T> var1, ListBuilder var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public ListBuilder<T> add(T var1) {
      this.y.add(var1);
      return this;
   }

   public ListBuilder<T> add(DataResult<T> var1) {
      this.y.add(var1);
      return this;
   }

   public <E> ListBuilder<T> add(E var1, Encoder<E> var2) {
      this.y.add(var2.encodeStart(this.ops(), var1));
      return this;
   }

   public <E> ListBuilder<T> addAll(Iterable<E> var1, Encoder<E> var2) {
      var1.forEach(var2x -> this.y.add(var2.encode(var2x, this.ops(), this.ops().empty())));
      return this;
   }

   public DataResult<T> build(T var1) {
      return this.y.build(var1);
   }

   public DataResult<T> build(DataResult<T> var1) {
      return this.y.build(var1);
   }

   public DynamicOps<T> ops() {
      return this.N;
   }

   public ListBuilder<T> withErrorsFrom(DataResult<?> var1) {
      this.y.withErrorsFrom(var1);
      return this;
   }

   public ListBuilder<T> mapError(UnaryOperator<String> var1) {
      this.y.mapError(var1);
      return this;
   }
}
