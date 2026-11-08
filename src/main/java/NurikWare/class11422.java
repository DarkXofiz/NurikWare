package NurikWare;

public class class11422 extends class11417 {
   public Object y_0;

   @SafeVarargs
   public class11422(String var1, boolean var2, Class<? extends class11784>... var3) {
      super(var1, var2);
      this.u();
      this.y_0 = var3;
   }

   private void u() {
   }

   @Override
   public void y(Object var1) {
      this.u();
      Class[] aclass = (Class[])this.y_0;
      int i = aclass.length;

      for (int j = 0; j < i; j++) {
         if (aclass[j].isInstance(var1)) {
            ((class11784)var1).N();
            return;
         }
      }
   }
}
