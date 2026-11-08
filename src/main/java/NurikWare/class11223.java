package NurikWare;

import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;

public record class11223(class06889 position, class07089 hitResult, int remainingTicks, class07049 entity) {

   public int L() {
      return this.remainingTicks;
   }


   public class07049 u() {
      return this.entity;
   }

   public class07089 y() {
      return this.hitResult;
   }

   public class06889 N() {
      return this.position;
   }
}
