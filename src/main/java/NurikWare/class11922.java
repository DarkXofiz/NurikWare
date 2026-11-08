package NurikWare;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import minecraft.class04585;

public class class11922 {
   public static Object N_0 = new ArrayList();
   public static Object N_1 = new Gson();
   public static Object N_2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;

   private static void L() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = "ip";
      N_4 = "expired";
      N_5 = "-1";
   }

   private class11922() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   private static String y(JsonObject var0) {
      return var0.has("ip") && !var0.get("ip").isJsonNull() ? var0.get("ip").getAsString() : null;
   }

   private static LocalDate N(JsonObject var0) {
      if (var0.has("expired") && !var0.get("expired").isJsonNull()) {
         String s = var0.get("expired").getAsString();
         return "-1".equals(s) ? null : LocalDate.parse(s, (DateTimeFormatter)N_2);
      } else {
         return null;
      }
   }

   private static boolean N(LocalDate var0) {
      return var0 == null || LocalDate.now().isBefore(var0);
   }

   private static void N(String var0, String var1) {
      class11930 class11930 = new class11930(var0, var1, class04585.field_45611);
      ((List)N_0).remove(class11930);
      ((List)N_0).add(class11930);
   }

   public static void N(String var0) {
      for (Entry entry : ((JsonObject)((Gson)N_1).fromJson(var0, JsonObject.class)).entrySet()) {
         String s = (String)entry.getKey();
         JsonObject jsonobject = ((JsonElement)entry.getValue()).getAsJsonObject();
         String s1 = y(jsonobject);
         if (s1 != null && !s1.isEmpty() && N(N(jsonobject))) {
            N(s, s1);
         }
      }
   }
}
