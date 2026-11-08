package NurikWare;

public class class09124 {
   public Object N_0;
   public boolean N_init;

   class09124() {
      super();
      this.R();
      this.N_0 = System.currentTimeMillis();
   }

   public long y() {
      return System.currentTimeMillis() - (Long)this.N_0;
   }

   public boolean N(long var1) {
      return this.y() >= var1;
   }

   public void N() {
      this.N_0 = System.currentTimeMillis();
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
      }
   }
}
