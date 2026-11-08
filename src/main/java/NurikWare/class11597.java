package NurikWare;

public class class11597 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private class11597(class11737 var1) {
      super();
      this.i();
      this.N_5 = -1;
      this.N_6 = -1;
      this.N_7 = (class11596)class11596.E_0;
      this.N_0 = var1;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
      }
   }

   static class11597 u() {
      return new class11597(class11737.LOADING);
   }

   class11596 N(int var1, int var2) {
      if ((Integer)this.N_2 != 0) {
         return (class11596)this.N_7;
      } else if ((class09946)this.N_1 != null && var1 != 0) {
         if (((class11596)this.N_7).Z() && (Integer)this.N_5 == var1 && (Integer)this.N_6 == var2) {
            return (class11596)this.N_7;
         } else {
            this.N_5 = var1;
            this.N_6 = var2;
            this.N_7 = class11596.N(
               var1,
               (Integer)this.N_3,
               (Integer)this.N_4,
               ((class09946)this.N_1).R(),
               ((class09946)this.N_1).M(),
               ((class09946)this.N_1).B(),
               ((class09946)this.N_1).Z()
            );
            return (class11596)this.N_7;
         }
      } else {
         return (class11596)class11596.E_0;
      }
   }
}
