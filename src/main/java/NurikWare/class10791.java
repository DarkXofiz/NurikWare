package NurikWare;

import java.util.Collection;
import minecraft.class00381;
import minecraft.class00480;
import minecraft.class00768;
import minecraft.class02265;
import minecraft.class07769;
import minecraft.class07790;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class10791 {
   public final class08036 N;
   private boolean u;
   private int i;
   private int R;
   private int M;
   private int B;
   private boolean Z;
   private int z;
   public int y;

   public class10791(class07769 var1, class08036 var2) {
      super();
      this.L = var1;
      this.u = true;
      this.M = 127;
      this.B = 127;
      this.Z = true;
      this.N = var2;
   }

   public void y() {
      this.Z = true;
   }

   private class07790 N() {
      int ix = this.i;
      int j = this.R;
      int k = this.M + 1 - this.i;
      int l = this.B + 1 - this.R;
      byte[] abyte = new byte[k * l];

      for (int i1 = 0; i1 < k; i1++) {
         for (int j1 = 0; j1 < l; j1++) {
            abyte[i1 + j1 * k] = this.L.B[ix + i1 + (j + j1) * 128];
         }
      }

      return new class07790(ix, j, k, l, abyte);
   }

   public void N(int var1, int var2) {
      if (this.u) {
         this.i = Math.min(this.i, var1);
         this.R = Math.min(this.R, var2);
         this.M = Math.max(this.M, var1);
         this.B = Math.max(this.B, var2);
      } else {
         this.u = true;
         this.i = var1;
         this.R = var2;
         this.M = var1;
         this.B = var2;
      }
   }

   @Nullable
   public class00381<?> N(class02265 var1) {
      class07790 class07790;
      if (this.u) {
         this.u = false;
         class07790 = this.N();
      } else {
         class07790 = null;
      }

      Collection<class00768> collection;
      if (this.Z && this.z++ % 5 == 0) {
         this.Z = false;
         collection = this.L.z.values();
      } else {
         collection = null;
      }

      return collection == null && class07790 == null ? null : new class00480(var1, this.L.M, this.L.Z, collection, class07790);
   }
}
