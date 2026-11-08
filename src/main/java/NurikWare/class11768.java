package NurikWare;

public record class11768(String text, String family, class09079 weight, boolean italic, float fontSize, float uiScale) {

   public class09079 L() {
      return this.weight;
   }

   class11768(String text, String family, class09079 weight, boolean italic, float fontSize, float uiScale) {
      super();
      this.text = text;
      this.family = family;
      this.weight = weight;
      this.italic = italic;
      this.fontSize = fontSize;
      this.uiScale = uiScale;
   }

   public float i() {
      return this.uiScale;
   }

   public boolean u() {
      return this.italic;
   }

   public String y() {
      return this.text;
   }

   public float N() {
      return this.fontSize;
   }

   public String R() {
      return this.family;
   }
}
