package NurikWare;

import com.mojang.datafixers.util.Either;

public record class10191<T>(Either<T, Exception> value, long time) {

   public class10191(Either<T, Exception> value, long time) {
      super();
      this.value = value;
      this.time = time;
   }

   public long y() {
      return this.time;
   }

   public Either<T, Exception> N() {
      return this.value;
   }
}
