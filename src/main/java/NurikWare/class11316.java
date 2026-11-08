package NurikWare;

public record class11316(class11308 phase, long presetId, long generation) {
   public static Object u_0 = new class11316(class11308.IDLE, 0L, 0L);

   public static class11316 L() {
      return (class11316)u_0;
   }

   public class11316(class11308 phase, long presetId, long generation) {
      super();
      this.phase = phase;
      this.presetId = presetId;
      this.generation = generation;
   }

   static {
      R();
   }

   public long u() {
      return this.presetId;
   }

   public long y() {
      return this.generation;
   }

   public class11308 N() {
      return this.phase;
   }

   private static void R() {
      u_0 = null;
   }
}
