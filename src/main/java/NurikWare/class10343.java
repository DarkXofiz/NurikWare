package NurikWare;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03794;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class10343 implements class10340 {
   private final class07209 N;
   private final class00891 y;
   @Nullable
   private class02733 L;
   @Nullable
   private final class07211 u;
   private int i = 0;

   public class10343(class07209 var1, class00891 var2, @Nullable class02733 var3, @Nullable class07211 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      if (class04376.N[this.i] == var4) {
         this.i++;
      }
   }

   @Override
   public boolean N(class07299 var1) {
      class07211 class07211 = class04376.N[this.i++];
      class07209 class07209 = this.N.method_10093(class07211);
      class00500 class00500 = var1.method_8320(class07209);
      class02733 class02733 = null;
      if (var1.method_45162().y(class03794.L)) {
         if (this.L == null) {
            this.L = class02752.N(var1, this.u == null ? null : this.u.b(), null);
         }

         class02733 = this.L.y(class07211);
      }

      class04376.N(var1, class00500, class07209, this.y, class02733, false);
      if (this.i < class04376.N.length && class04376.N[this.i] == this.u) {
         this.i++;
      }

      return this.i < class04376.N.length;
   }

   @Override
   public void N(Consumer<class07209> var1) {
      for (class07211 class07211 : class04376.N) {
         if (class07211 != this.u) {
            class07209 class07209 = this.N.method_10093(class07211);
            var1.accept(class07209);
         }
      }
   }
}
