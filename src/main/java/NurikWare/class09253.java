package NurikWare;

public non-sealed record class09253(int outcome, String presetName, String creator) implements class09282 {

   public int L() {
      return this.outcome;
   }

   public class09253(int outcome, String presetName, String creator) {
      super();
      this.outcome = outcome;
      this.presetName = presetName;
      this.creator = creator;
   }

   public String y() {
      return this.creator;
   }

   public static class09253 y(class11940 var0) {
      return new class09253(var0.R(), var0.P(), var0.P());
   }

   private int N(short var1) {
      return var1 < 16 && this.outcome == class11794.UPDATED.N() ? class11794.ALREADY_ACTIVATED.N() : this.outcome;
   }

   public String N() {
      return this.presetName;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.N(var1.z()));
      var1.N(this.presetName);
      var1.N(this.creator);
   }
}
