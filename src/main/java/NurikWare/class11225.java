package NurikWare;

public record class11225(double gravity, float airDrag, float waterDrag) {
   public static Object L_0 = new class11225(0.05, 0.99F, 0.6F);
   public static Object L_1 = new class11225(0.05, 0.99F, 0.99F);
   public static Object L_2 = new class11225(0.03, 0.99F, 0.8F);
   public static Object L_3 = new class11225(0.05, 0.99F, 0.8F);
   public static Object L_4 = new class11225(0.03, 0.99F, 0.8F);
   public static Object L_5 = new class11225(0.0, 1.0F, 0.8F);

   public double L() {
      return this.gravity;
   }


   static {
      u();
   }

   private static void u() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
   }

   public float y() {
      return this.waterDrag;
   }

   public float N() {
      return this.airDrag;
   }
}
