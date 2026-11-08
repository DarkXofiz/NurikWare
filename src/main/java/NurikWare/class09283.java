package NurikWare;

import java.util.List;

public class class09283 implements class11951<class09263> {
   public Object N_0;
   public Object N_1;

   public class09283() {
      super();
      this.i();
   }

   public class09283(class09259 var1, class09260 var2) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void i() {
   }

   public class09259 y() {
      return (class09259)this.N_0;
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class09259.N(i);
      if ((class09259)this.N_0 == null) {
         throw new IllegalStateException("Unknown S2CConfigPacket action: " + i);
      } else {
         this.N_1 = switch ((class09259)this.N_0) {
            case LIST_RESPONSE -> class09267.y(var1);
            case BLOB -> class09275.y(var1);
            case ACK -> class09287.y(var1);
            case NACK -> class09265.y(var1);
         };
      }
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class09259)this.N_0).N());
      ((class09260)this.N_1).N(var1);
   }

   public static class09283 N(List<class10732> var0) {
      return new class09283(class09259.LIST_RESPONSE, new class09267(var0));
   }

   public class09260 N() {
      return (class09260)this.N_1;
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public static class09283 N(int var0, long var1, byte[] var3) {
      return new class09283(class09259.BLOB, new class09275(var0, var1, var3));
   }

   public static class09283 N(int var0, long var1) {
      return new class09283(class09259.ACK, new class09287(var0, var1));
   }

   public static class09283 N(int var0, int var1) {
      return new class09283(class09259.NACK, new class09265(var0, var1));
   }
}
