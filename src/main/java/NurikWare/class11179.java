package NurikWare;

import java.util.List;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import org.joml.Vector3d;

public class class11179 {
   private static double[] Z;
   private static double[] b;
   private static double[] j;
   private static double[] n;
   private static double[] t;
   private static double[] Y;
   private static double[] X;
   private static double[] a;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public static Object y_0 = (double)class04995.Z(100);
   public static Object y_1 = class06202.Nq();
   public static Object y_2 = new class00734(Z[0], Z[1], Z[2], Z[3], Z[4], Z[5]);
   public Object L_0;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object i_0;
   public Object i_1;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public boolean R_init;

   private void L(double var1, double var3, double var5) {
      if (!(Boolean)this.R_7) {
         double d0 = var1;
         double d1 = var3;
         double d2 = var5;
         if (!(Boolean)this.R_2 && (var1 != t[1] || var3 != Y[0] || var5 != Y[1]) && class04995.E(var1) + class04995.E(var3) + class04995.E(var5) < (Double)y_0
            )
          {
            class06889 class06889 = class07049.method_20736(
               null, new class06889(var1, var3, var5), (class00734)this.R_6, (class03448)((class06202)y_1).T_3, List.of()
            );
            var1 = class06889.M;
            var3 = class06889.B;
            var5 = class06889.Z;
         }

         if (var1 != Y[2] || var3 != n[0] || var5 != n[1]) {
            this.R_6 = ((class00734)this.R_6).u(var1, var3, var5);
            this.t();
         }

         if (Math.abs(d1) >= n[2] && Math.abs(var3) < n[3]) {
            this.R_7 = true;
         }

         this.L_0 = d1 != var3 && d1 < n[4];
         if (d0 != var1) {
            ((Vector3d)this.N_1).x = X[0];
         }

         if (d2 != var5) {
            ((Vector3d)this.N_1).z = X[1];
         }
      }
   }

   public int L() {
      return (Integer)this.N_3;
   }

   public Vector3d M() {
      return (Vector3d)this.N_1;
   }

   private static void T() {
      y_0 = j[0];
   }

   public class11179(int var1, int var2) {
      super();
      this.b();
      this.i_0 = var1;
      this.i_1 = var2;
      this.N_2 = 1.0F;
      this.N_4 = class11908.y(0.0F, (float) (Math.PI * 2));
      this.N_5 = (Float)this.N_4;
      float f = class11908.y(0.03F, 0.2F);
      this.R_0 = class11908.y(0.0F, 1.0F) < 0.5F ? -f : f;
      this.R_2 = false;
      this.N_1 = new Vector3d();
      this.u_0 = new Vector3d();
      this.u_1 = new Vector3d();
      this.N_0 = new Vector3d(b[0], b[1], b[2]);
      this.R_5 = a[0];
      this.R_6 = (class00734)y_2;
   }

   static {
      n();
      T();
   }

   public Vector3d B() {
      return (Vector3d)this.u_0;
   }

   public Vector3d Z() {
      return (Vector3d)this.N_0;
   }

   public int i() {
      return (Integer)this.R_3;
   }

   private void b() {
      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0;
         this.i_1 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0.0F;
         this.N_3 = 0;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }

      if (!this.R_init) {
         this.R_init = true;
         this.R_0 = 0.0F;
         this.R_1 = Z[6];
         this.R_2 = false;
         this.R_3 = 0;
         this.R_4 = false;
         this.R_5 = Z[7];
         this.R_7 = false;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = false;
      }
   }

   private static void n() {
      b = new double[3];
      b[0] = Double.longBitsToDouble(4591870180174331904L);
      b[1] = Double.longBitsToDouble(4591870180174331904L);
      b[2] = Double.longBitsToDouble(4591870180174331904L);
      a = new double[3];
      a[0] = Double.longBitsToDouble(4607002274986721280L);
      a[1] = Double.longBitsToDouble(4585925428558828667L);
      a[2] = Double.longBitsToDouble(4604480258916220928L);
      t = new double[2];
      t[0] = Double.longBitsToDouble(4604480258916220928L);
      t[1] = Double.longBitsToDouble(0L);
      Y = new double[3];
      Y[0] = Double.longBitsToDouble(0L);
      Y[1] = Double.longBitsToDouble(0L);
      Y[2] = Double.longBitsToDouble(0L);
      n = new double[5];
      n[0] = Double.longBitsToDouble(0L);
      n[1] = Double.longBitsToDouble(0L);
      n[2] = Double.longBitsToDouble(4532020583461814272L);
      n[3] = Double.longBitsToDouble(4532020583461814272L);
      n[4] = Double.longBitsToDouble(0L);
      X = new double[4];
      X[0] = Double.longBitsToDouble(0L);
      X[1] = Double.longBitsToDouble(0L);
      X[2] = Double.longBitsToDouble(4611686018427387904L);
      X[3] = Double.longBitsToDouble(4611686018427387904L);
      Z = new double[8];
      Z[0] = Double.longBitsToDouble(0L);
      Z[1] = Double.longBitsToDouble(0L);
      Z[2] = Double.longBitsToDouble(0L);
      Z[3] = Double.longBitsToDouble(0L);
      Z[4] = Double.longBitsToDouble(0L);
      Z[5] = Double.longBitsToDouble(0L);
      Z[6] = Double.longBitsToDouble(0L);
      Z[7] = Double.longBitsToDouble(0L);
      j = new double[1];
      j[0] = Double.longBitsToDouble(0L);
   }

   public float m() {
      return (Float)this.N_5;
   }

   private void t() {
      ((Vector3d)this.u_1)
         .set(
            (((class00734)this.R_6).N + ((class00734)this.R_6).u) / X[2],
            ((class00734)this.R_6).y,
            (((class00734)this.R_6).L + ((class00734)this.R_6).R) / X[3]
         );
   }

   public boolean U() {
      return (Boolean)this.R_4;
   }

   public float z() {
      return (Float)this.R_0;
   }

   public int u() {
      return (Integer)this.i_0;
   }

   public class11179 y(float var1) {
      this.N_2 = var1;
      return this;
   }

   public void y(double var1, double var3, double var5) {
      ((Vector3d)this.u_1).set(var1, var3, var5);
      ((Vector3d)this.u_0).set(var1, var3, var5);
      this.R_6 = new class00734(
         var1 - ((Vector3d)this.N_0).x,
         var3,
         var5 - ((Vector3d)this.N_0).z,
         var1 + ((Vector3d)this.N_0).x,
         var3 + ((Vector3d)this.N_0).y,
         var5 + ((Vector3d)this.N_0).z
      );
   }

   public class11179 y(int var1) {
      this.N_3 = var1;
      return this;
   }

   public float y() {
      return (Float)this.N_4;
   }

   public void y(Vector3d var1) {
      this.y(var1.x, var1.y, var1.z);
   }

   public void y(class06889 var1) {
      this.N(var1.M, var1.B, var1.Z);
   }

   public class11179 y(double var1) {
      this.R_5 = var1;
      return this;
   }

   public void E() {
      ((Vector3d)this.u_0).set((Vector3d)this.u_1);
      this.N_5 = (Float)this.N_4;
      this.N_4 = (Float)this.N_4 + (Float)this.R_0;
      int i = (Integer)this.R_3;
      this.R_3 = i + 1;
      if (i >= (Integer)this.i_0) {
         this.R_4 = true;
      } else {
         ((Vector3d)this.N_1).y = ((Vector3d)this.N_1).y - a[1] * (Double)this.R_1;
         this.L(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z);
         ((Vector3d)this.N_1)
            .set(((Vector3d)this.N_1).x * (Double)this.R_5, ((Vector3d)this.N_1).y * (Double)this.R_5, ((Vector3d)this.N_1).z * (Double)this.R_5);
         if ((Boolean)this.L_0) {
            ((Vector3d)this.N_1).x = ((Vector3d)this.N_1).x * a[2];
            ((Vector3d)this.N_1).z = ((Vector3d)this.N_1).z * t[0];
         }
      }
   }

   public class11179 N(double var1) {
      this.R_1 = var1;
      return this;
   }

   public void N(Vector3d var1) {
      this.N(var1.x, var1.y, var1.z);
   }

   public class11179 N(float var1) {
      this.R_0 = var1;
      return this;
   }

   public void N(class06889 var1) {
      this.y(var1.M, var1.B, var1.Z);
   }

   public float N() {
      return (Float)this.N_2;
   }

   public void N(int var1) {
      this.i_0 = Math.min((Integer)this.i_0, (Integer)this.R_3 + var1);
   }

   public void N(double var1, double var3, double var5) {
      ((Vector3d)this.N_1).set(var1, var3, var5);
   }

   public class11179 N(boolean var1) {
      this.R_2 = var1;
      return this;
   }

   public Vector3d W() {
      return (Vector3d)this.u_1;
   }

   public int R() {
      return (Integer)this.i_1;
   }
}
