package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class11446 extends class11807<Notifications> {
   public static Object y_0;
   public Object L_0;

   public class11446(Notifications var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.N();
      this.L_0 = new Object2IntOpenHashMap();
   }

   static {
      R();
   }

   @Override
   public void y(Object var1) {
      this.N();
      if (var1 instanceof class11403) {
         class11067 class11067 = ((class11403)var1).N();
         if (!class11067.R().N()) {
            return;
         }

         String s = class12020.N(class11067.U() ? "module-enabled" : "module-disabled").formatted(class11067.L());
         int i = class11938.g()
            .N(
               ((Object2IntMap)this.L_0).getInt(class11067),
               var2 -> var2.N(new class11875(class11067::U)).y(new class11857(s)),
               var2 -> var2.y().N(new class11875(class11067::U)).N(new class11857(s)).N(3000L)
            );
         ((Object2IntMap)this.L_0).put(class11067, i);
      }
   }

   private void N() {
   }

   private static void R() {
      y_0 = 3000L;
   }
}
