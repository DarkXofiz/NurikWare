package NurikWare;

import minecraft.class07438;

public class class09154 extends class11122 {
   private static double[] L;

   public class09154(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      R();
   }

   @Override
   public boolean N() {
      return false;
   }

   @Override
   public boolean N(class07438 var1) {
      return ((AttackAura)super.y_0).N(class11895.N(var1), ((AttackAura)super.y_0).m());
   }

   @Override
   public void N(class11385 var1) {
      super.N(var1);
      class07438 class07438 = ((AttackAura)super.y_0).v();
      if (!((AttackAura)super.y_0).N(class11895.N(class07438), ((AttackAura)super.y_0).m() - L[0])) {
         var1.R(true);
      }

      if (class11899.N(var1.z(), 4).u().i().field_5976) {
         var1.i(true);
      }

      if (!class11315.N(((AttackAura)super.y_0).P().i().N() - 1) || var1.L()) {
         var1.B(true);
      }
   }

   private static void R() {
      L = new double[1];
      L[0] = Double.longBitsToDouble(4609434218613702656L);
   }
}
