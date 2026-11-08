package NurikWare;

import minecraft.class04995;

public class class09144 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;

   private void L() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
         this.L_2 = 0;
         this.L_3 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0.0F;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0.0F;
         this.u_1 = 0.0F;
         this.u_2 = false;
         this.u_3 = false;
      }
   }

   public class09144() {
      super();
      this.L();
      this.i_0 = new class09166();
      this.i_1 = new float[9];
      this.i_2 = new float[9];
      this.i_3 = new float[9];
      this.i_4 = new float[9];
      this.i_5 = new float[9];
      this.L_0 = new float[9];
   }

   static {
      B();
   }

   private static void B() {
      y_0 = 9;
   }

   private float y(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return ((class09166)this.i_0).N();
      }
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float f = var4 ? (Float)this.u_0 : (Float)this.u_1;
      float f1 = var3 * (var4 ? 3.8273628F + (Float)this.N_4 * 3.1726382F : 1.6273628F + (Float)this.N_4 * 1.3726382F);
      float f2 = Math.abs(var2) + f1;
      if (Math.abs(var2) > var3 * (var4 ? 5.8273625F : 2.7362838F) && Math.signum(var1) != Math.signum(var2)) {
         f2 = Math.min(f2, f1 * ((class09166)this.i_0).y(0.43628374F, 0.82736284F));
      }

      return class04995.N(var1, -Math.min(f, f2), Math.min(f, f2));
   }

   private float N(float var1, float[] var2, int var3, float var4, boolean var5) {
      if (var3 <= 0) {
         return var1;
      } else {
         int i = this.N(var1, var4);
         int j = this.N(var2[var3 - 1], var4);
         if (i == j || var3 > 1 && i - j == j - this.N(var2[var3 - 2], var4)) {
            float f = Math.abs(var1) > 1.0E-4F ? Math.signum(var1) : ((class09166)this.i_0).N();
            var1 += f * var4 * ((class09166)this.i_0).y(var5 ? 0.6273628F : 0.32736284F, var5 ? 2.1726382F : 1.1726383F);
         }

         return var1;
      }
   }

   private float N(float var1, float var2, double var3, boolean var5) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var3 <= 1.0E-5)) {
         int i = Math.round(var1 / (float)var3);
         if (i == 0 && Math.abs(var2) > (float)var3) {
            i = var2 > 0.0F ? 1 : -1;
         } else if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         int j = var5 ? (Integer)this.N_0 : (Integer)this.N_1;
         if (i == j && Math.abs(i) > 1) {
            i += i > 0 ? ((class09166)this.i_0).N(-1, 2) : ((class09166)this.i_0).N(-2, 1);
            if (i == 0) {
               i = j > 0 ? 1 : -1;
            }
         }

         if (var5) {
            this.N_0 = i;
         } else {
            this.N_1 = i;
         }

         return i * (float)var3;
      } else {
         return var1;
      }
   }

   public void N(long var1, class11499 var3, class11499 var4, class11499 var5, double var6, float var8, float var9, boolean var10, float var11, boolean var12) {
      float f = (float)Math.max(var6, 0.035F);
      float f1 = class09170.N(var3.y(), var4.y());
      float f2 = var4.R() - var3.R();
      float f3 = class09170.N(var5.y(), var4.y());
      float f4 = var4.R() - var5.R();
      if (Math.abs(f3) <= f * 0.82736284F) {
         f3 = f1 * ((class09166)this.i_0).y(0.17263828F, var10 ? 0.47263828F : 0.32736284F);
      }

      if (Math.abs(f4) <= f * 0.5273628F) {
         f4 = f2 * ((class09166)this.i_0).y(0.11726373F, var10 ? 0.38273627F : 0.26372838F);
      }

      this.u_2 = var10;
      this.N_4 = var11;
      this.L_3 = 0;
      this.L_2 = var10 ? ((class09166)this.i_0).N(4, 7) : ((class09166)this.i_0).N(3, 6);
      this.L_1 = var1 + (long)((class09166)this.i_0).y(var10 ? 96.273636F : 136.37263F, var10 ? 196.93738F : 264.82736F);
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      float f5 = var10 ? 1.9373773F : 1.5273628F;
      float f6 = var10 ? 1.6273628F : 1.3726382F;
      this.u_0 = Math.max(f * (var10 ? 6.8273625F : 4.736284F), Math.min(var8 * f5, Math.abs(f1) * 0.7362837F + f * (var10 ? 12.827362F : 7.736284F)));
      this.u_1 = Math.max(f * (var10 ? 3.2726383F : 2.1726382F), Math.min(var9 * f6, Math.abs(f2) * 0.6273628F + f * (var10 ? 5.6273627F : 3.5273628F)));
      this.N((float[])this.i_1, (float[])this.i_3, f3, f1, f, (Float)this.u_0, true, var12);
      this.N((float[])this.i_2, (float[])this.i_4, f4, f2, f, (Float)this.u_1, false, false);
      this.N((float[])this.i_5, var10 ? 1.6232324F : 1.0273628F, var10 ? 1.9373773F : 1.4273628F, 0.04736283F);
      this.N((float[])this.L_0, var10 ? 1.1172637F : 0.9273628F, var10 ? 1.6273628F : 1.2637284F, 0.03628373F);
      this.u_3 = true;
   }

   public boolean N(long var1) {
      if (!(Boolean)this.u_3) {
         return false;
      } else if (var1 <= (Long)this.L_1 && (Integer)this.L_3 < (Integer)this.L_2) {
         return true;
      } else {
         this.u_3 = false;
         return false;
      }
   }

   public class09147 N(class11499 var1, class11499 var2, class11499 var3, double var4, boolean var6, float var7, float var8, long var9) {
      if (!this.N(var9)) {
         return class09147.N(var3, var7, var8);
      } else {
         float f = (float)Math.max(var4, 0.035F);
         int j = (Integer)this.L_3;
         this.L_3 = j + 1;
         int i = j;
         float f1 = class09170.N(var3.y(), var2.y());
         float f2 = var6 ? 0.0F : var2.R() - var3.R();
         float f3 = ((float[])this.i_1)[i] + f1 * ((float[])this.i_3)[i] + ((class09166)this.i_0).N(true, f * (0.26372838F + (Float)this.N_4 * 0.6273628F));
         float f4 = var6
            ? 0.0F
            : ((float[])this.i_2)[i] + f2 * ((float[])this.i_4)[i] + ((class09166)this.i_0).N(false, f * (0.11726373F + (Float)this.N_4 * 0.32736284F));
         f3 = this.N(f3, f1, f, true);
         f4 = var6 ? 0.0F : this.N(f4, f2, f, false);
         f3 = this.N(f3, f1, var4, true);
         f4 = var6 ? 0.0F : this.N(f4, f2, var4, false);
         class11499 class11499 = new class11499(var3.y() + f3, class04995.N(var3.R() + f4, -90.0F, 90.0F));
         float f5 = this.N(
            Math.max(
               Math.abs(class09170.N(var1.y(), class11499.y())) + f,
               var7 * ((float[])this.i_5)[i] + Math.abs(f3) * ((class09166)this.i_0).y(0.26372838F, 0.82736284F)
            ),
            f,
            true
         );
         float f6 = this.N(
            Math.max(Math.abs(class11499.R() - var1.R()) + f, var8 * ((float[])this.L_0)[i] + Math.abs(f4) * ((class09166)this.i_0).y(0.17263828F, 0.6273628F)),
            f,
            false
         );
         return new class09147(class11499, f3, f4, f5, f6, true);
      }
   }

   private float N(float var1, float var2, boolean var3) {
      int i = Math.max(1, Math.round(var1 / var2));
      int j = var3 ? (Integer)this.N_2 : (Integer)this.N_3;
      if (i == j) {
         i += ((class09166)this.i_0).N() * ((class09166)this.i_0).N(1, var3 ? 6 : 4);
         i = Math.max(1, i);
      }

      if (var3) {
         this.N_2 = i;
      } else {
         this.N_3 = i;
      }

      return i * var2;
   }

   private void N(float[] var1, float var2, float var3, float var4) {
      float f = 0.0F;

      for (int i = 0; i < (Integer)this.L_2; i++) {
         float f1 = ((class09166)this.i_0).y(var2, var3);
         if (i > 0 && Math.abs(f1 - f) < var4) {
            f1 += ((class09166)this.i_0).N() * ((class09166)this.i_0).y(var4, var4 * 4.736284F);
            f1 = class04995.N(f1, var2, var3);
         }

         var1[i] = f1;
         f = f1;
      }
   }

   private void N(float[] var1, float[] var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8) {
      float f = this.y(var3, var4);
      float f1 = Math.max(Math.abs(var3), Math.abs(var4) * ((class09166)this.i_0).y(0.09273628F, var7 ? 0.26372838F : 0.17263828F));
      float f2 = f
         * (
            f1 * ((class09166)this.i_0).y(var7 ? 0.43628374F : 0.32736284F, var7 ? 0.8726383F : 0.7362837F)
               + var5 * ((class09166)this.i_0).y(var7 ? 0.7362837F : 0.26372838F, var7 ? 4.1726384F : 1.7362838F)
         );
      float f3 = 0.0F;
      float[] afloat = new float[9];

      for (int i = 0; i < (Integer)this.L_2; i++) {
         float f4 = ((class09166)this.i_0).y(0.11726373F, 1.0F);
         if (i == 0 && ((class09166)this.i_0).N(var7 ? 0.42736283F : 0.32736284F)) {
            f4 += ((class09166)this.i_0).y(0.32736284F, 0.9273628F);
         }

         if (i > 1 && ((class09166)this.i_0).N(0.26372838F)) {
            f4 *= ((class09166)this.i_0).y(0.32736284F, 0.7362837F);
         }

         afloat[i] = f4;
         f3 += f4;
      }

      for (int j = 0; j < (Integer)this.L_2; j++) {
         float f7 = f;
         if (j > 0 && ((class09166)this.i_0).N((var7 ? 0.17263828F : 0.21736284F) + (Float)this.N_4 * 0.06372837F)) {
            f7 = -f;
         }

         if (var8 && var7 && ((class09166)this.i_0).N(0.32736284F)) {
            f7 = -f7;
         }

         float f5 = f2 * (afloat[j] / Math.max(0.001F, f3));
         float f6 = f7
            * var5
            * ((class09166)this.i_0)
               .y(var7 ? 0.21736284F : 0.08273628F, var7 ? 2.8273628F + (Float)this.N_4 * 1.9273628F : 0.9273628F + (Float)this.N_4 * 0.82736284F);
         if (((class09166)this.i_0).N(0.38273627F)) {
            f6 *= ((class09166)this.i_0).y(-0.82736284F, 0.5637284F);
         }

         f5 = class04995.N(f5 + f6, -var6, var6);
         var1[j] = this.N(f5, var1, j, var5, var7);
         var2[j] = ((class09166)this.i_0)
            .y(var7 ? 0.08372837F : 0.06372837F, var7 ? 0.32736284F + (Float)this.N_4 * 0.16372837F : 0.23628373F + (Float)this.N_4 * 0.12736283F);
      }
   }

   public void N() {
      this.L_1 = 0L;
      this.L_2 = 0;
      this.L_3 = 0;
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0.0F;
      this.u_0 = 0.0F;
      this.u_1 = 0.0F;
      this.u_2 = false;
      this.u_3 = false;

      for (int i = 0; i < 9; i++) {
         ((float[])this.i_1)[i] = 0.0F;
         ((float[])this.i_2)[i] = 0.0F;
         ((float[])this.i_3)[i] = 0.0F;
         ((float[])this.i_4)[i] = 0.0F;
         ((float[])this.i_5)[i] = 1.0F;
         ((float[])this.L_0)[i] = 1.0F;
      }

      ((class09166)this.i_0).y();
   }
}
