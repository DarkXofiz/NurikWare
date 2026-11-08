package NurikWare;

public record class09901(float pivotX, float pivotY, float scale, float rotationDegrees) implements class09914 {
   public float L() {
      return this.pivotY;
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
