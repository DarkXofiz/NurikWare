package NurikWare;

import minecraft.class00949;
import minecraft.class01894;

public record class09413(class01894 atlasId, class01894 spriteId) implements class00949 {
   public class09413(class01894 atlasId, class01894 spriteId) {
      super();
      this.atlasId = atlasId;
      this.spriteId = spriteId;
   }

   public class01894 y() {
      return this.spriteId;
   }

   public class01894 N() {
      return this.atlasId;
   }
}
