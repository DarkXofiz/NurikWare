package NurikWare;

import io.netty.handler.codec.DecoderException;
import minecraft.class02362;
import minecraft.class02636;
import minecraft.class03519;
import minecraft.class04247;
import minecraft.class06584;

public class class10623 implements class02362<class04247, class06584> {
   public class10623(class02362 var1) {
      super();
      this.N = var1;
   }

   public class06584 decode(class04247 var1) {
      class06584 class06584 = (class06584)this.N.decode(var1);
      if (!class06584.R()) {
         class03519 class03519 = var1.J().N(class02636.N);
         class06584.y.encodeStart(class03519, class06584).getOrThrow(DecoderException::new);
      }

      return class06584;
   }

   public void encode(class04247 var1, class06584 var2) {
      this.N.encode(var1, var2);
   }
}
