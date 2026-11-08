package NurikWare;

import java.util.List;

public class class09256 implements class11951<class09263> {
   public Object N_0;
   public Object N_1;

   public class09256(class09251 var1, class09282 var2) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class09256() {
      super();
      this.i();
   }

   private void i() {
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class09251.N(i);
      if ((class09251)this.N_0 == null) {
         throw new IllegalStateException("Unknown S2CSharePacket action: " + i);
      } else {
         this.N_1 = switch ((class09251)this.N_0) {
            case LIST_RESPONSE -> class09254.y(var1);
            case CREATE_RESPONSE -> class09269.y(var1);
            case DELETE_RESPONSE -> class09300.y(var1);
            case NACK -> class09284.y(var1);
            case ACTIVATE_RESPONSE -> class09253.y(var1);
            case REFRESH_RESPONSE -> class09294.y(var1);
         };
      }
   }

   public static class09256 y(class11789 var0) {
      return new class09256(class09251.REFRESH_RESPONSE, new class09294(var0));
   }

   public class09282 y() {
      return (class09282)this.N_1;
   }

   public static class09256 N(long var0, int var2) {
      return new class09256(class09251.NACK, new class09284(var0, var2));
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class09251)this.N_0).N());
      ((class09282)this.N_1).N(var1);
   }

   public class09251 N() {
      return (class09251)this.N_0;
   }

   public static class09256 N(class11794 var0, String var1, String var2) {
      return new class09256(class09251.ACTIVATE_RESPONSE, new class09253(var0.N(), var1, var2));
   }

   public static class09256 N(class11789 var0) {
      return new class09256(class09251.CREATE_RESPONSE, new class09269(var0));
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public static class09256 N(long var0) {
      return new class09256(class09251.DELETE_RESPONSE, new class09300(var0));
   }

   public static class09256 N(List<class11789> var0) {
      return new class09256(class09251.LIST_RESPONSE, new class09254(var0));
   }
}
