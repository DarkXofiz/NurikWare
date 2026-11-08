package NurikWare;

import java.util.function.Consumer;

public class class11689 extends class11704 {
   public Object y_0;

   private void L() {
   }

   public class11689(NoDelay var1, String var2, boolean var3, Consumer<Object> var4) {
      super(var1, var2, var3);
      this.L();
      this.y_0 = var4;
   }

   @Override
   public void y(Object var1) {
      this.L();
      ((Consumer)this.y_0).accept(var1);
   }
}
