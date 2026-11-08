package NurikWare;

public class class11706 implements class11686 {
   public Object N_0;
   public static Object y_0;

   private static void L() {
      y_0 = null;
   }

   public class11706(class11693 var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   static {
      L();
   }

   private void u() {
   }

   @Override
   public String[] N() {
      return (String[])y_0;
   }

   @Override
   public void N(String var1) {
      class11910.N("/register " + var1 + " " + var1);

      try {
         ((class11693)this.N_0).N(class11715.N(), class11715.y(), var1);
      } catch (Exception exception) {
         class11303.N(new class11288(class11938.u().Q()), "Register error: " + exception.getMessage());
      }
   }
}
