package NurikWare;

import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06202;

@class11080(
   L = "ScreenWalk",
   y = class11072.MOVEMENT,
   N = class11106.BASE
)
public class ScreenWalk extends class11067 {
   public Object L_0;

   private void P() {
   }

   public ScreenWalk() {
      super();
      this.P();
      this.L_0 = (class11517)class11524.N(
            this,
            "mode",
            new class10903("ft", false, new class12024()),
            new class10903("matrix", false, new class12032()),
            new class10903("hw", false, new class12000()),
            new class10903("spooky", false, new class12034()),
            new class10903("vanilla", true, (class12001)class12029.y_0)
         )
         .N_6((var1, var2) -> this.N(var2));
   }

   @Override
   public boolean Z() {
      this.P();
      class11938.m().N((class12001)((class10903)((class11517)this.L_0).i()).N_0);
      return super.Z();
   }

   @Override
   public boolean i() {
      class11938.m().N((class12001)class12029.y_0);
      return super.i();
   }

   private void N(class10903 var1) {
      if (this.U()) {
         class11938.m().N((class12001)var1.N_0);
      }
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11385 var1) {
      if ((class05096)((class06202)super.y_0).v_3 != null && !class11902.y()) {
         var1.B(class11902.N(((class05630)((class06202)super.y_0).i_7).n.N.y()));
         var1.u(class11902.N(((class05630)((class06202)super.y_0).i_7).G.N.y()));
         var1.R(class11902.N(((class05630)((class06202)super.y_0).i_7).l.N.y()));
         var1.L(class11902.N(((class05630)((class06202)super.y_0).i_7).t.N.y()));
         var1.i(class11902.N(((class05630)((class06202)super.y_0).i_7).d.N.y()));
         var1.M(class11902.N(((class05630)((class06202)super.y_0).i_7).k.N.y()));
      }
   }
}
