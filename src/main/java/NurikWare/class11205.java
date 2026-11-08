package NurikWare;

import java.util.Objects;

public class class11205 implements class11211 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   @Override
   public class09064 L() {
      return (class09064)this.N_1;
   }

   class11205(int var1, class09064 var2) {
      super();
      this.i();
      this.N_2 = -1;
      this.N_0 = var1;
      this.N_1 = Objects.requireNonNull(var2, "source");
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_2 = 0;
      }
   }

   @Override
   public int y() {
      return (Integer)this.N_0;
   }

   @Override
   public void N(class09076 var1) {
      class09060.N().N((Integer)this.N_0 - 33984, var1.i((Integer)this.N_2));
   }

   @Override
   public void N(class11202 var1) {
      this.N_2 = var1.N((class09064)this.N_1);
   }

   @Override
   public int a_() {
      return (Integer)this.N_2;
   }
}
