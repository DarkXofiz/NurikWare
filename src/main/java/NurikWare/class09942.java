package NurikWare;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry;

public class class09942 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0 = new class09942();
   public static Object y_1;
   public static Object y_2;

   private static void L(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerMethodMapping("intermediary", var0, var1, null, var2);
         RuntimeMappingRegistry.registerMethodMapping("mappingfinder", var0, var1, null, var2);
      } catch (NoClassDefFoundError noclassdeffounderror) {
      }
   }

   private class09942() {
      super();
      this.u();
      this.N_0 = new HashMap();
      this.N_1 = new HashMap();
      this.N_2 = new HashMap();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
      y_1 = "mappingfinder";
      y_2 = "intermediary";
   }

   private static void u(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerFieldMapping("intermediary", var0, var1, null, var2);
         RuntimeMappingRegistry.registerFieldMapping("mappingfinder", var0, var1, null, var2);
      } catch (NoClassDefFoundError noclassdeffounderror) {
      }
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = false;
         this.N_4 = false;
      }
   }

   private static void y(String var0, Class<?> var1) {
      try {
         RuntimeMappingRegistry.registerClassMapping("intermediary", var0, var1.getName());
         RuntimeMappingRegistry.registerClassMapping("mappingfinder", var0, var1.getName());
      } catch (NoClassDefFoundError noclassdeffounderror) {
      }
   }

   private void y(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.N_2).put(new class09939(var1, var2), var3);
         u(var1, var2, var3);
      }
   }

   private void N(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.N_1).put(new class09939(var1, var2), var3);
         L(var1, var2, var3);
      }
   }

   public synchronized class09942 N(String var1, Class<?> var2) {
      ((Map)this.N_0).put(var1, var2);
      y(var1, var2);

      for (Method method : var2.getDeclaredMethods()) {
         class09956 class09956x = method.getAnnotation(class09956.class);
         if (class09956x != null) {
            this.N(var1, class09956x.N(), method.getName());
            this.N(var1, class09956x.y(), method.getName());
            this.N(var1, method.getName(), method.getName());
         }
      }

      for (Field field : var2.getDeclaredFields()) {
         class09956 class09956 = field.getAnnotation(class09956.class);
         if (class09956 != null) {
            this.y(var1, class09956.N(), field.getName());
            this.y(var1, class09956.y(), field.getName());
            this.y(var1, field.getName(), field.getName());
         }
      }

      return this;
   }

   public synchronized String N(String var1, String var2, String var3, String var4, String var5) {
      this.N();
      String s = (String)((Map)this.N_1).get(new class09939(var2, var3));
      if (s != null) {
         return s;
      } else {
         s = (String)((Map)this.N_1).get(new class09939(var2, var5));
         if (s != null) {
            return s;
         } else {
            Class oclass = (Class)((Map)this.N_0).get(var2);
            return oclass != null ? class09951.N(oclass, var5) : var3;
         }
      }
   }

   public synchronized String N(String var1, String var2) {
      this.N();
      String s = (String)((Map)this.N_2).get(new class09939(var1, var2));
      return s != null ? s : var2;
   }

   public synchronized void N() {
      if (!(Boolean)this.N_3) {
         if ((Boolean)this.N_4) {
            throw new IllegalStateException("Recursive mapping bootstrap");
         } else {
            this.N_4 = true;

            try {
               class09948.N(this);
               this.N_3 = true;
            } finally {
               this.N_4 = false;
            }
         }
      }
   }
}
