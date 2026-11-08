package NurikWare;

import java.util.Iterator;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06202;

public class class09352 implements class11826<class11353> {
   public Object N_0;

   private void L() {
   }

   public class09352() {
      super();
      this.L();
      this.N_0 = class06202.Nq();
   }

   private void N(String var1, boolean var2) {
      if ((class03448)((class06202)this.N_0).T_3 != null) {
         for (class04477 class04477 : ((class03448)((class06202)this.N_0).T_3).method_18456()) {
            if (var1.equals(class04477.method_5820())) {
               ((class11783)class04477).dataManager().i().N(var2);
            }
         }
      }
   }

   private void N() {
      if ((class03448)((class06202)this.N_0).T_3 != null) {
         Iterator<class04477> iterator = ((class03448)((class06202)this.N_0).T_3).method_18456().iterator();

         while (iterator.hasNext()) {
            ((class11783)iterator.next()).dataManager().i().N(false);
         }
      }
   }

   public void listen(class11353 var1) {
      switch (((int[])class09340.N_0)[var1.u().ordinal()]) {
         case 1:
            this.N(var1.y().y(), true);
            break;
         case 2:
            this.N(var1.y().y(), false);
            break;
         case 3:
            this.N();
      }
   }
}
