package NurikWare;

public class class11736 implements class09667 {
   public static Object N_0;
   public Object y_0;

   private static void L() {
      N_0 = 1.0E-4F;
   }

   public class11736(class09868 var1) {
      super();
      this.i();
      this.y_0 = var1;
   }

   static {
      L();
   }

   private void i() {
   }

   @Override
   public class09672 N(String var1, float var2, float var3, class09838 var4) {
      if (var1.isEmpty()) {
         float f5 = ((class09868)this.y_0).N(var3, var4);
         return new class09672(0.0F, f5);
      } else if (Float.isInfinite(var2)) {
         return this.N(var1, var3, var4);
      } else {
         float f = ((class09868)this.y_0).N(var3, var4);
         if (var2 <= 1.0E-4F) {
            return new class09672(0.0F, f * var1.length());
         } else {
            int i = 1;
            float f1 = 0.0F;
            float f2 = 0.0F;
            int j = -1;

            for (int l = 0; l < var1.length(); l++) {
               int k = var1.codePointAt(l);
               l += Character.charCount(k);
               if (k == 10) {
                  f2 = Math.max(f2, f1);
                  f1 = 0.0F;
                  i++;
                  j = -1;
               } else {
                  float f3 = j == -1 ? 0.0F : ((class09868)this.y_0).N(j, k, var3, var4);
                  float f4 = ((class09868)this.y_0).N(k, var3, var4) + f3;
                  if (f1 > 0.0F && f1 + f4 > var2) {
                     f2 = Math.max(f2, f1);
                     f1 = f4;
                     i++;
                     j = -1;
                  } else {
                     f1 += f4;
                     j = k;
                  }
               }
            }

            f2 = Math.max(f2, f1);
            return new class09672(Math.round(Math.min(f2, var2)), i * f);
         }
      }
   }

   @Override
   public class09672 N(String var1, float var2, class09838 var3) {
      float f = ((class09868)this.y_0).N(var1, var2, var3);
      float f1 = ((class09868)this.y_0).N(var2, var3);
      return new class09672(f, f1);
   }
}
