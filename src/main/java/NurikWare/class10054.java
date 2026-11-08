package NurikWare;

import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public final class class10054 {
   private static final Logger N = Logger.getLogger(class10054.class.getName());
   private static final int y = 8192;
   private static final class10043 L = new class10043();
   private final class09781 u;
   private final class10037 i;
   private final Map<class10021, class10060> R = new class10031(this, 256, 0.75F, true);
   private class10030 M = new class10030();
   private int B;

   class10054(class09781 var1) {
      super();
      this.u = Objects.requireNonNull(var1, "context");
      this.i = class10037.N(var1);
   }

   class10037 y() {
      return this.i;
   }

   private static String y(class10021 var0) {
      String s = var0.N();
      return s != null && !s.isBlank() ? s : "<anonymous>";
   }

   private class10060 y(class10021 var1, class09980 var2) {
      class10060 class10060 = this.R.computeIfAbsent(var1, var0 -> new class10060());
      int ix = var1.k();
      int j = var1.l();
      int k = this.u.u().y();
      if (!class10060.i || class10060.y != ix || class10060.L != j || class10060.u != k) {
         class10060.i = true;
         class10060.y = ix;
         class10060.L = j;
         class10060.u = k;
         class10060.R = null;
         class10060.M.clear();
      }

      return class10060;
   }

   public boolean N(class10021 var1, float var2, float var3, class09770 var4) {
      if (var1 == null) {
         return false;
      } else {
         class09770 class09770 = var4 == null ? class09770.N : var4;
         class10052 class10052 = new class10052(this, var1, Math.max(0.0F, var2), Math.max(0.0F, var3), this.u.u().N(), ++this.B);
         class10052.B();
         this.M = class10052.i();
         class10030 class10030 = this.M;
         if (class09770.u()) {
            N.info(
               () -> "Layout rebuilt for root='"
                  + y(var1)
                  + "', viewport="
                  + class10052.y()
                  + "x"
                  + class10052.L()
                  + ", epoch="
                  + class10052.u()
                  + ", metadataNodes="
                  + class10030.N
                  + ", intrinsicNodes="
                  + class10030.y
                  + ", widthSizingNodes="
                  + class10030.L
                  + ", heightSizingNodes="
                  + class10030.u
                  + ", textWrapNodes="
                  + class10030.i
                  + ", heightRecomputeNodes="
                  + class10030.R
                  + ", positioningNodes="
                  + class10030.M
            );
         }

         return true;
      }
   }

   public boolean N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, class09770.N);
   }

   public static class10054 N(class09781 var0) {
      class09781 class09781 = Objects.requireNonNull(var0, "context");
      return class09781.N(class10054.class).orElseGet(() -> {
         class10054 class10054 = new class10054(class09781);
         class09781.N(class10054.class, class10054);
         return class10054;
      });
   }

   class10030 N() {
      return this.M;
   }

   class10056 N(class10021 var1, class09980 var2) {
      class10060 class10060 = this.y(var1, var2);
      if (class10060.R != null) {
         return class10060.R;
      } else {
         class10060.R = class10058.N(this.u, var1.B(), var2.c(), var2.X());
         return class10060.R;
      }
   }

   class10026 N(class10021 var1, class09980 var2, float var3) {
      class10060 class10060 = this.y(var1, var2);
      int ix = Float.floatToIntBits(var3);
      class10026 class10026x = class10060.M.get(ix);
      if (class10026x != null) {
         return class10026x;
      } else {
         class10026 class10026x = class10058.N(this.u, var1.B(), var3, var2.c(), var2.X(), this.N(var1, var2));
         class10060.M.put(ix, class10026x);
         return class10026x;
      }
   }

   public boolean N(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         class10030 class10030 = new class10030();
         new class10022(class10030, L, this.u.u().N(), false).N(var1);
         var1.L(4);
         this.M = class10030;
         return true;
      }
   }
}
