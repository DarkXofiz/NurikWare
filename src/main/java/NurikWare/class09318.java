package NurikWare;

import minecraft.class05096;
import minecraft.class06202;

public class class09318 implements class11826<class11389> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   private void L(class11389 var1) {
      if (var1.B()) {
         ((class11992)this.N_3).N(var1.z()).stream().map(class11997::y).forEach(class11910::N);
      }
   }

   private void L() {
   }

   public class09318() {
      super();
      this.L();
      this.N_0 = class06202.Nq();
      this.N_1 = class11938.L();
      this.N_2 = class11938.W();
      this.N_3 = class11938.y();
   }

   private void y(class11389 var1) {
      class11400 class11400 = class11400.N(var1);
      ((class11805)this.N_1).L(class11400);
      if (class11400.y()) {
         var1.N();
      }
   }

   private boolean y() {
      return (class05096)((class06202)this.N_0).v_3 == null;
   }

   public void listen(class11389 var1) {
      if (!var1.y()) {
         if (var1.M()) {
            ((class09426)this.N_2).N(var1);
            this.y(var1);
         } else if (this.y()) {
            if (var1.B()) {
               ((class09426)this.N_2).y(var1);
            }

            this.y(var1);
            this.L(var1);
         }
      }
   }
}
