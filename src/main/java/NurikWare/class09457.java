package NurikWare;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.RecordBuilder;
import java.util.function.UnaryOperator;

public class class09457<T> implements RecordBuilder<T> {
   private final RecordBuilder<T> y;

   public class09457(RecordBuilder<T> var1, RecordBuilder var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public RecordBuilder<T> add(DataResult<T> var1, DataResult<T> var2) {
      this.y.add(var1, var2);
      return this;
   }

   public RecordBuilder<T> add(String var1, T var2) {
      this.y.add(var1, var2);
      return this;
   }

   public RecordBuilder<T> add(String var1, DataResult<T> var2) {
      this.y.add(var1, var2);
      return this;
   }

   public <E> RecordBuilder<T> add(String var1, E var2, Encoder<E> var3) {
      return this.y.add(var1, var3.encodeStart(this.ops(), var2));
   }

   public RecordBuilder<T> add(T var1, DataResult<T> var2) {
      this.y.add(var1, var2);
      return this;
   }

   public RecordBuilder<T> add(T var1, T var2) {
      this.y.add(var1, var2);
      return this;
   }

   public DataResult<T> build(DataResult<T> var1) {
      return this.y.build(var1);
   }

   public DataResult<T> build(T var1) {
      return this.y.build(var1);
   }

   public DynamicOps<T> ops() {
      return this.N;
   }

   public RecordBuilder<T> withErrorsFrom(DataResult<?> var1) {
      this.y.withErrorsFrom(var1);
      return this;
   }

   public RecordBuilder<T> setLifecycle(Lifecycle var1) {
      this.y.setLifecycle(var1);
      return this;
   }

   public RecordBuilder<T> mapError(UnaryOperator<String> var1) {
      this.y.mapError(var1);
      return this;
   }
}
