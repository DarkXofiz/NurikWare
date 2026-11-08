package NurikWare;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;

public class class09133 {
   public Object N_0;
   public boolean N_init;

   private int L(class07209 var1) {
      int i = 0;
      if (this.y(var1.method_10069(1, 0, 0)) || this.y(var1.method_10069(1, 1, 0))) {
         i++;
      }

      if (this.y(var1.method_10069(-1, 0, 0)) || this.y(var1.method_10069(-1, 1, 0))) {
         i++;
      }

      if (this.y(var1.method_10069(0, 0, 1)) || this.y(var1.method_10069(0, 1, 1))) {
         i++;
      }

      if (this.y(var1.method_10069(0, 0, -1)) || this.y(var1.method_10069(0, 1, -1))) {
         i++;
      }

      return i;
   }

   public class09133() {
      super();
      this.R();
   }

   private boolean y(class07209 var1) {
      class00500 class00500 = ((class03448)((class06202)class11087.N_0).T_3).method_8320(var1);
      if (class00500 != null && !class00500.P()) {
         class00494 class00494 = class00500.M((class03448)((class06202)class11087.N_0).T_3, var1);
         return class00494 != null && !class00494.method_1110();
      } else {
         return false;
      }
   }

   public void N() {
      this.N_0 = 0;
   }

   public boolean N(class07438 var1, class00734 var2, class06889 var3, double var4, float var6) {
      if ((class04453)((class06202)class11087.N_0).T_4 == null
         || (class03448)((class06202)class11087.N_0).T_3 == null
         || var1 == null
         || var2 == null
         || var3 == null) {
         this.N_0 = 0;
         return false;
      } else if (var4 > var6 + 0.75F) {
         this.N_0 = Math.max(0, (Integer)this.N_0 - 1);
         return (Integer)this.N_0 >= 2;
      } else {
         class07209 class07209 = class07209.method_49637(
            ((class04453)((class06202)class11087.N_0).T_4).method_23317(),
            ((class04453)((class06202)class11087.N_0).T_4).method_23318(),
            ((class04453)((class06202)class11087.N_0).T_4).method_23321()
         );
         int i = this.L(class07209);
         int j = this.N(class07209, 1, class07209.method_10264(), class07209.method_10264() + 1);
         int k = this.N(class07209, 2, class07209.method_10264(), class07209.method_10264() + 1);
         int l = this.N(class07209);
         boolean flag = i >= 3 || j >= 6;
         boolean flag1 = l >= 2 && (j >= 3 || k >= 8);
         boolean flag2 = j >= 5 && k >= 8;
         if (!flag && !flag1 && !flag2) {
            this.N_0 = Math.max(0, (Integer)this.N_0 - 1);
         } else {
            this.N_0 = Math.min(8, (Integer)this.N_0 + 2);
         }

         return (Integer)this.N_0 >= 2;
      }
   }

   private int N(class07209 var1) {
      int i = 0;
      int j = var1.method_10264() + 2;

      for (int k = -1; k <= 1; k++) {
         for (int l = -1; l <= 1; l++) {
            if (this.y(new class07209(var1.method_10263() + k, j, var1.method_10260() + l))) {
               i++;
            }
         }
      }

      return i;
   }

   private int N(class07209 var1, int var2, int var3, int var4) {
      int i = 0;

      for (int j = -var2; j <= var2; j++) {
         for (int k = -var2; k <= var2; k++) {
            if (Math.abs(j) == var2 || Math.abs(k) == var2) {
               for (int l = var3; l <= var4; l++) {
                  if (this.y(new class07209(var1.method_10263() + j, l, var1.method_10260() + k))) {
                     i++;
                     break;
                  }
               }
            }
         }
      }

      return i;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }
}
