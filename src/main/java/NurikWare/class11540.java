package NurikWare;

import java.util.UUID;

public record class11540(UUID uuid, String name, String token, String refresh, String xuid) {

   public String L() {
      return this.xuid;
   }


   public String i() {
      return this.name;
   }

   public String u() {
      return this.refresh;
   }

   public String y() {
      return this.token;
   }

   public UUID N() {
      return this.uuid;
   }
}
