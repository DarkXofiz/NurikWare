package NurikWare;

@class11080(
   L = "NoVelocity",
   y = class11072.COMBAT,
   N = class11106.FIGHTING
)
public class NoVelocity extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   private void P() {
   }

   public NoVelocity() {
      super();
      this.P();
      this.L_0 = new class11146("jump-reset", true);
      this.L_1 = new class11138("vanilla", false);
      this.L_2 = class11524.N(this, "mode", (class11146)this.L_0, (class11138)this.L_1);

      for (class11535 class11535 : ((class11517)this.L_2).L()) {
         if (class11535 instanceof class11801) {
            ((class11801)class11535).N(this);
         }
      }
   }

   @class11782(
      y = class11777.AFTER,
      L = {SprintReset.class}
   )
   public void N(class11385 var1) {
      this.P();
      ((class11787)((class11517)this.L_2).i()).y(var1);
   }

   @class11782
   public void N(class11387 var1) {
      this.P();
      ((class11787)((class11517)this.L_2).i()).y(var1);
   }

   @class11782
   public void N(class10990 var1) {
      this.P();
      ((class11787)((class11517)this.L_2).i()).y(var1);
   }
}
