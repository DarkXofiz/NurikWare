package NurikWare;

public abstract class class09860 {
   private final class09867 N;
   private final class09841 y;
   private final class09904 L;
   private final boolean u;
   private final boolean i;
   private class09904 R;
   private class09875 M = class09875.AT_TARGET;
   private boolean B;
   private boolean Z;
   private boolean z;
   private boolean U;
   private boolean E;

   public final class09841 M() {
      return this.y;
   }

   public final boolean P() {
      return this.E;
   }

   public void T() {
      this.B = true;
   }

   protected class09860(class09867 var1, class09904 var2) {
      this(var1, var2, var1 != null && var1.N(), var1 != null && var1.y());
   }

   protected class09860(class09867 var1, class09904 var2, boolean var3, boolean var4) {
      super();
      this.N = var1;
      this.y = var2 == null ? null : var2.K();
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   public final boolean B() {
      return this.u;
   }

   public final boolean Z() {
      return this.i;
   }

   public final class09867 i() {
      return this.N;
   }

   public void b() {
      this.Z = true;
      this.B = true;
   }

   public void s() {
      this.E = true;
      this.T();
   }

   public final boolean m() {
      return this.z;
   }

   public void v() {
      this.U = false;
   }

   public void j() {
      if (this.i && !this.U) {
         this.z = true;
      }
   }

   public final class09875 U() {
      return this.M;
   }

   public final class09904 z() {
      return this.R;
   }

   public final boolean E() {
      return this.B;
   }

   void N(class09875 var1) {
      this.M = var1;
   }

   public void N(boolean var1) {
      this.U = var1;
   }

   void N(class09904 var1) {
      this.R = var1;
   }

   public final boolean W() {
      return this.Z;
   }

   public final class09904 R() {
      return this.L;
   }
}
