package NurikWare;

public non-sealed record class11941(long id, int formatVersion, byte[] data) implements class11946 {

   public long L() {
      return this.id;
   }

   public class11941(long id, int formatVersion, byte[] data) {
      super();
      this.id = id;
      this.formatVersion = formatVersion;
      this.data = data;
   }

   public byte[] y() {
      return this.data;
   }

   public static class11941 y(class11940 var0) {
      return new class11941(var0.M(), var0.R(), var0.u(1048576));
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.id);
      var1.y(this.formatVersion);
      var1.N(this.data);
   }

   public int N() {
      return this.formatVersion;
   }
}
