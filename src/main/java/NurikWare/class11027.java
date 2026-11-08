package NurikWare;

import minecraft.class06889;

public class class11027 extends class11053 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11027(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.W();
   }

   @Override
   public void N(class11499 var1, boolean var2) {
      this.W();
      if (var2) {
         class11534.y(var1);
         this.N_0 = var1.y();
         this.N_1 = true;
      } else if ((Boolean)this.N_1) {
         this.N_1 = false;
      }
   }

   @Override
   public class11499 N(class11019 var1, class06889 var2, class11499 var3) {
      this.W();
      class11499 class11499 = class11505.N().N(var3);
      if (Math.abs((Float)this.N_0 - class11499.y()) <= 0.1F) {
         class11499 = class11499.N(0.11F, 0.0F);
      }

      return class11499.N(true);
   }

   private void W() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = false;
      }
   }
}
