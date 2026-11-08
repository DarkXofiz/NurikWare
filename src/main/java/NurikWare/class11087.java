package NurikWare;

import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11087 {
   public static Object N_0 = class06202.Nq();
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   public boolean L() {
      AttackAura attackaura = class11938.u().C();
      return attackaura != null && attackaura.l();
   }

   private static void M() {
      N_0 = null;
   }

   class11087() {
      super();
      this.z();
      this.y_0 = new class11063();
      this.y_1 = new class09124();
      this.y_4 = System.currentTimeMillis();
   }

   static {
      M();
   }

   public int i() {
      return 800;
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0.0F;
         this.y_3 = false;
         this.y_4 = 0L;
         this.y_5 = 0;
      }
   }

   public int u() {
      return (Integer)this.y_5;
   }

   public class09124 y() {
      return (class09124)this.y_1;
   }

   public class11499 y(class07438 var1) {
      class06889 class06889 = class11069.N(var1, class11505.N(), (Float)this.y_2);
      return class06889 != null ? class09170.N(class06889) : class11505.N();
   }

   public void N(float var1, boolean var2, boolean var3) {
      this.y_2 = var1;
      this.y_3 = var2;
   }

   public boolean N(class07438 var1, class11499 var2) {
      return class11069.y(var1, var2, (Float)this.y_2);
   }

   public float N(class07438 var1) {
      return (Float)this.y_2;
   }

   public boolean N() {
      if ((class04453)((class06202)N_0).T_4 != null && (class03443)((class06202)N_0).T_2 != null) {
         AttackAura attackaura = class11938.u().C();
         int i = attackaura != null ? Math.max(1, attackaura.P().i().N() - 1) : 9;
         return ((class11799)((class03443)((class06202)N_0).T_2)).N() >= i;
      } else {
         return false;
      }
   }

   public void N(float var1) {
      this.y_2 = var1;
      ((class09124)this.y_1).N();
      this.y_5 = (Integer)this.y_5 + 1;
   }
}
