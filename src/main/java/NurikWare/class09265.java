package NurikWare;

public record class09265(int kindId, int errorCode) implements class09260 {


   public int y() {
      return this.kindId;
   }

   public static class09265 y(class11940 var0) {
      return new class09265(var0.R(), var0.R());
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.kindId);
      var1.y(this.errorCode);
   }

   public int N() {
      return this.errorCode;
   }
}
