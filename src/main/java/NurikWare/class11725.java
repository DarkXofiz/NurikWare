package NurikWare;

public class class11725 implements class09868 {
   public Object N_0;

   private boolean L(class09838 var1) {
      return var1 != null && var1.L() == class09870.ITALIC;
   }

   public class11725() {
      super();
      this.u();
   }

   private void u() {
   }

   private class09079 y(class09838 var1) {
      return class09079.N(var1.y()).orElse(class09079.REGULAR);
   }

   private float N(float var1, float var2) {
      return Math.max(1.0F, (float)Math.round(var1 * var2));
   }

   @Override
   public float N(String var1, float var2, class09838 var3) {
      float f = ((class09794)this.N_0).N();
      return N(var3).y(var1, this.N(var2, f), this.y(var3), this.L(var3)) / f;
   }

   @Override
   public float N(int var1, float var2, class09838 var3) {
      class09079 class09079 = this.y(var3);
      boolean flag = this.L(var3);
      float f = ((class09794)this.N_0).N();
      float f1 = this.N(var2, f);

      return switch (var1) {
         case 9 -> Math.round(N(var3).N(f1, class09079, flag, 32) * 4.0F) / f;
         case 10, 13 -> 0.0F;
         default -> Math.round(N(var3).N(f1, class09079, flag, var1)) / f;
      };
   }

   private static class09093 N(class09838 var0) {
      class09093 class09093 = class09080.N(var0.N());
      if (class09093 == null) {
         throw new IllegalArgumentException("Unknown font family: " + var0.N());
      } else {
         return class09093;
      }
   }

   public void N(class09794 var1) {
      this.N_0 = var1;
   }

   @Override
   public float N(float var1, class09838 var2) {
      float f = ((class09794)this.N_0).N();
      return N(var2).N(this.N(var1, f), this.y(var2), this.L(var2)) / f;
   }

   @Override
   public float N(int var1, int var2, float var3, class09838 var4) {
      float f = ((class09794)this.N_0).N();
      class09093 class09093 = N(var4);
      class09079 class09079 = this.y(var4);
      boolean flag = this.L(var4);
      float f1 = this.N(var3, f);
      float f2 = class09093.N(f1, class09079, flag, var1);
      float f3 = class09093.N(f1, class09079, flag, var1, var2);
      return (Math.round(f2 + f3) - Math.round(f2)) / f;
   }
}
