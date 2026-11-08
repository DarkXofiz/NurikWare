package NurikWare;

import com.google.common.collect.AbstractIterator;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;

public class class10731 extends AbstractIterator<class07209> {
   final class07218 N;
   int y;

   public class10731(int var1, int var2, class06069 var3, int var4, int var5, int var6, int var7, int var8) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.N = new class07218();
      this.y = this.L;
   }

   protected class07209 computeNext() {
      if (this.y <= 0) {
         return (class07209)this.endOfData();
      } else {
         class07218 class07218 = this.N.N(this.u + this.i.y(this.R), this.M + this.i.y(this.B), this.Z + this.i.y(this.z));
         this.y--;
         return class07218;
      }
   }
}
