package NurikWare;

public record class09830(
   float trackX,
   float trackY,
   float trackWidth,
   float trackHeight,
   float trackContentX,
   float trackContentY,
   float trackContentWidth,
   float trackContentHeight,
   float thumbX,
   float thumbY,
   float thumbWidth,
   float thumbHeight,
   float thumbTravel
) {
   public float L() {
      return this.trackWidth;
   }

   public float M() {
      return this.trackContentWidth;
   }


   public float B() {
      return this.trackContentHeight;
   }

   public float Z() {
      return this.thumbX;
   }

   public float i() {
      return this.trackContentX;
   }

   public float U() {
      return this.thumbWidth;
   }

   public float z() {
      return this.thumbY;
   }

   public float u() {
      return this.trackHeight;
   }

   public float y() {
      return this.trackY;
   }

   public float E() {
      return this.thumbHeight;
   }

   public float N() {
      return this.trackX;
   }

   public float W() {
      return this.thumbTravel;
   }

   public float R() {
      return this.trackContentY;
   }
}
