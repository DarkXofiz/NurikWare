package NurikWare;

import java.util.EnumSet;
import java.util.Iterator;
import minecraft.class00675;
import minecraft.class01328;
import minecraft.class04882;
import minecraft.class07078;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;

public class class10474 extends class07473 {
   private final class04882 y;
   private final float L;
   public final class01328 N = class01328.y().N(8.0).u().i();

   public void L() {
      super.L();
      this.y.f().W();
      Iterator<class04882> iterator = N(this.y).N(class04882.class, this.N, this.y, this.y.method_5829().L(8.0, 8.0, 8.0)).iterator();

      while (iterator.hasNext()) {
         iterator.next().y(this.y.T());
      }
   }

   public class10474(class00675 var1, float var2) {
      super();
      this.y = var1;
      this.L = var2 * var2;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   public boolean B() {
      return true;
   }

   public void i() {
      class07438 class07438 = this.y.T();
      if (class07438 != null) {
         if (this.y.method_5858(class07438) > this.L) {
            this.y.p().N(class07438, 30.0F, 30.0F);
            if (class04882.u(this.y).y(50) == 0) {
               this.y.D();
            }
         } else {
            this.y.R(true);
         }

         super.i();
      }
   }

   public void u() {
      super.u();
      class07438 class07438 = this.y.T();
      if (class07438 != null) {
         for (class04882 class04882 : N(this.y).N(class04882.class, this.N, this.y, this.y.method_5829().L(8.0, 8.0, 8.0))) {
            class04882.y(class07438);
            class04882.R(true);
         }

         this.y.R(true);
      }
   }

   public boolean N() {
      class07438 class07438 = this.y.method_6065();
      return this.y.K() == null
         && class04882.L(this.y)
         && this.y.T() != null
         && !this.y.Nl()
         && (class07438 == null || class07438.method_5864() != class07078.Ly);
   }
}
