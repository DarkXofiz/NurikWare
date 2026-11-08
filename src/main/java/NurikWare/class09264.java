package NurikWare;

public non-sealed record class09264(long presetId) implements class11942 {

   public class09264(long presetId) {
      super();
      this.presetId = presetId;
   }

   public static class09264 y(class11940 var0) {
      return new class09264(var0.M());
   }

   public long N() {
      return this.presetId;
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.presetId);
   }
}
