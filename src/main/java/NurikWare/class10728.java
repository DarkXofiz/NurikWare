package NurikWare;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07218;

public class class10728 extends AbstractIterator<class07209> {
   private final class07218 M;
   private int B;

   public class10728(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = new class07218();
   }

   protected class07209 computeNext() {
      if (this.B == this.N) {
         return (class07209)this.endOfData();
      } else {
         int ix = this.B % this.y;
         int j = this.B / this.y;
         int k = j % this.L;
         int l = j / this.L;
         this.B++;
         return this.M.N(this.u + ix, this.i + k, this.R + l);
      }
   }
}
