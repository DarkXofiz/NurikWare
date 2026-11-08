package NurikWare;

public class class11243 implements class11192<class11257> {
   private static String[] R;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;

   public class11243(class11213 var1) {
      super();
      this.R();
      this.N_2 = ((class09322)class11185.L_3).z(R[0]);
      this.N_3 = ((class09322)class11185.L_3).z(R[1]);
      this.N_4 = ((class09322)class11185.L_3).L(R[2]);
      this.N_0 = var1;
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_3).N(4).N()).N(var1).N();
   }

   static {
      N();
      u();
   }

   private static void u() {
      R = new String[3];
      R[0] = "u_projection";
      R[1] = "u_view";
      R[2] = "textureIn";
   }

   public void execute(class11257 var1) {
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.Z(), var1.i(), -1);
      ((class11174)this.N_1).N(var2 -> {
         ((class12038)this.N_2).N(var1.z());
         ((class12038)this.N_3).N(var1.N());
         ((class12003)this.N_4).N(0);
      });
   }

   private static void N() {
   }

   private void R() {
   }
}
