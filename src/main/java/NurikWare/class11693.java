package NurikWare;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class class11693 {
   public Object N_0;
   public static Object y_0 = new GsonBuilder().setPrettyPrinting().create();
   public static Object y_1 = new class11709().getType();
   public static Object y_2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   public static Object y_3;

   private void L() {
   }

   public class11693(Path var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   static {
      u();
      i();
   }

   private Map<String, List<class11675>> B() throws IOException {
      try {
         Map map = (Map)((Gson)y_0).fromJson(Files.readString((Path)this.N_0, StandardCharsets.UTF_8), (Type)y_1);
         return (Map<String, List<class11675>>)(map == null ? new LinkedHashMap<>() : map);
      } catch (JsonParseException jsonparseexception) {
         return new LinkedHashMap<>();
      }
   }

   private static void i() {
      y_0 = null;
      y_1 = null;
      y_2 = null;
      y_3 = "{}";
   }

   private static void u() {
   }

   public void N(String var1, String var2, String var3) throws IOException {
      this.N();
      Map<String, List<class11675>> map = this.B();
      List<class11675> list = map.computeIfAbsent(var1, var0 -> new ArrayList<>());
      class11675 class11675 = new class11675(var2, var3, LocalDateTime.now().format((DateTimeFormatter)y_2));
      int i = N(list, var2);
      if (i >= 0) {
         list.set(i, class11675);
      } else {
         list.add(class11675);
      }

      Files.writeString((Path)this.N_0, ((Gson)y_0).toJson(map, (Type)y_1), StandardCharsets.UTF_8);
   }

   private static int N(List<class11675> var0, String var1) {
      for (int i = 0; i < var0.size(); i++) {
         if (var1.equals(((class11675)var0.get(i)).L())) {
            return i;
         }
      }

      return -1;
   }

   public Path N() throws IOException {
      Path path = ((Path)this.N_0).getParent();
      if (path != null) {
         if (Files.notExists(path)) {
            Files.createDirectories(path);
         } else if (!Files.isDirectory(path)) {
            Files.deleteIfExists(path);
            Files.createDirectories(path);
         }
      }

      if (Files.notExists((Path)this.N_0)) {
         Files.writeString((Path)this.N_0, "{}", StandardCharsets.UTF_8);
      }

      return (Path)this.N_0;
   }

   public Optional<class11675> N(String var1, String var2) {
      if (Files.notExists((Path)this.N_0)) {
         return Optional.empty();
      } else {
         try {
            List<class11675> list = this.B().get(var1);
            return list == null ? Optional.empty() : list.stream().filter(var1x -> var2.equals(var1x.L())).findFirst();
         } catch (IOException ioexception) {
            return Optional.empty();
         }
      }
   }
}
