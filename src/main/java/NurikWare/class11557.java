package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00869;

public class class11557 {
   private static String[] B;
   private static String[] s;
   private static String[] O;
   public static Object N_0 = N(new class11565(B[1], class00869.ML, class00869.UI, class00869.Tq, class00869.EJ, class00869.Mi, class00869.PW));
   public static Object N_1 = N(new class11565(B[2], class00869.EI, class00869.PW, class00869.Eo, class00869.ML, class00869.Pe, class00869.Tq));
   public static Object N_2 = N(new class11565(O[0], class00869.Ej, class00869.En, class00869.Ev, class00869.Et, class00869.iD, class00869.MP, class00869.Pc));
   public static Object N_3 = N(new class11565(O[1], class00869.Tb, class00869.Tn, class00869.iQ, class00869.Eq, class00869.BS));
   public static Object N_4 = N(new class11565(O[2], class00869.ZF, class00869.ZA, class00869.Zf, class00869.zN, class00869.Zh));
   public static Object y_0 = N(new class11565(s[4], class00869.TU, class00869.Tn, class00869.TQ, class00869.TG, class00869.TZ, class00869.Tb));
   public static Object y_1 = N(
      new class11565(
         s[5], class00869.To, class00869.zv, class00869.Tb, class00869.TZ, class00869.Tj, class00869.TG, class00869.Tk, class00869.Tw, class00869.Wo
      )
   );
   public static Object y_2 = N(new class11565(s[6], class00869.zn, class00869.iT, class00869.Wj, class00869.ib));
   public static Object y_3 = N(new class11565(B[0], class00869.iQ, class00869.PE, class00869.M, class00869.mi));
   public static Object L_0 = new ArrayList();
   public static Object L_1 = N(
      new class11565(s[1], 600, class00869.Td, class00869.Tk, class00869.Tw, class00869.TZ, class00869.iQ, class00869.Ul, class00869.TT)
   );
   public static Object L_2 = N(new class11565(s[2], class00869.mi, class00869.PE, class00869.W, class00869.M));
   public static Object L_3 = N(new class11565(s[3], class00869.Td, class00869.TU, class00869.TE, class00869.Tl, class00869.Tk, class00869.TG));
   public static Object u_0 = N(new class11565(O[3], class00869.ic, class00869.BD, class00869.Bx, class00869.BS, class00869.PG, class00869.i, class00869.zN));
   public static Object u_1 = N(
      new class11565(O[4], class00869.iS, class00869.PP, class00869.TQ, class00869.R, class00869.TZ, class00869.i, class00869.PX, class00869.Pj)
   );
   public static Object u_2 = N(new class11565(O[5], class00869.Wo, class00869.zv, class00869.Tn, class00869.zv));
   public static Object u_3 = N(
      new class11565(O[6], class00869.RA, class00869.RG, class00869.Rl, class00869.Rt, class00869.Rd, class00869.UO, class00869.Po, class00869.TT)
   );

   private class11557() {
      super();
      throw new UnsupportedOperationException(s[0]);
   }

   static {
      i();
      y();
   }

   private static void i() {
      s = new String[7];
      s[0] = "This is a utility class and cannot be instantiated";
      s[1] = "Драконья трапка";
      s[2] = "Трапка";
      s[3] = "Проклятая трапка";
      s[4] = "Жестокая трапка";
      s[5] = "Мучительная трапка";
      s[6] = "Ледяная трапка";
      B = new String[3];
      B[0] = "Неизбежная трапка";
      B[1] = "Коварная трапка";
      B[2] = "Смертельная трапка";
      O = new String[7];
      O[0] = "Мистическая трапка";
      O[1] = "Кошмарная трапка";
      O[2] = "Жемчужная трапка";
      O[3] = "Призрачная трапка";
      O[4] = "Царская трапка";
      O[5] = "Сингулярная трапка";
      O[6] = "Зловещая трапка";
   }

   private static void y() {
   }

   private static <T extends class11565> T N(T var0) {
      ((List)L_0).add(var0);
      return (T)var0;
   }
}
