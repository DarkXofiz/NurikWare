package NurikWare;

public class class09306 {
   public Object y_0;
   public boolean y_init;

   private void L() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   public class09306(int var1) {
      super();
      this.L();
      this.y_0 = var1;
   }

   public int y() {
      return (Integer)this.y_0;
   }
}
