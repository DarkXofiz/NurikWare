package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;

public interface class09809 {
   default <T> T L(String var1, Supplier<T> var2) {
      return this.N(var1, var2, (var0, var1x) -> !Objects.equals(var0, var1x));
   }

   default <T extends class09819> T u(String var1, Supplier<T> var2) {
      return this.y(var1, var2, class09783.WHILE_MOUNTED);
   }

   <T> class09785<T> y(String var1, T var2);

   <T> class09785<T> y(String var1, Supplier<T> var2);

   default <T extends class09819> T y(String var1, Supplier<T> var2, class09783 var3) {
      throw new UnsupportedOperationException("Ticker state is not supported by this UiScope");
   }

   <T> T N(String var1, Supplier<T> var2, class09805<T> var3);

   void N(String var1);

   <P> class09798 N(String var1, class09788<P> var2, P var3);

   <T> class09785<T> N(String var1, T var2);

   <T> class09785<T> N(String var1, T var2, class09783 var3);

   <T> class09785<T> N(String var1, Supplier<T> var2);

   <T> class09785<T> N(String var1, Supplier<T> var2, class09783 var3);

   <T> T N(class09804<T> var1);

   <T> class09798 N(class09804<T> var1, T var2, Supplier<class09798> var3);
}
