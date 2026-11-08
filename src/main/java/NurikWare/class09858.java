package NurikWare;

public record class09858(float minX, float minY, float maxX, float maxY) {
   public float L() {
      return this.minY;
   }


   public float i() {
      return this.maxY;
   }

   public float u() {
      return this.maxX;
   }

   public float y() {
      return this.minX;
   }

   public boolean N(class09858 var1) {
      return this.maxX > var1.minX && this.minX < var1.maxX && this.maxY > var1.minY && this.minY < var1.maxY;
   }

   public boolean N() {
      return this.maxX > this.minX && this.maxY > this.minY;
   }

   public boolean N(float var1, float var2) {
      return var1 >= this.minX && var1 <= this.maxX && var2 >= this.minY && var2 <= this.maxY;
   }
}
