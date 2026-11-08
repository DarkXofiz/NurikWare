package NurikWare;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class09951 {
   public class09951() {
      super();
   }

   public static String y(Class<?> var0, String var1) {
      for (Field field : var0.getDeclaredFields()) {
         class09956 class09956 = field.getAnnotation(class09956.class);
         if (class09956 != null && (class09956.N().equals(var1) || class09956.y().equals(var1))) {
            return field.getName();
         }
      }

      throw new IllegalStateException("Could not find field mapping for " + var1 + " in class " + var0.getName());
   }

   public static String N(Class<?> var0, String var1) {
      for (Method method : var0.getDeclaredMethods()) {
         class09956 class09956 = method.getAnnotation(class09956.class);
         if (class09956 != null && (class09956.N().equals(var1) || class09956.y().equals(var1))) {
            return method.getName();
         }
      }

      throw new IllegalStateException("Could not find mapping for " + var1 + " in class " + var0.getName());
   }
}
