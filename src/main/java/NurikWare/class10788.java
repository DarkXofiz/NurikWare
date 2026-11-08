package NurikWare;

import minecraft.class02195;
import minecraft.class03556;

public record class10788(class03556<class02195> type, byte x, byte y, byte rot) {
   public byte L() {
      return this.y;
   }

   public class10788(class03556<class02195> type, byte x, byte y, byte rot) {
      super();
      this.type = type;
      this.x = x;
      this.y = y;
      this.rot = rot;
   }

   public byte u() {
      return this.rot;
   }

   public byte y() {
      return this.x;
   }

   public class03556<class02195> N() {
      return this.type;
   }
}
