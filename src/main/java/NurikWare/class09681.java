package NurikWare;

public final class class09681 implements class09667 {
   private static final float N = 1.0E-4F;
   private static final float y = 16.0F;
   private final class09868 L;
   private final float u;
   private final class09838 i;

   public class09681(class09868 var1) {
      this(var1, 16.0F, class09838.N);
   }

   public class09681(class09868 var1, float var2, class09838 var3) {
      super();
      this.L = var1;
      this.u = N(var2);
      this.i = var3 == null ? class09838.N : var3;
   }

   private float y(float var1) {
      return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : this.u;
   }

   private class09838 N(class09838 var1) {
      return var1 == null ? this.i : var1;
   }

   private static float N(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? var0 : 16.0F;
   }

   @Override
   public class09672 N(String var1, float var2, float var3, class09838 var4) {
      String s = var1 == null ? "" : var1;
      float f = this.y(var3);
      class09838 class09838 = this.N(var4);
      if (s.isEmpty()) {
         float f5 = this.L.N(f, class09838);
         return new class09672(0.0F, f5);
      } else if (Float.isInfinite(var2)) {
         return this.N(s, f, class09838);
      } else {
         float f1 = this.L.N(f, class09838);
         if (var2 <= 1.0E-4F) {
            return new class09672(0.0F, f1 * s.length());
         } else {
            int ix = 1;
            float f2 = 0.0F;
            float f3 = 0.0F;

            for (int j = 0; j < s.length(); j++) {
               char c0 = s.charAt(j);
               if (c0 == '\n') {
                  f3 = Math.max(f3, f2);
                  f2 = 0.0F;
                  ix++;
               } else {
                  float f4 = this.L.N(c0, f, class09838);
                  if (f2 > 0.0F && f2 + f4 > var2) {
                     f3 = Math.max(f3, f2);
                     f2 = f4;
                     ix++;
                  } else {
                     f2 += f4;
                  }
               }
            }

            f3 = Math.max(f3, f2);
            return new class09672(Math.min(f3, var2), ix * f1);
         }
      }
   }

   @Override
   public class09672 N(String var1, float var2) {
      return this.N(var1, var2, this.u, this.i);
   }

   @Override
   public class09672 N(String var1, float var2, class09838 var3) {
      String s = var1 == null ? "" : var1;
      float f = this.y(var2);
      class09838 class09838 = this.N(var3);
      float f1 = this.L.N(s, f, class09838);
      float f2 = this.L.N(f, class09838);
      return new class09672(f1, f2);
   }

   @Override
   public class09672 N(String var1) {
      return this.N(var1, this.u, this.i);
   }
}
