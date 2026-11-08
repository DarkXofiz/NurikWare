package NurikWare;

import java.util.List;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;

@class11080(
   L = "TapeMouse",
   y = class11072.COMBAT,
   N = class11106.TOOLS
)
public class TapeMouse extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   private void P() {
   }

   public TapeMouse() {
      super();
      this.P();
      this.L_0 = new class11154("left-mouse", true, "left-mouse-delay-sec", ((class06202)super.y_0)::NF);
      this.L_1 = new class11154("right-mouse", false, "right-mouse-delay-sec", ((class06202)super.y_0)::yn);
      this.L_2 = class11524.y(this, "mouse-buttons", (class11154)this.L_0, (class11154)this.L_1);
      ((class11523)this.L_2).L().forEach(var1 -> var1.N(this));
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class11380 var1) {
      this.P();
      if ((class04453)((class06202)super.y_0).T_4 != null
         && !((class04453)((class06202)super.y_0).T_4).method_6115()
         && (class05096)((class06202)super.y_0).v_3 == null) {
         ((List)((class11523)this.L_2).i()).forEach(var1x -> var1x.N(var1));
      }
   }
}
