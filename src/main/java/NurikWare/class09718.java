package NurikWare;

public record class09718(double ascent, double descent, double lineHeight) {
   public double L() {
      return this.lineHeight;
   }


   public double y() {
      return this.descent;
   }

   public double N() {
      return this.ascent;
   }
}
