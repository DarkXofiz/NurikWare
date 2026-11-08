package NurikWare;

import java.util.UUID;

public record class11827(long id, UUID clientId, String name, String creator, long lastUpdate, long rowVersion) {

   public String L() {
      return this.name;
   }


   public long i() {
      return this.rowVersion;
   }

   public UUID u() {
      return this.clientId;
   }

   public String y() {
      return this.creator;
   }

   public static class11827 y(class11940 var0) {
      return new class11827(var0.M(), var0.U(), var0.P(), var0.P(), var0.M(), var0.M());
   }

   public void N(class11940 var1) {
      var1.N(this.id);
      var1.N(this.clientId);
      var1.N(this.name);
      var1.N(this.creator);
      var1.N(this.lastUpdate);
      var1.N(this.rowVersion);
   }

   public long N() {
      return this.lastUpdate;
   }

   public long R() {
      return this.id;
   }
}
