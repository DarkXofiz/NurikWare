package NurikWare;

import minecraft.class08066;
import org.joml.Matrix4f;

public class class11049 implements class11192<class09321> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public static Object y_0;

   class11049(JumpEffect var1, class11213 var2) {
      super();
      this.u();
      this.N_6 = var1;
      this.N_2 = new Matrix4f();
      this.N_3 = ((class09322)class11185.B_5).z("u_projection");
      this.N_4 = ((class09322)class11185.B_5).z("u_view");
      this.N_5 = ((class09322)class11185.B_5).L("texture_in");
      this.N_0 = var2;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_5).N(4).N()).N(var2).N();
   }

   static {
      N();
      R();
   }

   private void u() {
   }

   private static void N() {
   }

   public void execute(class09321 var1) {
      class08066 class08066 = JumpEffect.N((JumpEffect)this.N_6).e();
      ((Matrix4f)this.N_2).setOrtho(0.0F, class08066.N, class08066.y, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, class08066.N, class08066.y, -1);
      ((class11174)this.N_1).N(var1x -> {
         ((class12038)this.N_3).N((Matrix4f)this.N_2);
         ((class12038)this.N_4).N((Matrix4f)class11925.y_3);
         ((class12003)this.N_5).N(0);
      });
   }

   private static void R() {
      y_0 = 0;
   }
}
