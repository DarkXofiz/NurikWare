package NurikWare;

import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11620 {
   public static Object[] N;
   private static byte[] L;

   public static void L() {
      class11635 class11635 = (class11635)N[0];
      N[1] = class11635;
   }

   private class11620() {
      super();
   }

   static {
      i();
      R();
      N[0] = class11635.i();
      N[1] = N[0];
   }

   private static void i() {
      L = new byte[1];
      L[0] = 2;
   }

   public static Optional<class11599> u() {
      return ((class11635)N[1]).L();
   }

   public static class11635 y() {
      return (class11635)N[1];
   }

   public static void N(List<Vector4f> var0, List<Vector4f> var1, class11599 var2, class11599 var3) {
      int i = Math.min(var0.size(), var1.size());
      Vector4f[] avector4f = new Vector4f[i];
      Vector4f[] avector4f1 = new Vector4f[i];

      for (int j = 0; j < i; j++) {
         avector4f[j] = new Vector4f((Vector4fc)var0.get(j));
         avector4f1[j] = new Vector4f((Vector4fc)var1.get(j));
      }

      class11635 class11635 = new class11635(List.of(avector4f), List.of(avector4f1), Optional.ofNullable(var2), Optional.ofNullable(var3));
      N[1] = class11635;
   }

   public static Optional<class11599> N() {
      return ((class11635)N[1]).u();
   }

   private static void R() {
      N = new Object[L[0]];
   }
}
