package NurikWare;

@class11080(
   L = "NoSlow",
   y = class11072.MOVEMENT,
   N = class11106.BASE
)
public class NoSlow extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public NoSlow() {
      super();
      this.m();
      this.L_0 = new class10922(this, "vanilla", true);
      this.L_1 = new class10934(this, "spooky-time-duels", false);
      this.L_2 = class11524.N(this, "mode", (class10922)this.L_0, (class10934)this.L_1);
   }

   private void m() {
   }

   @class11782
   public void N(class11354 var1) {
      this.m();
      ((class10915)((class11517)this.L_2).i()).y(var1);
   }

   @class11782
   public void N(class10971 var1) {
      this.m();
      ((class10915)((class11517)this.L_2).i()).y(var1);
   }

   @class11782
   public void N(class10996 var1) {
      this.m();
      ((class10915)((class11517)this.L_2).i()).y(var1);
   }
}
