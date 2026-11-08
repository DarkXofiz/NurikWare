package NurikWare;

import java.util.Objects;

final class class10039 {
   private final class09743 N;
   private final float y;
   private final float L;
   private final class09780 u;
   private float i;

   private float L() {
      if (this.N instanceof class09728 class09728x) {
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

         f = f3;
         if (!(f <= 0.0F)) {
            float f1 = (this.i - f) / f;
            if (f1 <= 0.0F) {
               return 0.0F;
            }

            if (f1 >= 1.0F) {
               return 1.0F;
            }

            return f1;
         }
      }

      return 1.0F;
   }

   private class10039(class09743 var1, float var2, float var3, class09780 var4) {
      super();
      this.N = Objects.requireNonNull(var1, "spec");
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   float y() {
      if (this.u != null) {
         return this.u.N().y();
      } else if (this.N instanceof class09728 class09728x) {
         class09728 class09728x = class09728x;

         try {
            class09728x.N();
         } catch (Throwable throwable2) {
            throw new MatchException(throwable2.toString(), throwable2);
         }

         class09728x = class09728x;

         try {
            class09759 = class09728x.y();
         } catch (Throwable throwable1) {
            throw new MatchException(throwable1.toString(), throwable1);
         }

         class09759 class09759x = class09759;
         class09728x = class09728x;

         try {
            class09728x.L();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         float f = class09759x.N(this.L());
         return this.y + (this.L - this.y) * f;
      } else {
         return this.L;
      }
   }

   boolean N() {
      if (this.u != null) {
         return this.u.y();
      } else if (this.N instanceof class09728 class09728x) {
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
         return this.i >= f1 + f;
      } else {
         return true;
      }
   }

   boolean N(float var1) {
      if (this.u != null) {
         return this.u.N(var1);
      } else if (!(var1 <= 0.0F) && !this.N()) {
         float f = this.L();
         this.i += var1;
         return Float.compare(f, this.L()) != 0;
      } else {
         return false;
      }
   }

   static class10039 N(class09736 var0, class09743 var1, float var2, float var3) {
      if (var1 instanceof class09815) {
         class09780 class09780 = Objects.requireNonNull(((class09815)var1).N(var0, class09753.N(var2), class09753.N(var3)), "valueTransitionRuntime");
         return new class10039(var1, var2, var3, class09780);
      } else {
         return new class10039(var1, var2, var3, null);
      }
   }
}
