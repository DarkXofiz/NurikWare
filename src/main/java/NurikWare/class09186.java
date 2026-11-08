package NurikWare;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class09186 {
   public static Object N_0;

   private class09186() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = 2;
   }

   public static List<List<Entry<class11106, List<class11067>>>> N(class11072 var0, Map<class11106, List<class11067>> var1, int var2) {
      List<Entry<class11106, List<class11067>>> list = N(var0, var1);
      ArrayList arraylist = new ArrayList(2);

      for (int i = 0; i < 2; i++) {
         arraylist.add(new ArrayList());
      }

      int[] aint = N(list);
      int j = N(aint, var2);

      for (int k = 0; k < list.size(); k++) {
         ((List)arraylist.get(N(j, k))).add(list.get(k));
      }

      return arraylist;
   }

   private static List<Entry<class11106, List<class11067>>> N(class11072 var0, Map<class11106, List<class11067>> var1) {
      ArrayList arraylist = new ArrayList(var1.size());
      EnumSet<class11106> enumset = EnumSet.noneOf(class11106.class);

      for (class11106 class11106 : var0.y()) {
         List list = (List)var1.get(class11106);
         if (list != null) {
            arraylist.add(Map.entry(class11106, list));
            enumset.add(class11106);
         }
      }

      var1.entrySet().stream().filter(var1x -> !enumset.contains(var1x.getKey())).sorted(Entry.comparingByKey()).forEach(arraylist::add);
      return arraylist;
   }

   private static int N(int[] var0, int var1) {
      int i = var0.length;
      int j = 1 << i;
      byte b0 = 0;
      int k = Integer.MAX_VALUE;
      int l = Integer.MAX_VALUE;
      int i1 = Integer.MAX_VALUE;

      for (byte b1 = 0; b1 < j; b1 += 2) {
         int j1 = N(var0, var1, b1, 0);
         int k1 = N(var0, var1, b1, 1);
         int l1 = Math.max(j1, k1);
         int i2 = Math.abs(j1 - k1);
         int j2 = N(var0.length, b1, 1);
         if (l1 < k || l1 == k && i2 < l || l1 == k && i2 == l && j2 < i1) {
            k = l1;
            l = i2;
            i1 = j2;
            b0 = b1;
         }
      }

      return b0;
   }

   private static int N(int var0, int var1, int var2) {
      int i = 0;

      for (int j = 0; j < var0; j++) {
         if (N(var1, j) == var2) {
            i++;
         }
      }

      return i;
   }

   private static void N() {
   }

   private static int N(int var0, int var1) {
      return (var0 & 1 << var1) == 0 ? 0 : 1;
   }

   private static int N(int[] var0, int var1, int var2, int var3) {
      int i = 0;
      int j = 0;

      for (int k = 0; k < var0.length; k++) {
         if (N(var2, k) == var3) {
            if (j > 0) {
               i += var1;
            }

            i += var0[k];
            j++;
         }
      }

      return i;
   }

   private static int[] N(List<Entry<class11106, List<class11067>>> var0) {
      int[] aint = new int[var0.size()];

      for (int i = 0; i < var0.size(); i++) {
         aint[i] = class09187.N(((List)((Entry)var0.get(i)).getValue()).size());
      }

      return aint;
   }
}
