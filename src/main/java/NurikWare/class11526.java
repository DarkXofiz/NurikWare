package NurikWare;

import java.util.ArrayList;
import java.util.List;

public abstract class class11526 {
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;

   public class11526() {
      super();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = 200;
      y_1 = 100;
      y_2 = 50;
      y_3 = 20;
      y_4 = 5;
      y_5 = 0;
   }

   public List<String> N(List<String> var1, String var2) {
      ArrayList arraylist = new ArrayList(var1.size() + 1);
      arraylist.addAll(var1);
      arraylist.add(var2);
      return arraylist;
   }

   public int N(String var1, String var2, int var3) {
      int i = var1.length();
      int j = var2.length();
      if (Math.abs(i - j) > var3) {
         return var3 + 1;
      } else if (i == 0) {
         return j;
      } else if (j == 0) {
         return i;
      } else {
         int[][] aint = new int[i + 1][j + 1];
         int k = 0;

         while (k <= i) {
            aint[k][0] = k++;
         }

         k = 0;

         while (k <= j) {
            aint[0][k] = k++;
         }

         for (int l1 = 1; l1 <= i; l1++) {
            int l = Integer.MAX_VALUE;

            for (int i1 = 1; i1 <= j; i1++) {
               int j1 = var1.charAt(l1 - 1) == var2.charAt(i1 - 1) ? 0 : 1;
               int k1 = Math.min(Math.min(aint[l1 - 1][i1] + 1, aint[l1][i1 - 1] + 1), aint[l1 - 1][i1 - 1] + j1);
               if (l1 > 1 && i1 > 1 && var1.charAt(l1 - 1) == var2.charAt(i1 - 2) && var1.charAt(l1 - 2) == var2.charAt(i1 - 1)) {
                  k1 = Math.min(k1, aint[l1 - 2][i1 - 2] + 1);
               }

               aint[l1][i1] = k1;
               if (k1 < l) {
                  l = k1;
               }
            }

            if (l > var3) {
               return var3 + 1;
            }
         }

         return aint[i][j];
      }
   }

   public int N(String var1, String var2) {
      if (var1 == null) {
         return 0;
      } else {
         String s = var1.toLowerCase();
         if (s.equals(var2)) {
            return 200;
         } else if (s.startsWith(var2)) {
            return 100;
         } else if (s.contains(var2)) {
            return 50;
         } else {
            int i = this.N(var2.length());
            if (i == 0) {
               return 0;
            } else {
               int j = this.N(s, var2, i);
               return j > i ? 0 : 20 - (j - 1) * 5;
            }
         }
      }
   }

   public abstract void N(String var1, int var2, List<class11510> var3);

   public int N(int var1) {
      if (var1 <= 3) {
         return 0;
      } else {
         return var1 <= 6 ? 1 : 2;
      }
   }
}
