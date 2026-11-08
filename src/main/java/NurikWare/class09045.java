package NurikWare;

import java.util.Arrays;

public enum class09045 {
   TOGGLE("toggle"),
   HOLD("hold");
   public String fields_0b9b15f5e167c3861902fa68eb25fbfed_0;

   private class09045(String var3) {
      this.R();
      this.fields_0b9b15f5e167c3861902fa68eb25fbfed_0 = var3;
   }

   static {
      B();
   }

   private static void B() {
   }

   public static class09045 N(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_0b9b15f5e167c3861902fa68eb25fbfed_0.equalsIgnoreCase(var0)).findFirst().orElse(null);
   }

   public String N() {
      return this.fields_0b9b15f5e167c3861902fa68eb25fbfed_0;
   }

   private void R() {
   }
}
