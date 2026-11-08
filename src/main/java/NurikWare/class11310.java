package NurikWare;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class class11310 extends class05362 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public class11310(int var1, int var2, int var3, int var4, class01894 var5, int var6, int var7, class05361 var8) {
      super(var1, var2, var3, var4, class00392.i(), var8, field_40754);
      this.R();
      this.N_0 = var5;
      this.N_1 = var6;
      this.N_2 = var7;
   }

   private void R() {
      this.N_1 = 0;
      this.N_2 = 0;
   }

   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      this.R();
      this.method_75794(var1);
      int i = (Integer)this.N_1 / 2;
      int j = (Integer)this.N_2 / 2;
      int k = this.method_46426() + (this.field_22758 - i) / 2;
      int l = this.method_46427() + (this.field_22759 - j) / 2;
      var1.N(class08394.Na, (class01894)this.N_0, k, l, 0.0F, 0.0F, i, j, (Integer)this.N_1, (Integer)this.N_2, (Integer)this.N_1, (Integer)this.N_2, -1);
   }
}
