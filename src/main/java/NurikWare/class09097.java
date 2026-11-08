package NurikWare;

import java.util.function.IntSupplier;

public class class09097 {
   public static class09064 L(IntSupplier var0, IntSupplier var1) {
      return class09064.N(var0, var1).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N();
   }

   public static class09064 L(int var0, int var1) {
      return u(() -> var0, () -> var1);
   }

   private class09097() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
   }

   public static class09064 i(IntSupplier var0, IntSupplier var1) {
      return class09064.N(var0, var1).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N();
   }

   public static class09064 i(int var0, int var1) {
      return N(() -> var0, () -> var1);
   }

   public static class09064 u(IntSupplier var0, IntSupplier var1) {
      return class09064.N(var0, var1).N(class11199.LINEAR_MIPMAP_LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N(true).N();
   }

   public static class09064 u(int var0, int var1) {
      return L(() -> var0, () -> var1);
   }

   public static class09064 y(int var0, int var1) {
      return i(() -> var0, () -> var1);
   }

   private static void y() {
   }

   public static class09064 y(IntSupplier var0, IntSupplier var1) {
      return class09064.N(var0, var1).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).N();
   }

   public static class09064 N(IntSupplier var0, IntSupplier var1, boolean var2) {
      return class09064.N(var0, var1).y(class11181.RG16F).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).y(var2).N();
   }

   public static class09064 N(int var0, int var1, boolean var2) {
      return N(() -> var0, () -> var1, var2);
   }

   public static class09064 N(IntSupplier var0, IntSupplier var1) {
      return class09064.N(var0, var1).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).y(true).N();
   }

   public static class09064 N(int var0, int var1) {
      return y(() -> var0, () -> var1);
   }
}
