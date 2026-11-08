package NurikWare;

public class class11948 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;

   public class11981 L() {
      return (class11981)this.N_1;
   }

   public class11948(class11979 var1, class11981 var2) {
      super();
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class11948() {
      super();
      this.R();
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class11979.N(i);
      if ((class11979)this.N_0 == null) {
         throw new IllegalStateException("Unknown C2SConfigPacket action: " + i);
      } else {
         this.N_1 = switch ((class11979)this.N_0) {
            case REQUEST_LIST -> class11949.y(var1);
            case REQUEST_PULL -> class11960.y(var1);
            case REQUEST_PUSH -> class11969.y(var1);
         };
      }
   }

   public class11979 y() {
      return (class11979)this.N_0;
   }

   public static class11948 N(int var0, byte[] var1) {
      return new class11948(class11979.REQUEST_PUSH, new class11969(var0, var1));
   }

   public static class11948 N(int var0) {
      return new class11948(class11979.REQUEST_PULL, new class11960(var0));
   }

   public static class11948 N() {
      return new class11948(class11979.REQUEST_LIST, new class11949());
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class11979)this.N_0).N());
      ((class11981)this.N_1).N(var1);
   }

   private void R() {
   }
}
