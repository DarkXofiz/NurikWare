package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;

final class class09845 implements class09809 {
   private final class09879 N;
   private final class09874 y;

   class09845(class09879 var1, class09874 var2) {
      super();
      this.N = Objects.requireNonNull(var1, "stateStore");
      this.y = Objects.requireNonNull(var2, "path");
   }

   @Override
   public <T extends class09819> T u(String var1, Supplier<T> var2) {
      return this.y(var1, var2, class09783.WHILE_MOUNTED);
   }

   @Override
   public <T> class09785<T> y(String var1, T var2) {
      return this.y(var1, () -> (T)var2);
   }

   @Override
   public <T> class09785<T> y(String var1, Supplier<T> var2) {
      return this.N.N(var1, var2);
   }

   @Override
   public <T extends class09819> T y(String var1, Supplier<T> var2, class09783 var3) {
      return this.N.y(this.y, var1, var2, var3);
   }

   @Override
   public <T> class09785<T> N(String var1, T var2) {
      return this.N(var1, (T)var2, class09783.WHILE_MOUNTED);
   }

   @Override
   public <C> class09798 N(String var1, class09788<C> var2, C var3) {
      return this.N.N(this.y, var1, var2, var3);
   }

   @Override
   public void N(String var1) {
      this.N.N(this.y, var1);
   }

   @Override
   public <T> class09798 N(class09804<T> var1, T var2, Supplier<class09798> var3) {
      return this.N.N(var1, var2, var3);
   }

   @Override
   public <T> class09785<T> N(String var1, Supplier<T> var2, class09783 var3) {
      return this.N.N(this.y, var1, var2, var3);
   }

   @Override
   public <T> T N(class09804<T> var1) {
      return this.N.N(var1);
   }

   @Override
   public <T> class09785<T> N(String var1, Supplier<T> var2) {
      return this.N(var1, var2, class09783.WHILE_MOUNTED);
   }

   @Override
   public <T> T N(String var1, Supplier<T> var2, class09805<T> var3) {
      return this.N.N(this.y, var1, var2, var3);
   }

   @Override
   public <T> class09785<T> N(String var1, T var2, class09783 var3) {
      return this.N(var1, () -> (T)var2, var3);
   }
}
