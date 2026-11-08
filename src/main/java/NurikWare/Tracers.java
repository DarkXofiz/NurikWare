package NurikWare;

import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import org.joml.Matrix4f;

@class11080(
   L = "Tracers",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class Tracers extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   public Tracers() {
      super();
      this.s();
      this.L_0 = new Matrix4f();
      this.L_1 = new class11414(this, "players", true);
      this.L_2 = new class11437(this, "friends", true);
      this.L_3 = class11524.y(this, "entities", (class11414)this.L_1, (class11437)this.L_2);
      this.L_4 = new Matrix4f();

      for (class11419 class11419 : ((class11523)this.L_3).L()) {
         if (class11419 instanceof class11801) {
            class11419.N(this);
         }
      }
   }

   private void s() {
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class09321 var1) {
      this.s();
      class11184 class11184 = ((class11174)class11190.N_2).R();
      class06889 class06889 = var1.y().y();
      Matrix4f matrix4f = var1.L().L().N().invert((Matrix4f)this.L_4);
      Matrix4f matrix4f1 = var1.N().invert((Matrix4f)this.L_0).mul(matrix4f);

      for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3).M()) {
         if (class07049 != (class04453)((class06202)super.y_0).T_4) {
            for (int i = 0; i < ((List)((class11523)this.L_3).i()).size(); i++) {
               class11419 class11419 = (class11419)((List)((class11523)this.L_3).i()).get(i);
               if (class11419.test(class07049)) {
                  int j = class11419.N();
                  class11184.N(matrix4f1, 0.0F, 0.0F, -1.0F)
                     .N(
                        var1.R(),
                        (float)(class11925.i(class07049) - class06889.M),
                        (float)(class11925.u(class07049) - class06889.B),
                        (float)(class11925.L(class07049) - class06889.Z)
                     )
                     .y(j)
                     .y(j)
                     .N(0.0F)
                     .y();
               }
            }
         }
      }
   }
}
