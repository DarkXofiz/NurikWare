package NurikWare;

import org.joml.Vector4fc;

public record class09893(float x, float y, float width, float height, Vector4fc borderRadius) implements class09926 {
   public float L() {
      return this.width;
   }

   public class09893(float x, float y, float width, float height, Vector4fc borderRadius) {
      super();
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.borderRadius = borderRadius;
   }

   public Vector4fc i() {
      return this.borderRadius;
   }

   public float u() {
      return this.height;
   }

   public float N() {
      return this.x;
   }
}
