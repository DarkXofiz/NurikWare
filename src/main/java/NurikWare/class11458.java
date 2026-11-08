package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class05216;

public class class11458 {
   private static String[] y;

   public static class05216 L(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, true, true);
   }

   public static class05216 L(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, true, true);
   }

   private class11458() {
      super();
      throw new UnsupportedOperationException(y[0]);
   }

   static {
      y();
      N();
   }

   public static class05216 u(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, false, false);
   }

   public static class05216 u(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, true, false);
   }

   private static void y() {
   }

   public static class05216 y(class00392 var0, String var1) {
      return u(var0, var1, class00392.i());
   }

   public static class05216 y(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, false, false);
   }

   public static class05216 y(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, true, false);
   }

   private static List<class11471> y(String var0, String var1, boolean var2) {
      ArrayList arraylist = new ArrayList();
      if (var1.isEmpty()) {
         return arraylist;
      } else {
         String s = var1.toLowerCase(Locale.ROOT);
         String s1 = var0.toLowerCase(Locale.ROOT);
         int i = 0;

         while (true) {
            int j = s1.indexOf(s, i);
            if (j < 0) {
               break;
            }

            int k = j + s.length();
            arraylist.add(new class11471(j, k));
            if (!var2) {
               break;
            }

            i = k;
         }

         return arraylist;
      }
   }

   public static class05216 y(class00392 var0, Pattern var1) {
      return y(var0, var1, class00392.i());
   }

   private static List<class11471> N(String var0, Pattern var1, boolean var2) {
      ArrayList arraylist = new ArrayList();
      Matcher matcher = var1.matcher(var0);

      while (matcher.find()) {
         arraylist.add(new class11471(matcher.start(), matcher.end()));
         if (!var2) {
            break;
         }
      }

      return arraylist;
   }

   private static void N(class05216 var0, List<class11468> var1, int var2, int var3) {
      if (var2 < var3) {
         int i = 0;

         for (class11468 class11468 : var1) {
            int j = i + class11468.N().length();
            if (j <= var2) {
               i = j;
            } else {
               if (i >= var3) {
                  break;
               }

               int k = Math.max(var2, i) - i;
               int l = Math.min(var3, j) - i;
               if (k < l) {
                  var0.y(class00392.y(class11468.N().substring(k, l)).y(class11468.y()));
               }

               i = j;
            }
         }
      }
   }

   private static class00405 N(List<class11468> var0, int var1) {
      int i = 0;

      for (class11468 class11468 : var0) {
         int j = i + class11468.N().length();
         if (var1 < j) {
            return class11468.y();
         }

         i = j;
      }

      return class00405.N;
   }

   private static class05216 N(List<class11468> var0, int var1, List<class11471> var2, class00392 var3, boolean var4) {
      class05216 class05216x = class00392.i();
      int i = 0;

      for (class11471 class11471 : var2) {
         if (class11471.y() > i) {
            N(class05216x, var0, i, class11471.y());
         }

         if (!var3.getString().isEmpty()) {
            class05216 class05216x = var3.L();
            if (var4) {
               class00405 class00405 = N(var0, class11471.y());
               class05216x.y(class00405);
               if (!var3.method_10866().B()) {
                  class05216x.L(var3.method_10866());
               }
            }

            class05216x.y(class05216x);
         }

         i = class11471.N();
      }

      if (i < var1) {
         N(class05216x, var0, i, var1);
      }

      return class05216x;
   }

   public static class05216 N(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, false, true);
   }

   private static void N() {
      y = new String[1];
      y[0] = "This is a utility class and cannot be instantiated";
   }

   public static class05216 N(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, false, true);
   }

   public static class05216 N(class00392 var0, String var1) {
      return y(var0, var1, class00392.i());
   }

   private static class05216 N(class00392 var0, class11486 var1, class00392 var2, boolean var3, boolean var4) {
      ArrayList arraylist = new ArrayList();
      N(var0, arraylist);
      StringBuilder stringbuilder = new StringBuilder();

      for (class11468 var8 : arraylist) {
         stringbuilder.append(var8.N());
      }

      String s = stringbuilder.toString();
      List<class11471> list = var1.collect(s, var3);
      return list.isEmpty() ? var0.L() : N(arraylist, s.length(), list, var2, var4);
   }

   public static class05216 N(class00392 var0, Pattern var1) {
      return u(var0, var1, class00392.i());
   }

   private static void N(class00392 var0, List<class11468> var1) {
      if (var0.method_10851() instanceof class01751 var2) {
         String s = var2.comp_737();
         if (s != null && !s.isEmpty()) {
            var1.add(new class11468(s, var0.method_10866()));
         }
      }

      for (class00392 class00392 : var0.method_10855()) {
         N(class00392, var1);
      }
   }
}
