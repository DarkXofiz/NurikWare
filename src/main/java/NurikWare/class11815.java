package NurikWare;

import java.util.UUID;

public class class11815 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11815(UUID var1, boolean var2) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = false;
      }
   }

   public UUID y() {
      return (UUID)this.N_0;
   }

   public class11815 N(UUID var1) {
      this.N_0 = var1;
      return this;
   }

   public class11815 N(boolean var1) {
      this.N_1 = var1;
      return this;
   }

   public boolean N() {
      return (Boolean)this.N_1;
   }
}
