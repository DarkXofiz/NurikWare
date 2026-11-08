package NurikWare;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01858;
import minecraft.class01883;
import minecraft.class05341;
import minecraft.class05361;
import org.jspecify.annotations.Nullable;

public class class09536 extends class01858 {
   public class09536(
      int var1, int var2, class00392 var3, int var4, int var5, class01883 var6, class05361 var7, @Nullable class00392 var8, @Nullable class05341 var9
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      this.method_75794(var1);
      int i = this.method_46426() + 2;
      int j = this.method_46426() + this.method_25368() - this.y - 4;
      int k = this.method_46426() + this.method_25368() / 2;
      var1.N(this, class01065.field_63850).N(this.method_25369(), k, i, j, this.method_46427(), this.method_46427() + this.method_25364());
      int l = this.method_46426() + this.method_25368() - this.y - 2;
      int i1 = this.method_46427() + this.method_25364() / 2 - this.L / 2;
      this.N(var1, l, i1);
   }
}
