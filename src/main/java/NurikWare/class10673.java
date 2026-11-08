package NurikWare;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class06738;

public class class10673 extends class06738 {
   private final class01686 L;
   private final class01686 u;

   public class10673(class01686 var1) {
      super(var1);
      this.L = var1.y("root");
      this.u = this.L.y("shell");
   }

   public static class04806 N() {
      class04792 class04792 = L();
      class04792.N()
         .N("root", class04822.L(), class04838.N(0.0F, 29.0F, -6.0F))
         .N("shell", class04822.L().N(0, 0).N(-7.0F, -10.0F, -7.0F, 14.0F, 10.0F, 16.0F, new class04834(0.2F)), class04838.N(0.0F, -13.0F, 5.0F));
      return class04806.N(class04792, 128, 128);
   }
}
