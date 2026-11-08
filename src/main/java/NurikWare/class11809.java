package NurikWare;

import java.util.function.Predicate;
import minecraft.class07049;

public class class11809<T extends class07049> extends class11535 implements Predicate<T> {
   public Object N_0;

   private void L() {
   }

   public class11809(Predicate<T> var1, String var2, boolean var3) {
      super(var2, var3);
      this.L();
      this.N_0 = var1;
   }

   public boolean test(T var1) {
      this.L();
      return !this.U() ? false : ((Predicate)this.N_0).test(var1);
   }
}
