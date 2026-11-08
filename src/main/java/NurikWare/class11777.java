package NurikWare;

public enum class11777 {
   BEFORE_ALL(200),
   BEFORE(100),
   NOW(0),
   AFTER(-100),
   AFTER_ALL(-200),
   LISTENER(-999);

   public Integer fields_0d1998a71c0803f83aaed89a64f36d2f5_0;
   public boolean fields_0d1998a71c0803f83aaed89a64f36d2f5_init;

   private class11777(int var3) {
      this.u();
      this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0 = var3;
   }

   static {
      i();
   }

   private static void i() {
   }

   private void u() {
      if (!this.fields_0d1998a71c0803f83aaed89a64f36d2f5_init) {
         this.fields_0d1998a71c0803f83aaed89a64f36d2f5_init = true;
         this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0 = 0;
      }
   }

   public int N() {
      return this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0;
   }
}
