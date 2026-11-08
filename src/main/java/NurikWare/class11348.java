package NurikWare;

import java.util.function.ObjIntConsumer;

public class class11348 {
   public Object N_0;
   public Object N_1;

   private static boolean L(class11389 var0) {
      return var0.Z().N(class11381.KEYBOARD) && (var0.y(class12002.ESCAPE) || var0.y(class12002.DELETE));
   }

   private void L() {
   }

   public class11348(ObjIntConsumer<class12002> var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   private void u(class11389 var1) {
      if (L(var1)) {
         this.N_1 = null;
         ((ObjIntConsumer)this.N_0).accept(class12002.UNKNOWN, 0);
         var1.N();
      } else {
         class12002 class12002 = class12002.y(var1.z());
         if (class12013.N(class12002)) {
            this.N_1 = class12002;
            var1.N();
         } else {
            this.N_1 = null;
            ((ObjIntConsumer)this.N_0).accept(class12002, class12002.y() ? 0 : class12013.y(class12002, var1.R()));
            var1.N();
         }
      }
   }

   private void y(class11389 var1) {
      if ((class12002)this.N_1 != null && ((class12002)this.N_1).N(var1.z())) {
         class12002 class12002 = (class12002)this.N_1;
         this.N_1 = null;
         ((ObjIntConsumer)this.N_0).accept(class12002, class12013.y(class12002, var1.R()));
         var1.N();
      }
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class11389 var1) {
      if (var1.B()) {
         this.u(var1);
      } else {
         if (var1.M()) {
            this.y(var1);
         }
      }
   }
}
