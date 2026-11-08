package NurikWare;

import java.util.Objects;
import minecraft.class02419;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08044;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11322 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1 = class06202.Nq();
   public static Object N_2 = -1;
   public static Object N_3;
   public static Object N_4;

   public static void L(int var0) {
      Objects.requireNonNull((class04453)((class06202)N_1).T_4);
      class08044 class08044 = ((class04453)((class06202)N_1).T_4).method_31548();
      class08044.N(class02419.N(var0, class08044.N(), class08044.L()));
   }

   public static void L() {
      y();
      u();
   }

   public static void M() {
      N_2 = -1;
   }

   private class11322() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      U();
   }

   public static void i(int var0) {
      y(var0);
      u();
   }

   public static void i() {
      if (!class11281.y((Integer)N_2)) {
         N_3 = true;
      }
   }

   private static void U() {
      N_0 = null;
      N_1 = null;
      N_2 = -1;
      N_3 = false;
      N_4 = false;
   }

   private static boolean z(int var0) {
      if (!class11281.u(var0)) {
         IllegalArgumentException illegalargumentexception = new IllegalArgumentException("Invalid slot");
         ((Logger)N_0).error(illegalargumentexception, illegalargumentexception);
         return true;
      } else {
         return false;
      }
   }

   public static void u() {
      Objects.requireNonNull((class03443)((class06202)N_1).T_2);
      ((class03443)((class06202)N_1).T_2).i();
   }

   public static void u(int var0) {
      Objects.requireNonNull((class04453)((class06202)N_1).T_4);
      if (!z(var0)) {
         class08044 class08044 = ((class04453)((class06202)N_1).T_4).method_31548();
         if (class11281.y((Integer)N_2)) {
            N_2 = class08044.N();
         }

         class08044.N(var0);
         N_4 = true;
      }
   }

   public static void y() {
      Objects.requireNonNull((class04453)((class06202)N_1).T_4);
      if (!class11281.y((Integer)N_2)) {
         ((class04453)((class06202)N_1).T_4).method_31548().N((Integer)N_2);
         M();
      }
   }

   public static void y(int var0) {
      Objects.requireNonNull((class04453)((class06202)N_1).T_4);
      if (!z(var0)) {
         ((class04453)((class06202)N_1).T_4).method_31548().N(var0);
         N_4 = true;
      }
   }

   public static void N(int var0) {
      u(var0);
      u();
   }

   public static void N() {
      class11938.Z().N(class11322::u);
   }

   public static void R() {
      if ((Boolean)N_4) {
         N_4 = false;
      } else if ((Boolean)N_3) {
         N_3 = false;
         if ((class04453)((class06202)N_1).T_4 != null && !class11281.y((Integer)N_2)) {
            ((class04453)((class06202)N_1).T_4).method_31548().N((Integer)N_2);
            M();
         }
      }
   }

   public static void R(int var0) {
      L(var0);
      u();
   }
}
