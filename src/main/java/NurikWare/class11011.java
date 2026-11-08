package NurikWare;

import minecraft.class00717;
import minecraft.class07049;

public class class11011 extends class11034<class00717> {
   public Object y_0;
   public Object y_1;

   @Override
   public int L() {
      this.W();
      return ((class11515)this.y_1).i();
   }

   public class11011(Arrows var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.W();
   }

   @Override
   public float N() {
      this.W();
      return ((class11504)this.y_0).i();
   }

   public boolean test(class07049 var1) {
      return class11791.M().test(var1);
   }

   public void N(Arrows var1) {
      this.W();
      this.y_0 = (class11504)class11524.N(var1, "item-radius", 90.0F, 70.0F, 140.0F, 1.0F).N(var1x -> this.U());
      this.y_1 = (class11515)class11524.N(var1, "item-color", -16711681).N(var1x -> this.U());
   }

   private void W() {
   }
}
