package NurikWare;

public class class11879 implements class09780 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   public class11879(int var1, int var2, class11863 var3) {
      super();
      this.u();
      this.N_0 = new class11833(class09662.N(var1), class09662.N(var2), var3);
      this.N_1 = new class11833(class09662.y(var1), class09662.y(var2), var3);
      this.N_2 = new class11833(class09662.L(var1), class09662.L(var2), var3);
      this.N_3 = new class11833(class09662.u(var1), class09662.u(var2), var3);
   }

   private void u() {
   }

   @Override
   public boolean y() {
      return ((class11833)this.N_0).y() && ((class11833)this.N_1).y() && ((class11833)this.N_2).y() && ((class11833)this.N_3).y();
   }

   @Override
   public boolean N(class09753 var1) {
      int i = var1.L();
      ((class11833)this.N_0).y(class09662.N(i));
      ((class11833)this.N_1).y(class09662.y(i));
      ((class11833)this.N_2).y(class09662.L(i));
      ((class11833)this.N_3).y(class09662.u(i));
      return true;
   }

   @Override
   public boolean N(float var1) {
      boolean flag = ((class11833)this.N_0).N(var1);
      flag |= ((class11833)this.N_1).N(var1);
      flag |= ((class11833)this.N_2).N(var1);
      return flag | ((class11833)this.N_3).N(var1);
   }

   @Override
   public class09753 N() {
      return class09753.N(
         class09662.N(
            Math.round(((class11833)this.N_1).L()),
            Math.round(((class11833)this.N_2).L()),
            Math.round(((class11833)this.N_3).L()),
            Math.round(((class11833)this.N_0).L())
         )
      );
   }
}
