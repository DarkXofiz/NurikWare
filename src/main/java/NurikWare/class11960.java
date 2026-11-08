package NurikWare;

public non-sealed record class11960(int kindId) implements class11981 {

   public class11960(int kindId) {
      super();
      this.kindId = kindId;
   }

   public static class11960 y(class11940 var0) {
      return new class11960(var0.R());
   }

   public int N() {
      return this.kindId;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.kindId);
   }
}
