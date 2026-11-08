package NurikWare;

public class class09067 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;

   class09067(class11213 var1, class09322 var2, boolean var3, boolean var4, String var5) {
      super();
      this.y();
      this.N_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N(var2).N(4).N()).N(var1).N();
      this.N_1 = var2.z("u_projection");
      this.N_2 = var2.z("u_view");
      this.N_3 = var2.L("texture_in");
      this.N_4 = var2.R("texel_size");
      this.N_5 = var4 ? var2.R("direction") : null;
      this.N_6 = var3 ? var2.L("radius") : null;
      this.N_7 = var5 != null ? var2.y(var5) : null;
   }

   static {
      N();
   }

   private void y() {
   }

   void N(class09101 var1, float var2, float var3) {
      ((class11174)this.N_0).N(var4 -> {
         ((class12038)this.N_1).N(var1.z());
         ((class12038)this.N_2).N(var1.y());
         ((class12003)this.N_3).N(0);
         ((class11993)this.N_4).N(1.0F / var1.E(), 1.0F / var1.m());
         if ((class11993)this.N_5 != null) {
            ((class11993)this.N_5).N(var2, var3);
         }

         if ((class12003)this.N_6 != null) {
            ((class12003)this.N_6).N(var1.N() - 1);
         }

         if ((class11170)this.N_7 != null) {
            ((class11170)this.N_7).N(var1.W());
         }
      });
   }

   private static void N() {
   }
}
