package NurikWare;

public class class11262 implements class11192<class11270> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;

   public class11262(class11213 var1, float[] var2, float var3) {
      super();
      this.y();
      this.N_5 = ((class09322)class11185.U_3).z("u_projection");
      this.N_6 = ((class09322)class11185.U_3).z("u_view");
      this.y_0 = ((class09322)class11185.U_3).L("texture_in");
      this.y_1 = ((class09322)class11185.U_3).R("texel_size");
      this.y_2 = ((class09322)class11185.U_3).R("direction");
      this.y_3 = ((class09322)class11185.U_3).L("radius");
      this.y_4 = ((class09322)class11185.U_3).y("weights");
      this.N_0 = var1;
      this.N_2 = var2[0];
      this.N_3 = var2[1];
      this.N_4 = var3;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.U_3).N(4).N()).N(var1).N();
   }

   static {
      N();
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
      }
   }

   private static void N() {
      L_0 = new float[]{1.0F, 0.0F};
      L_1 = new float[]{0.0F, 1.0F};
      L_2 = 0;
   }

   public void execute(class11270 var1) {
      class11176.y((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.i(), var1.z(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_5).N(var1.R());
         ((class12038)this.N_6).N(var1.M());
         ((class12003)this.y_0).N(0);
         ((class11993)this.y_1).N((Float)this.N_4 / var1.y(), (Float)this.N_4 / var1.N());
         ((class11993)this.y_2).N((Float)this.N_2, (Float)this.N_3);
         ((class12003)this.y_3).N(var1.U() - 1);
         ((class11170)this.y_4).N(var1.B());
      });
   }
}
