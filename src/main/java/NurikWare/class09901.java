package NurikWare;

public record class09901(float pivotX, float pivotY, float scale, float rotationDegrees) implements class09914 {
   public float L() {
      return this.pivotY;
   }

   public class09901(float pivotX, float pivotY, float scale, float rotationDegrees) {
      super();
      this.pivotX = pivotX;
      this.pivotY = pivotY;
      this.scale = scale;
      this.rotationDegrees = rotationDegrees;
   }

   public float i() {
      return this.rotationDegrees;
   }

   public float u() {
      return this.scale;
   }

   public float y() {
      return this.pivotX;
   }
}
