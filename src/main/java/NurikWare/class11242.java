package NurikWare;

public class class11242 implements class11192<class11270> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public static Object y_0;
   public static Object y_1;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;

   public class11242(class11213 var1) {
      super();
      this.u();
      this.N_2 = ((class09322)class11185.L_0).z("u_projection");
      this.N_3 = ((class09322)class11185.L_0).z("u_view");
      this.N_4 = ((class09322)class11185.L_0).z("invProjection");
      this.L_0 = ((class09322)class11185.L_0).z("invView");
      this.L_1 = ((class09322)class11185.L_0).i("dist");
      this.L_2 = ((class09322)class11185.L_0).L("texture_in");
      this.L_3 = ((class09322)class11185.L_0).L("depth_texture_in");
      this.N_0 = var1;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_0).N(4).N()).N(var1).N();
   }

   static {
      N();
      R();
   }

   private void u() {
   }

   public void execute(class11270 var1) {
      class11176.y((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.i(), var1.z(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_2).N(var1.R());
         ((class12038)this.N_3).N(var1.M());
         ((class12003)this.L_2).N(0);
         ((class12003)this.L_3).N(6);
         ((class12038)this.N_4).N(var1.L());
         ((class12038)this.L_0).N(var1.E());
         ((class11200)this.L_1).N(var1.u());
      });
   }

   private static void N() {
   }

   private static void R() {
      y_0 = 0;
      y_1 = 6;
   }
}
