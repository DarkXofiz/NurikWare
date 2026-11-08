package NurikWare;

public non-sealed record class11972(byte[] token) implements class11942 {

   public class11972(byte[] token) {
      super();
      this.token = token;
   }

   public static class11972 y(class11940 var0) {
      return new class11972(var0.u(64));
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.token);
   }

   public byte[] N() {
      return this.token;
   }
}
