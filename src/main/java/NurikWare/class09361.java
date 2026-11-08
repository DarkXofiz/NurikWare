package NurikWare;

import minecraft.class00394;
import minecraft.class04489;

public record class09361(class00394 blockEntity) implements class04489 {

   public String get() {
      return this.blockEntity.Q() + "@" + this.blockEntity.d();
   }

   public class00394 N() {
      return this.blockEntity;
   }
}
