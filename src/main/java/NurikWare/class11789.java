package NurikWare;

import java.util.UUID;

public record class11789(
   long presetId, UUID presetClientId, byte[] token, long expiresAtMillis, int activationLimit, int activationCount, long createdAtMillis, boolean stale
) {

   public int L() {
      return this.activationCount;
   }

   public long M() {
      return this.createdAtMillis;
   }

   public class11789(
      long presetId, UUID presetClientId, byte[] token, long expiresAtMillis, int activationLimit, int activationCount, long createdAtMillis, boolean stale
   ) {
      super();
      this.presetId = presetId;
      this.presetClientId = presetClientId;
      this.token = token;
      this.expiresAtMillis = expiresAtMillis;
      this.activationLimit = activationLimit;
      this.activationCount = activationCount;
      this.createdAtMillis = createdAtMillis;
      this.stale = stale;
   }

   public long B() {
      return this.presetId;
   }

   public int i() {
      return this.activationLimit;
   }

   public byte[] u() {
      return this.token;
   }

   public long y() {
      return this.expiresAtMillis;
   }

   public void y(class11940 var1) {
      var1.N(this.presetId);
      var1.N(this.presetClientId);
      var1.N(this.token);
      var1.N(this.expiresAtMillis);
      var1.y(this.activationLimit);
      var1.y(this.activationCount);
      var1.N(this.createdAtMillis);
      if (var1.z() >= 16) {
         var1.N(this.stale);
      }
   }

   public boolean N() {
      return this.stale;
   }

   public static class11789 N(class11940 var0) {
      return new class11789(var0.M(), var0.U(), var0.u(64), var0.M(), var0.R(), var0.R(), var0.M(), var0.z() >= 16 && var0.B());
   }

   public UUID R() {
      return this.presetClientId;
   }
}
