package NurikWare;

import java.time.Duration;
import minecraft.class06889;

public class class11479 extends class11481 {
   public Object y_0;
   public boolean y_init;

   public class11479(String var1, class06889 var2, Duration var3, String var4) {
      super(var1, var2, var4);
      this.u();
      this.y_0 = class11938.j().y() + class11464.u((int)var3.getSeconds());
   }

   public int Z() {
      this.u();
      return (Integer)this.y_0;
   }

   @Override
   public boolean U() {
      return false;
   }

   @Override
   public boolean z() {
      this.u();
      return super.z() || class11938.j().y() > (Integer)this.y_0;
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }
}
