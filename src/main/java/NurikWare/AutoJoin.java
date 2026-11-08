package NurikWare;

@class11080(
   L = "AutoJoin",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoJoin extends class11067 {
   public Object L_0;

   public AutoJoin() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "mode", new class11112(this, "spooky-time-duels", true), new class11158(this, "really-world", false));
      ((class11517)this.L_0).L().forEach(var1 -> {
         if (var1 instanceof class11801) {
            ((class11801)var1).N(this);
         }
      });
   }

   private void b() {
   }

   @Override
   public void y() {
      this.b();
      ((class11517)this.L_0).L().forEach(class11127::N);
   }

   @class11782
   public void N(class10990 var1) {
      this.b();
      ((class11127)((class11517)this.L_0).i()).y(var1);
   }

   @class11782
   public void N(class10996 var1) {
      this.b();
      ((class11127)((class11517)this.L_0).i()).y(var1);
   }
}
