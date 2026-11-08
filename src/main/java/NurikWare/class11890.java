package NurikWare;

import java.util.List;
import java.util.function.Consumer;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01434;
import minecraft.class01590;
import minecraft.class03063;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08133;

public class class11890 {
   private static byte[] y;
   public static Object[] N;
   private static String[] i;

   private static void L() {
      N = new Object[y[0]];
   }

   private class11890() {
      super();
      throw new UnsupportedOperationException(i[0]);
   }

   static {
      N();
      y();
      u();
      L();
   }

   private static void u() {
      i = new String[1];
      i[0] = "This is a utility class and cannot be instantiated";
   }

   private static void y() {
      y = new byte[1];
      y[0] = 4;
   }

   private static void N() {
   }

   public static List<class11904> N(Consumer<class01237> var0) {
      class06202 class06202 = class06202.Nq();
      if ((class08133)N[3] == null) {
         class04790 class04790 = new class04790();
         N[0] = class04790;
         class11913 class11913x = new class11913();
         N[1] = class11913x;
         class11913 class11913x = new class11913();
         N[2] = class11913x;
         class08133 class08133 = new class08133(
            (class04790)N[0], class06202.yU(), (class11913)N[1], class06202.yW(), new class01434(), (class11913)N[2], (class01590)class06202.i_3
         );
         N[3] = class08133;
      }

      List<class11904> list;
      try {
         var0.accept((class04790)N[0]);
         ((class08133)N[3]).N();
         list = ((class11913)N[1]).y();
      } finally {
         ((class11913)N[1]).N();
         ((class11913)N[2]).N();
         ((class04790)N[0]).N();
      }

      return list;
   }

   public static List<class11904> N(class07049 var0, class06889 var1, float var2) {
      class06202 class06202 = class06202.Nq();
      class06959 class06959 = ((class03063)class06202.B_2).B.N;
      return N(var5 -> ((class11792)class06202.Ng()).N(var0, class06959, var1.M, var1.B, var1.Z, var2, new class01421(), var5));
   }
}
