package NurikWare;

public record class11208(String name, boolean uniform, Object value, class11169 expectedType) {

   public Object L() {
      return this.value;
   }


   public String u() {
      return this.name;
   }

   public boolean y() {
      return this.uniform;
   }

   public static class11208 N(String var0, class11169 var1) {
      return new class11208(N(var0), true, null, var1);
   }

   public static class11208 N(String var0, Object var1) {
      return new class11208(N(var0), false, var1, null);
   }

   public static class11208 N(class11169 var0) {
      return new class11208(null, true, null, var0);
   }

   public static class11208 N(Object var0) {
      return new class11208(null, false, var0, null);
   }

   private static String N(String var0) {
      if (var0 != null && !var0.isBlank()) {
         return var0;
      } else {
         throw new IllegalArgumentException("Shader template arg name is blank");
      }
   }

   public class11169 N() {
      return this.expectedType;
   }
}
