package NurikWare;

import org.joml.Vector3i;

public record class11560(Vector3i min, Vector3i max) {

   class11560(Vector3i min, Vector3i max) {
      super();
      this.min = min;
      this.max = max;
   }

   public Vector3i y() {
      return this.max;
   }

   public Vector3i N() {
      return this.min;
   }
}
