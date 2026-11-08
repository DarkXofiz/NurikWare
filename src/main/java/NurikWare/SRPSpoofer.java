package NurikWare;

import minecraft.class00381;
import minecraft.class00642;
import minecraft.class06666;
import minecraft.class07367;
import minecraft.class07369;

@class11080(
   L = "SRPSpoofer",
   y = class11072.MISC,
   N = class11106.BASE
)
public class SRPSpoofer extends class11067 {
   public SRPSpoofer() {
      super();
   }

   @class11782
   public void N(class10990 var1) {
      if (var1.u() instanceof class06666 class06666) {
         var1.N();
         class00381<?> uuid = class06666.N();
         class00642 class00642 = var1.L();
         class00642.method_10743(new class07367(uuid, class07369.field_13016));
         class00642.method_10743(new class07367(uuid, class07369.field_13017));
      }
   }
}
