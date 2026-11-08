package NurikWare;

public class class11957 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;

   public class11988 L() {
      return (class11988)this.N_0;
   }

   public class11957(class11988 var1, class11942 var2) {
      super();
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class11957() {
      super();
      this.R();
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class11988.N(i);
      if ((class11988)this.N_0 == null) {
         throw new IllegalStateException("Unknown C2SSharePacket action: " + i);
      } else {
         this.N_1 = switch ((class11988)this.N_0) {
            case REQUEST_LIST -> class09301.y(var1);
            case REQUEST_CREATE -> class11982.y(var1);
            case REQUEST_DELETE -> class09264.y(var1);
            case REQUEST_ACTIVATE -> class11972.y(var1);
            case REQUEST_REFRESH -> class09262.y(var1);
         };
      }
   }

   public static class11957 y(long var0) {
      return new class11957(class11988.REQUEST_REFRESH, new class09262(var0));
   }

   public static class11957 y() {
      return new class11957(class11988.REQUEST_LIST, new class09301());
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   public static class11957 N(long var0) {
      return new class11957(class11988.REQUEST_DELETE, new class09264(var0));
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class11988)this.N_0).N());
      ((class11942)this.N_1).N(var1);
   }

   public class11942 N() {
      return (class11942)this.N_1;
   }

   public static class11957 N(byte[] var0) {
      return new class11957(class11988.REQUEST_ACTIVATE, new class11972(var0));
   }

   public static class11957 N(long var0, long var2, int var4) {
      return new class11957(class11988.REQUEST_CREATE, new class11982(var0, var2, var4));
   }

   private void R() {
   }
}
