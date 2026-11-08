package NurikWare;

public class class12013 {
   private static String[] i;
   public static Object N_0;

   private class12013() {
      super();
      throw new UnsupportedOperationException(i[3]);
   }

   static {
      N();
      i();
   }

   private static void i() {
      N_0 = 7;
   }

   private static int y(class12002 var0) {
      return switch (((int[])class12022.N_0)[var0.ordinal()]) {
         case 1, 2 -> 1;
         case 3, 4 -> 2;
         case 5, 6 -> 4;
         default -> 0;
      };
   }

   public static int y(class12002 var0, int var1) {
      return var1 & 7 & ~y(var0);
   }

   private static void N() {
      i = new String[4];
      i[0] = "Ctrl+";
      i[1] = "Shift+";
      i[2] = "Alt+";
      i[3] = "This is a utility class and cannot be instantiated";
   }

   public static String N(class12002 var0, int var1) {
      if (var1 == 0) {
         return var0.u();
      } else {
         StringBuilder stringbuilder = new StringBuilder();
         if ((var1 & 2) != 0) {
            stringbuilder.append(i[0]);
         }

         if ((var1 & 1) != 0) {
            stringbuilder.append(i[1]);
         }

         if ((var1 & 4) != 0) {
            stringbuilder.append(i[2]);
         }

         return stringbuilder.append(var0.u()).toString();
      }
   }

   public static boolean N(class12002 var0) {
      return y(var0) != 0;
   }
}
