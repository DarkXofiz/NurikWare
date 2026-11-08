package NurikWare;

public final class class09794 {
   private static final float N = 0.25F;
   private static final float y = 8.0F;
   private float L = 1.0F;
   private int u;

   public class09794() {
      super();
   }

   public int y() {
      return this.u;
   }

   public float N() {
      return this.L;
   }

   public void N(float var1) {
      float f = class09693.N(var1, 0.25F, 8.0F);
      if (Float.floatToIntBits(this.L) != Float.floatToIntBits(f)) {
         this.L = f;
         this.u++;
      }
   }
}
