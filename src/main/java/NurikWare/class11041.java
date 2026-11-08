package NurikWare;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class11041 implements class11192<class09321> {
   public Object N_0;
   public Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public static Object i_0;
   public static Object i_1;

   private void M() {
   }

   class11041(JumpEffect var1, class11213 var2) {
      super();
      this.M();
      this.L_2 = var1;
      this.u_0 = new Matrix4f();
      this.u_1 = new Matrix4f();
      this.u_2 = new Matrix4f();
      this.u_3 = ((class09322)class11185.i_1).z("u_projection");
      this.u_4 = ((class09322)class11185.i_1).z("u_view");
      this.y_0 = ((class09322)class11185.i_1).L("texture_in");
      this.y_1 = ((class09322)class11185.i_1).L("depth_texture_in");
      this.y_2 = ((class09322)class11185.i_1).z("inv_mvp");
      this.y_3 = ((class09322)class11185.i_1).z("mvp");
      this.y_4 = ((class09322)class11185.i_1).N("wave_params");
      this.y_5 = ((class09322)class11185.i_1).N("first_color");
      this.y_6 = ((class09322)class11185.i_1).N("second_color");
      this.L_0 = ((class09322)class11185.i_1).R("gradient_dir");
      this.L_1 = ((class09322)class11185.i_1).y("waves");
      this.N_0 = var2;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_1).N(4).N()).N(var2).N();
   }

   static {
      N();
   }

   public void execute(class09321 var1) {
      int i = ((class09064)((JumpEffect)this.L_2).L_3).G();
      int j = ((class09064)((JumpEffect)this.L_2).L_3).u();
      float f = var1.u().N(true);
      ((Matrix4f)this.u_0).setOrtho(0.0F, i, j, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, i, j, -1);
      ((Matrix4f)this.u_1).set(var1.i()).mul(var1.N());
      ((Matrix4f)this.u_2).set((Matrix4f)this.u_1).invert();
      ((JumpEffect)this.L_2).N(var1.y().y(), f);
      class11925.N(JumpEffect.L((JumpEffect)this.L_2).e().i());
      class11925.N(JumpEffect.y((JumpEffect)this.L_2).e().L());
      ((class11174)this.N_1).N(var2x -> {
         ((class12038)this.u_3).N((Matrix4f)this.u_0);
         ((class12038)this.u_4).N((Matrix4f)class11925.y_3);
         ((class12003)this.y_0).N(0);
         ((class12003)this.y_1).N(6);
         ((class12038)this.y_2).N((Matrix4f)this.u_2);
         ((class12038)this.y_3).N((Matrix4f)this.u_1);
         ((class12043)this.y_4).N(0.1F, ((class11504)((JumpEffect)this.L_2).u_1).i(), 0.0F, 20.0F);
         ((class12043)this.y_5).N(((class11515)((JumpEffect)this.L_2).u_2).i());
         ((class12043)this.y_6).N(((class11515)((JumpEffect)this.L_2).u_3).i());
         double d0 = (((Integer)((JumpEffect)this.L_2).L_1).intValue() + f) / 8.0;
         ((class11993)this.L_0).N((float)Math.sin(d0), (float)Math.cos(d0));
         ((class11170)this.L_1).N((FloatBuffer)((JumpEffect)this.L_2).L_0);
      });
   }

   private static void N() {
      i_0 = 0;
      i_1 = 6;
   }
}
