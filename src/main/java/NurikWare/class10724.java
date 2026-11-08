package NurikWare;

import minecraft.class03556;
import minecraft.class06069;
import minecraft.class07047;
import minecraft.class07084;
import minecraft.class07446;
import org.jspecify.annotations.Nullable;

public class class10724 implements class07446 {
   @Nullable
   public class03556<class07084> N;

   public class10724() {
      super();
   }

   public void N(class06069 var1) {
      int i = var1.y(5);
      if (i <= 1) {
         this.N = class07047.N;
      } else if (i <= 2) {
         this.N = class07047.i;
      } else if (i <= 3) {
         this.N = class07047.z;
      } else if (i <= 4) {
         this.N = class07047.m;
      }
   }
}
