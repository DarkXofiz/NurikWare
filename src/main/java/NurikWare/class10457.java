package NurikWare;

import com.google.common.base.Ticker;
import java.util.function.LongSupplier;

public class class10457 extends Ticker {
   public class10457(LongSupplier var1) {
      super();
      this.N = var1;
   }

   public long read() {
      return this.N.getAsLong();
   }
}
