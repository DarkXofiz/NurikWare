package NurikWare;

public record class09229(class11854 displayed, class11854 previous, int direction, int generation, boolean active) {

   public class11854 L() {
      return this.previous;
   }


   boolean B() {
      return this.active && this.previous != null;
   }

   public boolean i() {
      return this.active;
   }

   public int u() {
      return this.direction;
   }

   static class09229 y(class11854 var0) {
      return new class09229(var0, null, 0, 0, false);
   }

   public class11854 y() {
      return this.displayed;
   }

   class09229 N(class11854 var1) {
      return var1 == this.displayed
         ? this
         : new class09229(var1, this.displayed, Integer.signum(var1.ordinal() - this.displayed.ordinal()), this.generation + 1, true);
   }

   public int N() {
      return this.generation;
   }

   class09229 R() {
      return !this.active && this.previous == null ? this : new class09229(this.displayed, null, this.direction, this.generation, false);
   }
}
