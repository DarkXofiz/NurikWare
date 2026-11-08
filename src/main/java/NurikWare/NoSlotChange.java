package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06664;

@class11080(
   L = "NoSlotChange",
   y = class11072.COMBAT,
   N = class11106.OTHER
)
public class NoSlotChange extends class11067 {
   public NoSlotChange() {
      super();
   }

   @class11782
   private void N(class10990 var1) {
      if (var1.u() instanceof class06664 class06664x) {
         class06664 class06664x = class06664x;

         try {
            j = class06664x.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         int i = j;
         var1.N();
         class11938.Z().N(() -> {
            int ix = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
            class11322.i(i);
            class11322.i(ix);
         });
      }
   }
}
