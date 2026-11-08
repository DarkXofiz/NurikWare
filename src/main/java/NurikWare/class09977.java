package NurikWare;

import java.util.Objects;

public final class class09977 {
   private final class09975 N;
   private final class09973 y;
   private final class09973 L;
   private final class10009 u;

   public static class09977 L(float var0) {
      return y().i(var0);
   }

   public class09977 L() {
      return this.N(class10009.N());
   }

   public class10009 M() {
      return this.u;
   }

   private class09977(class09975 var1, class09973 var2, class09973 var3, class10009 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class09977 i(float var1) {
      return this.N(class10009.N(var1));
   }

   public class09973 i() {
      return this.y;
   }

   public static class09977 u(float var0) {
      return L(var0).N(class09973.CENTER).y(class09973.CENTER);
   }

   public class09975 u() {
      return this.N;
   }

   public class09977 y(class09973 var1) {
      return new class09977(this.N, this.y, var1, this.u);
   }

   public static class09977 y() {
      return new class09977(class09975.COLUMN, null, null, null);
   }

   public static class09977 y(float var0) {
      return N(var0).N(class09973.CENTER).y(class09973.CENTER);
   }

   public class09977 N(class10009 var1) {
      return new class09977(this.N, this.y, this.L, Objects.requireNonNull(var1, "value"));
   }

   public static class09977 N(float var0) {
      return N().i(var0);
   }

   public static class09977 N() {
      return new class09977(class09975.ROW, null, null, null);
   }

   public class09977 N(class09973 var1) {
      return new class09977(this.N, var1, this.L, this.u);
   }

   public class09973 R() {
      return this.L;
   }
}
