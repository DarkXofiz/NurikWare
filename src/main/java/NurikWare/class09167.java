package NurikWare;

import minecraft.class04995;

public class class09167 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;
   public Object u_0;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public boolean R_init;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public boolean M_init;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public boolean B_init;
   public static Object Z_0;
   public Object z_0;
   public Object z_1;
   public Object z_2;
   public Object z_3;
   public Object z_4;
   public Object z_5;
   public Object z_6;
   public Object z_7;
   public boolean z_init;

   private float L(long var1) {
      float f = (float)Math.sin((float)var1 * 0.021F + (Float)this.B_0);
      float f1 = (float)Math.sin((float)var1 * 0.047F + (Float)this.B_0 * 1.7F);
      return class04995.N(f * 0.65F + f1 * 0.35F, -1.0F, 1.0F);
   }

   private float L(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);
      float f1 = (float)Math.sin(f * Math.PI);
      float f2 = 1.0F + (float)Math.sin(f * Math.PI * (((Integer)this.B_1).intValue() + 1.35F) + ((Float)this.B_0).floatValue()) * 0.34F;
      if ((Integer)this.B_1 == 0) {
         f1 = (float)Math.pow(1.0F - f, 0.62) * 0.72F + f1 * 0.34F;
      } else if ((Integer)this.B_1 == 1) {
         f1 = (float)Math.pow(f, 1.65) * 0.84F + f1 * 0.22F;
      }

      return class04995.N(f1 * f2, 0.0F, 1.0F);
   }

   public class09167() {
      super();
      this.R();
      this.N_0 = new class09166();
      this.N_1 = new int[12];
      this.N_2 = new int[12];
      this.y_0 = new int[12];
      this.y_1 = new int[12];
      this.i_0 = 1.0F;
      this.i_1 = 1.0F;
      this.L_3 = 1.0F;
      this.L_4 = 1.0F;
      this.L_5 = 1.0F;
      this.B_2 = -1;
   }

   static {
      y();
   }

   private int Z() {
      int i = ((class09166)this.N_0).N(0, 4);
      if (i == (Integer)this.B_2) {
         i = (i + ((class09166)this.N_0).N(1, 4)) % 5;
      }

      return i;
   }

   private float u(long var1) {
      return (Long)this.y_4 <= (Long)this.y_3 ? 1.0F : class04995.N((float)(var1 - (Long)this.y_3) / (float)((Long)this.y_4 - (Long)this.y_3), 0.0F, 1.0F);
   }

   private float y(long var1) {
      return var1 >= (Long)this.y_5 && var1 < (Long)this.y_6
         ? class04995.N(
            (float)Math.sin(class04995.N((float)(var1 - (Long)this.y_5) / (float)Math.max(1L, (Long)this.y_6 - (Long)this.y_5), 0.0F, 1.0F) * Math.PI),
            0.0F,
            1.0F
         )
         : 0.0F;
   }

   private static void y() {
      Z_0 = 12;
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private boolean y(float var1, float var2, float var3) {
      int j = this.y(var1, var3);
      int k = this.y(var2, var3);
      if (j == 0 && k == 0) {
         return false;
      } else {
         int l = (Boolean)this.z_6 ? j - (Integer)this.z_2 : 0;
         int i = (Boolean)this.z_6 ? k - (Integer)this.z_3 : 0;
         if ((Boolean)this.z_6 && j == (Integer)this.z_2 && k == (Integer)this.z_3) {
            return true;
         } else if ((Boolean)this.z_6 && (l != 0 || i != 0) && l == (Integer)this.z_4 && i == (Integer)this.z_5 && Math.abs(j) + Math.abs(k) > 3) {
            return true;
         } else {
            for (int i1 = 0; i1 < (Integer)this.z_1; i1++) {
               if (((int[])this.N_1)[i1] == j && ((int[])this.N_2)[i1] == k) {
                  return true;
               }

               if (((int[])this.y_0)[i1] == l && ((int[])this.y_1)[i1] == i && (l != 0 || i != 0)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private float y(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);

      return switch ((Integer)this.B_1) {
         case 0 -> 0.78F * (1.0F - (float)Math.pow(f, 0.42)) - 0.22F * (float)Math.sin(f * Math.PI);
         case 1 -> -0.34F * (1.0F - f) + 0.92F * (float)Math.pow(f, 2.2);
         case 2 -> (float)Math.sin(f * Math.PI * 2.15F + ((Float)this.B_0).floatValue()) * 0.58F;
         case 3 -> f < 0.36F ? -0.54F + f * 0.72F : (f < 0.72F ? 0.84F : -0.18F);
         default -> (float)Math.sin((f * 1.35F + 0.18F) * Math.PI + ((Float)this.B_0).floatValue()) * 0.66F;
      };
   }

   private float N(float var1, float var2) {
      if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else {
         return ((class09166)this.N_0).N();
      }
   }

   private float N(long var1, boolean var3) {
      float f = var3 ? 0.067F : 0.052F;
      float f1 = (float)Math.sin((float)var1 * f + (Float)this.B_0);
      float f2 = (float)Math.sin((float)var1 * (f * 1.91F) + (Float)this.B_0 * (var3 ? 1.43F : 0.81F));
      float f3 = f2 > 0.0F ? 0.32F : -0.32F;
      return class04995.N(f1 * 0.58F + f2 * 0.28F + f3, -1.0F, 1.0F);
   }

   private class09155 N(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      float f = var1;
      float f1 = var2;

      for (int i = 0; i < 7 && this.y(f, f1, var5); i++) {
         float f2 = this.N(f, var3);
         float f3 = this.N(f1, var4);
         float f4 = 0.75F + i * 0.34F + var6 * 0.75F;
         float f5 = var7 ? 0.66F : 1.0F;
         float f6 = f2 * var5 * ((class09166)this.N_0).y(0.65F, 2.15F + f4) * f5;
         float f7 = f3 * var5 * ((class09166)this.N_0).y(0.28F, 1.32F + f4 * 0.44F) * (var7 ? 0.58F : 1.0F);
         if ((i & 1) == 1) {
            f7 = -f7 * ((class09166)this.N_0).y(0.55F, 1.18F);
         }

         f = this.N(f + f6, var3, var5, true, var7);
         f1 = this.N(f1 + f7, var4, var5, false, var7);
      }

      return new class09155(f, f1);
   }

   private float N(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);

      return switch ((Integer)this.B_1) {
         case 1 -> class04995.N(1.0F - f * 2.7F, 0.0F, 1.0F);
         case 3 -> f < 0.34F ? class04995.N(1.0F - f * 2.1F, 0.0F, 1.0F) : class04995.N((f - 0.76F) * 3.8F, 0.0F, 1.0F);
         default -> class04995.N((float)Math.sin(f * Math.PI * 2.0 + ((Float)this.B_0).floatValue()) * 0.38F, 0.0F, 1.0F);
      };
   }

   public void N() {
      this.y_2 = 0L;
      this.y_3 = 0L;
      this.y_4 = 0L;
      this.y_5 = 0L;
      this.y_6 = 0L;
      this.i_0 = 1.0F;
      this.i_1 = 1.0F;
      this.i_2 = 0.0F;
      this.i_3 = 0.0F;
      this.M_0 = 0.0F;
      this.M_1 = 0.0F;
      this.M_2 = 0.0F;
      this.M_3 = 0.0F;
      this.R_0 = 0.0F;
      this.R_1 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.L_3 = 1.0F;
      this.L_4 = 1.0F;
      this.L_5 = 1.0F;
      this.B_0 = 0.0F;
      this.B_1 = 0;
      this.B_2 = -1;
      this.z_0 = 0;
      this.z_1 = 0;
      this.z_2 = 0;
      this.z_3 = 0;
      this.z_4 = 0;
      this.z_5 = 0;
      this.z_6 = false;
      this.z_7 = false;
      this.u_0 = false;

      for (int i = 0; i < 12; i++) {
         ((int[])this.N_1)[i] = 0;
         ((int[])this.N_2)[i] = 0;
         ((int[])this.y_0)[i] = 0;
         ((int[])this.y_1)[i] = 0;
      }

      ((class09166)this.N_0).y();
   }

   private void N(float var1, float var2, float var3) {
      int i = this.y(var1, var3);
      int j = this.y(var2, var3);
      int k = (Boolean)this.z_6 ? i - (Integer)this.z_2 : 0;
      int l = (Boolean)this.z_6 ? j - (Integer)this.z_3 : 0;
      ((int[])this.N_1)[(Integer)this.z_0] = i;
      ((int[])this.N_2)[(Integer)this.z_0] = j;
      ((int[])this.y_0)[(Integer)this.z_0] = k;
      ((int[])this.y_1)[(Integer)this.z_0] = l;
      this.z_0 = ((Integer)this.z_0 + 1) % 12;
      this.z_1 = Math.min(12, (Integer)this.z_1 + 1);
      this.z_2 = i;
      this.z_3 = j;
      this.z_4 = k;
      this.z_5 = l;
      this.z_6 = true;
   }

   public class09138 N(
      float var1, float var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11
   ) {
      long i = System.currentTimeMillis();
      this.N(i, var4, var5, var6, var7, var8, var9, var10, var11);
      float f5 = Math.abs(var1);
      float f6 = Math.abs(var2);
      boolean flag = var10 || var11;
      float f7 = class04995.N((f5 + f6 * 1.45F) / 34.0F, 0.0F, 1.0F);
      float f8 = class04995.N(var4 * 0.72F + var5 * 0.82F + (var8 ? 0.35F : 0.0F), 0.0F, 1.65F);
      float f9 = this.u(i);
      float f10 = this.y(f9);
      float f11 = this.N(f9);
      float f12 = this.L(f9);
      float f13 = this.y(i);
      float f14 = this.L(i);
      float f15 = flag ? 0.64F : 1.0F;
      float f16 = (Float)this.i_0 + (Float)this.i_2 * f10 * f15 + (Float)this.M_2 * f13 - (Float)this.M_0 * f11;
      float f17 = (Float)this.i_1 - (Float)this.i_3 * f10 * 0.72F + f14 * (Float)this.i_3 * 0.34F + (Float)this.M_3 * f13 - (Float)this.M_1 * f11;
      float f18 = (Float)this.L_5 * var3 * (Float)this.R_0 * f8 * f7 * f15;
      float f19 = -(Float)this.L_5 * var3 * (Float)this.R_1 * f8 * f7 * (flag ? 0.58F : 1.0F);
      float f20 = this.N(i, true) * var3 * (Float)this.L_0 * f7 * f15;
      float f21 = this.N(i, false) * var3 * (Float)this.L_1 * f7;
      float f22 = var3 * (Float)this.L_2 * f8 * class04995.N(0.35F + f7, 0.0F, 1.25F) * f12 * f15;
      float f23 = (float)Math.sqrt(var1 * var1 + var2 * var2);
      float f3;
      float f4;
      if (f23 > 1.0E-4F) {
         f4 = -var2 / f23 * (Float)this.L_5;
         f3 = var1 / f23 * (Float)this.L_5 * (Float)this.L_3;
      } else {
         f4 = (Float)this.L_5;
         f3 = -(Float)this.L_5 * (Float)this.L_3;
      }

      if (f5 > 54.0F) {
         f18 *= 0.42F;
         f20 *= 0.55F;
         f22 *= 0.62F;
      }

      float f24 = var1 * f16 + f18 + f20 + f4 * f22;
      float f25 = var2 * f17 + f19 + f21 + f3 * f22;
      class09155 class09155 = this.N(f24, f25, var1, var2, var3, f7, flag);
      f24 = class09155.y();
      f25 = class09155.N();
      this.N(f24, f25, var3);
      float f2 = flag ? 0.94F : (var7 ? 0.8F : 0.86F);
      float f1 = flag ? 0.88F : (var7 ? 0.7F : 0.78F);
      float f = flag ? 1.14F : (var7 ? 1.18F : 1.24F);
      float f26 = flag ? 1.1F : (var7 ? 1.14F : 1.18F);
      boolean flag1 = f13 > 0.36F && (Boolean)this.z_7 || f12 > 0.55F && (Boolean)this.u_0;
      boolean flag2 = flag1 && (flag || var9 || f7 > 0.34F);
      return new class09138(
         f24,
         f25,
         f2,
         f1,
         f,
         f26,
         class04995.N((Float)this.L_4 + f13 * 0.72F + Math.max(f10, 0.0F) * 0.44F, 0.76F, 2.15F),
         class04995.N((Float)this.L_4 * 0.88F + f13 * 0.44F + Math.abs(f14) * 0.28F, 0.66F, 1.75F),
         flag1,
         flag2
      );
   }

   private void N(long var1, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      boolean flag = var9 || var10;
      if (var1 >= (Long)this.y_2) {
         this.B_2 = (Integer)this.B_1;
         this.B_1 = this.Z();
         float f = Math.abs(var5) > 0.45F ? Math.signum(var5) : 0.0F;
         this.L_5 = f != 0.0F && ((class09166)this.N_0).N(0.58F + var4 * 0.16F)
            ? -f
            : (((class09166)this.N_0).N(0.62F + var4 * 0.12F) ? -(Float)this.L_5 : ((class09166)this.N_0).N());
         float f1 = var3 * 0.62F + var4 * 0.92F + (var7 ? 0.42F : 0.0F) + (var8 ? 0.26F : 0.0F);
         this.i_0 = this.N((Float)this.i_0, flag ? 0.96F : (var6 ? 0.82F : 0.88F), flag ? 1.08F : 1.1F, 0.045F);
         this.i_1 = this.N((Float)this.i_1, flag ? 0.9F : (var6 ? 0.74F : 0.82F), flag ? 1.03F : 1.03F, 0.04F);
         this.i_2 = ((class09166)this.N_0).y(0.08F, 0.25F + f1 * 0.09F);
         this.i_3 = ((class09166)this.N_0).y(0.04F, 0.18F + f1 * 0.06F);
         this.M_0 = ((class09166)this.N_0).y(0.06F, flag ? 0.13F : 0.22F);
         this.M_1 = ((class09166)this.N_0).y(0.04F, flag ? 0.1F : 0.18F);
         this.R_0 = ((class09166)this.N_0).y(0.7F, 3.6F + f1 * 1.55F);
         this.R_1 = ((class09166)this.N_0).y(0.26F, 1.65F + f1 * 0.84F);
         this.L_0 = ((class09166)this.N_0).y(0.42F, 1.55F + f1 * 0.58F);
         this.L_1 = ((class09166)this.N_0).y(0.14F, 0.82F + f1 * 0.28F);
         this.L_2 = ((class09166)this.N_0).y(1.15F, 4.7F + f1 * 2.3F);
         this.L_3 = ((class09166)this.N_0).y(0.35F, 1.18F);
         this.L_4 = ((class09166)this.N_0).y(!var8 && !flag ? 0.82F : 1.08F, !var8 && !flag ? 1.36F : 1.72F);
         this.B_0 = ((class09166)this.N_0).N(0.0F, (float) (Math.PI * 2));
         this.u_0 = ((class09166)this.N_0).N(!var8 && !flag ? 0.3F : 0.46F);
         this.y_3 = var1;
         this.y_4 = var1 + (long)((class09166)this.N_0).y(var8 ? 62.0F : 84.0F, flag ? 145.0F : 230.0F);
         this.y_2 = var1 + (long)((class09166)this.N_0).y(var8 ? 54.0F : 78.0F, flag ? 155.0F : 250.0F);
      }

      if (var1 >= (Long)this.y_6 && ((class09166)this.N_0).N(!var8 && !var9 ? 0.26F : 0.44F)) {
         boolean flag1 = ((class09166)this.N_0).N(!var9 && !var10 ? 0.54F : 0.76F);
         this.M_2 = flag1 ? ((class09166)this.N_0).y(0.1F, 0.28F) : -((class09166)this.N_0).y(0.07F, 0.18F);
         this.M_3 = flag1 ? ((class09166)this.N_0).y(0.05F, 0.16F) : -((class09166)this.N_0).y(0.04F, 0.13F);
         this.z_7 = flag1 && ((class09166)this.N_0).N(0.62F);
         this.y_5 = var1;
         this.y_6 = var1 + (long)((class09166)this.N_0).y(28.0F, var9 ? 86.0F : 118.0F);
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         return class04995.N(var1, -var3 * (var4 ? 3.0F : 1.8F), var3 * (var4 ? 3.0F : 1.8F));
      } else {
         float f = Math.signum(var2);
         if (Math.signum(var1) != f && Math.abs(var2) > var3 * 2.5F) {
            return class04995.N(var1, -var3 * (var4 ? 1.1F : 0.85F), var3 * (var4 ? 1.1F : 0.85F));
         } else {
            float f1 = var5 ? (var4 ? 1.14F : 1.1F) : (var4 ? 1.24F : 1.18F);
            float f2 = var3 * (var4 ? 2.4F : 1.35F);
            return class04995.N(var1, -Math.abs(var2) * f1 - f2, Math.abs(var2) * f1 + f2);
         }
      }
   }

   private float N(float var1, float var2, float var3, float var4) {
      float f = ((class09166)this.N_0).y(var2, var3);
      if (Math.abs(f - var1) < var4) {
         f += ((class09166)this.N_0).N() * ((class09166)this.N_0).y(var4, var4 * 3.4F);
      }

      return class04995.N(f, var2, var3);
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0L;
         this.y_3 = 0L;
         this.y_4 = 0L;
         this.y_5 = 0L;
         this.y_6 = 0L;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = 0.0F;
         this.i_2 = 0.0F;
         this.i_3 = 0.0F;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0.0F;
         this.M_1 = 0.0F;
         this.M_2 = 0.0F;
         this.M_3 = 0.0F;
      }

      if (!this.R_init) {
         this.R_init = true;
         this.R_0 = 0.0F;
         this.R_1 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
      }

      if (!this.B_init) {
         this.B_init = true;
         this.B_0 = 0.0F;
         this.B_1 = 0;
         this.B_2 = 0;
      }

      if (!this.z_init) {
         this.z_init = true;
         this.z_0 = 0;
         this.z_1 = 0;
         this.z_2 = 0;
         this.z_3 = 0;
         this.z_4 = 0;
         this.z_5 = 0;
         this.z_6 = false;
         this.z_7 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
      }
   }
}
