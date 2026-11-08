package NurikWare;

import minecraft.class00681;

@class11080(
   L = "SeeInvisible",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class SeeInvisible extends class11067 {
   public Object L_0;

   public SeeInvisible() {
      super();
      this.m();
      this.L_0 = class11524.N(this, "opacity", 0.5F, 0.1F, 1.0F, 0.1F);
   }

   private void m() {
   }

   @class11782
   public void N(class10986 var1) {
      this.m();
      var1.y(class11300.y(255, (int)(255.0F * ((class11504)this.L_0).i())));
   }

   @class11782
   public void N(class10988 var1) {
      if (!(var1.N() instanceof class00681)) {
         var1.N(false);
      }
   }
}
