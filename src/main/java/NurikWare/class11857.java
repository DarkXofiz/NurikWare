package NurikWare;

import java.time.Duration;

public record class11857(String text) implements class11868 {
   public static Object y_0;
   public static Object y_1;
   public static Object y_2 = Duration.ofMillis(180L);
   public static Object y_3;
   public static Object y_4 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09976.PARENT);
   public static Object y_5 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F);

   private static void M() {
      y_0 = 14;
      y_1 = 14.0F;
      y_2 = null;
      y_3 = null;
      y_4 = null;
      y_5 = null;
   }


   static {
      M();
      class09991 class09991 = class09991.N();
      y_3 = class09991.N(class09991.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   public String y() {
      return this.text;
   }

   @Override
   public class09798 N(class09809 var1, class11834 var2) {
      String s = "notifyText-" + var2.N();
      class11865 class11865 = var1.u(s + "-slide", class11865::new);
      class11865.N(this.text);
      float f = class11865.i();
      boolean flag = class11865.M();
      return class09778.N((class09991)y_4, var5x -> {
         var5x.N(s + "-clip");
         if (flag) {
            class09991 class09991x = class09991.N((class09991)y_5, class09991.N().m(-14.0F * f));
            var5x.N_3(class09991x, var3xx -> {
               var3xx.N(s + "-old");
               var3xx.y(var3xxx -> var3xxx.N(s + "-oldText").L(class11865.y()).N(N(1.0F - f)));
            });
         }

         class09991 class09991 = flag ? class09991.N().m(14.0F * (1.0F - f)) : class09991.N();
         var5x.N_3(class09991, var4xx -> {
            var4xx.N(s + "-current");
            var4xx.y(var4xxx -> var4xxx.N(s + "-currentText").L(this.text).N(N(flag ? f : 1.0F)));
         });
      });
   }

   @Override
   public float N() {
      return class11938.i().N(this.text, 14.0F, class09079.REGULAR);
   }

   private static class09991 N(float var0) {
      return var0 >= 1.0F ? (class09991)y_3 : class09991.N((class09991)y_3, class09991.N().i(class11300.u((Integer)class09181.N_0, var0)));
   }
}
