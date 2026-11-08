package NurikWare;

public class class11467 {
   public Object N_0;

   public class11467() {
      super();
      this.u();
      this.N_0 = System.nanoTime();
      this.N();
   }

   private void u() {
      this.N_0 = 0L;
   }

   public long y() {
      return (System.nanoTime() - (Long)this.N_0) / 1000000L;
   }

   public void N() {
      this.N_0 = System.nanoTime();
   }

   public boolean N(long var1) {
      return System.nanoTime() - (Long)this.N_0 >= var1 * 1000000L;
   }
}
