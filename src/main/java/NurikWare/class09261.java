package NurikWare;

public record class09261(class11827 preset, int formatVersion, byte[] data) implements class09279 {

   public byte[] L() {
      return this.data;
   }


   @Override
   public void y(class11940 var1) {
      this.preset.N(var1);
      var1.y(this.formatVersion);
      var1.N(this.data);
   }

   public int y() {
      return this.formatVersion;
   }

   public static class09261 N(class11940 var0) {
      return new class09261(class11827.y(var0), var0.R(), var0.u(1048576));
   }

   public class11827 N() {
      return this.preset;
   }
}
