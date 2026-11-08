package NurikWare;

public enum class11085 {
   MID_CHEST,
   UPPER_CHEST,
   SHOULDER,
   HEAD_LINE;

   private class11085() {
   }

   static {
      u();
   }

   private static void u() {
   }

   public class11085 N(class09166 var1) {
      class11085[] aclass11085 = values();
      class11085 class11085 = aclass11085[var1.N(0, aclass11085.length - 1)];
      return class11085 == this ? aclass11085[(this.ordinal() + 1) % aclass11085.length] : class11085;
   }
}
