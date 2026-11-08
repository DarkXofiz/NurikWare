package NurikWare;

import java.util.function.Consumer;
import java.util.function.Supplier;

public final class class09778 {
   public static class09801 L() {
      return new class09801();
   }

   public static class09814 L(String var0) {
      return new class09814().L(var0);
   }

   private class09778() {
      super();
   }

   public static class09814 i() {
      return new class09814();
   }

   public static class09777 u() {
      return new class09777();
   }

   public static class09777 y(String var0) {
      return new class09777().L(var0);
   }

   public static class09798 y(String var0, class09991 var1) {
      return new class09777().L(var0).N(var1).i();
   }

   public static class09784 y() {
      return new class09784();
   }

   public static <T> class09804<T> N(Supplier<T> var0) {
      return new class09804<>(var0);
   }

   private static <T> void N(Consumer<T> var0, T var1) {
      if (var0 != null) {
         var0.accept(var1);
      }
   }

   public static <T> class09804<T> N() {
      return new class09804<>();
   }

   public static class09813 N_1(class09938 var0) {
      return new class09813().N(var0);
   }

   public static class09798 N(Consumer<class09784> var0) {
      class09784 class09784 = new class09784();
      N(var0, class09784);
      return class09784.i();
   }

   public static class09798 N(class09991 var0, Consumer<class09784> var1) {
      class09784 class09784 = new class09784().N(var0);
      N(var1, class09784);
      return class09784.i();
   }

   public static class09798 N(class09991 var0) {
      return N(var0, null);
   }

   public static class09798 N(String var0, class09991 var1) {
      return new class09801().L(var0).N(var1).i();
   }

   public static <T> class09804<T> N(T var0) {
      return new class09804<>((T)var0);
   }

   public static class09801 N(String var0) {
      return new class09801().L(var0);
   }

   public static class09813 R() {
      return new class09813();
   }
}
