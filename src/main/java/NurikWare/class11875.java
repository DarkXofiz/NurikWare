package NurikWare;

import java.util.function.BooleanSupplier;

public record class11875(BooleanSupplier checked) implements class11849 {

   public class11875(BooleanSupplier checked) {
      super();
      this.checked = checked;
   }

   @Override
   public class09798 N(class09809 var1, class11834 var2) {
      class11861 class11861 = new class11861(this.checked.getAsBoolean(), var0 -> {});
      return var1.N("notify-switch-" + var2.N(), (class09788<class11861>)class11601.u_0, class11861);
   }

   public BooleanSupplier N() {
      return this.checked;
   }
}
