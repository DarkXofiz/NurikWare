package NurikWare;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11206<C> {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   public class11206<C> L(Supplier<class08066> var1) {
      return this.L(var1, true);
   }

   public class11206<C> L(Supplier<class08066> var1, boolean var2) {
      ((class11194)this.N_1).N(new class11186(var1, var2));
      return this;
   }

   public class11206<C> L(class09064 var1) {
      return this.N(33984, var1);
   }

   class11206(class11187<C> var1, class11194<C> var2) {
      super();
      this.L();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public class11206<C> y(class09064 var1, boolean var2) {
      ((class11194)this.N_1).N(new class11182(var1, var2));
      return this;
   }

   public class11187<C> y_1(Supplier<class08066> var1) {
      return ((class11187)this.N_0).N(var1);
   }

   public class11206<C> y(Supplier<class08066> var1, boolean var2) {
      ((class11194)this.N_1).N(new class11186(var1, var2));
      ((class11194)this.N_1).y(true);
      return this;
   }

   public class11206<C> y(class09064 var1) {
      return this.N(var1, true);
   }

   public class11206<C> y(class11173<C> var1) {
      ((class11194)this.N_1).y(var1);
      return this;
   }

   public class11206<C> N(class11192<C> var1) {
      return ((class11187)this.N_0).N(var1);
   }

   public class11206<C> N_3(class11173<C> var1) {
      ((class11194)this.N_1).N(var1);
      return this;
   }

   public class11206<C> N(class09064 var1) {
      return this.y(var1, true);
   }

   public class11206<C> N_4(Supplier<class08066> var1) {
      return this.y(var1, true);
   }

   public class11206<C> N(class09064 var1, boolean var2) {
      ((class11194)this.N_1).N(new class11182(var1, var2));
      ((class11194)this.N_1).y(true);
      return this;
   }

   public class11187<C> N(Supplier<class08066> var1, boolean var2) {
      return ((class11187)this.N_0).N(var1, var2);
   }

   public class11206<C> N(int var1, IntSupplier var2) {
      ((class11194)this.N_1).N(new class11189(var1, var2));
      return this;
   }

   public class11206<C> N(int var1, class09064 var2) {
      ((class11194)this.N_1).N(new class11205(var1, var2));
      return this;
   }

   public class11206<C> N(IntSupplier var1) {
      return this.N(33984, var1);
   }

   public class11218<C> N() {
      return ((class11187)this.N_0).N();
   }
}
