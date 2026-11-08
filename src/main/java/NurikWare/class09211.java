package NurikWare;

public class class09211 {
   public static Object N_0 = class09196.N(-7623425, -9268528);
   public static Object N_1 = class09196.N(-7623425, -11244133);
   public static Object N_2 = class09196.N(-7623425, -7557137);
   public static Object N_3 = class09196.N(-7623425, -7624449);
   public static Object N_4;
   public static Object N_5;
   public static Object N_6 = class09778.N(N(-7623425));
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public static Object u_0 = class09196.N(-7623425, -7623425);
   public static Object u_1 = class09196.N(-7623425, class11300.L(4362239, 3.0F));
   public static Object u_2 = class09196.N(-7623425, class11300.L(10205439, 30.0F));
   public static Object u_3 = class09196.N(-7623425, -14801353);
   public static Object u_4 = class09196.N(-7623425, -11246949);

   public int L() {
      return (Integer)this.y_3;
   }

   public int M() {
      return (Integer)this.L_0;
   }

   private class09211(int var1) {
      super();
      this.m();
      this.L_0 = ((class09196)u_0).N(var1);
      this.L_1 = ((class09196)u_1).N(var1);
      this.L_2 = ((class09196)u_2).N(var1);
      this.y_0 = ((class09196)u_3).N(var1);
      this.y_1 = ((class09196)u_4).N(var1);
      this.y_2 = ((class09196)N_0).N(var1);
      this.y_3 = ((class09196)N_1).N(var1);
      this.y_4 = ((class09196)N_2).N(var1);
      this.y_5 = ((class09196)N_3).N(var1);
   }

   static {
      E();
   }

   public int B() {
      return (Integer)this.y_1;
   }

   public static class09211 Z() {
      return N(-7623425);
   }

   public int i() {
      return (Integer)this.y_0;
   }

   private void m() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
      }
   }

   public int z() {
      return (Integer)this.y_5;
   }

   public int u() {
      return (Integer)this.L_2;
   }

   public int y() {
      return (Integer)this.L_1;
   }

   private static void E() {
      u_0 = null;
      u_1 = null;
      u_2 = null;
      u_3 = null;
      u_4 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = -7623425;
      N_5 = null;
      N_6 = null;
   }

   public static class09211 N(int var0) {
      int i = var0 | 0xFF000000;
      class09211 class09211x = (class09211)N_5;
      if (class09211x != null && (Integer)N_4 == i) {
         return class09211x;
      } else {
         class09211 class09211x = new class09211(i);
         N_4 = i;
         N_5 = class09211x;
         return class09211x;
      }
   }

   public int N() {
      return (Integer)this.y_2;
   }

   public int R() {
      return (Integer)this.y_4;
   }
}
