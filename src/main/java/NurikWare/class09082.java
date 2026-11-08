package NurikWare;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import minecraft.class01079;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class09082 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;

   public int L(int var1) {
      class09071 class09071 = this.Z(var1);
      return class09071 == null ? 0 : class09071.u();
   }

   public void L() {
      Iterator iterator = ((List)this.y_2).iterator();

      while (iterator.hasNext()) {
         ((class09071)iterator.next()).i();
      }

      ((List)this.y_2).clear();
      ((Map)this.y_1).clear();
      ((ExecutorService)this.y_3).shutdown();
   }

   private static void M() {
      N_0 = null;
      N_1 = 64.0;
      N_2 = 12.0;
      N_3 = 512;
   }

   public class09082() {
      super();
      this.i();
      this.y_0 = new HashMap();
      this.y_1 = new HashMap();
      this.y_2 = new ArrayList();
      this.y_3 = Executors.newFixedThreadPool(4);
      this.y_4 = Math.max(512, Math.min(class11925.u(), 8192));
   }

   static {
      M();
   }

   private class09071 Z(int var1) {
      return var1 >= 0 && var1 < ((List)this.y_2).size() ? (class09071)((List)this.y_2).get(var1) : null;
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0;
      }
   }

   public int y(int var1) {
      class09071 class09071 = this.Z(var1);
      return class09071 == null ? 0 : class09071.M();
   }

   public void y() {
      Iterator iterator = ((List)this.y_2).iterator();

      while (iterator.hasNext()) {
         ((class09071)iterator.next()).N();
      }
   }

   public class09071 N(String var1, byte[] var2, class09079 var3) {
      String s = var1 + "#" + var3.name();
      class09071 class09071x = (class09071)((Map)this.y_1).get(s);
      if (class09071x != null) {
         return class09071x;
      } else {
         class09734 class09734 = new class09734(class09735.MTSDF, 64.0, 12.0, 512, (Integer)this.y_4).N(var3.N());
         Path path = this.N(var1, var3);
         class09742 class09742 = this.N(var2, class09734, path);
         class09071 class09071x = new class09071(class09742, ((List)this.y_2).size(), 12.0F, path);
         ((Map)this.y_1).put(s, class09071x);
         ((List)this.y_2).add(class09071x);
         return class09071x;
      }
   }

   public class09093 N(String var1) {
      return (class09093)((Map)this.y_0).get(var1);
   }

   private Path N(String var1, class09079 var2) {
      try {
         Path path = ((Path)class11518.N_0).resolve("cache").resolve("font");
         Files.createDirectories(path);
         return path.resolve(var1 + "_w" + (int)var2.N() + ".msdf");
      } catch (Exception exception) {
         ((Logger)N_0).warn("Font atlas cache directory unavailable: {}", exception.toString());
         return null;
      }
   }

   public class09093 N(String var1, class01079 var2) {
      if (((Map)this.y_0).containsKey(var1)) {
         throw new IllegalStateException("Font family already registered: " + var1);
      } else {
         class09093 class09093 = new class09093(var1, this, var2);
         ((Map)this.y_0).put(var1, class09093);
         return class09093;
      }
   }

   public int N(int var1) {
      class09071 class09071 = this.Z(var1);
      return class09071 == null ? 0 : class09071.R();
   }

   private class09742 N(byte[] var1, class09734 var2, Path var3) {
      if (var3 != null) {
         try {
            return class09742.N(var1, var2, var3, (ExecutorService)this.y_3);
         } catch (Exception exception) {
            ((Logger)N_0).warn("Font atlas cache load failed ({}): {}", var3, exception.toString());
         }
      }

      return class09742.N(var1, var2, (ExecutorService)this.y_3);
   }

   public void N() {
      this.y();
      Iterator iterator = ((Map)this.y_0).values().iterator();

      while (iterator.hasNext()) {
         ((class09093)iterator.next()).y();
      }
   }
}
