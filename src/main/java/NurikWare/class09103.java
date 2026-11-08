package NurikWare;

import minecraft.class00405;
import minecraft.class00949;
import minecraft.class01590;
import minecraft.class01923;
import minecraft.class05272;
import minecraft.class06202;
import minecraft.class09006;

public class class09103 {
   public static Object N_0;
   public static Object N_1;

   private class09103() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      N();
   }

   public static class09091 N(int var0, class00405 var1) {
      class00405 class00405 = var1 == null ? class00405.N : var1;
      if (!(((class01590)class06202.Nq().i_3).N(var0, class00405) instanceof class05272 class05272 && class05272.N() != class01923.field_37899)) {
         return null;
      } else {
         return class05272.u instanceof class09006 class09006 && !class09006.isClosed()
            ? new class09091(
               class09006.texture().N(),
               class05272.i,
               class05272.M,
               class05272.R,
               class05272.B,
               class05272.Z,
               class05272.z,
               class05272.U,
               class05272.E,
               class05272.N().N(class00405.L())
            )
            : null;
      }
   }

   private static void N() {
      N_0 = 9.0F;
      N_1 = 7.0F;
   }

   public static boolean N(class00405 var0) {
      if (var0 == null) {
         return false;
      } else {
         class00949 class00949 = var0.E();
         return class00949 != class00949.y && !class00949.y.equals(class00949);
      }
   }

   public static boolean N(int var0) {
      return var0 >= 57344 && var0 <= 63743 || var0 >= 983040 && var0 <= 1048573 || var0 >= 1048576 && var0 <= 1114109;
   }
}
