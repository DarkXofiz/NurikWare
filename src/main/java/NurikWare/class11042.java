package NurikWare;

import java.util.Optional;
import minecraft.class07049;
import minecraft.class07438;

public class class11042<T extends class07438> extends class11034<T> {
   public Object L_0;
   public Object L_1;

   @Override
   public int L() {
      this.B();
      return ((class11515)this.L_1).i();
   }

   public class11042(Arrows var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
   }

   static {
      u();
   }

   private void B() {
   }

   private static void u() {
   }

   public void N(Arrows var1) {
      String s = "living-radius";
      String s1 = "living-color";
      Optional.ofNullable((class11504)var1.L(var1.N_7(s).N())).ifPresentOrElse(var1x -> {
         this.B();
         this.L_0 = (class11504)var1x.N(var1x.Z().or(var1xx -> this.U()));
      }, () -> {
         this.B();
         this.L_0 = (class11504)class11524.N(var1, s, 90.0F, 70.0F, 140.0F, 1.0F).N(var1xx -> this.U());
      });
      Optional.ofNullable((class11515)var1.L(var1.N_7(s1).N())).ifPresentOrElse(var1x -> {
         this.B();
         this.L_1 = (class11515)var1x.N(var1x.Z().or(var1xx -> this.U()));
      }, () -> {
         this.B();
         this.L_1 = (class11515)class11524.N(var1, s1, -1).N(var1xx -> this.U());
      });
   }

   @Override
   public float N() {
      this.B();
      return ((class11504)this.L_0).i();
   }

   public boolean test(class07049 var1) {
      return var1 instanceof class07438;
   }
}
