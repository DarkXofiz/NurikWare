package NurikWare;

import minecraft.class04995;

public class class11300 {
   public static int L(int var0, float var1) {
      return Math.round(Math.clamp(var1, 0.0F, 100.0F) / 100.0F * 255.0F) << 24 | var0 & 16777215;
   }

   public static float[] L(int var0) {
      float f = u(var0) / 255.0F;
      float f1 = N(var0) / 255.0F;
      float f2 = i(var0) / 255.0F;
      float f3 = Math.max(f, Math.max(f1, f2));
      float f4 = Math.min(f, Math.min(f1, f2));
      float f5 = (f3 + f4) / 2.0F;
      if (f3 == f4) {
         return new float[]{0.0F, 0.0F, f5};
      } else {
         float f6 = f3 - f4;
         float f7 = f5 > 0.5F ? f6 / (2.0F - f3 - f4) : f6 / (f3 + f4);
         float f8;
         if (f3 == f) {
            f8 = ((f1 - f2) / f6 + (f1 < f2 ? 6.0F : 0.0F)) / 6.0F;
         } else if (f3 == f1) {
            f8 = ((f2 - f) / f6 + 2.0F) / 6.0F;
         } else {
            f8 = ((f - f1) / f6 + 4.0F) / 6.0F;
         }

         return new float[]{f8 * 360.0F, f7, f5};
      }
   }

   private static float L(float var0, float var1, float var2) {
      float f = var2;
      if (var2 < 0.0F) {
         f = var2 + 1.0F;
      }

      if (f > 1.0F) {
         f--;
      }

      if (f < 0.16666667F) {
         return var0 + (var1 - var0) * 6.0F * f;
      } else if (f < 0.5F) {
         return var1;
      } else {
         return f < 0.6666667F ? var0 + (var1 - var0) * (0.6666667F - f) * 6.0F : var0;
      }
   }

   private class11300() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static int i(int var0) {
      return var0 & 0xFF;
   }

   public static int u(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int u(int var0, float var1) {
      return N(var0, Math.round(y(var0) * Math.clamp(var1, 0.0F, 1.0F)));
   }

   public static int y(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int y(int var0, float var1) {
      int i = u(var0);
      int j = N(var0);
      int k = i(var0);
      int l = y(var0);
      return y(Math.max((int)(i * var1), 0), Math.max((int)(j * var1), 0), Math.max((int)(k * var1), 0), l);
   }

   public static int y(float var0, float var1, float var2) {
      float f = (var0 % 360.0F + 360.0F) % 360.0F / 360.0F;
      if (var1 == 0.0F) {
         int l = Math.round(var2 * 255.0F);
         return l << 16 | l << 8 | l;
      } else {
         float f1 = var2 < 0.5F ? var2 * (1.0F + var1) : var2 + var1 - var2 * var1;
         float f2 = 2.0F * var2 - f1;
         int i = Math.round(L(f2, f1, f + 0.33333334F) * 255.0F);
         int j = Math.round(L(f2, f1, f) * 255.0F);
         int k = Math.round(L(f2, f1, f - 0.33333334F) * 255.0F);
         return (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
      }
   }

   public static int y(int var0, int var1) {
      return y(var0, var0, var0, var1);
   }

   public static int y(int var0) {
      return var0 >>> 24;
   }

   public static int N(int var0, int var1, float var2) {
      int i = u(var0);
      int j = N(var0);
      int k = i(var0);
      int l = y(var0);
      int i1 = u(var1);
      int j1 = N(var1);
      int k1 = i(var1);
      int l1 = y(var1);
      return y(class04995.N(var2, i, i1), class04995.N(var2, j, j1), class04995.N(var2, k, k1), class04995.N(var2, l, l1));
   }

   public static int N(float var0, float var1, float var2) {
      return 0xFF000000 | (int)(var0 * 255.0F) << 16 | (int)(var1 * 255.0F) << 8 | (int)(var2 * 255.0F);
   }

   public static int N(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int N(float var0) {
      int i = Math.round(var0 * 85.0F);
      int j;
      int k;
      if (i < 43) {
         j = 255;
         k = Math.round(i * 5.94F);
      } else {
         j = Math.round(255.0F - (i - 43) * 6.07F);
         k = 255;
      }

      return 0xFF000000 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
   }

   public static int N(int var0, int var1, int var2, int var3) {
      int i = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      i = (i >= 180 ? 360 - i : i) * 2;
      return N(var2, var3, i / 360.0F);
   }

   public static int N(int var0, float var1) {
      int i = u(var0);
      int j = N(var0);
      int k = i(var0);
      int l = y(var0);
      int i1 = (int)(1.0 / (1.0 - var1));
      if (i == 0 && j == 0 && k == 0) {
         return y(i1, i1, i1, l);
      } else {
         if (i > 0 && i < i1) {
            i = i1;
         }

         if (j > 0 && j < i1) {
            j = i1;
         }

         if (k > 0 && k < i1) {
            k = i1;
         }

         return y(Math.min((int)(i / var1), 255), Math.min((int)(j / var1), 255), Math.min((int)(k / var1), 255), l);
      }
   }

   public static boolean N(int var0, int var1, int var2) {
      int i = var0 >> 16 & 0xFF;
      int j = var0 >> 8 & 0xFF;
      int k = var0 & 0xFF;
      int l = var1 >> 16 & 0xFF;
      int i1 = var1 >> 8 & 0xFF;
      int j1 = var1 & 0xFF;
      return Math.abs(i - l) <= var2 && Math.abs(j - i1) <= var2 && Math.abs(k - j1) <= var2;
   }

   public static int N(int var0, int var1) {
      return Math.clamp((long)var1, 0, 255) << 24 | var0 & 16777215;
   }
}
