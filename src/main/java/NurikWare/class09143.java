package NurikWare;

public record class09143(boolean active, float multiplier, float envelope) {

   public boolean L() {
      return this.active;
   }

   public class09143(boolean active, float multiplier, float envelope) {
      super();
      this.active = active;
      this.multiplier = multiplier;
      this.envelope = envelope;
   }

   public float u() {
      return this.envelope;
   }

   public static class09143 y() {
      return new class09143(false, 1.0F, 0.0F);
   }

   public float N() {
      return this.multiplier;
   }
}
