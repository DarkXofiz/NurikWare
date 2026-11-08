package NurikWare;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11535 {
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public boolean R_init;

   public void M(boolean var1) {
      this.R_3 = var1;
      ((Consumer)this.R_2).accept(this);
   }

   public class11535(String var1, boolean var2, Consumer<class11535> var3) {
      super();
      this.u();
      this.R_4 = (Supplier<>)() -> null;
      this.R_0 = class12033.y(var1);
      this.R_1 = var2;
      this.R_3 = var2;
      this.R_2 = var3;
   }

   public class11535(String var1, boolean var2) {
      this(var1, var2, var0 -> {});
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         class11535 class11535 = (class11535)var1;
         return Objects.equals(((class12018)this.R_0).N(), ((class12018)class11535.R_0).N());
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return ((class12018)this.R_0).N();
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((class12018)this.R_0).N());
   }

   public Consumer<class11535> Z() {
      return (Consumer<class11535>)this.R_2;
   }

   public boolean U() {
      Boolean obool = (Boolean)((Supplier)this.R_4).get();
      return obool != null ? obool : (Boolean)this.R_3;
   }

   public boolean z() {
      return (Boolean)this.R_1;
   }

   private void u() {
      if (!this.R_init) {
         this.R_init = true;
         this.R_1 = false;
         this.R_3 = false;
      }
   }

   public class12018 E() {
      return (class12018)this.R_0;
   }

   public void N_5(Supplier<Boolean> var1) {
      this.R_4 = var1;
   }

   public void b_() {
      this.M(!(Boolean)this.R_3);
   }
}
