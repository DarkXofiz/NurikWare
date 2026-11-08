package NurikWare;

import java.util.UUID;

public record class11540(UUID uuid, String name, String token, String refresh, String xuid) {

   public String L() {
      return this.xuid;
   }

   public class11540(UUID uuid, String name, String token, String refresh, String xuid) {
      super();
      this.uuid = uuid;
      this.name = name;
      this.token = token;
      this.refresh = refresh;
      this.xuid = xuid;
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
