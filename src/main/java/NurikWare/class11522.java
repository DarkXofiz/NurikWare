package NurikWare;

public enum class11522 {
   private static String[] strings_05ffa7eec8dd73e94b3c68970de658457;
   public Integer fields_05ffa7eec8dd73e94b3c68970de658457_0;
   public boolean fields_05ffa7eec8dd73e94b3c68970de658457_init;
   public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_0 = new class11522(200);
   public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_1 = new class11522(0);
   public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_2 = new class11522(-200);
   public static class11522[] staticFields_05ffa7eec8dd73e94b3c68970de658457_3 = L();

   private void M() {
      if (!this.fields_05ffa7eec8dd73e94b3c68970de658457_init) {
         this.fields_05ffa7eec8dd73e94b3c68970de658457_init = true;
         this.fields_05ffa7eec8dd73e94b3c68970de658457_0 = 0;
      }
   }

   private class11522(int var3) {
      this.M();
      this.fields_05ffa7eec8dd73e94b3c68970de658457_0 = var3;
   }

   static {
      R();
      y();
   }

   private static void y() {
   }

   public int N() {
      return this.fields_05ffa7eec8dd73e94b3c68970de658457_0;
   }

   private static void R() {
      strings_05ffa7eec8dd73e94b3c68970de658457 = new String[3];
      strings_05ffa7eec8dd73e94b3c68970de658457[0] = "NOW";
      strings_05ffa7eec8dd73e94b3c68970de658457[1] = "DEFAULT";
      strings_05ffa7eec8dd73e94b3c68970de658457[2] = "LATER";
   }
}
