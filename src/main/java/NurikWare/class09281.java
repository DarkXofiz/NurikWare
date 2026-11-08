package NurikWare;

import java.util.UUID;

public record class09281(long id, UUID clientId, int errorCode) implements class09279 {

   public int L() {
      return this.errorCode;
   }


   @Override
   public void y(class11940 var1) {
      var1.N(this.id);
      var1.N(this.clientId);
      var1.y(this.errorCode);
   }

   public long y() {
      return this.id;
   }

   public UUID N() {
      return this.clientId;
   }

   public static class09281 N(class11940 var0) {
      return new class09281(var0.M(), var0.U(), var0.R());
   }
}
