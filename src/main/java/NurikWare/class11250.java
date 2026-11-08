package NurikWare;

public class class11250 implements class11192<class11270> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public static Object y_0;

   public class11250(class11213 var1, float var2) {
      super();
      this.R();
      this.N_3 = ((class09322)class11185.B_3).z("u_projection");
      this.N_4 = ((class09322)class11185.B_3).z("u_view");
      this.N_5 = ((class09322)class11185.B_3).L("texture_in");
      this.N_6 = ((class09322)class11185.B_3).R("texel_size");
      this.N_0 = var1;
      this.N_2 = var2;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_3).N(4).N()).N(var1).N();
   }

   static {
      N();
      i();
   }

   private static void i() {
      y_0 = 0;
   }

   private static void N() {
   }

   public void execute(class11270 var1) {
      class11176.y((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.i(), var1.z(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_3).N(var1.R());
         ((class12038)this.N_4).N(var1.M());
         ((class12003)this.N_5).N(0);
         ((class11993)this.N_6).N((Float)this.N_2 / var1.y(), (Float)this.N_2 / var1.N());
      });
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0.0F;
      }
   }
}
