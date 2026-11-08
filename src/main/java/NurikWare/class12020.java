package NurikWare;

import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12020 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void L(class11999 var1) {
      class11911.N("locale/" + var1.N(), var0 -> var0.N().endsWith(".json")).forEach(var1x -> {
         class12015 class12015 = new class12015(this);
         Map map = class11911.N(var1x, class12015);
         if (map != null) {
            ((Map)this.N_2).putAll(map);
         }
      });
   }

   public class12020(class11999 var1, class11999 var2) {
      super();
      this.i();
      this.N_2 = new HashMap();
      this.N_1 = var2;
      this.N(var1);
   }

   static {
      B();
   }

   private static void B() {
      y_0 = null;
   }

   private void i() {
   }

   private boolean y(class11999 var1) {
      if ((class11999)this.N_0 == var1) {
         return false;
      } else {
         this.N_0 = var1;
         return true;
      }
   }

   public Map<String, String> y() {
      return Map.copyOf((Map<? extends String, ? extends String>)this.N_2);
   }

   public void N(class11999 var1) {
      if (this.y(var1)) {
         try {
            ((Map)this.N_2).clear();
            this.L((class11999)this.N_1);
            this.L(var1);
         } catch (Exception exception) {
            ((Logger)y_0).error(exception, exception);
         }
      }
   }

   public class11999 N() {
      return (class11999)this.N_0;
   }

   public static String N(String var0) {
      return ((Map)class11938.P().N_2).getOrDefault(var0, var0);
   }

   public static String N(class12018 var0) {
      return ((Map)class11938.P().N_2).getOrDefault(var0.N(), var0.N());
   }
}
