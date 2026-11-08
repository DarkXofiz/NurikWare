package NurikWare;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class class11320 extends class05362 {
   private static String[] y;
   public Object N_0;

   public class11320(int var1, int var2, int var3, int var4, class01894 var5, class05361 var6) {
      super(var1, var2, var3, var4, class00392.y(y[0]), var6, field_40754);
      this.y();
      this.N_0 = var5;
   }

   static {
      R();
   }

   private void y() {
   }

   private static void R() {
      y = new String[1];
      y[0] = "";
   }

   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      this.y();
      var1.N(class08394.Na, (class01894)this.N_0, this.method_46426(), this.method_46427(), 0.0F, 0.0F, this.field_22758, this.field_22759, 16, 16, -1);
   }
}
