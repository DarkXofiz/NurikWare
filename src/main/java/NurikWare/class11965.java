package NurikWare;

import java.util.UUID;

public non-sealed record class11965(UUID clientId, int formatVersion, String name, byte[] data) implements class11946 {

   public byte[] L() {
      return this.data;
   }

   public class11965(UUID clientId, int formatVersion, String name, byte[] data) {
      super();
      this.clientId = clientId;
      this.formatVersion = formatVersion;
      this.name = name;
      this.data = data;
   }

   public UUID u() {
      return this.clientId;
   }

   public String y() {
      return this.name;
   }

   public static class11965 y(class11940 var0) {
      return new class11965(var0.U(), var0.R(), var0.P(), var0.u(1048576));
   }

   public int N() {
      return this.formatVersion;
   }

   @Override
   public void N(class11940 var1) {
      var1.N(this.clientId);
      var1.y(this.formatVersion);
      var1.N(this.name);
      var1.N(this.data);
   }
}
