package NurikWare;

import java.util.Objects;

public final class class09843<P> {
   private final class09832 N;
   private final class09788<P> y;
   private final class09879 L;
   private class09841 u;
   private P i;
   private boolean R;
   private class09810 M = class09810.N();

   private void L() {
      class09798 class09798 = this.R();

      try {
         this.u = this.N.N(class09798);
         this.L.L();
         this.R = false;
      } catch (RuntimeException runtimeexception) {
         this.L.u();
         throw runtimeexception;
      }
   }

   private class09843(class09832 var1, String var2, class09788<P> var3, P var4) {
      super();
      this.N = Objects.requireNonNull(var1, "engine");
      this.y = Objects.requireNonNull(var3, "root");
      class09872 class09872 = class09872.N(var1.N());
      this.L = new class09879(class09872, this::y, var2);
      this.i = (P)var4;
   }

   private void i() {
      if (!this.R && this.L.i()) {
         this.y();
      }
   }

   private void u() {
      if (this.R) {
         class09798 class09798 = this.R();
         class09810 class09810 = this.M;

         try {
            this.u.N(class09798, class09810);
            this.L.L();
            this.R = false;
            this.M = class09810.N();
         } catch (RuntimeException runtimeexception) {
            this.L.u();
            throw runtimeexception;
         }
      }
   }

   public void y() {
      this.N(class09810.N());
   }

   public class09936 N(int var1, int var2, float var3) {
      this.i();
      this.u();
      return this.N.N(this.u, var1, var2, var3);
   }

   public void N(P var1) {
      this.i = (P)var1;
      this.y();
   }

   private static class09810 N(class09810 var0, class09810 var1) {
      Objects.requireNonNull(var0, "current");
      Objects.requireNonNull(var1, "next");
      return var0.L() != class09787.REMOVE_IMMEDIATELY && var1.L() != class09787.REMOVE_IMMEDIATELY ? class09810.N() : class09810.y();
   }

   public static <P> class09843<P> N(class09832 var0, String var1, class09788<P> var2, P var3) {
      class09843 class09843 = new class09843<>(var0, var1, var2, var3);
      class09843.L();
      return class09843;
   }

   public class09841 N() {
      return this.u;
   }

   public void N(P var1, class09810 var2) {
      Objects.requireNonNull(var2, "renderOptions");
      this.i = (P)var1;
      this.N(var2);
   }

   public void N(class09810 var1) {
      Objects.requireNonNull(var1, "renderOptions");
      this.R = true;
      this.M = N(this.M, var1);
   }

   private class09798 R() {
      this.L.N();

      try {
         class09809 class09809 = this.L.y();
         return Objects.requireNonNull(this.y.render(this.i, class09809), "Root stateful component returned null");
      } catch (RuntimeException runtimeexception) {
         this.L.u();
         throw runtimeexception;
      }
   }
}
