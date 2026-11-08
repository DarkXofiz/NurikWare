package NurikWare;

import minecraft.class04995;
import org.joml.Vector2f;

public class class11623<P extends class11632> implements class11598<P> {
   public static Object L_0 = new class11623();

   @Override
   public void L(class09860 var1, P var2) {
      class09864 class09864 = (class09864)var1;
      if (class09864.L() == 0) {
         class09904 class09904 = var1.z();
         if (var2.N().equals(class09904.N())) {
            var2.u().N(true);
            var2.L().N(var2.L().L().set(class09864.N() - class09904.c().y(), class09864.y() - class09904.c().L()));
         }
      }
   }

   public class11623() {
      super();
   }

   static {
      i();
   }

   private static void i() {
      L_0 = null;
   }

   @Override
   public void y(class09860 var1, P var2) {
      if (var2.u().L()) {
         class09864 class09864 = (class09864)var1;
         Vector2f vector2f = var2.y().L();
         if (vector2f == null) {
            vector2f = new Vector2f();
         }

         Vector2f vector2f1 = var2.L().L();
         class09904 class09904 = var1.z();
         class09898 class09898x = class09904.X().c();
         class09898 class09898x = class09904.c();
         class11616 class11616 = this.N();
         var2.y()
            .N(
               vector2f.set(
                  class11616.y() ? N(class09864.N() - vector2f1.x, class09898x.u(), class09898x.u()) : vector2f.x,
                  class11616.N() ? N(class09864.y() - vector2f1.y, class09898x.i(), class09898x.i()) : vector2f.y
               )
            );
      }
   }

   @Override
   public void N(class09860 var1, P var2) {
      if (((class09864)var1).L() == 0) {
         var2.u().N(false);
      }
   }

   public class11616 N() {
      return class11616.FULL;
   }

   public static float N(float var0, float var1, float var2) {
      return var2 > var1 ? class04995.N(var0, -var2 / 2.0F, var1 - var2 / 2.0F) : class04995.N(var0, 0.0F, var1 - var2);
   }
}
