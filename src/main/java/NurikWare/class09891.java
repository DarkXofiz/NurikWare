package NurikWare;

public record class09891(class09938 renderer, float x, float y, float width, float height) implements class09924 {
   public float L() {
      return this.y;
   }

   public class09891(class09938 renderer, float x, float y, float width, float height) {
      super();
      this.renderer = renderer;
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public float i() {
      return this.height;
   }

   public float u() {
      return this.width;
   }

   public float y() {
      return this.x;
   }

   public class09938 N() {
      return this.renderer;
   }
}
