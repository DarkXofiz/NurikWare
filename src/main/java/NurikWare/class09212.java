package NurikWare;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class09212 {
   public static Object N_0 = new class09212()::N;
   public static Object N_1;

   private static void L() {
   }

   private class09212() {
      super();
   }

   static {
      L();
      y();
   }

   private static List<List<Entry<class11165, List<class11882>>>> i() {
      EnumMap enummap = new EnumMap<>(class11165.class);
      class11938.n().L().forEach(var1x -> enummap.computeIfAbsent(var1x.i(), var0xx -> new ArrayList()).add(var1x));
      ArrayList arraylist = new ArrayList(2);
      arraylist.add(new ArrayList());
      arraylist.add(new ArrayList());
      int[] aint = new int[2];

      for (class11165 class11165 : class11165.values()) {
         List list = (List)enummap.get(class11165);
         if (list != null && !list.isEmpty()) {
            int i = aint[0] <= aint[1] ? 0 : 1;
            ((List)arraylist.get(i)).add(Map.entry(class11165, list));
            aint[i] += class09189.N(list.size()) + 20;
         }
      }

      return arraylist;
   }

   private static void y() {
   }

   private class09798 N(Void var1, class09809 var2) {
      List<List<Entry<class11165, List<class11882>>>> list = N();
      return class09778.N((class09991)class09198.N_0, var2x -> {
         var2x.N_3((class09991)class09198.N_1, var2xx -> N(var2xx, list.get(0), var2));
         var2x.N_3((class09991)class09198.N_1, var2xx -> N(var2xx, list.get(1), var2));
      });
   }

   private static List<List<Entry<class11165, List<class11882>>>> N() {
      if ((List)N_1 == null) {
         N_1 = i();
      }

      return (List<List<Entry<class11165, List<class11882>>>>)N_1;
   }

   private static void N(class09784 var0, List<Entry<class11165, List<class11882>>> var1, class09809 var2) {
      for (Entry entry : var1) {
         class11165 class11165 = (class11165)entry.getKey();
         List list = (List)entry.getValue();
         class09785 class09785 = var2.y("nurikware:autoBuyExpanded:" + class11165.name(), true);
         var0.y(var2.N("autoBuy" + class11165.name(), (class09788<class11859>)class09189.y_0, new class11859(class09785, class11165, list)));
      }
   }
}
