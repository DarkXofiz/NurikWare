package NurikWare;

public record class09062(int width, int height) {

   class09062(int width, int height) {
      super();
      this.width = width;
      this.height = height;
   }

   public int y() {
      return this.height;
   }

   public int N() {
      return this.width;
   }
}
