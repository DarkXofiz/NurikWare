package NurikWare;

public class class11110 extends class11787 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   public class11110(AttackAura var1, String var2, boolean var3, boolean var4) {
      super(var2, var3);
      this.R();
      this.L_0 = var1;
      this.L_1 = var4;
   }

   @Override
   public void y(Object var1) {
   }

   public boolean N() {
      this.R();
      return (Boolean)this.L_1;
   }

   private void R() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
      }
   }
}
