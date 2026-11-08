package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

final class class09890 {
   private static final Logger N = Logger.getLogger(class09890.class.getName());
   private final class09927 y = new class09927();

   class09890() {
      super();
   }

   private static String N(class10021 var0) {
      String s = var0.N();
      return s != null && !s.isBlank() ? s : "<anonymous>";
   }

   class09936 N(class10021 var1, class09895 var2, List<String> var3, boolean var4) {
      if (!var4) {
         return class09936.N(var2.N(), var2.y(), var3);
      } else {
         List<class09935> list = this.y.N(var1);
         if (list.isEmpty()) {
            return class09936.N(var2.N(), var2.y(), var3);
         } else {
            ArrayList arraylist = new ArrayList(var2.N().size() + list.size());
            arraylist.addAll(var2.N());
            arraylist.addAll(list);
            return class09936.N(arraylist, var2.y() + list.size(), var3);
         }
      }
   }

   void N(class10021 var1, int var2, class09896 var3, class09770 var4) {
      if ((var4 == null ? class09770.N : var4).i() && var3.L > 0) {
         N.info(
            () -> "Draw commands rebuilt for root='"
               + N(var1)
               + "', drawCommandCount="
               + var2
               + ", rebuiltNodes="
               + var3.L
               + ", cacheHits="
               + var3.N
               + ", cacheMisses="
               + var3.y
         );
      }
   }
}
