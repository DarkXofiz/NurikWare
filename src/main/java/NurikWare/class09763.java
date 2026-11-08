package NurikWare;

public record class09763(long timestampMs, String location, Class<? extends Throwable> cls, String message) {

   public Class<? extends Throwable> L() {
      return this.cls;
   }

   public class09763(long timestampMs, String location, Class<? extends Throwable> cls, String message) {
      super();
      this.timestampMs = timestampMs;
      this.location = location;
      this.cls = cls;
      this.message = message;
   }

   public String u() {
      return this.message;
   }

   public String y() {
      return this.location;
   }

   public long N() {
      return this.timestampMs;
   }
}
