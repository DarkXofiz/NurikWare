package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00869;

public class class11570 {
   private static String[] B;
   private static String[] m;
   private static String[] j;
   public static Object N_0 = N(new class11565(j[6], class00869.Wo, class00869.zv));
   public static Object N_1 = N(new class11565(j[7], class00869.Rt, class00869.Rl, class00869.RG, class00869.TT));
   public static Object y_0 = N(new class11565(m[2], class00869.TG, class00869.TZ, class00869.Tb, class00869.zv));
   public static Object y_1 = N(new class11565(m[3], class00869.zn, class00869.iT, class00869.ib));
   public static Object L_0 = new ArrayList();
   public static Object L_1 = N(new class11565(B[1], class00869.mi, class00869.W, class00869.M));
   public static Object L_2 = N(new class11565(B[2], class00869.Td, class00869.TG, class00869.iQ, class00869.Tt, class00869.UV, class00869.TT));
   public static Object L_3 = N(new class11565(m[0], class00869.TU, class00869.TE, class00869.TG, class00869.Tb, class00869.Td));
   public static Object L_4 = N(new class11565(m[1], class00869.TG, class00869.TU, class00869.TZ, class00869.Tb, class00869.TQ));
   public static Object u_0 = N(new class11565(m[4], class00869.iQ, class00869.M, class00869.mi));
   public static Object u_1 = N(new class11565(m[5], class00869.ML, class00869.EJ, class00869.Tq, class00869.Eo));
   public static Object u_2 = N(new class11565(j[0], class00869.Eo, class00869.EI, class00869.ML, class00869.Tq));
   public static Object u_3 = N(new class11565(j[1], class00869.Ej, class00869.Ev, class00869.Et, class00869.iD));
   public static Object u_4 = N(new class11565(j[2], class00869.Tb, class00869.Eq, class00869.iQ));
   public static Object u_5 = N(new class11565(j[3], class00869.ZF, class00869.ZA, class00869.Zf));
   public static Object u_6 = N(new class11565(j[4], class00869.Bx, class00869.ic, class00869.BS, class00869.UH));
   public static Object u_7 = N(new class11565(j[5], class00869.TZ, class00869.R, class00869.i, class00869.iS));

   private class11570() {
      super();
      throw new UnsupportedOperationException(B[0]);
   }

   static {
      N();
      u();
   }

   private static void u() {
   }

   private static void N() {
      B = new String[3];
      B[0] = "This is a utility class and cannot be instantiated";
      B[1] = "Пласт";
      B[2] = "Драконий пласт";
      m = new String[6];
      m[0] = "Проклятый пласт";
      m[1] = "Жестокий пласт";
      m[2] = "Мучительный пласт";
      m[3] = "Ледяной пласт";
      m[4] = "Неизбежный пласт";
      m[5] = "Коварный пласт";
      j = new String[8];
      j[0] = "Смертельный пласт";
      j[1] = "Мистический пласт";
      j[2] = "Кошмарный пласт";
      j[3] = "Жемчужный пласт";
      j[4] = "Призрачный пласт";
      j[5] = "Царский пласт";
      j[6] = "Сингулярный пласт";
      j[7] = "Зловещий пласт";
   }

   private static <T extends class11565> T N(T var0) {
      ((List)L_0).add(var0);
      return (T)var0;
   }
}
