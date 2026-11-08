package NurikWare;

public record class11970(long id, String newName) implements class11946 {


   public long y() {
      return this.id;
   }

   public static class11970 y(class11940 var0) {
      return new class11970(var0.M(), var0.P());
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.id);
      var1.N(this.newName);
   }

   public String N() {
      return this.newName;
   }
}
