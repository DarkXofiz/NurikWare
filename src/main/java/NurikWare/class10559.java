package NurikWare;

import minecraft.class02727;
import minecraft.class06202;

public class class10559 implements Runnable {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public class10559(class06202 var1, class09454 var2) {
      super();
      this.y();
      this.N_2 = var1;
      this.N_1 = var2;
   }

   @Override
   public void run() {
      if (!(Boolean)this.N_0) {
         this.N_0 = true;
         class02727.N(((class09454)this.N_1).L.N, ((Thread)((class06202)this.N_2).G_2).threadId());
      }
   }

   private void y() {
      this.N_0 = false;
   }
}
