package NurikWare;

import java.util.Arrays;

public enum class11828 {
   HELPER("helper", 1),
   MODERATOR("moderator", 2),
   ADMINISTRATOR("administrator", 3),
   DEVELOPER("developer", 4);

   public String fields_051d503ac1bdb307ba7adfe057adb8485_0;
   public Integer fields_051d503ac1bdb307ba7adfe057adb8485_1;
   public boolean fields_051d503ac1bdb307ba7adfe057adb8485_init;

   private void L() {
      if (!this.fields_051d503ac1bdb307ba7adfe057adb8485_init) {
         this.fields_051d503ac1bdb307ba7adfe057adb8485_init = true;
         this.fields_051d503ac1bdb307ba7adfe057adb8485_1 = 0;
      }
   }

   private class11828(String var3, int var4) {
      this.L();
      this.fields_051d503ac1bdb307ba7adfe057adb8485_0 = var3;
      this.fields_051d503ac1bdb307ba7adfe057adb8485_1 = var4;
   }

   static {
      R();
   }

   public String y() {
      return this.fields_051d503ac1bdb307ba7adfe057adb8485_0;
   }

   public int N() {
      return this.fields_051d503ac1bdb307ba7adfe057adb8485_1;
   }

   public boolean N(class11802 var1) {
      return var1.N() >= this.fields_051d503ac1bdb307ba7adfe057adb8485_1;
   }

   public static class11828 N(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_051d503ac1bdb307ba7adfe057adb8485_0.equals(var0)).findFirst().orElse(null);
   }

   private static void R() {
   }
}
