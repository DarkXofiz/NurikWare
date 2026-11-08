package NurikWare;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00490;
import minecraft.class00518;
import minecraft.class01762;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class06683;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public class class10640 implements class01765 {
   public boolean L() {
      return this.N.L();
   }

   public class10640(class06683 var1, class00490 var2, boolean var3, MutableBoolean var4, class00518 var5, class01766 var6) {
      super();
      this.R = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
      this.i = var6;
   }

   private void B() {
      this.R.N(this.i, this.u, this.N);
      this.L.setFalse();
   }

   public void i() {
      this.N(true);
   }

   public void u() {
      this.N(false);
   }

   @Nullable
   public class00392 y() {
      return this.N.u();
   }

   public void N(@Nullable class01762 var1) {
      this.N.N(var1);
      this.B();
   }

   private void N(boolean var1) {
      this.N.N(var1);
      if (this.L.isTrue()) {
         this.B();
      }

      this.R.u(this.i, this.u);
   }

   public void N(@Nullable class00392 var1) {
      if (this.L.isTrue() || !Objects.equals(var1, this.N.u())) {
         this.N.N(var1);
         this.B();
      }
   }

   public void N(int var1) {
      if (!this.y) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         boolean flag = this.L.isTrue();
         if (this.u.R()) {
            class00392 class00392 = this.i.method_5476();
            if (class00392 != null && !class00392.equals(this.N.u())) {
               this.N.N(class00392);
               flag = true;
            }
         }

         if (var1 != this.N.y()) {
            this.N.N(var1);
            flag = true;
         }

         if (flag) {
            this.B();
         }
      }
   }

   public int N() {
      return this.N.y();
   }
}
