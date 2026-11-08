package NurikWare;

import java.util.List;
import java.util.UUID;

public class class09274 implements class11951<class09263> {
   public Object N_0;
   public Object N_1;

   public class09274(class09277 var1, class09279 var2) {
      super();
      this.u();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class09274() {
      super();
      this.u();
   }

   private void u() {
   }

   public class09279 y() {
      return (class09279)this.N_1;
   }

   public static class09274 y(class11827 var0, int var1, byte[] var2) {
      return new class09274(class09277.GET_RESPONSE, new class09261(var0, var1, var2));
   }

   public static class09274 y(class11827 var0) {
      return new class09274(class09277.CREATE_RESPONSE, new class09291(var0));
   }

   @Override
   public void y(class11940 var1) {
      int i = var1.R();
      this.N_0 = class09277.N(i);
      if ((class09277)this.N_0 == null) {
         throw new IllegalStateException("Unknown S2CPresetPacket action: " + i);
      } else {
         this.N_1 = switch ((class09277)this.N_0) {
            case LIST_RESPONSE -> class09272.N(var1);
            case CREATE_RESPONSE -> class09291.N(var1);
            case UPDATE_RESPONSE -> class09292.N(var1);
            case GET_RESPONSE -> class09261.N(var1);
            case DELETE_RESPONSE -> class09293.N(var1);
            case RENAME_RESPONSE -> class09258.N(var1);
            case NACK -> class09281.N(var1);
         };
      }
   }

   public static class09274 N(List<class11827> var0) {
      return new class09274(class09277.LIST_RESPONSE, new class09272(var0));
   }

   public static class09274 N(class11827 var0) {
      return new class09274(class09277.RENAME_RESPONSE, new class09258(var0));
   }

   public class09277 N() {
      return (class09277)this.N_0;
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public static class09274 N(class11827 var0, int var1, byte[] var2) {
      return new class09274(class09277.UPDATE_RESPONSE, new class09292(var0, var1, var2));
   }

   public static class09274 N(long var0) {
      return new class09274(class09277.DELETE_RESPONSE, new class09293(var0));
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class09277)this.N_0).N());
      ((class09279)this.N_1).y(var1);
   }

   public static class09274 N(long var0, UUID var2, int var3) {
      return new class09274(class09277.NACK, new class09281(var0, var2, var3));
   }
}
