package NurikWare;

import minecraft.class07049;

public class class11012 extends class11034<class07049> {
   public Object y_0;
   public Object y_1;

   @Override
   public int L() {
      this.R();
      return ((class11515)this.y_1).i();
   }

   public class11012(Arrows var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
   }

   @Override
   public float N() {
      this.R();
      return ((class11504)this.y_0).i();
   }

   public void N(Arrows var1) {
      this.R();
      this.y_0 = (class11504)class11524.N(var1, "party-radius", 90.0F, 70.0F, 140.0F, 1.0F).N(var1x -> this.U());
      this.y_1 = (class11515)class11524.N(var1, "party-color", -16711681).N(var1x -> this.U());
   }

   public boolean test(class07049 var1) {
      return false;
   }

   private void R() {
   }
}
