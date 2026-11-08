package NurikWare;

public record class09902(String text, float x, float y, int color, float fontSize, class09838 fontSpec) implements class09924 {
   public float L() {
      return this.y;
   }

   public class09902(String text, float x, float y, int color, float fontSize, class09838 fontSpec) {
      super();
      this.text = text;
      this.x = x;
      this.y = y;
      this.color = color;
      this.fontSize = fontSize;
      this.fontSpec = fontSpec;
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
