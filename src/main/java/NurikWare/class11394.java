package NurikWare;

public class class11394 {
   public static Object N_0 = new class11394();
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class11394() {
      super();
      this.B();
   }

   static {
      R();
   }

   private void B() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
      }
   }

   public float y() {
      return (Float)this.y_0;
   }

   public class11394 y(float var1) {
      this.y_0 = var1;
      return this;
   }

   public static class11394 N(float var0, float var1) {
      ((class11394)N_0).y_0 = var0;
      ((class11394)N_0).y_1 = var1;
      return (class11394)N_0;
   }

   public class11394 N(float var1) {
      this.y_1 = var1;
      return this;
   }

   public float N() {
      return (Float)this.y_1;
   }

   private static void R() {
   }
}
