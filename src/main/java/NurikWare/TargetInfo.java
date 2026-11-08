package NurikWare;

@class11080(
   L = "TargetInfo",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class TargetInfo extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public class11507 P() {
      this.T();
      return (class11507)this.L_0;
   }

   private void T() {
   }

   public TargetInfo() {
      super();
      this.T();
      this.L_0 = class11524.N(this, "show-from-mouse", false);
      this.L_1 = class11524.N(this, "show-armor-details", true);
      this.L_2 = class11524.N(this, "show-absorption", true);
   }

   @Override
   public boolean Z() {
      class11938.i().N();
      return super.Z();
   }

   @Override
   public boolean i() {
      class11938.i().N();
      return super.i();
   }

   public class11507 s() {
      this.T();
      return (class11507)this.L_1;
   }

   public class11507 m() {
      this.T();
      return (class11507)this.L_2;
   }

   @class11782
   public void N(class11374 var1) {
      if (class11938.i() != null) {
         class11938.i().N();
      }
   }
}
