package NurikWare;

import java.util.List;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class07055;
import minecraft.class07469;
import minecraft.class08687;

public class class11899 {
   public static Object[] N;
   private static byte[] G;
   private static String[] d;

   private static void L() {
      for (class03556 class03556 : (List)N[1]) {
         class07469 class07469x = ((class04453)((class06202)N[0]).T_4).method_5996(class03556);
         class07469 class07469x = ((class11897)N[2]).method_5996(class03556);
         if (class07469x != null && class07469x != null) {
            class07469x.R();
            class07469x.N(class07469x.y());
            class07469x.L().forEach(class07469x::y);
         }
      }
   }

   private static void M() {
      N = new Object[G[0]];
   }

   private class11899() {
      super();
      throw new UnsupportedOperationException(d[0]);
   }

   static {
      u();
      N();
      R();
      M();
      N[0] = class06202.Nq();
      N[1] = List.of(class05298.l, class05298.Y, class05298.T, class05298.s, class05298.O, class05298.G, class05298.o);
   }

   private static void u() {
      G = new byte[1];
      G[0] = 3;
   }

   public static class11915 N(boolean var0, boolean var1, boolean var2, int var3) {
      if ((class11897)N[2] == null || ((class11897)N[2]).method_73183() != (class03448)((class06202)N[0]).T_3) {
         class11897 class11897 = new class11897((class03448)((class06202)N[0]).T_3);
         N[2] = class11897;
      }

      N(var0, var1, var2);

      for (int i = 0; i < var3; i++) {
         ((class11897)N[2]).B();
         ((class11897)N[2]).method_6007();
         class11891.N((class11897)N[2]);
         ((class11897)N[2]).N_5 = ((class11897)N[2]).L();
         ((class11897)N[2]).N_6 = ((class11897)N[2]).method_23318();
      }

      return new class11915(
         ((class11897)N[2]).method_5715(),
         ((class11897)N[2]).method_5624(),
         (Boolean)((class11897)N[2]).N_1,
         ((class11897)N[2]).method_5799(),
         ((class11897)N[2]).method_24828(),
         ((class11897)N[2]).field_6017,
         ((class11897)N[2]).fields_8212a028292fd3c078969e3ee4c71d9e8_5,
         (class11897)N[2]
      );
   }

   private static void N() {
   }

   public static class11915 N(int var0) {
      return N(((class04474)((class04453)((class06202)N[0]).T_4).L_1).field_54155, var0);
   }

   public static class11915 N(class08687 var0, int var1) {
      return N(var0.R(), var0.M(), var0.i(), var1);
   }

   private static void N(boolean var0, boolean var1, boolean var2) {
      L();
      ((class11897)N[2]).method_6088().clear();
      ((class04453)((class06202)N[0]).T_4).method_6088().forEach((var0x, var1x) -> ((class11897)N[2]).method_26082(var1x, null));
      ((class04474)((class11897)N[2]).N_0).field_55868 = ((class04474)((class04453)((class06202)N[0]).T_4).L_1).method_3128();
      ((class11897)N[2]).N_1 = var2;
      ((class11897)N[2]).N_2 = var0;
      ((class11897)N[2]).N_3 = var1;
      ((class11897)N[2]).method_5728(var1);
      ((class11897)N[2]).N_4 = ((class04453)((class06202)N[0]).T_4).method_6115() && !((class04453)((class06202)N[0]).T_4).method_5765()
         ? ((class04453)((class06202)N[0]).T_4).Y()
         : 1.0F;
      ((class11897)N[2]).field_5957 = ((class04453)((class06202)N[0]).T_4).method_5799();
      ((class11897)N[2]).method_6033(((class04453)((class06202)N[0]).T_4).method_6032());
      ((class11897)N[2]).fields_8212a028292fd3c078969e3ee4c71d9e8_5 = ((class04453)((class06202)N[0]).T_4).fields_8212a028292fd3c078969e3ee4c71d9e8_5;
      ((class11897)N[2]).field_17046 = ((class04453)((class06202)N[0]).T_4).field_17046;
      ((class11897)N[2])
         .method_5814(
            ((class04453)((class06202)N[0]).T_4).method_23317(),
            ((class04453)((class06202)N[0]).T_4).method_23318(),
            ((class04453)((class06202)N[0]).T_4).method_23321()
         );
      ((class11897)N[2]).method_60608(((class04453)((class06202)N[0]).T_4).method_36454(), ((class04453)((class06202)N[0]).T_4).method_36455());
      ((class11897)N[2]).method_18380(((class04453)((class06202)N[0]).T_4).method_18376());
      ((class11897)N[2]).method_5796(((class04453)((class06202)N[0]).T_4).method_5681());
      ((class11897)N[2]).method_24830(((class04453)((class06202)N[0]).T_4).method_24828());
      ((class11897)N[2]).field_5976 = ((class04453)((class06202)N[0]).T_4).field_5976;
      ((class11897)N[2]).field_6017 = ((class04453)((class06202)N[0]).T_4).field_6017;
      ((class11897)N[2]).method_18799(((class04453)((class06202)N[0]).T_4).method_18798());
      var class11781 = (class11781 & class04453)((class06202)N[0]).T_4;
      ((class11897)N[2]).N(class11781.N());
      ((class11897)N[2]).N(class11781.R());
      ((class11897)N[2]).N_6 = (Double)((class04453)((class06202)N[0]).T_4).M_2;
      ((class11897)N[2]).N_5 = (Boolean)((class04453)((class06202)N[0]).T_4).R_3;
   }

   private static void R() {
      d = new String[1];
      d[0] = "This is a utility class and cannot be instantiated";
   }
}
