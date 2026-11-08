package NurikWare;

import minecraft.class01687;
import org.joml.Matrix4f;

public record class11237(Matrix4f matrix, class01687 cuboid, float volume) {

   public class01687 L() {
      return this.cuboid;
   }


   public Matrix4f y() {
      return this.matrix;
   }

   public float N() {
      return this.volume;
   }
}
