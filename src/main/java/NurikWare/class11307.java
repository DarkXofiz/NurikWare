package NurikWare;

import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2i;

public class class11307 {
   public static Object N_0 = class06202.Nq();

   private static void L() {
      N_0 = null;
   }

   private class11307() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   public static class09857 N(int var0) {
      boolean flag = (var0 & 2) != 0;
      boolean flag1 = (var0 & 1) != 0;
      boolean flag2 = (var0 & 4) != 0;
      boolean flag3 = (var0 & 8) != 0;
      return new class09857(flag, flag1, flag2, flag3);
   }

   public static Vector2i N(double var0, double var2) {
      class08844 class08844 = ((class06202)N_0).Nt();
      double d0 = (double)class08844.U() / class08844.W();
      double d1 = (double)class08844.E() / class08844.m();
      return new Vector2i((int)(var0 * d0), (int)(var2 * d1));
   }

   public static boolean N(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }
}
