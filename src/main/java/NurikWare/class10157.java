package NurikWare;

import minecraft.class00500;
import minecraft.class03182;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class06202;
import minecraft.class06898;
import minecraft.class07105;
import minecraft.class07204;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class10157 implements class04417<class07105> {
   private final class06143 N;

   public class10157(class06143 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   public class04406 method_3090(
      class07105 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class00500 class00500 = var1.N();
      if (!class00500.P() && class00500.b() == class06898.field_11455) {
         return null;
      } else {
         class07209 class07209 = class07209.method_49637(var3, var5, var7);
         int i = class06202.Nq().d().N(class00500, var2, class07209);
         if (class00500.i() instanceof class07204) {
            i = ((class07204)class00500.i()).N(class00500, var2, class07209);
         }

         float f = (i >> 16 & 0xFF) / 255.0F;
         float f1 = (i >> 8 & 0xFF) / 255.0F;
         float f2 = (i & 0xFF) / 255.0F;
         return new class03182(var2, var3, var5, var7, f, f1, f2, this.N);
      }
   }
}
