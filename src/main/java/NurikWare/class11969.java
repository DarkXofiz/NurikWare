package NurikWare;

public non-sealed record class11969(int kindId, byte[] data) implements class11981 {

   public class11969(int kindId, byte[] data) {
      super();
      this.kindId = kindId;
      this.data = data;
   }

   public static class11969 y(class11940 var0) {
      return new class11969(var0.R(), var0.u(262144));
   }

   public int y() {
      return this.kindId;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.kindId);
      var1.N(this.data);
   }

   public byte[] N() {
      return this.data;
   }
}
