package NurikWare;

@class11080(
   L = "WallClimb",
   y = class11072.MOVEMENT,
   N = class11106.BASE
)
public class WallClimb extends class11067 {
   public Object L_0;

   public WallClimb() {
      super();
      this.m();
      this.L_0 = class11524.N(this, "mode", new class10895(this, "block", true));
   }

   private void m() {
   }

   @Override
   public void y() {
      this.m();
      ((class11807)((class11517)this.L_0).i()).y(this);
      super.y();
   }

   @class11782
   public void N(class10992 var1) {
      this.m();
      ((class11807)((class11517)this.L_0).i()).y(var1);
   }
}
