package NurikWare;

import java.util.concurrent.ThreadLocalRandom;
import minecraft.class04995;
import minecraft.class06889;

public class class09139 {
   private class09139() {
      super();
   }

   public static class06889 N(float var0, float var1) {
      float f = var0 * (float) (Math.PI / 180.0);
      float f1 = -var1 * (float) (Math.PI / 180.0);
      float f2 = class04995.P(f1);
      float f3 = class04995.m(f1);
      float f4 = class04995.P(f);
      float f5 = class04995.m(f);
      return new class06889(f3 * f4, -f5, f2 * f4);
   }

   public static float N(double var0, double var2) {
      return var2 <= var0 ? (float)var0 : (float)(var0 + (var2 - var0) * ThreadLocalRandom.current().nextDouble());
   }
}
