package NurikWare;

import java.util.Optional;
import minecraft.class07049;
import minecraft.class07438;

public class class11413<T extends class07438> extends class11419<T> {
   public Object L_0;

   public class11413(Tracers var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
   }

   public void N(Tracers var1) {
      String s = "living-color";
      Optional.ofNullable((class11515)var1.L(var1.N_7(s).N())).ifPresentOrElse(var1x -> {
         this.R();
         this.L_0 = (class11515)var1x.N(var1x.Z().or(var1xx -> this.U()));
      }, () -> {
         this.R();
         this.L_0 = (class11515)class11524.N(var1, s, -1).N(var1xx -> this.U());
      });
   }

   public boolean test(class07049 var1) {
      return var1 instanceof class07438;
   }

   @Override
   public int N() {
      this.R();
      return ((class11515)this.L_0).i();
   }

   private void R() {
   }
}
