package NurikWare;

public non-sealed record class09262(long presetId) implements class11942 {

   public class09262(long presetId) {
      super();
      this.presetId = presetId;
   }

   public static class09262 y(class11940 var0) {
      return new class09262(var0.M());
   }

   public long N() {
      return this.presetId;
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.presetId);
   }
}
