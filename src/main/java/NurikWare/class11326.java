package NurikWare;

public record class11326(class11318 kind, long presetId, long expiresAtMillis, int activationLimit) {

   public int L() {
      return this.activationLimit;
   }


   public long i() {
      return this.presetId;
   }

   public long u() {
      return this.expiresAtMillis;
   }

   public static class11326 y(long var0) {
      return new class11326(class11318.REFRESH, var0, 0L, 0);
   }

   public static class11326 y() {
      return new class11326(class11318.LIST, 0L, 0L, 0);
   }

   public class11318 N() {
      return this.kind;
   }

   public static class11326 N(long var0) {
      return new class11326(class11318.DELETE, var0, 0L, 0);
   }

   public static class11326 N(long var0, long var2, int var4) {
      return new class11326(class11318.CREATE, var0, var2, var4);
   }
}
