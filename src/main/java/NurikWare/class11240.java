package NurikWare;

import java.util.function.DoubleSupplier;

public class class11240 implements class11192<class11257> {
   private static String[] U;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public Object y_0;

   public class11240(class11213 var1, DoubleSupplier var2) {
      super();
      this.y();
      this.N_3 = ((class09322)class11185.L_5).z(U[0]);
      this.N_4 = ((class09322)class11185.L_5).z(U[1]);
      this.N_5 = ((class09322)class11185.L_5).L(U[2]);
      this.N_6 = ((class09322)class11185.L_5).L(U[3]);
      this.N_7 = ((class09322)class11185.L_5).i(U[4]);
      this.y_0 = ((class09322)class11185.L_5).i(U[5]);
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.L_5).N(4).N()).N(var1).N();
   }

   static {
      N();
      R();
   }

   private void y() {
   }

   private static void N() {
   }

   public void execute(class11257 var1) {
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.Z(), var1.i(), var1.R());
      ((class11174)this.N_2).N(var2 -> {
         ((class12038)this.N_3).N(var1.z());
         ((class12038)this.N_4).N(var1.N());
         ((class12003)this.N_5).N(6);
         ((class12003)this.N_6).N(0);
         ((class11200)this.N_7).N(var1.B());
         ((class11200)this.y_0).N((float)((DoubleSupplier)this.N_1).getAsDouble());
      });
   }

   private static void R() {
      U = new String[6];
      U[0] = "u_projection";
      U[1] = "u_view";
      U[2] = "texture_in";
      U[3] = "texture_jf";
      U[4] = "radius";
      U[5] = "time";
   }
}
