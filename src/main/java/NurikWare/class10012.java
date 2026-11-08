package NurikWare;

public final class class10012 {
   private final Float N;
   private final Integer y;
   private final class09965 L;

   public class09965 L() {
      return this.L;
   }

   private class10012(Float var1, Integer var2, class09965 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public Integer y() {
      return this.y;
   }

   public class10012 N(class09965 var1) {
      return new class10012(this.N, this.y, var1);
   }

   public Float N() {
      return this.N;
   }

   public static class10012 N(float var0, int var1) {
      return new class10012(Math.max(0.0F, var0), var1, null);
   }

   public class10012 N(float var1) {
      return new class10012(this.N, this.y, class09965.N(var1));
   }
}
