package NurikWare;

public class class11258 implements class11192<class11270> {
   public static Object N_0;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public class11258(class11213 var1) {
      super();
      this.y();
      this.y_2 = ((class09322)class11185.L_1).z("u_projection");
      this.y_3 = ((class09322)class11185.L_1).z("u_view");
      this.y_4 = ((class09322)class11185.L_1).L("texture_in");
      this.y_5 = ((class09322)class11185.L_1).R("texel_size");
      this.y_0 = var1;
      this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_1).N(4).N()).N(var1).N();
   }

   static {
      N();
   }

   private void y() {
   }

   public void execute(class11270 var1) {
      class11176.y((class11213)this.y_0, 0.0F, 0.0F, 0.0F, var1.i(), var1.z(), -1);
      ((class11174)this.y_1).N(var2 -> {
         ((class12038)this.y_2).N(var1.R());
         ((class12038)this.y_3).N(var1.M());
         ((class12003)this.y_4).N(0);
         ((class11993)this.y_5).N(var1.U() * (2.0F / var1.y()), var1.U() * (2.0F / var1.N()));
      });
   }

   private static void N() {
      N_0 = 0;
   }
}
