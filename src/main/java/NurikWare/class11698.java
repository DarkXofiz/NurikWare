package NurikWare;

import java.util.Optional;

public class class11698 implements class11686 {
   public Object N_0;
   public static Object y_0;

   public class11698(class11693 var1) {
      super();
      this.R();
      this.N_0 = var1;
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
   }

   @Override
   public String[] N() {
      return (String[])y_0;
   }

   @Override
   public void N(String var1) {
      String s = class11715.N();
      String s1 = class11715.y();
      Optional<class11675> optional = ((class11693)this.N_0).N(s, s1);
      if (!optional.isEmpty()) {
         String s2 = optional.get().y();
         class11910.N("/login " + s2);

         try {
            ((class11693)this.N_0).N(s, s1, s2);
         } catch (Exception exception) {
            class11303.N(new class11288(class11938.u().Q()), "Login update error: " + exception.getMessage());
         }
      }
   }

   private void R() {
   }
}
