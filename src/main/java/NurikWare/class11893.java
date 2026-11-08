package NurikWare;

import org.joml.Vector2f;

public record class11893(Vector2f pos, boolean inFront) {


   public boolean y() {
      return this.inFront;
   }

   public Vector2f N() {
      return this.pos;
   }
}
