package NurikWare;

public record class09192(String entryKey, int days) {

   class09192(String entryKey, int days) {
      super();
      this.entryKey = entryKey;
      this.days = days;
   }

   public int y() {
      return this.days;
   }

   public String N() {
      return this.entryKey;
   }
}
