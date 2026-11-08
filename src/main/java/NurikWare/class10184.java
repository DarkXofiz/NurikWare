package NurikWare;

import minecraft.class03448;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class07126;
import minecraft.class08388;

class class10184 extends class10173 {
   @Override
   protected void L() {
      if (this.field_3845) {
         this.method_3085();
         this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
         class04891 class04891 = this.N() == class04684.i ? class04909.zR : class04909.zM;
         float f = class04995.y(this.field_3840, 0.3F, 1.0F);
         this.field_3851.method_8486(this.field_3874, this.field_3854, this.field_3871, class04891, class04911.field_15245, f, 1.0F, false);
      }
   }

   class10184(class03448 var1, double var2, double var4, double var6, class04651 var8, class07126 var9, class08388 var10) {
      super(var1, var2, var4, var6, var8, var9, var10);
   }
}
