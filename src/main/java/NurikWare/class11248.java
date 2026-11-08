package NurikWare;

public class class11248 implements class11192<class11257> {
   private static String[] Z;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   public class11248(class11213 var1, int var2) {
      super();
      this.L();
      this.N_3 = ((class09322)class11185.L_4).z(Z[0]);
      this.N_4 = ((class09322)class11185.L_4).z(Z[1]);
      this.N_5 = ((class09322)class11185.L_4).L(Z[2]);
      this.N_6 = ((class09322)class11185.L_4).R(Z[3]);
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_4).N(4).N()).N(var1).N();
   }

   static {
      N();
      y();
   }

   private static void y() {
      Z = new String[4];
      Z[0] = "u_projection";
      Z[1] = "u_view";
      Z[2] = "textureIn";
      Z[3] = "texelSize";
   }

   private static void N() {
   }

   public void execute(class11257 var1) {
      class11176.N((class11213)this.N_0, 0.0F, 0.0F, 0.0F, var1.Z(), var1.i(), -1);
      ((class11174)this.N_2).N(var2 -> {
         ((class12038)this.N_3).N(var1.z());
         ((class12038)this.N_4).N(var1.N());
         ((class12003)this.N_5).N(0);
         ((class11993)this.N_6).N(((Integer)this.N_1).intValue() / var1.u(), ((Integer)this.N_1).intValue() / var1.y());
      });
   }
}
