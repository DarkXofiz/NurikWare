package NurikWare;

import org.joml.Vector4fc;

public record class09907(float x, float y, float width, float height, float blurRadius, int color, Vector4fc borderRadius) implements class09924 {
   public float L() {
      return this.width;
   }

   public Vector4fc M() {
      return this.borderRadius;
   }


   public float i() {
      return this.blurRadius;
   }

   public float u() {
      return this.height;
   }

   public float N() {
      return this.x;
   }

   public int R() {
      return this.color;
   }
}
