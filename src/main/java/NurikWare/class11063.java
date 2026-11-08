package NurikWare;

import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07438;

public class class11063 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;

   private static void L() {
      N_0 = -0.008;
      N_1 = 0.018F;
      N_2 = 0.08F;
   }

   class11063() {
      super();
   }

   static {
      L();
   }

   private boolean N(boolean var1, float var2, double var3) {
      return !var1 && var3 < -0.008 && var2 + 0.018F >= 0.08F;
   }

   public boolean N(class11087 var1, class07438 var2) {
      AttackAura attackaura = class11938.u().C();
      if (attackaura == null || ((class11535)attackaura.B_3).U()) {
         return true;
      } else {
         return (class04453)((class06202)class11087.N_0).T_4 != null && (class03448)((class06202)class11087.N_0).T_3 != null && var2 != null && !this.R()
            ? this.N(false, (float)((class04453)((class06202)class11087.N_0).T_4).field_6017, ((class04453)((class06202)class11087.N_0).T_4).method_18798().B)
               || this.N()
            : false;
      }
   }

   private boolean N() {
      class06889 class06889 = ((class04453)((class06202)class11087.N_0).T_4).method_18798();
      if (class06889.B >= -0.008) {
         return false;
      } else {
         class00734 class00734 = ((class04453)((class06202)class11087.N_0).T_4).method_5829();
         float f = (float)((class04453)((class06202)class11087.N_0).T_4).field_6017;
         double d0 = class06889.B;

         for (int i = 0; i < 2; i++) {
            class00734 = class00734.u(0.0, d0 - 0.001, 0.0);
            if (!((class03448)((class06202)class11087.N_0).T_3).method_8600((class04453)((class06202)class11087.N_0).T_4, class00734).iterator().hasNext()) {
               return false;
            }

            f += (float)Math.max(0.0, -d0);
            if (this.N(false, f, d0)) {
               return true;
            }

            d0 = (d0 - 0.08) * 0.98;
         }

         return false;
      }
   }

   private boolean R() {
      return ((class04453)((class06202)class11087.N_0).T_4).method_6101()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5799()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5681()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5771()
         || ((class04453)((class06202)class11087.N_0).T_4).method_5765()
         || ((class04453)((class06202)class11087.N_0).T_4).field_17046 != class06889.L
         || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.d)
         || ((class04453)((class06202)class11087.N_0).T_4).method_6059(class07047.P);
   }
}
