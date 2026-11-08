package NurikWare;

import java.util.Arrays;

public enum class11999 {
   RU("ru"),
   EN("en");
   public String fields_012b09a0b8db6387686aa0e4095e29f49_0;

   private static void L() {
   }

   private class11999(String var3) {
      this.u();
      this.fields_012b09a0b8db6387686aa0e4095e29f49_0 = var3;
   }

   static {
      L();
   }

   private void u() {
   }

   public String N() {
      return this.fields_012b09a0b8db6387686aa0e4095e29f49_0;
   }

   public static class11999 N(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_012b09a0b8db6387686aa0e4095e29f49_0.equals(var0)).findFirst().orElse(EN);
   }
}
