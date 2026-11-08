package NurikWare;

public enum class11763 {
   LEFT(0.0F),
   CENTER(0.5F),
   RIGHT(1.0F);

   public Float fields_033c692263dec3df9a50f4d3e389deeb9_0;
   public class09991 fields_033c692263dec3df9a50f4d3e389deeb9_1;
   public boolean fields_033c692263dec3df9a50f4d3e389deeb9_init;

   private class11763(float var3) {
      this.R();
      this.fields_033c692263dec3df9a50f4d3e389deeb9_0 = var3;
      this.fields_033c692263dec3df9a50f4d3e389deeb9_1 = var3 == 0.0F ? class09991.N : class09991.N().N(class09666.y(-var3 * 100.0F));
   }

   static {
      B();
   }

   private static void B() {
   }

   public class09991 y() {
      return this.fields_033c692263dec3df9a50f4d3e389deeb9_1;
   }

   public float N() {
      return this.fields_033c692263dec3df9a50f4d3e389deeb9_0;
   }

   public static class11763 N(float var0, float var1) {
      if (!(var1 <= 0.0F) && !(var0 < var1 / 3.0F)) {
         return var0 < var1 * 2.0F / 3.0F ? CENTER : RIGHT;
      } else {
         return LEFT;
      }
   }

   private void R() {
      if (!this.fields_033c692263dec3df9a50f4d3e389deeb9_init) {
         this.fields_033c692263dec3df9a50f4d3e389deeb9_init = true;
         this.fields_033c692263dec3df9a50f4d3e389deeb9_0 = 0.0F;
      }
   }
}
