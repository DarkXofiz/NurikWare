package NurikWare;

public non-sealed record class09287(int kindId, long updatedAt) implements class09260 {

   public class09287(int kindId, long updatedAt) {
      super();
      this.kindId = kindId;
      this.updatedAt = updatedAt;
   }

   public int y() {
      return this.kindId;
   }

   public static class09287 y(class11940 var0) {
      return new class09287(var0.R(), var0.M());
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.kindId);
      var1.N(this.updatedAt);
   }

   public long N() {
      return this.updatedAt;
   }
}
