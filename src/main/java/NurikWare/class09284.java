package NurikWare;

public record class09284(long presetId, int errorCode) implements class09282 {


   public long y() {
      return this.presetId;
   }

   public static class09284 y(class11940 var0) {
      return new class09284(var0.M(), var0.R());
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.presetId);
      var1.y(this.errorCode);
   }

   public int N() {
      return this.errorCode;
   }
}
