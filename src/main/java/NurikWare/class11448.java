package NurikWare;

public abstract class class11448 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11448(class11410 var1, boolean var2) {
      super();
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public boolean y() {
      return (Boolean)this.N_1;
   }

   public abstract void N(class11940 var1);

   public class11410 N() {
      return (class11410)this.N_0;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = false;
      }
   }
}
