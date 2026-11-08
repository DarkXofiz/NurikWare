package NurikWare;

import minecraft.class00147;
import minecraft.class00161;
import minecraft.class00176;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public class class09174 implements class00161 {
   private final class00147 y;
   @Nullable
   private class06584 L = null;
   @Nullable
   private class00176 u = null;

   public class09174(class00147 var1) {
      super();
      this.y = var1;
   }

   public boolean y(class06584 var1) {
      if (this.L != null) {
         return class06584.N(this.L, var1);
      } else if (this.u != null && this.u.N(var1, this.y)) {
         this.L = var1.t();
         return true;
      } else {
         return false;
      }
   }

   public void N(class09174 var1) {
      this.L = var1.L;
      this.u = var1.u;
   }

   public void N(class00176 var1) {
      this.L = null;
      this.u = var1;
   }

   public void N(class06584 var1) {
      this.L = var1.t();
      this.u = null;
   }
}
