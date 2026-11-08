package NurikWare;

public class class09083 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   class09083(int var1, int var2, class09096 var3, class09057 var4, class09057 var5) {
      super();
      this.R();
      this.N_7 = System.currentTimeMillis();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
      this.N_4 = var5;
   }

   public class09086 y() {
      if ((class09086)this.N_5 == null) {
         this.N_5 = class09060.N().N((class09057)this.N_3, (class09057)this.N_4, ((class09096)this.N_2).N());
      }

      return (class09086)this.N_5;
   }

   public void N() {
      if ((class09086)this.N_5 != null) {
         ((class09086)this.N_5).y();
         this.N_5 = null;
      }

      if ((class09057)this.N_3 != null) {
         ((class09057)this.N_3).L();
         this.N_3 = null;
      }

      if ((class09057)this.N_4 != null) {
         ((class09057)this.N_4).L();
         this.N_4 = null;
      }
   }

   boolean N(long var1, long var3, boolean var5) {
      return (class09057)this.N_3 != null && ((class09057)this.N_3).y() && !(Boolean)this.N_6 && !var5 && var1 - (Long)this.N_7 > var3;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_6 = false;
         this.N_7 = 0L;
      }
   }
}
