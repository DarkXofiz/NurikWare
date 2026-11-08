package NurikWare;

import minecraft.class06584;

public record class11869(class06584 stack) implements class11849 {
   public static Object y_0;
   public static Object y_1 = class09991.N().u(16.0F, 16.0F);

   private static void L() {
      y_0 = 16;
   }

   public class11869(class06584 stack) {
      super();
      this.stack = stack;
   }

   static {
      L();
   }

   public class06584 N() {
      return this.stack;
   }

   @Override
   public class09798 N(class09809 var1, class11834 var2) {
      String s = "notify-item-" + var2.N();
      class11867 class11867 = class11938.k().N(this.stack);
      if (!class11867.L()) {
         return class09778.N(var1x -> var1x.N(s).N((class09991)y_1));
      } else {
         class09991 class09991 = class09991.N((class09991)y_1, class09991.N().N(class11867.y(), class11867.N(), class11867.R(), class11867.i()));
         return class09778.y(class11938.k().y()).N(s).N(class09991).i();
      }
   }
}
