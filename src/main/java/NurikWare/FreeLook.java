package NurikWare;

import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import org.joml.Vector2f;

@class11080(
   L = "FreeLook",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class FreeLook extends class11067 {
   public Object L_0;
   public Object L_1;

   public FreeLook() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "pov", new class11268("back", true), new class11260("front", false), new class11252("nothing", false));
      this.L_1 = new Vector2f(0.0F, 0.0F);
   }

   @Override
   public boolean Z() {
      this.b();
      class05363 class05363 = ((class03386)((class06202)super.y_0).i_5).s();
      this.L_1 = new Vector2f(class05363.R(), class05363.i());
      return super.Z();
   }

   private void b() {
   }

   @class11782
   public void N(class10976 var1) {
      this.b();
      ((class11787)((class11517)this.L_0).i()).y(var1);
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11384 var1) {
      this.b();
      ((Vector2f)this.L_1).x = ((Vector2f)this.L_1).x + (float)var1.u() * 0.15F;
      ((Vector2f)this.L_1).y = ((Vector2f)this.L_1).y + (float)var1.L() * 0.15F;
      var1.N();
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class09316 var1) {
      this.b();
      var1.N(((Vector2f)this.L_1).x);
      var1.y(((Vector2f)this.L_1).y);
   }
}
