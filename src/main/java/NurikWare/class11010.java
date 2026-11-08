package NurikWare;

import minecraft.class07049;

public class class11010 extends class11023 {
   public Object y_0;
   public Object y_1;

   @Override
   public int L() {
      this.M();
      return ((class11515)this.y_1).i();
   }

   private void M() {
   }

   public class11010(Arrows var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.M();
   }

   @Override
   public boolean test(class07049 var1) {
      return class11791.E().and(class11791.N()).and(class11791.y().negate()).and(class11791.z().negate()).test(var1);
   }

   @Override
   public float N() {
      this.M();
      return ((class11504)this.y_0).i();
   }

   @Override
   public void N(Arrows var1) {
      this.M();
      this.y_0 = (class11504)class11524.N(var1, "friends-radius", 90.0F, 70.0F, 140.0F, 1.0F).N(var1x -> this.U());
      this.y_1 = (class11515)class11524.N(var1, "friend-color", -16711936).N(var1x -> this.U());
   }
}
