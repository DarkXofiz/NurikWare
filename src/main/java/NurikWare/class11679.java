package NurikWare;

import java.util.Comparator;
import java.util.stream.Stream;

public class class11679 extends class11535 {
   public Object N_0;

   private void L() {
   }

   public class11679(String var1, boolean var2, class11328 var3) {
      super(var1, var2);
      this.L();
      this.N_0 = var3;
   }

   static {
      N();
   }

   private static void N() {
   }

   public int N(Stream<class11297> var1) {
      return var1.sorted(Comparator.comparingInt(var0 -> var0.N().I() ? 0 : 1)).filter(var1x -> {
         this.L();
         return ((class11328)this.N_0).test(var1x.N());
      }).map(class11297::y).findFirst().orElse(-1);
   }
}
