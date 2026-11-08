package NurikWare;

public record class09906(String textureRef, float x, float y, float width, float height, int color, class09689 uv) implements class09924 {
   public float L() {
      return this.y;
   }

   public class09689 M() {
      return this.uv;
   }

   public class09906(String var1, float var2, float var3, float var4, float var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, class09689.N);
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

   public String N() {
      return this.textureRef;
   }

   public int R() {
      return this.color;
   }
}
