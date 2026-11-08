package NurikWare;

import minecraft.class00392;
import minecraft.class05216;
import minecraft.class07689;

public class class10620 {
   public Object N_0;
   public Object N_1;

   public class10620(String var1, class10580[] var2) {
      super();
      this.u();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void u() {
   }

   public class00392 N(class07689 var1, boolean var2) {
      if (((class10580[])this.N_1).length != 0 && var2) {
         int i = ((class10580[])this.N_1)[0].y();
         class05216 class05216 = class00392.y(((String)this.N_0).substring(0, ((class10580[])this.N_1)[0].y()));

         for (class10580 class10580 : (class10580[])this.N_1) {
            class00392 class00392 = class10580.N(var1);
            if (i < class10580.y()) {
               class05216.i(((String)this.N_0).substring(i, class10580.y()));
            }

            class05216.y(class00392);
            i = class10580.N();
         }

         if (i < ((String)this.N_0).length()) {
            class05216.i(((String)this.N_0).substring(i));
         }

         return class05216;
      } else {
         return class00392.y((String)this.N_0);
      }
   }
}
