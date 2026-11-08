package NurikWare;

public non-sealed record class09300(long presetId) implements class09282 {

   public class09300(long presetId) {
      super();
      this.presetId = presetId;
   }

   public static class09300 y(class11940 var0) {
      return new class09300(var0.M());
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.presetId);
   }

   public long N() {
      return this.presetId;
   }
}
