package NurikWare;

public record class11877(String icon) implements class11849 {
   public static Object N_0;
   public static Object N_1 = class09991.N().N(class09962.N()).y(class09962.N());

   private static void L() {
      N_0 = 16;
   }

   public class11877(String icon) {
      super();
      this.icon = icon;
   }

   static {
      y();
      L();
   }

   private static void y() {
   }

   public String N() {
      return this.icon;
   }

   @Override
   public class09798 N(class09809 var1, class11834 var2) {
      String s = "notify-icon-" + var2.N();
      class09991 class09991 = class09991.N().u(16.0F, 16.0F).i(var2.B().color());
      return class09778.N((class09991)N_1, var3x -> {
         var3x.N(s);
         var3x.L(var3xx -> var3xx.N(s + "-tex").L(this.icon).N(class09991));
      });
   }
}
