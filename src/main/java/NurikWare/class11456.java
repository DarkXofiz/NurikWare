package NurikWare;

import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11456 implements class11192<class09317> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public static Object y_0;
   public static Object y_1 = class06202.Nq();

   public class11456(class11213 var1) {
      super();
      this.R();
      this.N_2 = new Matrix4f();
      this.N_3 = ((class09322)class11185.M_1).z("u_projection");
      this.N_4 = ((class09322)class11185.M_1).z("u_view");
      this.N_5 = ((class09322)class11185.M_1).z("inv_view_proj");
      this.N_6 = ((class09322)class11185.M_1).L("texture_in");
      this.N_7 = ((class09322)class11185.M_1).N("params");
      this.N_0 = var1;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.M_1).N(4).N()).N(var1).N();
   }

   static {
      N();
      y();
   }

   private static void y() {
      y_0 = 0;
      y_1 = null;
   }

   public void execute(class09317 var1) {
      class08066 class08066 = ((class06202)y_1).e();
      ((Matrix4f)this.N_2).setOrtho(0.0F, class08066.N, class08066.y, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, class08066.N, class08066.y, -1);
      ((class11174)this.N_1).N(var3 -> {
         ((class12038)this.N_3).N((Matrix4f)this.N_2);
         ((class12038)this.N_4).N((Matrix4f)class11925.y_3);
         ((class12038)this.N_5).N(var1.y());
         ((class12003)this.N_6).N(0);
         ((class12043)this.N_7).N(0.0F, class08066.N, 0.0F, 0.0F);
      });
   }

   private static void N() {
   }

   private void R() {
   }
}
