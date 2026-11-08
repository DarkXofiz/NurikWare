package NurikWare;

import minecraft.class06202;
import org.joml.Vector2f;

public class class11633 extends class11623<class11632> {
   public Object N_0;
   public static Object y_0 = new class11633(class11616.FULL);
   public static Object y_1 = new class11633(class11616.HORIZONTAL);
   public static Object y_2 = new class11633(class11616.VERTICAL);

   @Override
   public void L(class09860 var1, class11632 var2) {
      class11769 class11769 = class11730.N(var2.N());
      if (class11769 != null && var1 instanceof class09864) {
         switch (((class09864)var1).L()) {
            case 0:
               class11769.P();
               break;
            case 2:
               class11769.M();
         }
      }

      super.L(var1, var2);
   }

   private static void M() {
   }

   private class11633(class11616 var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   static {
      M();
   }

   private static boolean u() {
      return class06202.Nq().s();
   }

   private void y() {
   }

   @Override
   public void y(class09860 var1, class11632 var2) {
      this.y();
      super.y(var1, var2);
      if (var2.u().L()) {
         ((class11738)class11738.y_0).N();
         Vector2f vector2f = var2.y().L();
         if (vector2f != null) {
            class09904 class09904 = var1.z();
            class09898 class09898 = class09904.X().c();
            Vector2f vector2f1 = new Vector2f(vector2f);
            if (u()) {
               ((class11738)class11738.y_0)
                  .N(
                     var2.N(),
                     vector2f1,
                     class09904.c().u(),
                     class09904.c().i(),
                     class09898.u(),
                     class09898.i(),
                     ((class11616)this.N_0).y(),
                     ((class11616)this.N_0).N()
                  );
            }

            if (((class11616)this.N_0).y()) {
               vector2f1.x = vector2f1.x + N(var2.N(), class09904.c().u());
            }

            if (!vector2f1.equals(vector2f)) {
               var2.y().N(vector2f1);
            }
         }
      }
   }

   @Override
   public class11616 N() {
      this.y();
      return (class11616)this.N_0;
   }

   public static class11598<class11632> N(class11616 var0) {
      return (class11598<class11632>)(switch (((int[])class11639.N_0)[var0.ordinal()]) {
         case 1 -> (class11633)y_0;
         case 2 -> (class11633)y_1;
         case 3 -> (class11633)y_2;
         case 4 -> (class11626)class11626.N_0;
         default -> throw new MatchException(null, null);
      });
   }

   private static float N(String var0, float var1) {
      class11769 class11769 = class11730.N(var0);
      return class11769 != null ? class11769.L().N() * var1 : 0.0F;
   }

   @Override
   public void N(class09860 var1, class11632 var2) {
      super.N(var1, var2);
      if (!var2.u().L()) {
         ((class11738)class11738.y_0).N();
      }
   }
}
