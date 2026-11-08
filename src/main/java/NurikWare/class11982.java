package NurikWare;

public non-sealed record class11982(long presetId, long expiresAtMillis, int activationLimit) implements class11942 {

   public long L() {
      return this.presetId;
   }

   public class11982(long presetId, long expiresAtMillis, int activationLimit) {
      super();
      this.presetId = presetId;
      this.expiresAtMillis = expiresAtMillis;
      this.activationLimit = activationLimit;
   }

   public static class11982 y(class11940 var0) {
      return new class11982(var0.M(), var0.M(), var0.R());
   }

   public int y() {
      return this.activationLimit;
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.presetId);
      var1.N(this.expiresAtMillis);
      var1.y(this.activationLimit);
   }

   public long N() {
      return this.expiresAtMillis;
   }
}
