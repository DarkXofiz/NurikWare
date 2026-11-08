package NurikWare;

import minecraft.class03448;
import minecraft.class04651;
import minecraft.class07126;
import minecraft.class08388;

public class class10173 extends class10172 {
   protected final class07126 y;

   @Override
   protected void L() {
      if (this.field_3845) {
         this.method_3085();
         this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
      }
   }

   public class10173(class03448 var1, double var2, double var4, double var6, class04651 var8, class07126 var9, class08388 var10) {
      super(var1, var2, var4, var6, var8, var10);
      this.field_3847 = (int)(64.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.y = var9;
   }
}
