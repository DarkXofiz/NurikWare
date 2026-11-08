package NurikWare;

import minecraft.class06584;
import org.joml.Vector3d;

public record class11563(class06584 itemStack, class11579 structure, Vector3d center, int lifeTimeTicks) {

   public class06584 L() {
      return this.itemStack;
   }

   public class11563(class06584 itemStack, class11579 structure, Vector3d center, int lifeTimeTicks) {
      super();
      this.itemStack = itemStack;
      this.structure = structure;
      this.center = center;
      this.lifeTimeTicks = lifeTimeTicks;
   }

   public class11579 u() {
      return this.structure;
   }

   public int y() {
      return this.lifeTimeTicks;
   }

   public Vector3d N() {
      return this.center;
   }
}
