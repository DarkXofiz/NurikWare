package NurikWare;

import org.joml.Vector3i;

public record class11560(Vector3i min, Vector3i max) {


   public Vector3i y() {
      return this.max;
   }

   public Vector3i N() {
      return this.min;
   }
}
