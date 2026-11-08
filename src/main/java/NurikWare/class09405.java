package NurikWare;

import java.util.Optional;
import minecraft.class00819;
import minecraft.class02362;

public class class09405<B, T> implements class02362<B, class00819<T>> {
   private static final int y = 1;
   private static final int L = 2;

   public class09405(class02362 var1) {
      super();
      this.N = var1;
   }

   public void encode(B var1, class00819<T> var2) {
      Optional optional = var2.R();
      Optional optional1 = var2.M();
      var1.writeByte((optional.isPresent() ? 1 : 0) | (optional1.isPresent() ? 2 : 0));
      optional.ifPresent(var2x -> var0.encode(var1, var2x));
      optional1.ifPresent(var2x -> var0.encode(var1, var2x));
   }

   public class00819<T> decode(B var1) {
      byte b0 = var1.readByte();
      Optional optional = (b0 & 1) != 0 ? Optional.of((Number)this.N.decode(var1)) : Optional.empty();
      Optional optional1 = (b0 & 2) != 0 ? Optional.of((Number)this.N.decode(var1)) : Optional.empty();
      return new class00819(optional, optional1);
   }
}
