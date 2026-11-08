package NurikWare;

@class11080(
   L = "Flight",
   y = class11072.MOVEMENT,
   N = class11106.BASE
)
public class Flight extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;

   public Flight() {
      super();
      this.m();
      this.L_0 = new class10931(this, "multi-jump", true);
      this.L_1 = new class10892(this, "vanilla", false);
      this.L_2 = new class10925(this, "motion", false);
      this.L_3 = class11524.N(this, "mode", (class11807)this.L_0, (class11807)this.L_1, (class11807)this.L_2);

      for (class11535 class11535 : ((class11517)this.L_3).L()) {
         if (class11535 instanceof class11801) {
            ((class11801)class11535).N(this);
         }
      }
   }

   private void m() {
   }

   @class11782
   public void N(class11385 var1) {
      this.m();
      ((class11807)((class11517)this.L_3).i()).y(var1);
   }

   @class11782
   public void N(class10990 var1) {
      this.m();
      ((class11807)((class11517)this.L_3).i()).y(var1);
   }

   @class11782
   public void N(class11370 var1) {
      this.m();
      ((class11807)((class11517)this.L_3).i()).y(var1);
   }

   @class11782
   public void N(class10996 var1) {
      this.m();
      ((class11807)((class11517)this.L_3).i()).y(var1);
   }
}
