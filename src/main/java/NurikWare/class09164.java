package NurikWare;

public class class09164 extends class11787 {
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class09164(AttackAura var1, boolean var2, String var3, boolean var4) {
      super(var3, var4);
      this.i();
      this.y_0 = var1;
      this.y_1 = var2;
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = false;
      }
   }

   @Override
   public void y(Object var1) {
   }

   public boolean N() {
      this.i();
      return (Boolean)this.y_1;
   }
}
