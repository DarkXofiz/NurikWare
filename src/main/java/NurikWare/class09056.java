package NurikWare;

public class class09056 implements class11192<class09101> {
   public static Object N_0;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;

   private void M() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0.0F;
      }
   }

   public class09056(class11213 var1, float var2) {
      super();
      this.M();
      this.y_3 = ((class09322)class11185.B_3).z("u_projection");
      this.y_4 = ((class09322)class11185.B_3).z("u_view");
      this.y_5 = ((class09322)class11185.B_3).L("texture_in");
      this.y_6 = ((class09322)class11185.B_3).R("texel_size");
      this.y_0 = var1;
      this.y_2 = var2;
      this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_3).N(4).N()).N(var1).N();
   }

   static {
      N();
      i();
   }

   private static void i() {
      N_0 = 0;
   }

   private static void N() {
   }

   public void execute(class09101 var1) {
      class11176.N((class11213)this.y_0, var1.Z(), var1.R(), var1.B(), var1.i(), var1.u(), var1.L(), var1.U(), var1.M(), -1);
      ((class11174)this.y_1).N(var2 -> {
         ((class12038)this.y_3).N(var1.z());
         ((class12038)this.y_4).N(var1.y());
         ((class12003)this.y_5).N(0);
         ((class11993)this.y_6).N((Float)this.y_2 / var1.E(), (Float)this.y_2 / var1.m());
      });
   }
}
