package NurikWare;

import minecraft.class02484;
import minecraft.class02710;
import minecraft.class02833;
import minecraft.class06584;

public class class09241 extends class11882 {
   public class09241(class06584 var1, String var2, String var3, class11165 var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean u(class06584 var1) {
      return ((class02833)var1.y().a_(class02484.b, class02833.N)).y().isEmpty()
         && !var1.y().N(class02484.R)
         && ((class02710)var1.y().a_(class02484.P, class02710.N)).u();
   }
}
