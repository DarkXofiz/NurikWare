package NurikWare;

import minecraft.class07049;
import minecraft.class08036;

public class class11414 extends class11413<class08036> {
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;

   private void M() {
   }

   public class11414(Tracers var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.M();
      this.u_0 = new class11785("invisible", false);
      this.u_1 = new class11786("naked", true);
      this.u_2 = new class11793("bot", true);
   }

   @Override
   public boolean test(class07049 var1) {
      this.M();
      return class11791.B()
         .and(class11791.N())
         .and(class11791.E().negate())
         .and(class11791.y().negate())
         .and((class11786)this.u_1)
         .and((class11785)this.u_0)
         .and((class11793)this.u_2)
         .test(var1);
   }

   @Override
   public void N(Tracers var1) {
      this.M();
      class11524.y(var1, "target-condition", (class11785)this.u_0, (class11786)this.u_1, (class11793)this.u_2).N(var1x -> this.U());
      this.u_3 = (class11515)class11524.N(var1, "player-color", -65536).N(var1x -> this.U());
   }

   @Override
   public int N() {
      this.M();
      return ((class11515)this.u_3).i();
   }
}
