package NurikWare;

import minecraft.class00717;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07049;
import org.joml.Vector4f;

public class class11035 extends class11051<class00717> {
   public class11035(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, class00717 var4) {
      class06584 class06584 = var4.N();
      boolean flag = ((class11535)((EntityESP)super.N_0).Z_0).U() || ((class11535)((EntityESP)super.N_0).Z_2).U();
      boolean flag1 = ((class11535)((EntityESP)super.N_0).Z_1).U() || ((class11535)((EntityESP)super.N_0).Z_2).U();
      boolean flag2 = class06584.y().method_58694(class02484.B) != null;
      if (flag) {
         super.N(var1, var2, var3, var4);
      }

      if (flag1 && (!flag || flag2)) {
         if (flag) {
            var3.y = Math.round(var3.y - 4.0F);
         }

         this.N(var1, var2, var3, var4, this.N(class06584), this.y(var4), this.u(var4));
      }
   }

   public boolean test(class07049 var1) {
      return class11791.M().test(var1);
   }

   public class05216 L(class00717 var1) {
      class06584 class06584 = var1.N();
      class05216 class05216 = class06584.Y().L();
      return class06584.c() <= 1 ? class05216 : class05216.i(class06541.field_1080 + " x" + class06584.c());
   }

   private class05216 N(class06584 var1) {
      class05216 class05216 = var1.k().L().N(var1.O().N());
      return var1.c() <= 1 ? class05216 : class05216.i(class06541.field_1080 + " x" + var1.c());
   }
}
