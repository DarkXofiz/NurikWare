package NurikWare;

import org.joml.Matrix4f;

public class class11430 implements class11192<class09317> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;

   public class11430(SkyCustomization var1, class11213 var2) {
      super();
      this.u();
      this.y_3 = new Matrix4f();
      this.N_0 = ((class09322)class11185.i_0).z("u_projection");
      this.N_1 = ((class09322)class11185.i_0).z("u_view");
      this.N_2 = ((class09322)class11185.i_0).z("inv_view_proj");
      this.N_3 = ((class09322)class11185.i_0).N("aurora_a");
      this.N_4 = ((class09322)class11185.i_0).N("aurora_b");
      this.N_5 = ((class09322)class11185.i_0).N("params");
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_0).N(4).N()).N(var2).N();
   }

   static {
      N();
   }

   private void u() {
   }

   public void execute(class09317 var1) {
      int i = ((SkyCustomization)this.y_0).v().G();
      int j = ((SkyCustomization)this.y_0).v().u();
      ((Matrix4f)this.y_3).setOrtho(0.0F, i, j, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.y_1, 0.0F, 0.0F, 0.0F, i, j, -1);
      float f = ((SkyCustomization)this.y_0).N(var1.L().N(true));
      ((class11174)this.y_2).N(var3x -> {
         ((class12038)this.N_0).N((Matrix4f)this.y_3);
         ((class12038)this.N_1).N((Matrix4f)class11925.y_3);
         ((class12038)this.N_2).N(var1.y());
         ((class12043)this.N_3).N(((SkyCustomization)this.y_0).n().i());
         ((class12043)this.N_4).N(((SkyCustomization)this.y_0).t().i());
         ((class12043)this.N_5).N(f, 0.0F, 0.0F, 0.0F);
      });
   }

   private static void N() {
   }
}
