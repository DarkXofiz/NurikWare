package NurikWare;

import org.joml.Matrix4f;

public class class11425 implements class11192<class09317> {
   public Object N_0;
   public Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;

   public class11425(SkyCustomization var1, class11213 var2) {
      super();
      this.R();
      this.y_1 = new Matrix4f();
      this.y_2 = ((class09322)class11185.M_0).z("u_projection");
      this.y_3 = ((class09322)class11185.M_0).z("u_view");
      this.y_4 = ((class09322)class11185.M_0).z("inv_view_proj");
      this.y_5 = ((class09322)class11185.M_0).N("aurora_a");
      this.y_6 = ((class09322)class11185.M_0).N("aurora_b");
      this.y_7 = ((class09322)class11185.M_0).N("params");
      this.N_0 = var1;
      this.N_1 = var2;
      this.y_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.M_0).N(4).N()).N(var2).N();
   }

   static {
      N();
   }

   private static void N() {
   }

   public void execute(class09317 var1) {
      int i = ((SkyCustomization)this.N_0).b().G();
      int j = ((SkyCustomization)this.N_0).b().u();
      ((Matrix4f)this.y_1).setOrtho(0.0F, i, j, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.N_1, 0.0F, 0.0F, 0.0F, i, j, -1);
      float f = ((SkyCustomization)this.N_0).N(var1.L().N(true));
      ((class11174)this.y_0).N(var3x -> {
         ((class12038)this.y_2).N((Matrix4f)this.y_1);
         ((class12038)this.y_3).N((Matrix4f)class11925.y_3);
         ((class12038)this.y_4).N(var1.y());
         ((class12043)this.y_5).N(((SkyCustomization)this.N_0).n().i());
         ((class12043)this.y_6).N(((SkyCustomization)this.N_0).t().i());
         ((class12043)this.y_7).N(f, ((SkyCustomization)this.N_0).m().i(), ((SkyCustomization)this.N_0).T().i(), ((SkyCustomization)this.N_0).P().i());
      });
   }

   private void R() {
   }
}
