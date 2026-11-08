package NurikWare;

public record class09741(boolean changed, boolean layoutChanged) {
   public static final class09741 N = new class09741(false, false);
   private static final class09741 u = new class09741(true, false);
   private static final class09741 i = new class09741(true, true);
   private static final class09741 R = new class09741(false, true);

   public class09741(boolean changed, boolean layoutChanged) {
      super();
      this.changed = changed;
      this.layoutChanged = layoutChanged;
   }

   public boolean y() {
      return this.layoutChanged;
   }

   public boolean N() {
      return this.changed;
   }

   public static class09741 N(boolean var0, boolean var1) {
      if (var0) {
         return var1 ? i : u;
      } else {
         return var1 ? R : N;
      }
   }
}
