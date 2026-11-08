package NurikWare;

import java.util.Objects;

public final class class09920 {
   private final class09972 N;

   class09920(class09781 var1) {
      super();
      this.N = new class09972(Objects.requireNonNull(var1, "context"));
   }

   public class09936 N(class10021 var1, float var2, float var3, class09770 var4, boolean var5) {
      return this.N.N(var1, var2, var3, var4, var5);
   }

   public static class09920 N(class09781 var0) {
      class09781 class09781 = Objects.requireNonNull(var0, "context");
      return class09781.N(class09920.class).orElseGet(() -> {
         class09920 class09920 = new class09920(class09781);
         class09781.N(class09920.class, class09920);
         return class09920;
      });
   }

   public class09936 N(class10021 var1, float var2, float var3) {
      return this.N.N(var1, var2, var3);
   }
}
