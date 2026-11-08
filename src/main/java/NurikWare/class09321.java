package NurikWare;

import minecraft.class01421;
import minecraft.class02233;
import minecraft.class05363;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class class09321 {
   public static Object N_0 = new class09321();
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public class01421 L() {
      return (class01421)this.y_4;
   }

   public class09321() {
      super();
      this.B();
      this.y_5 = new Matrix4fStack(16);
   }

   static {
      U();
   }

   private void B() {
   }

   public Matrix4f i() {
      return (Matrix4f)this.y_1;
   }

   private static void U() {
   }

   public class02233 u() {
      return (class02233)this.y_2;
   }

   public class05363 y() {
      return (class05363)this.y_3;
   }

   public Matrix4f N() {
      return (Matrix4f)this.y_0;
   }

   public static class09321 N(Matrix4f var0, Matrix4f var1, class02233 var2, class05363 var3, class01421 var4) {
      ((class09321)N_0).y_0 = var1;
      ((class09321)N_0).y_1 = var0;
      ((class09321)N_0).y_2 = var2;
      ((class09321)N_0).y_3 = var3;
      ((class09321)N_0).y_4 = var4;
      return (class09321)N_0;
   }

   public Matrix4fStack R() {
      return (Matrix4fStack)this.y_5;
   }
}
