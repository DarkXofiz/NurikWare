package NurikWare;

public class class11462 {
   public Object y_0;
   public Object y_1;

   public boolean L() {
      return (Integer)this.y_0 <= 0;
   }

   public int M() {
      return (Integer)this.y_0;
   }

   public class11462(int var1, Runnable var2) {
      super();
      this.R();
      this.y_0 = var1;
      this.y_1 = var2;
   }

   public Runnable B() {
      return (Runnable)this.y_1;
   }

   public boolean u() {
      int i = (Integer)this.y_0 - 1;
      this.y_0 = i;
      if (i == 0) {
         ((Runnable)this.y_1).run();
         return true;
      } else {
         return false;
      }
   }

   private void R() {
      this.y_0 = 0;
   }
}
