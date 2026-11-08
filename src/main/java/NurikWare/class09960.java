package NurikWare;

public record class09960(int x, int y, int width, int height) {
   public int L() {
      return this.x;
   }

   public class09960(int x, int y, int width, int height) {
      super();
      if (x < 0) {
         throw new IllegalArgumentException("x must be >= 0");
      } else if (y < 0) {
         throw new IllegalArgumentException("y must be >= 0");
      } else if (width <= 0) {
         throw new IllegalArgumentException("width must be > 0");
      } else if (height <= 0) {
         throw new IllegalArgumentException("height must be > 0");
      } else {
         this.x = x;
         this.y = y;
         this.width = width;
         this.height = height;
      }
   }

   public int i() {
      return this.width;
   }

   public int u() {
      return this.y;
   }

   public int y() {
      return this.y + this.height;
   }

   public int N() {
      return this.x + this.width;
   }

   public int R() {
      return this.height;
   }
}
