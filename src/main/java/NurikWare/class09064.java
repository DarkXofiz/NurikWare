package NurikWare;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class class09064 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   public void w() {
      ((class09085)this.N_7).B();
   }

   public void L(int var1, int var2) {
      this.y_2 = var1;
      this.y_3 = var2;
   }

   public boolean L() {
      return ((class09085)this.N_7).Z();
   }

   public class09083 L(class09083 var1) {
      return ((class09085)this.N_7).N(var1);
   }

   public class09064 L(boolean var1) {
      if ((Boolean)this.y_5 != var1) {
         this.w();
         this.y_5 = var1;
      }

      return this;
   }

   public class09086 M(class09083 var1) {
      return ((class09085)this.N_7).B(var1);
   }

   public void M() {
      this.N(this.m(), this.B());
   }

   public class09057 P() {
      return ((class09085)this.N_7).M();
   }

   public void T() {
      ((class09085)this.N_7).i();
   }

   class09064(
      IntSupplier var1,
      IntSupplier var2,
      class11181 var3,
      boolean var4,
      class11199 var5,
      class11199 var6,
      class11175 var7,
      class11175 var8,
      boolean var9,
      String var10,
      BooleanSupplier var11
   ) {
      super();
      this.Y();
      this.N_7 = new class09085(this);
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = this.m();
      this.y_3 = this.B();
      this.y_4 = var3;
      this.y_5 = var4;
      this.N_0 = var5;
      this.N_1 = var6;
      this.N_2 = var7;
      this.N_3 = var8;
      this.N_4 = var9;
      this.N_5 = var10;
      this.N_6 = var11 == null ? () -> false : var11;
   }

   public void B(class09083 var1) {
      ((class09085)this.N_7).M(var1);
   }

   public int B() {
      return Math.max(1, ((IntSupplier)this.y_1).getAsInt());
   }

   public boolean Z() {
      return ((BooleanSupplier)this.N_6).getAsBoolean();
   }

   public boolean i(class09083 var1) {
      return ((class09085)this.N_7).L(var1);
   }

   public class09096 i() {
      return this.s();
   }

   public class09096 i(int var1, int var2) {
      class09073 class09073x = new class09073(
         var1, var2, (class11181)this.y_4, (class11199)this.N_0, (class11199)this.N_1, (class11175)this.N_2, (class11175)this.N_3, (Boolean)this.N_4, 3
      );
      class09073 class09073x = (Boolean)this.y_5
         ? new class09073(var1, var2, class11181.DEPTH32, class11199.NEAREST, class11199.NEAREST, class11175.CLAMP_TO_EDGE, class11175.CLAMP_TO_EDGE, false, 5)
         : null;
      return new class09096(class09073x, class09073x, (String)this.N_5);
   }

   public class11199 b() {
      return (class11199)this.N_1;
   }

   public class09096 s() {
      return this.i(this.m(), this.B());
   }

   public class11175 n() {
      return (class11175)this.N_2;
   }

   public class11199 l() {
      return (class11199)this.N_0;
   }

   public String d() {
      return (String)this.N_5;
   }

   public int m() {
      return Math.max(1, ((IntSupplier)this.y_0).getAsInt());
   }

   public static class09095 k() {
      return new class09095();
   }

   public boolean t() {
      return ((class09085)this.N_7).y();
   }

   public boolean v() {
      return (Boolean)this.y_5;
   }

   public class09083 j() {
      return ((class09085)this.N_7).N();
   }

   public class09057 U() {
      return ((class09085)this.N_7).R();
   }

   public class09086 z() {
      return ((class09085)this.N_7).L();
   }

   public static class09064 u(int var0, int var1) {
      return y(var0, var1).N();
   }

   public class09057 u(class09083 var1) {
      return ((class09085)this.N_7).u(var1);
   }

   public int u() {
      return (Integer)this.y_3;
   }

   public boolean y() {
      return (Integer)this.y_2 != this.m() || (Integer)this.y_3 != this.B();
   }

   public static class09095 y(int var0, int var1) {
      return N(() -> var0, () -> var1);
   }

   public class09083 y(class09083 var1) {
      return ((class09085)this.N_7).R(var1);
   }

   public class09064 y(boolean var1) {
      return this.N(() -> !var1);
   }

   public boolean E() {
      return (Boolean)this.N_4;
   }

   public class09064 N(class11175 var1) {
      return this.N(var1, var1);
   }

   public class09064 N(String var1) {
      this.N_5 = var1;
      return this;
   }

   public static class09095 N(IntSupplier var0, IntSupplier var1) {
      return k()
         .N(var0)
         .y(var1)
         .N(class11181.RGBA8)
         .N(class11199.NEAREST)
         .y(class11199.NEAREST)
         .L(class11175.CLAMP_TO_EDGE)
         .N(class11175.CLAMP_TO_EDGE)
         .N(() -> false);
   }

   public class09064 N(class11181 var1) {
      if ((class11181)this.y_4 != var1) {
         this.w();
         this.y_4 = var1;
      }

      return this;
   }

   public void N(long var1, long var3) {
      ((class09085)this.N_7).N(var1, var3);
   }

   public class09064 N(class11175 var1, class11175 var2) {
      if ((class11175)this.N_2 != var1 || (class11175)this.N_3 != var2) {
         this.w();
         this.N_2 = var1;
         this.N_3 = var2;
      }

      return this;
   }

   public class09064 N(boolean var1) {
      if ((Boolean)this.N_4 != var1) {
         this.w();
         this.N_4 = var1;
      }

      return this;
   }

   public class09064 N(class11199 var1, class11199 var2) {
      if ((class11199)this.N_0 != var1 || (class11199)this.N_1 != var2) {
         this.w();
         this.N_0 = var1;
         this.N_1 = var2;
      }

      return this;
   }

   public class09057 N(class09083 var1) {
      return ((class09085)this.N_7).i(var1);
   }

   public class09064 N(BooleanSupplier var1) {
      this.N_6 = var1 == null ? () -> false : var1;
      return this;
   }

   public void N() {
      ((class09085)this.N_7).u();
   }

   public void N(int var1, int var2) {
      var1 = Math.max(1, var1);
      var2 = Math.max(1, var2);
      if ((Integer)this.y_2 != var1 || (Integer)this.y_3 != var2) {
         this.L(var1, var2);
         ((class09085)this.N_7).y(var1, var2);
      }
   }

   public class11181 W() {
      return (class11181)this.y_4;
   }

   public class11175 R() {
      return (class11175)this.N_3;
   }

   public void R(class09083 var1) {
      ((class09085)this.N_7).y(var1);
   }

   public int G() {
      return (Integer)this.y_2;
   }

   private void Y() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_5 = false;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = false;
      }
   }
}
