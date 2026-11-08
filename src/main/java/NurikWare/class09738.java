package NurikWare;

import java.util.Objects;

public final class class09738 {
   private final class09736 N;
   private final class09743 y;
   private final int L;
   private final int u;
   private final float i;
   private final float R;
   private final class09962 M;
   private final class09962 B;
   private final class09666 Z;
   private final class09666 z;
   private final class09733 U;
   private final class09780 E;
   private class09753 W;
   private float m;

   public float L() {
      return this.U == class09733.RUNTIME_VALUE ? this.u().y() : class09712.N(this.i, this.R, this.y());
   }

   int M() {
      return this.u;
   }

   private class09738(
      class09736 var1,
      class09743 var2,
      int var3,
      int var4,
      float var5,
      float var6,
      class09962 var7,
      class09962 var8,
      class09666 var9,
      class09666 var10,
      class09733 var11,
      class09780 var12,
      class09753 var13
   ) {
      super();
      this.N = var1;
      this.y = Objects.requireNonNull(var2, "spec");
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
      this.z = var10;
      this.U = var11;
      this.E = var12;
      this.W = Objects.requireNonNull(var13, "targetValue");
   }

   float B() {
      return this.i;
   }

   float Z() {
      return this.R;
   }

   public class09736 i() {
      return this.N;
   }

   class09733 m() {
      return this.U;
   }

   class09962 U() {
      return this.B;
   }

   class09962 z() {
      return this.M;
   }

   public class09753 u() {
      if (this.U == class09733.RUNTIME_VALUE) {
         return Objects.requireNonNull(this.E.N(), "transitionValue");
      } else {
         return switch (this.U) {
            case COLOR -> class09753.N(this.u);
            case FLOAT -> class09753.N(this.L());
            case RUNTIME_VALUE -> throw new IllegalStateException("Runtime value handled above");
            case AXIS_SIZE -> class09753.N(this.B);
            case TRANSLATE_LENGTH -> class09753.N(this.z);
         };
      }
   }

   public boolean y(class09743 var1) {
      return this.U == class09733.RUNTIME_VALUE && this.N(var1);
   }

   public boolean y(class09753 var1) {
      if (this.U != class09733.RUNTIME_VALUE) {
         return false;
      } else {
         boolean flag = this.E.N(var1);
         if (flag) {
            this.W = var1;
         }

         return flag;
      }
   }

   public float y() {
      if (this.y instanceof class09728 class09728x) {
         class09728 class09728x = class09728x;

         try {
            f2 = class09728x.N();
         } catch (Throwable throwable2) {
            throw new MatchException(throwable2.toString(), throwable2);
         }

         float f = f2;
         class09728x = class09728x;

         try {
            class09759 = class09728x.y();
         } catch (Throwable throwable1) {
            throw new MatchException(throwable1.toString(), throwable1);
         }

         class09759 class09759x = class09759;
         class09728x = class09728x;

         try {
            f3 = class09728x.L();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         f = f3;
         if (!(f <= 0.0F)) {
            float f1 = (this.m - f) / f;
            if (f1 <= 0.0F) {
               return 0.0F;
            }

            if (f1 >= 1.0F) {
               return 1.0F;
            }

            return class09759x.N(f1);
         }
      }

      return 1.0F;
   }

   class09666 E() {
      return this.Z;
   }

   public static class09738 N(class09736 var0, class09743 var1, int var2, int var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 class09753x = class09753.N(var2);
      class09753 class09753x = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, class09753x, class09753x, var2, var3, 0.0F, 0.0F, null, null, null, null)
         : new class09738(var0, var1, var2, var3, 0.0F, 0.0F, null, null, null, null, class09733.COLOR, null, class09753x);
   }

   public static class09738 N(class09736 var0, class09743 var1, float var2, float var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 class09753x = class09753.N(var2);
      class09753 class09753x = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, class09753x, class09753x, 0, 0, var2, var3, null, null, null, null)
         : new class09738(var0, var1, 0, 0, var2, var3, null, null, null, null, class09733.FLOAT, null, class09753x);
   }

   public static class09738 N(class09736 var0, class09743 var1, class09962 var2, class09962 var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 class09753x = class09753.N(var2);
      class09753 class09753x = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, class09753x, class09753x, 0, 0, 0.0F, 0.0F, var2, var3, null, null)
         : new class09738(var0, var1, 0, 0, 0.0F, 0.0F, var2, var3, null, null, class09733.AXIS_SIZE, null, class09753x);
   }

   public boolean N(float var1) {
      if (var1 <= 0.0F || this.N()) {
         return false;
      } else if (this.U == class09733.RUNTIME_VALUE) {
         return this.E.N(var1);
      } else {
         float f = this.y();
         this.m += var1;
         float f1 = this.y();
         return Float.compare(f, f1) != 0;
      }
   }

   public boolean N() {
      if (this.U == class09733.RUNTIME_VALUE) {
         return this.E.y();
      } else if (this.y instanceof class09728 class09728x) {
         class09728 class09728x = class09728x;

         try {
            f2 = class09728x.N();
         } catch (Throwable throwable2) {
            throw new MatchException(throwable2.toString(), throwable2);
         }

         float f = f2;
         class09728x = class09728x;

         try {
            class09728x.y();
         } catch (Throwable throwable1) {
            throw new MatchException(throwable1.toString(), throwable1);
         }

         class09728x = class09728x;

         try {
            f3 = class09728x.L();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         float f1 = f3;
         return this.m >= f1 + f;
      } else {
         return true;
      }
   }

   public boolean N(class09743 var1) {
      class09743 class09743 = var1 == null ? class09743.Z() : var1;
      return this.y.equals(class09743);
   }

   public boolean N(class09753 var1) {
      return this.W.equals(var1);
   }

   public static class09738 N(class09736 var0, class09743 var1, class09666 var2, class09666 var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 class09753x = class09753.N(var2);
      class09753 class09753x = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, class09753x, class09753x, 0, 0, 0.0F, 0.0F, null, null, var2, var3)
         : new class09738(var0, var1, 0, 0, 0.0F, 0.0F, null, null, var2, var3, class09733.TRANSLATE_LENGTH, null, class09753x);
   }

   private static class09738 N(
      class09736 var0,
      class09743 var1,
      class09753 var2,
      class09753 var3,
      int var4,
      int var5,
      float var6,
      float var7,
      class09962 var8,
      class09962 var9,
      class09666 var10,
      class09666 var11
   ) {
      class09815 class09815 = (class09815)var1;
      return new class09738(
         var0,
         var1,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         class09733.RUNTIME_VALUE,
         Objects.requireNonNull(class09815.N(var0, var2, var3), "valueTransitionRuntime"),
         var3
      );
   }

   class09666 W() {
      return this.z;
   }

   int R() {
      return this.L;
   }
}
