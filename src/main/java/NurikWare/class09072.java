package NurikWare;

public class class09072 implements class11192<class09101> {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;

   private static void M() {
      N_0 = new float[]{1.0F, 0.0F};
      N_1 = new float[]{0.0F, 1.0F};
      N_2 = 0;
   }

   public class09072(class11213 var1, float[] var2) {
      super();
      this.u();
      this.y_0 = var1;
      this.y_1 = var2[0];
      this.y_2 = var2[1];
      boolean flag = (Float)this.y_1 != 0.0F;
      this.y_3 = new class09067(var1, (class09322)class11185.U_3, true, true, "weights");
      this.y_4 = new class09067(var1, flag ? (class09322)class11185.U_4 : (class09322)class11185.U_5, false, false, null);
      this.y_5 = new class09067(var1, flag ? (class09322)class11185.U_6 : (class09322)class11185.B_0, false, false, null);
      this.y_6 = new class09067(var1, flag ? (class09322)class11185.B_1 : (class09322)class11185.B_2, false, false, null);
   }

   static {
      M();
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }
   }

   public static class09072 N(class11213 var0, float[] var1) {
      return new class09072(var0, var1);
   }

   public void execute(class09101 var1) {
      class11176.N((class11213)this.y_0, var1.Z(), var1.R(), var1.B(), var1.i(), var1.u(), var1.L(), var1.U(), var1.M(), -1);
      this.N(var1.N()).N(var1, (Float)this.y_1, (Float)this.y_2);
   }

   private class09067 N(int var1) {
      return switch (var1) {
         case 5 -> (class09067)this.y_4;
         case 10 -> (class09067)this.y_5;
         case 15 -> (class09067)this.y_6;
         default -> (class09067)this.y_3;
      };
   }
}
