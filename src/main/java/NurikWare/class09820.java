package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class class09820 {
   private static final String N = "style.";

   private static String L(class09773 var0) {
      StringBuilder stringbuilder = new StringBuilder();

      for (Entry entry : var0.L().entrySet()) {
         if (((String)entry.getKey()).startsWith("style.")) {
            if (!stringbuilder.isEmpty()) {
               stringbuilder.append("  ");
            }

            stringbuilder.append(N((String)entry.getKey())).append('=').append((String)entry.getValue());
         }
      }

      return stringbuilder.toString();
   }

   public static String L(class10021 var0, class09791 var1) {
      return y(N(var0, var1));
   }

   private class09820() {
      super();
   }

   public static String y(class10021 var0, class09791 var1) {
      return N(N(var0, var1));
   }

   public static String y(class09773 var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, stringbuilder);
      return stringbuilder.toString();
   }

   private static String y(String var0) {
      StringBuilder stringbuilder = new StringBuilder(var0.length() + 2);
      stringbuilder.append('"');

      for (int i = 0; i < var0.length(); i++) {
         char c0 = var0.charAt(i);
         switch (c0) {
            case '\t':
               stringbuilder.append("\\t");
               break;
            case '\n':
               stringbuilder.append("\\n");
               break;
            case '\r':
               stringbuilder.append("\\r");
               break;
            case '"':
               stringbuilder.append("\\\"");
               break;
            case '\\':
               stringbuilder.append("\\\\");
               break;
            default:
               stringbuilder.append(c0);
         }
      }

      stringbuilder.append('"');
      return stringbuilder.toString();
   }

   private static void y(class09773 var0, class09773 var1, String var2, StringBuilder var3) {
      LinkedHashSet linkedhashset = new LinkedHashSet();
      linkedhashset.addAll(var0.L().keySet());
      linkedhashset.addAll(var1.L().keySet());

      for (String s : linkedhashset) {
         String s1 = var0.L().get(s);
         String s2 = var1.L().get(s);
         if (!Objects.equals(s1, s2)) {
            var3.append("~ ")
               .append(var2)
               .append(' ')
               .append(N(s))
               .append(": ")
               .append(s1 == null ? "-" : s1)
               .append(" -> ")
               .append(s2 == null ? "-" : s2)
               .append('\n');
         }
      }
   }

   private static String y(class10021 var0) {
      String s = var0.N();
      String s1 = var0.y().name().toLowerCase();
      return s != null && !s.isBlank() ? s1 + "#" + s : s1;
   }

   private static void y(class10021 var0, Map<String, String> var1) {
      String s = N(var0);
      if (!s.isEmpty()) {
         var1.put("dirty", s);
      }

      int i = var0.q().Z();
      if (i > 0) {
         var1.put("cachedDraws", String.valueOf(i));
      }
   }

   private static String N(class09962 var0) {
      String s = var0.u().name().toLowerCase();

      float f = switch (var0.u()) {
         case FIXED, PERCENT -> var0.M();
         default -> var0.i();
      };
      return s + "(" + N(f) + ")";
   }

   private static String N(String var0) {
      return var0.startsWith("style.") ? var0.substring("style.".length()) : var0;
   }

   private static boolean N(class09985 var0) {
      return N(var0.L(), var0.u()) && N(var0.u(), var0.i()) && N(var0.i(), var0.R());
   }

   private static class10021 N(class10021 var0, String var1) {
      if (var1.equals(var0.N())) {
         return var0;
      } else {
         Iterator<class10021> iterator = var0.L().iterator();

         while (iterator.hasNext()) {
            class10021 class10021 = N(iterator.next(), var1);
            if (class10021 != null) {
               return class10021;
            }
         }

         return null;
      }
   }

   public static class09773 N(class10021 var0, class09791 var1) {
      class09791 class09791 = var1 == null ? class09791.N() : var1;
      class10021 class10021 = class09791.L() == null ? var0 : N(var0, class09791.L());
      return class10021 == null
         ? new class09773("missing", "(missing key: " + class09791.L() + ")", new LinkedHashMap<>(), List.of())
         : N(class10021, class09791, 0, 0);
   }

   private static String N(class10021 var0, int var1) {
      String s = var0.N();
      return s != null && !s.isBlank() ? s : var0.y().name().toLowerCase() + "[" + var1 + "]";
   }

   private static String N(class09989 var0, Object var1) {
      return switch (var1) {
         case null -> "null";
         case Float f -> N((Float)var1);
         case Integer integer when var0.name().contains("COLOR") -> N(integer);
         case class09962 class09962 -> N((class09962)var1);
         case class09965 class09965 -> class09965.L()
            ? N(class09965.u())
            : N(class09965.u()) + "/" + N(class09965.i()) + "/" + N(class09965.R()) + "/" + N(class09965.M());
         case class09985 class09985 -> N(class09985)
            ? N(class09985.L())
            : N(class09985.L()) + "/" + N(class09985.u()) + "/" + N(class09985.i()) + "/" + N(class09985.R());
         default -> String.valueOf(var1);
      };
   }

   public static String N(class09773 var0, class09773 var1) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, var1, "", stringbuilder);
      return stringbuilder.isEmpty() ? "(no differences)\n" : stringbuilder.toString();
   }

   private static boolean N(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   private static String N(String var0, int var1) {
      String s = var0.replace('\n', ' ').replace('\r', ' ');
      return s.length() <= var1 ? s : s.substring(0, var1) + "...";
   }

   private static String N(int var0) {
      return String.format("#%08X", var0);
   }

   private static String N(float var0) {
      return var0 == Math.rint(var0) && !Float.isInfinite(var0) ? Integer.toString((int)var0) : String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String N(float var0, float var1, float var2, float var3) {
      return "(" + N(var0) + "," + N(var1) + " " + N(var2) + "x" + N(var3) + ")";
   }

   private static void N(class09980 var0, boolean var1, Map<String, String> var2) {
      class09980 class09980 = class09968.N();

      for (class09989 class09989 : class09989.values()) {
         if (var1 || class09989.N(class09980, var0)) {
            var2.put("style." + class09989.name().toLowerCase(), N(class09989, class09989.N(var0)));
         }
      }
   }

   private static void N(StringBuilder var0, class09773 var1) {
      for (Entry entry : var1.L().entrySet()) {
         if (!((String)entry.getKey()).startsWith("style.")) {
            var0.append(' ').append((String)entry.getKey()).append('=').append((String)entry.getValue());
         }
      }
   }

   private static void N(class09773 var0, int var1, StringBuilder var2) {
      String s = "  ".repeat(var1);
      var2.append(s).append(var0.y());
      N(var2, var0);
      var2.append('\n');
      String s1 = L(var0);
      if (!s1.isEmpty()) {
         var2.append(s).append("    style ").append(s1).append('\n');
      }

      Iterator<class09773> iterator = var0.u().iterator();

      while (iterator.hasNext()) {
         N(iterator.next(), var1 + 1, var2);
      }
   }

   public static String N(class09773 var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, 0, stringbuilder);
      return stringbuilder.toString();
   }

   private static String N(class10021 var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(stringbuilder, var0, 2, "LAYOUT");
      N(stringbuilder, var0, 4, "POSITION");
      N(stringbuilder, var0, 8, "SCROLL");
      N(stringbuilder, var0, 1, "DRAW");
      return stringbuilder.toString();
   }

   private static void N(StringBuilder var0, class10021 var1, int var2, String var3) {
      if (var1.M(var2)) {
         if (!var0.isEmpty()) {
            var0.append('|');
         }

         var0.append(var3);
      }
   }

   private static Map<String, class09773> N(List<class09773> var0) {
      LinkedHashMap linkedhashmap = new LinkedHashMap();

      for (int i = 0; i < var0.size(); i++) {
         class09773 class09773 = (class09773)var0.get(i);
         String s = class09773.N();
         String s1 = linkedhashmap.containsKey(s) ? s + "#" + i : s;
         linkedhashmap.put(s1, class09773);
      }

      return linkedhashmap;
   }

   private static class09773 N(class10021 var0, class09791 var1, int var2, int var3) {
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      N(var0, linkedhashmap);
      N(var0.c(), linkedhashmap);
      N(var0.o(), var1.u(), linkedhashmap);
      y(var0, linkedhashmap);
      ArrayList arraylist = new ArrayList();
      List<class10021> list = var0.L();
      if (var2 >= var1.y() && !list.isEmpty()) {
         linkedhashmap.put("childrenElided", String.valueOf(list.size()));
      } else {
         for (int i = 0; i < list.size(); i++) {
            arraylist.add(N(list.get(i), var1, var2 + 1, i));
         }
      }

      return new class09773(N(var0, var3), y(var0), linkedhashmap, arraylist);
   }

   private static void N(class09773 var0, class09773 var1, String var2, StringBuilder var3) {
      String s = var2.isEmpty() ? var1.N() : var2 + "/" + var1.N();
      y(var0, var1, s, var3);
      Map<String, class09773> map = N(var0.u());
      Map<String, class09773> map1 = N(var1.u());
      LinkedHashSet linkedhashset = new LinkedHashSet();
      linkedhashset.addAll(map.keySet());
      linkedhashset.addAll(map1.keySet());

      for (String s1 : linkedhashset) {
         class09773 class09773x = map.get(s1);
         class09773 class09773x = map1.get(s1);
         if (class09773x == null) {
            var3.append("+ ").append(s).append('/').append(class09773x.N()).append("  ").append(class09773x.y()).append('\n');
         } else if (class09773x == null) {
            var3.append("- ").append(s).append('/').append(class09773x.N()).append("  ").append(class09773x.y()).append('\n');
         } else {
            N(class09773x, class09773x, s, var3);
         }
      }
   }

   private static void N(class10021 var0, Map<String, String> var1) {
      String s = var0.B();
      if (s != null && !s.isEmpty()) {
         var1.put("text", "\"" + N(s, 60) + "\"");
      }

      String s1 = var0.Z();
      if (s1 != null && !s1.isEmpty()) {
         var1.put("placeholder", "\"" + N(s1, 60) + "\"");
      }

      String s2 = var0.z();
      if (s2 != null && !s2.isEmpty()) {
         var1.put("texture", s2);
      }

      if (var0.U() != null) {
         var1.put("canvas", "yes");
      }
   }

   private static void N(class09773 var0, StringBuilder var1) {
      var1.append("{\"id\":").append(y(var0.N()));
      var1.append(",\"label\":").append(y(var0.y()));
      var1.append(",\"fields\":{");
      boolean flag = true;

      for (Entry entry : var0.L().entrySet()) {
         if (!flag) {
            var1.append(',');
         }

         flag = false;
         var1.append(y((String)entry.getKey())).append(':').append(y((String)entry.getValue()));
      }

      var1.append("},\"children\":[");
      List<class09773> list = var0.u();

      for (int i = 0; i < list.size(); i++) {
         if (i > 0) {
            var1.append(',');
         }

         N(list.get(i), var1);
      }

      var1.append("]}");
   }

   private static void N(class09937 var0, Map<String, String> var1) {
      var1.put("box", N(var0.y(), var0.L(), var0.u(), var0.i()));
      if (!N(var0.t(), var0.u()) || !N(var0.G(), var0.i())) {
         var1.put("raw", N(var0.t()) + "x" + N(var0.G()));
      }

      var1.put("content", N(var0.R(), var0.M(), var0.B(), var0.Z()));
      if (var0.P() > 0.0F || var0.m() != 0.0F) {
         var1.put("scrollY", N(var0.m()) + "/" + N(var0.P()));
      }

      if (var0.z() != 0) {
         var1.put("z", String.valueOf(var0.z()));
      }
   }
}
