package NurikWare;

import java.util.function.Consumer;
import minecraft.class01054;

public class class11245 extends class11535 implements class11227 {
   public Object N_0;

   public class11245(String var1, boolean var2, class11227 var3, Consumer<class11535> var4) {
      super(var1, var2, var4);
      this.N();
      this.N_0 = var3;
   }

   private void N() {
   }

   @Override
   public void draw(class01054 var1, int var2, int var3, int var4) {
      this.N();
      ((class11227)this.N_0).draw(var1, var2, var3, var4);
   }
}
