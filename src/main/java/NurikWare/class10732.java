package NurikWare;

public record class10732(int kindId, long updatedAt) {

   public int L() {
      return this.kindId;
   }


   public static class10732 y(class11940 var0) {
      return new class10732(var0.R(), var0.M());
   }

   public long y() {
      return this.updatedAt;
   }

   public void N(class11940 var1) {
      var1.y(this.kindId);
      var1.N(this.updatedAt);
   }

   public class09378 N() {
      return class09378.N(this.kindId);
   }
}
