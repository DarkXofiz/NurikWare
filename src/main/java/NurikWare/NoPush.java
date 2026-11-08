package NurikWare;

@class11080(
   L = "NoPush",
   y = class11072.MOVEMENT,
   N = class11106.TOOLS
)
public class NoPush extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;

   public NoPush() {
      super();
      this.b();
      this.L_0 = new class10932("entity-push", true);
      this.L_1 = new class10932("block-push", true);
      this.L_2 = new class10897("fishing-rod", true);
      this.L_3 = class11524.y(this, "apply-to", (class10932)this.L_0, (class10932)this.L_1, (class10897)this.L_2);
   }

   private void b() {
   }

   @class11782
   public void N(class09319 var1) {
      this.b();
      ((class10932)this.L_1).y(var1);
   }

   @class11782
   public void N(class09348 var1) {
      this.b();
      ((class10932)this.L_0).y(var1);
   }

   @class11782
   public void N(class10990 var1) {
      this.b();
      ((class10897)this.L_2).y(var1);
   }
}
