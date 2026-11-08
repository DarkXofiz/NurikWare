package NurikWare;

import org.joml.Vector3d;

public class class11824 extends class11812 {
   private static double[] L;
   private static double[] M;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   public class11821<Vector3d> L() {
      this.U();
      return (class11821<Vector3d>)this.N_0;
   }

   public class11824() {
      super();
      this.U();
      this.N_0 = new class11821<>(new Vector3d(L[0], L[1], L[2]));
      this.N_1 = new class11821<>(new Vector3d(L[3], L[4], M[0]));
      this.N_2 = new class11821<>(new Vector3d(M[1], M[2], M[3]));
      this.N_3 = new class11821<>(false);
   }

   static {
      Z();
   }

   private static void Z() {
      L = new double[5];
      L[0] = Double.longBitsToDouble(0L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(0L);
      L[3] = Double.longBitsToDouble(0L);
      L[4] = Double.longBitsToDouble(0L);
      M = new double[4];
      M[0] = Double.longBitsToDouble(0L);
      M[1] = Double.longBitsToDouble(0L);
      M[2] = Double.longBitsToDouble(0L);
      M[3] = Double.longBitsToDouble(0L);
   }

   private void U() {
   }

   public class11821<Vector3d> u() {
      this.U();
      return (class11821<Vector3d>)this.N_2;
   }

   public class11821<Boolean> y() {
      this.U();
      return (class11821<Boolean>)this.N_3;
   }

   public class11821<Vector3d> N() {
      this.U();
      return (class11821<Vector3d>)this.N_1;
   }
}
