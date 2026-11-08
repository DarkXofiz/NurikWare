package NurikWare;

import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11409 implements class11192<class09317> {
   public static Object N_0;
   public static Object N_1 = class06202.Nq();
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public class11409(class11213 var1) {
      super();
      this.R();
      this.y_2 = new Matrix4f();
      this.y_3 = ((class09322)class11185.B_5).z("u_projection");
      this.y_4 = ((class09322)class11185.B_5).z("u_view");
      this.y_5 = ((class09322)class11185.B_5).L("texture_in");
      this.y_0 = var1;
      this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_5).N(4).N()).N(var1).N();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = 0;
      N_1 = null;
   }

   private static void N() {
   }

   public void execute(class09317 var1) {
      class08066 class08066 = ((class06202)N_1).e();
      ((Matrix4f)this.y_2).setOrtho(0.0F, class08066.N, class08066.y, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.y_0, 0.0F, 0.0F, 0.0F, class08066.N, class08066.y, -1);
      ((class11174)this.y_1).N(var1x -> {
         ((class12038)this.y_3).N((Matrix4f)this.y_2);
         ((class12038)this.y_4).N((Matrix4f)class11925.y_3);
         ((class12003)this.y_5).N(0);
      });
   }

   private void R() {
   }
}
