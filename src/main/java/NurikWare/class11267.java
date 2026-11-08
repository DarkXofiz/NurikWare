package NurikWare;

public class class11267 implements class11192<class11270> {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;

   private static void M() {
      N_0 = 0;
      N_1 = 6;
   }

   public class11267(class11213 var1) {
      super();
      this.y();
      this.L_0 = ((class09322)class11185.u_1).z("u_projection");
      this.L_1 = ((class09322)class11185.u_1).z("u_view");
      this.L_2 = ((class09322)class11185.u_1).z("invProjection");
      this.L_3 = ((class09322)class11185.u_1).z("invView");
      this.L_4 = ((class09322)class11185.u_1).i("dist");
      this.L_5 = ((class09322)class11185.u_1).L("texture_in");
      this.L_6 = ((class09322)class11185.u_1).L("depth_texture_in");
      this.y_0 = var1;
      this.y_1 = class11174.N().N(class11204.L().N(((class12036)class12019.N_0).L().N()).N((class09322)class11185.u_1).N(4).N()).N(var1).N();
   }

   static {
      N();
      M();
   }

   private void y() {
   }

   public void execute(class11270 var1) {
      class11176.N((class11213)this.y_0, 0.0F, 0.0F, 1.0F, var1.i(), var1.z(), var1.Z());
      ((class11174)this.y_1).N(var2 -> {
         ((class12038)this.L_0).N(var1.R());
         ((class12038)this.L_1).N(var1.M());
         ((class12003)this.L_5).N(0);
         ((class12003)this.L_6).N(6);
         ((class12038)this.L_2).N(var1.L());
         ((class12038)this.L_3).N(var1.E());
         ((class11200)this.L_4).N(var1.u());
      });
   }

   private static void N() {
   }
}
