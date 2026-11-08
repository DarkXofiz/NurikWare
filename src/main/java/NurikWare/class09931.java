package NurikWare;

public record class09931(String text, float x, float y, int color, float fontSize, class09838 fontSpec, int outlineColor, float outlineWidth)
   implements class09924 {
   public float L() {
      return this.y;
   }

   public int M() {
      return this.outlineColor;
   }


   public float B() {
      return this.outlineWidth;
   }

   public float i() {
      return this.fontSize;
   }

   public int u() {
      return this.color;
   }

   public float y() {
      return this.x;
   }

   public String N() {
      return this.text;
   }

   public class09838 R() {
      return this.fontSpec;
   }
}
