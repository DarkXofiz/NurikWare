package NurikWare;

import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;

public class class09074 implements class09102 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public class09074() {
      super();
      this.B();
      this.N_0 = new class09084();
      this.N_1 = new class09090();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0;
         this.N_5 = false;
      }
   }

   public boolean N(class09071 var1, float var2, float var3, String var4, float var5, float var6, int var7, class09061 var8) {
      this.N_2 = var1;
      this.N_3 = var8;
      this.N_4 = var7;
      this.N_5 = true;
      ((class09090)this.N_1).N(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.N_5;
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
      if (!var3) {
         this.N_5 = false;
      } else {
         this.N(var4, var1, N(var2, (Integer)this.N_4));
      }
   }

   public boolean N(class09071 var1, float var2, float var3, class01028 var4, float var5, float var6, int var7, class09061 var8) {
      this.N_2 = var1;
      this.N_3 = var8;
      this.N_4 = var7;
      this.N_5 = true;
      ((class09090)this.N_1).N(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.N_5;
   }

   private void N(class09719 var1, int var2, int var3) {
      int i = ((class09071)this.N_2).u();
      int j = ((class09071)this.N_2).M();
      if (i > 0 && j > 0) {
         float f = ((class09090)this.N_1).y() + (((class09090)this.N_1).R() - ((class09090)this.N_1).N());
         float f1 = ((class09090)this.N_1).u();
         float f2 = f + var1.N;
         float f3 = f + var1.L;
         float f4 = f1 - var1.u;
         float f5 = f1 - var1.y;
         float f6 = 1.0F / ((class09090)this.N_1).L();
         float f7 = f2 * f6;
         float f8 = f4 * f6;
         float f9 = f3 * f6;
         float f10 = f5 * f6;
         float f11 = var1.i;
         float f12 = var1.B;
         float f13 = var1.M;
         float f14 = var1.R;
         ((class09084)this.N_0)
            .N(
               f7,
               f8,
               f9,
               f10,
               f11,
               f12,
               f13,
               f14,
               ((class09071)this.N_2).y(),
               i,
               j,
               var2,
               var3,
               var1.Z * f6,
               ((class09090)this.N_1).R(),
               ((class09090)this.N_1).M(),
               ((class09090)this.N_1).y(),
               ((class09090)this.N_1).u(),
               ((class09071)this.N_2).L()
            );
         ((class09061)this.N_3).accept((class09084)this.N_0);
      }
   }

   private static int N(class00405 var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         class05194 class05194 = var0.N();
         return class05194 == null ? var1 : var1 & 0xFF000000 | class05194.N() & 16777215;
      }
   }
}
