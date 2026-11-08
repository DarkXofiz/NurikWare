package NurikWare;

public class class11224 implements class11192<class11257> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public class11224(class11213 var1) {
      super();
      this.N();
      this.N_2 = ((class09322)class11185.U_0).z("u_projection");
      this.y_0 = ((class09322)class11185.U_0).z("u_view");
      this.y_1 = ((class09322)class11185.U_0).L("texture_in");
      this.y_2 = ((class09322)class11185.U_0).L("u_texture_in");
      this.y_3 = ((class09322)class11185.U_0).R("texel_size");
      this.y_4 = ((class09322)class11185.U_0).N("color");
      this.y_5 = ((class09322)class11185.U_0).y("weights");
      this.N_0 = var1;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.U_0).N(4).N()).N(var1).N();
   }

   public void execute(class11257 var1) {
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.Z(), var1.i(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_2).N(var1.z());
         ((class12038)this.y_0).N(var1.N());
         ((class12003)this.y_1).N(0);
         ((class12003)this.y_2).N(6);
         ((class11993)this.y_3).N(2.0F / var1.u(), 2.0F / var1.y());
         ((class12043)this.y_4).N(var1.R());
         ((class11170)this.y_5).N(var1.M());
      });
   }

   private void N() {
   }
}
