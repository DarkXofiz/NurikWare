package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11187<C> {
   public Object N_0;
   public Object N_1;

   class11187(class09065 var1) {
      super();
      this.y();
      this.N_0 = new ArrayList();
      this.N_1 = var1;
   }

   private void y() {
   }

   public class11187<C> N(Supplier<class08066> var1, boolean var2) {
      ((List)this.N_0).add(new class11214(var1, var2));
      return this;
   }

   public class11206<C> N(class11192<C> var1) {
      class11194 class11194 = new class11194(var1);
      ((List)this.N_0).add(class11194);
      return new class11206<>(this, class11194);
   }

   public class11187<C> N(Supplier<class08066> var1) {
      return this.N(var1, true);
   }

   public class11218<C> N() {
      ((List)this.N_0).forEach(class11171::N);
      return new class11218<>(List.copyOf((List)this.N_0), (class09065)this.N_1);
   }
}
