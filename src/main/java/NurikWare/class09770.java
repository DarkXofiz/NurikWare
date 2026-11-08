package NurikWare;

public record class09770(boolean layoutRebuilds, boolean drawCommandRebuilds) {
   public static final class09770 N = new class09770(false, false);

   public static class09770 L() {
      return new class09770(true, true);
   }


   public boolean i() {
      return this.drawCommandRebuilds;
   }

   public boolean u() {
      return this.layoutRebuilds;
   }

   public static class09770 y() {
      return new class09770(false, true);
   }

   public static class09770 N() {
      return new class09770(true, false);
   }
}
