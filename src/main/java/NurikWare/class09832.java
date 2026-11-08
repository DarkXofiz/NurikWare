package NurikWare;

import java.util.Objects;

public final class class09832 {
   private final class09781 N;
   private final class09715 y;
   private final class09872 L;
   private final class10054 u;
   private final class10037 i;
   private final class09920 R;
   private final class09828 M;
   private final class10066 B;
   private final class09855 Z = new class09855(120.0F);
   private class09866 z;
   private float U = Float.NaN;
   private float E = Float.NaN;
   private class10021 W;
   private class09936 m = class09936.N();
   private boolean P;
   private boolean s;
   private boolean T;

   boolean L() {
      return this.s;
   }

   private void L(class10021 var1, class09850 var2) {
      if (!var2.N() && var2.L()) {
         var1.L(8);
      }
   }

   public class09832(class09781 var1) {
      this(var1, class09866.N());
   }

   public class09832(class09781 var1, class09866 var2) {
      super();
      this.N = Objects.requireNonNull(var1, "context");
      this.y = class09715.N(var1);
      this.L = class09872.N(var1);
      this.u = class10054.N(var1);
      this.i = class10037.N(var1);
      this.R = class09920.N(var1);
      this.M = class09828.N(var1);
      this.B = class10066.N(var1);
      this.N(var2);
   }

   boolean u() {
      return this.T;
   }

   private boolean y(class10021 var1, class09850 var2) {
      if (var2.N()) {
         return false;
      } else {
         return this.P != this.z.i() ? false : !var1.R(1);
      }
   }

   private void y(class10021 var1) {
      this.W = var1;
      this.Z.y();
      this.U = Float.NaN;
      this.E = Float.NaN;
      this.m = class09936.N();
      this.P = false;
   }

   private class09741 y(float var1) {
      float f = this.Z.y(var1);
      if (f <= 0.0F) {
         return class09741.N;
      } else {
         class09741 class09741 = this.y.y(f);
         boolean flag = this.i.N(f);
         class09847 class09847 = this.L.N(f);
         return class09741.N(class09741.N() || class09847.N() || flag, class09741.y() || flag);
      }
   }

   public class09866 y() {
      return this.z;
   }

   private boolean N(class10021 var1, float var2, float var3, class09850 var4) {
      if (!var4.N()) {
         return false;
      } else {
         boolean flag = this.u.N(var1, var2, var3, this.z.u());
         this.U = var2;
         this.E = var3;
         return flag;
      }
   }

   private class09850 N(class10021 var1, float var2, float var3, boolean var4) {
      boolean flag = Float.compare(this.U, var2) != 0 || Float.compare(this.E, var3) != 0;
      boolean flag1 = var1.R(2);
      boolean flag2 = flag || var4 || flag1;
      boolean flag3 = var1.R(4);
      boolean flag4 = var1.R(8);
      boolean flag5 = flag3 && !flag1 && !flag && !var4;
      return new class09850(flag2, flag5, flag4, flag);
   }

   private boolean N(class10021 var1, class09850 var2) {
      return !var2.y() ? false : this.u.N(var1);
   }

   public class09841 N(class09798 var1) {
      return new class09841(this.N, var1);
   }

   public class09781 N() {
      return this.N;
   }

   public void N(class09866 var1) {
      class09866 class09866 = var1 == null ? class09866.N() : var1;
      this.z = class09866;
      this.Z.N(class09866.y());
      this.M.N(class09866.L());
   }

   class09936 N(class09841 var1, int var2, int var3, float var4) {
      if (var1 == null) {
         this.s = false;
         this.T = false;
         return class09936.N();
      } else {
         float f = this.N.u().N();
         float f1 = Math.max(0.0F, (float)var2) / f;
         float f2 = Math.max(0.0F, (float)var3) / f;
         return this.N(var1, f1, f2, var4);
      }
   }

   class09936 N(class09841 var1, float var2, float var3, float var4) {
      if (var1 == null) {
         this.s = false;
         this.T = false;
         return class09936.N();
      } else {
         class10021 class10021 = (class10021)var1.y();
         float f = this.N(var4);
         this.N(class10021);
         class09741 class09741 = this.y(f);
         boolean flag = var1.B();
         boolean flag1 = this.B.N(f);
         this.M.N(class10021);
         boolean flag2 = this.M.y(class10021, f);
         class09850 class09850 = this.N(class10021, var2, var3, class09741.y() || flag);
         boolean flag3 = this.N(class10021, var2, var3, class09850);
         boolean flag4 = this.N(class10021, class09850);
         boolean flag5 = flag3 || flag4 || class09850.L() || class09850.u();
         boolean flag6 = var1.N(var2, var3, this.N.u().N(), flag5);
         if (class09850.u()) {
            class10021.u(1);
         }

         this.M.N(class10021);
         if (this.y(class10021, class09850)) {
            this.s = class09741.N() || flag1 || flag2 || flag;
            this.T = flag;
            return this.m;
         } else {
            if (flag3 || flag4 || flag6 || class09850.L()) {
               this.N.i().N();
            }

            class09936 class09936 = this.R.N(class10021, var2, var3, this.z.u(), this.z.i());
            this.L(class10021, class09850);
            this.m = class09936;
            this.P = this.z.i();
            this.s = class09741.N() || flag1 || flag2 || flag;
            this.T = flag3 || flag4 || flag6 || flag;
            return class09936;
         }
      }
   }

   private float N(float var1) {
      return Math.max(0.0F, var1);
   }

   private void N(class10021 var1) {
      if (var1 != this.W) {
         this.y(var1);
      }
   }
}
