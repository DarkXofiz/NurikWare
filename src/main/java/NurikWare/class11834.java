package NurikWare;

public class class11834 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;

   public class11849 L() {
      return (class11849)this.N_1;
   }

   public long M() {
      return (Long)this.N_3;
   }

   private void T() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
         this.y_2 = 0L;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = 0L;
         this.N_4 = false;
         this.N_5 = 0L;
         this.N_6 = false;
         this.N_7 = 0L;
      }
   }

   public class11834(class11845 var1, int var2, class11874 var3, class11849 var4, class11868 var5, long var6, boolean var8) {
      super();
      this.T();
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = System.currentTimeMillis();
      this.N_0 = var3;
      this.N_1 = var4;
      this.N_2 = var5;
      this.N_3 = var6;
      this.N_4 = var8;
      this.N_5 = N((Long)this.y_2, var6);
   }

   public class11874 B() {
      return (class11874)this.N_0;
   }

   public long Z() {
      return (Long)this.N_5;
   }

   public long i() {
      return (Long)this.y_2;
   }

   public boolean U() {
      return (Boolean)this.N_6;
   }

   public long z() {
      return (Boolean)this.N_6 ? (Long)this.N_7 : (Long)this.N_5;
   }

   public class11834 u() {
      this.N_5 = N(System.currentTimeMillis(), (Long)this.N_3);
      return this;
   }

   public class11834 y(class11868 var1) {
      return this.N(var1).u();
   }

   public class11834 y(long var1) {
      this.N_3 = var1;
      return this;
   }

   public class11868 y() {
      return (class11868)this.N_2;
   }

   public boolean E() {
      return !(Boolean)this.N_6 && System.currentTimeMillis() < (Long)this.N_5;
   }

   public class11834 N(class11874 var1) {
      this.N_0 = var1;
      return this;
   }

   public class11834 N(long var1) {
      this.N_5 = var1;
      return this;
   }

   public class11834 N(class11849 var1) {
      this.N_1 = var1;
      return this;
   }

   public class11834 N(class11868 var1) {
      this.N_2 = var1;
      return this;
   }

   private static long N(long var0, long var2) {
      return var2 <= 0L ? Long.MAX_VALUE : var0 + var2;
   }

   public int N() {
      return (Integer)this.y_1;
   }

   public boolean W() {
      return (Boolean)this.N_4;
   }

   public void R() {
      if (!(Boolean)this.N_6 && !(Boolean)this.N_4) {
         this.N_6 = true;
         this.N_7 = System.currentTimeMillis();
         ((class11845)this.y_0).L();
      }
   }
}
