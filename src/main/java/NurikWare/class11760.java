package NurikWare;

public class class11760 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09692.N(class09994.z((class09743)class11644.N_0)));
   public static Object N_5 = class09991.N((class09991)N_4, class09991.N().P(1.0F));
   public static Object N_6 = class09991.N((class09991)N_4, class09991.N().P(1.05F));
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;

   private void L() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0L;
      }
   }

   public class11760(String var1) {
      super();
      this.L();
      this.y_0 = (var1.hashCode() & 65535) / 65535.0F * (float) (Math.PI * 2);
   }

   static {
      N();
      y();
   }

   private static void y() {
      L_0 = 1.05F;
      L_1 = 0.45F;
      L_2 = 1.2F;
      L_3 = 9.0F;
      N_0 = 13.0F;
      N_1 = 0.005F;
      N_2 = 0.05F;
      N_3 = Math.PI * 2;
      N_4 = null;
      N_5 = null;
      N_6 = null;
   }

   private float N(boolean var1) {
      long i = System.nanoTime();
      float f = (Long)this.y_2 == 0L ? 0.0F : Math.min(0.05F, (float)(i - (Long)this.y_2) / 1.0E9F);
      this.y_2 = i;
      float f1 = var1 ? 1.0F : 0.0F;
      this.y_1 = (Float)this.y_1 + (f1 - (Float)this.y_1) * Math.min(1.0F, f * (var1 ? 9.0F : 13.0F));
      if (!var1 && (Float)this.y_1 < 0.005F) {
         this.y_1 = 0.0F;
         return 0.0F;
      } else {
         double d0 = i / 1.0E9 * 13.96263438583813 + ((Float)this.y_0).floatValue();
         return (Float)this.y_1 * 1.2F * (float)Math.sin(d0);
      }
   }

   public class09798 N(class09809 var1, class11769 var2, class09785<Boolean> var3, class09798 var4) {
      float f = var1.L(var2.E() + "Jiggle", () -> this.N(var2.s() && !Boolean.TRUE.equals(var3.L())));
      boolean flag = Boolean.TRUE.equals(var3.L());
      return class09778.N(class09991.N(flag ? (class09991)N_6 : (class09991)N_5, class09991.N().s(f)), var2x -> {
         var2x.N(var2.E() + "Motion");
         var2x.y(var4);
      });
   }

   private static void N() {
   }
}
