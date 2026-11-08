package NurikWare;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class01056;
import minecraft.class01683;
import minecraft.class01890;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class04453;
import minecraft.class04568;
import minecraft.class06202;
import minecraft.class06683;

public class class11910 {
   private static String[] i;
   private static String[] B;
   private static String[] b;
   private static String[] j;
   public static Object N_0 = Pattern.compile(b[2]);
   public static Object N_1;
   public static Object N_2 = Pattern.compile(b[3], 64);
   public static Object N_3;
   public static Object N_4 = class06202.Nq();
   public static Object N_5;
   public static Object N_6;

   public static String L() {
      if ((class03448)((class06202)N_4).T_3 != null && (class04453)((class06202)N_4).T_4 != null) {
         class04568 class04568 = ((class06202)N_4).yN();
         if (class04568 == null) {
            return i[3];
         } else {
            String s = class04568.y.split(B[0])[0];
            if (s.matches(B[1])) {
               return s.toLowerCase();
            } else {
               String[] astring = s.split(B[2]);
               return astring.length >= 2 ? astring[astring.length - 2].toLowerCase() : b[0];
            }
         }
      } else {
         return i[2];
      }
   }

   public static int M() {
      class00518 class00518 = R();
      if (class00518 == null) {
         return -1;
      } else {
         Matcher matcher = ((Pattern)N_2).matcher(class00518.i().getString());
         return matcher.find() ? Integer.parseInt(matcher.group(2)) : -1;
      }
   }

   private class11910() {
      super();
      throw new UnsupportedOperationException(b[1]);
   }

   static {
      z();
      Z();
   }

   public static boolean B() {
      return (class04453)((class06202)N_4).T_4 != null && ((class04453)((class06202)N_4).T_4).method_5476() != null ? N(j[1]) : false;
   }

   private static void Z() {
      N_1 = b[4];
      N_3 = b[5];
      N_5 = b[6];
   }

   public static boolean i() {
      if ((class04453)((class06202)N_4).T_4 != null && ((class04453)((class06202)N_4).T_4).method_5476() != null) {
         return !y(j[2]) ? false : ((class04453)((class06202)N_4).T_4).method_5476().getString().contains(j[3]);
      } else {
         return false;
      }
   }

   private static void z() {
      j = new String[5];
      j[0] = "/";
      j[1] = "наш сайт: reallyworld.ru";
      j[2] = "⚡";
      j[3] = "⚡";
      j[4] = "Монет:";
      i = new String[4];
      i[0] = "[,.]";
      i[1] = "";
      i[2] = "localhost";
      i[3] = "localhost";
      B = new String[3];
      B[0] = ":";
      B[1] = "\\d{1,3}(\\.\\d{1,3}){3}";
      B[2] = "\\.";
      b = new String[7];
      b[0] = "localhost";
      b[1] = "This is a utility class and cannot be instantiated";
      b[2] = ":\\s*(\\d+)";
      b[3] = "(?i).*?(анархия)-(\\d+)";
      b[4] = "\\d{1,3}(\\.\\d{1,3}){3}";
      b[5] = "localhost";
      b[6] = "⚡";
   }

   public static int u() {
      class01683 class01683 = ((class06202)N_4).NE();
      if ((class04453)((class06202)N_4).T_4 != null && (class03448)((class06202)N_4).T_3 != null && class01683 != null) {
         class03458 class03458 = class01683.N(((class04453)((class06202)N_4).T_4).method_7334().id());
         return class03458 != null ? class03458.R() : 0;
      } else {
         return 0;
      }
   }

   public static boolean y(String... var0) {
      if (var0.length == 0) {
         return false;
      } else {
         class00518 class00518 = R();
         if (class00518 == null) {
            return false;
         } else {
            for (String s : var0) {
               if (class00518.i().getString().trim().toLowerCase().contains(s.toLowerCase())) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static Optional<Long> y() {
      if (!i()) {
         return Optional.empty();
      } else {
         for (class00502 class00502 : ((class03448)((class06202)N_4).T_3).method_8428().i()) {
            if (class00502.R().getString().contains(j[4])) {
               Matcher matcher = ((Pattern)N_0).matcher(class00502.R().getString().replaceAll(i[0], i[1]));
               if (matcher.find()) {
                  return Optional.of(Long.parseLong(matcher.group(1)));
               }
            }
         }

         return Optional.empty();
      }
   }

   public static boolean N(String... var0) {
      if (var0.length == 0) {
         return false;
      } else {
         class00392 class00392 = ((class01056)((class06202)N_4).i_6).Z().y;
         if (class00392 == null) {
            return false;
         } else {
            for (String s : var0) {
               if (class00392.getString().trim().toLowerCase().contains(s.toLowerCase())) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static void N(String var0) {
      if (var0.startsWith(j[0])) {
         ((class06202)N_4).NE().u(var0.substring(1));
      } else {
         ((class06202)N_4).NE().L(var0);
      }
   }

   public static class11920 N() {
      return ((class11796)((class11825)((class04453)((class06202)N_4).T_4)).dataManager()).N().N();
   }

   public static void N(class00381<?> var0) {
      ((class11797)((class06202)N_4).NE().M()).sendPacketSilent(var0);
   }

   public static class00518 R() {
      if ((class04453)((class06202)N_4).T_4 != null && (class03448)((class06202)N_4).T_3 != null) {
         class06683 class06683 = ((class03448)((class06202)N_4).T_3).method_8428();
         class00518 class00518 = null;
         class00502 class00502 = class06683.y(((class04453)((class06202)N_4).T_4).method_5820());
         if (class00502 != null) {
            int ix = class00502.P().y();
            if (ix >= 0) {
               class00518 = class06683.N(class01890.values()[3 + ix]);
            }
         }

         return class00518 != null ? class00518 : class06683.N(class01890.values()[1]);
      } else {
         return null;
      }
   }
}
