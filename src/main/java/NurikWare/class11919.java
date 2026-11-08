package NurikWare;

import java.util.function.BiConsumer;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07510;

public class class11919 {
   private static String[] Z;
   public static Object N_0 = class06202.Nq();

   private class11919() {
      super();
      throw new UnsupportedOperationException(Z[0]);
   }

   static {
      R();
      Z();
   }

   private static int B() {
      return ((class04453)((class06202)N_0).T_4).method_31548().N() % 8 + 1;
   }

   private static void Z() {
   }

   private static boolean i() {
      return ((class04453)((class06202)N_0).T_4).method_6115() && ((class04453)((class06202)N_0).T_4).method_6058() == class07050.field_5808;
   }

   public static void y(Runnable var0, BiConsumer<Integer, Integer> var1, int var2) {
      boolean flag = i();
      int i = flag ? 40 : B();
      class11938.m().N(0, var2, i, class07510.field_7791).y((class12040)(var5 -> {
         if (flag) {
            N(class07050.field_5810, var0);
         } else {
            class11322.N(i);
            N(class07050.field_5808, var0);
            class11938.Z().N(class11322::L);
         }

         var1.accept(var2, i);
      })).y();
   }

   public static boolean y() {
      return ((class04453)((class06202)N_0).T_4).method_6118(class07085.field_6174).B() == class06570.sT;
   }

   public static boolean N(Runnable var0) {
      for (class07050 class07050 : class07050.values()) {
         if (((class04453)((class06202)N_0).T_4).method_5998(class07050).B() == class06570.GJ) {
            N(class07050, var0);
            return true;
         }
      }

      return false;
   }

   public static void N(Runnable var0, BiConsumer<Integer, Integer> var1, int var2) {
      if (i()) {
         class11938.m().N(0, var2 + 36, 40, class07510.field_7791).y((class12040)(var3 -> {
            N(class07050.field_5810, var0);
            var1.accept(var2 + 36, 40);
         })).y();
      } else {
         class11322.N(var2);
         N(class07050.field_5808, var0);
         class11938.Z().N(class11322::L);
      }
   }

   public static boolean N() {
      return y() && ((class04453)((class06202)N_0).T_4).method_6128();
   }

   public static void N(class07050 var0, Runnable var1) {
      ((class03443)((class06202)N_0).T_2).N((class04453)((class06202)N_0).T_4, var0);
      var1.run();
   }

   public static void N(Runnable var0, BiConsumer<Integer, Integer> var1) {
      if (y() && ((class04453)((class06202)N_0).T_4).method_6128()) {
         if (!N(var0)) {
            int i = class11281.N(class06570.GJ);
            if (class11281.u(i)) {
               N(var0, var1, i);
            } else if (!class11281.y(i)) {
               y(var0, var1, i);
            }
         }
      }
   }

   private static void R() {
      Z = new String[1];
      Z[0] = "This is a utility class and cannot be instantiated";
   }
}
