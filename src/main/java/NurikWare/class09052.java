package NurikWare;

import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04453;
import minecraft.class04909;
import minecraft.class04911;

public class class09052 extends class00155 {
   public static final int m = 40;
   private final class04453 P;
   private int s;

   public void P() {
      if (!this.P.method_31481() && this.s >= 0) {
         if (this.P.method_5869()) {
            this.s++;
         } else {
            this.s -= 2;
         }

         this.s = Math.min(this.s, 40);
         this.u = Math.max(0.0F, Math.min(this.s / 40.0F, 1.0F));
      } else {
         this.y();
      }
   }

   public class09052(class04453 var1) {
      super(class04909.w, class04911.field_15256, class00044.v());
      this.P = var1;
      this.Z = true;
      this.z = 0;
      this.u = 1.0F;
      this.E = true;
   }
}
