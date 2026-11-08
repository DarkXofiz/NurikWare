package NurikWare;

public non-sealed record class09275(int kindId, long updatedAt, byte[] data) implements class09260 {

   public long L() {
      return this.updatedAt;
   }

   public class09275(int kindId, long updatedAt, byte[] data) {
      super();
      this.kindId = kindId;
      this.updatedAt = updatedAt;
      this.data = data;
   }

   public static class09275 y(class11940 var0) {
      return new class09275(var0.R(), var0.M(), var0.u(262144));
   }

   public int y() {
      return this.kindId;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.kindId);
      var1.N(this.updatedAt);
      var1.N(this.data);
   }

   public byte[] N() {
      return this.data;
   }
}
