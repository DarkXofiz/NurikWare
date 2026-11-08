package NurikWare;

public class class11235 implements class11192<class11257> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;

   public class11235(class11213 var1) {
      super();
      this.R();
      this.N_2 = ((class09322)class11185.U_1).z("u_projection");
      this.N_3 = ((class09322)class11185.U_1).z("u_view");
      this.N_4 = ((class09322)class11185.U_1).L("texture_in");
      this.N_5 = ((class09322)class11185.U_1).R("texel_size");
      this.N_6 = ((class09322)class11185.U_1).N("color");
      this.N_7 = ((class09322)class11185.U_1).y("weights");
      this.N_0 = var1;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.U_1).N(4).N()).N(var1).N();
   }

   static {
      N();
   }

   private static void N() {
   }

   public void execute(class11257 var1) {
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.Z(), var1.i(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_2).N(var1.z());
         ((class12038)this.N_3).N(var1.N());
         ((class12003)this.N_4).N(0);
         ((class11993)this.N_5).N(2.0F / var1.u(), 2.0F / var1.y());
         ((class12043)this.N_6).N(var1.R());
         ((class11170)this.N_7).N(var1.M());
      });
   }

   private void R() {
   }
}
