package NurikWare;

public class class11832 implements class09780 {
   private static String[] u;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   private static void L() {
      u = new String[4];
      u[0] = "Spring AXIS_SIZE transitions require matching size modes";
      u[1] = "min";
      u[2] = "max";
      u[3] = "value";
   }

   private static class11833 L(class09962 var0, class09962 var1, class11863 var2) {
      return switch (((int[])class11848.N_0)[var0.u().ordinal()]) {
         case 1, 2 -> null;
         case 3, 4 -> N(var0.i(), var1.i(), var2, u[1]);
         default -> throw new MatchException(null, null);
      };
   }

   private class09962 M() {
      return switch (((int[])class11848.N_0)[((class09982)this.N_0).ordinal()]) {
         case 1 -> class09971.N(((class11833)this.N_3).L());
         case 2 -> class09971.u(((class11833)this.N_3).L());
         case 3 -> class09971.N(((class11833)this.N_1).L(), Math.max(((class11833)this.N_1).L(), ((class11833)this.N_2).L()));
         case 4 -> class09971.y(((class11833)this.N_1).L(), Math.max(((class11833)this.N_1).L(), ((class11833)this.N_2).L()));
         default -> throw new MatchException(null, null);
      };
   }

   public class11832(class09962 var1, class09962 var2, class11863 var3) {
      super();
      this.u();
      if (var1.u() != var2.u()) {
         throw new IllegalArgumentException(u[0]);
      } else {
         this.N_0 = var1.u();
         this.N_1 = L(var1, var2, var3);
         this.N_2 = N(var1, var2, var3);
         this.N_3 = y(var1, var2, var3);
      }
   }

   static {
      L();
   }

   private void u() {
   }

   private static class11833 y(class09962 var0, class09962 var1, class11863 var2) {
      return switch (((int[])class11848.N_0)[var0.u().ordinal()]) {
         case 1, 2 -> N(var0.M(), var1.M(), var2, u[3]);
         case 3, 4 -> null;
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public boolean y() {
      return N((class11833)this.N_1) && N((class11833)this.N_2) && N((class11833)this.N_3);
   }

   @Override
   public boolean N(float var1) {
      boolean flag = false;
      if ((class11833)this.N_1 != null) {
         flag |= ((class11833)this.N_1).N(var1);
      }

      if ((class11833)this.N_2 != null) {
         flag |= ((class11833)this.N_2).N(var1);
      }

      if ((class11833)this.N_3 != null) {
         flag |= ((class11833)this.N_3).N(var1);
      }

      return flag;
   }

   private static class11833 N(float var0, float var1, class11863 var2, String var3) {
      if (Float.isFinite(var0) && Float.isFinite(var1)) {
         return new class11833(var0, var1, var2);
      } else {
         throw new IllegalArgumentException("Spring AXIS_SIZE transitions require finite " + var3 + " values");
      }
   }

   @Override
   public boolean N(class09753 var1) {
      class09962 class09962 = var1.u();
      if (class09962.u() != (class09982)this.N_0) {
         return false;
      } else {
         if ((class11833)this.N_1 != null) {
            ((class11833)this.N_1).y(class09962.i());
         }

         if ((class11833)this.N_2 != null) {
            ((class11833)this.N_2).y(class09962.R());
         }

         if ((class11833)this.N_3 != null) {
            ((class11833)this.N_3).y(class09962.M());
         }

         return true;
      }
   }

   @Override
   public class09753 N() {
      return class09753.N(this.M());
   }

   private static boolean N(class11833 var0) {
      return var0 == null || var0.y();
   }

   private static class11833 N(class09962 var0, class09962 var1, class11863 var2) {
      return switch (((int[])class11848.N_0)[var0.u().ordinal()]) {
         case 1, 2 -> null;
         case 3, 4 -> N(var0.R(), var1.R(), var2, u[2]);
         default -> throw new MatchException(null, null);
      };
   }
}
