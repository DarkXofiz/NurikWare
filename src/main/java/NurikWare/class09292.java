package NurikWare;

public non-sealed record class09292(class11827 preset, int formatVersion, byte[] data) implements class09279 {

   public int L() {
      return this.formatVersion;
   }

   public class09292(class11827 preset, int formatVersion, byte[] data) {
      super();
      this.preset = preset;
      this.formatVersion = formatVersion;
      this.data = data;
   }

   public byte[] y() {
      return this.data;
   }

   @Override
   public void y(class11940 var1) {
      this.preset.N(var1);
      var1.y(this.formatVersion);
      var1.N(this.data);
   }

   public static class09292 N(class11940 var0) {
      return new class09292(class11827.y(var0), var0.R(), var0.u(1048576));
   }

   public class11827 N() {
      return this.preset;
   }
}
