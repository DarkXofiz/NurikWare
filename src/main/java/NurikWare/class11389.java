package NurikWare;

public class class11389 extends class11784 {
   public static Object y_0 = new class11389();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;

   private boolean L(class12002 var1, int var2) {
      this.U();
      return var2 == 0 || class12013.y(var1, (Integer)this.L_1) == var2;
   }

   public boolean L(class12002 var1) {
      return this.N(var1.L());
   }

   public boolean L(int var1) {
      return this.B() && this.i(var1);
   }

   public boolean L() {
      return this.u().N(class11286.REPEAT);
   }

   public boolean M() {
      return this.u().N(class11286.RELEASE);
   }

   public class11389() {
      super();
      this.U();
   }

   static {
      E();
   }

   public boolean B() {
      return this.u().N(class11286.PRESS);
   }

   public class11381 Z() {
      this.U();
      return (class11381)this.L_4;
   }

   public int i() {
      this.U();
      return (Integer)this.L_2;
   }

   private boolean i(int var1) {
      return this.z() == var1;
   }

   private void U() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
      }
   }

   public int z() {
      this.U();
      return (Integer)this.L_0;
   }

   public class11286 u() {
      this.U();
      return (class11286)this.L_3;
   }

   public boolean y(class12002 var1) {
      return this.L(var1.L());
   }

   public boolean y(class12002 var1, int var2) {
      return this.y(var1) && this.L(var1, var2);
   }

   public boolean y(int var1) {
      return this.M() && this.i(var1);
   }

   private static void E() {
      y_0 = null;
   }

   public boolean N(int var1) {
      return this.L() && this.i(var1);
   }

   public boolean N(class12002 var1) {
      return this.y(var1.L());
   }

   public boolean N(class12002 var1, int var2) {
      return this.N(var1) && this.L(var1, var2);
   }

   public static class11389 N(int var0, int var1, int var2, class11286 var3, class11381 var4) {
      ((class11389)y_0).L_0 = var0;
      ((class11389)y_0).L_1 = var1;
      ((class11389)y_0).L_2 = var2;
      ((class11389)y_0).L_4 = var4;
      ((class11389)y_0).L_3 = var3;
      return (class11389)y_0;
   }

   public static class11389 N(int var0, class11286 var1, class11381 var2) {
      class11389 class11389 = new class11389();
      class11389.L_0 = var0;
      class11389.L_2 = var0;
      class11389.L_1 = 0;
      class11389.L_3 = var1;
      class11389.L_4 = var2;
      return class11389;
   }

   public int R() {
      this.U();
      return (Integer)this.L_1;
   }
}
