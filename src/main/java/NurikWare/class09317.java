package NurikWare;

import minecraft.class02233;
import org.joml.Matrix4f;

public class class09317 {
   public Object N_0;
   public Object N_1;
   public static Object y_0 = new class09317();

   public class02233 L() {
      return (class02233)this.N_1;
   }

   private void M() {
   }

   public class09317() {
      super();
      this.M();
      this.N_0 = new Matrix4f();
   }

   static {
      i();
   }

   private static void i() {
   }

   public Matrix4f y() {
      return (Matrix4f)this.N_0;
   }

   public void N(Matrix4f var1, Matrix4f var2, class02233 var3) {
      ((Matrix4f)this.N_0).set(var1).mul(var2).invert();
      this.N_1 = var3;
   }

   public static class09317 N() {
      return (class09317)y_0;
   }
}
