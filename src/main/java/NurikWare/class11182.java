package NurikWare;

import java.util.Objects;

public class class11182 implements class11212 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   class11182(class09064 var1, boolean var2) {
      super();
      this.i();
      this.N_2 = -1;
      this.N_0 = Objects.requireNonNull(var1, "config");
      this.N_1 = var2;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = false;
         this.N_2 = 0;
      }
   }

   @Override
   public void N(class09076 var1, class09065 var2) {
      var1.N((Integer)this.N_2);
      var1.y((Integer)this.N_2).N((Boolean)this.N_1);
   }

   @Override
   public class09064 N() {
      return (class09064)this.N_0;
   }

   @Override
   public void N(class11202 var1) {
      this.N_2 = var1.N((class09064)this.N_0);
   }

   @Override
   public boolean N(class09076 var1) {
      return var1.u((Integer)this.N_2) != null;
   }
}
