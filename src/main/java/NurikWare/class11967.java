package NurikWare;

import java.util.UUID;

public class class11967 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;

   public static class11967 L() {
      return new class11967(class11962.REQUEST_LIST, new class11939());
   }

   public class11967(class11962 var1, class11946 var2) {
      super();
      this.u();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class11967() {
      super();
      this.u();
   }

   private void u() {
   }

   public class11962 y() {
      return (class11962)this.N_0;
   }

   public static class11967 y(long var0) {
      return new class11967(class11962.REQUEST_GET, new class11944(var0));
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class11962.N(i);
      if ((class11962)this.N_0 == null) {
         throw new IllegalStateException("Unknown C2SPresetPacket action: " + i);
      } else {
         this.N_1 = switch ((class11962)this.N_0) {
            case REQUEST_LIST -> class11939.y(var1);
            case REQUEST_CREATE -> class11965.y(var1);
            case REQUEST_UPDATE -> class11941.y(var1);
            case REQUEST_GET -> class11944.y(var1);
            case REQUEST_DELETE -> class11980.y(var1);
            case REQUEST_RENAME -> class11970.y(var1);
         };
      }
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   public static class11967 N(long var0, byte[] var2, int var3) {
      return new class11967(class11962.REQUEST_UPDATE, new class11941(var0, var3, var2));
   }

   public static class11967 N(UUID var0, String var1, byte[] var2, int var3) {
      return new class11967(class11962.REQUEST_CREATE, new class11965(var0, var3, var1, var2));
   }

   public static class11967 N(long var0) {
      return new class11967(class11962.REQUEST_DELETE, new class11980(var0));
   }

   public class11946 N() {
      return (class11946)this.N_1;
   }

   public static class11967 N(long var0, String var2) {
      return new class11967(class11962.REQUEST_RENAME, new class11970(var0, var2));
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class11962)this.N_0).N());
      ((class11946)this.N_1).N(var1);
   }
}
