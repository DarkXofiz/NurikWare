package NurikWare;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class11257 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;

   public class11257 L(int var1) {
      this.N_3 = var1;
      return this;
   }

   public class11257 L(float var1) {
      this.y_1 = var1;
      return this;
   }

   public float L() {
      return (Float)this.y_1;
   }

   public FloatBuffer M() {
      return (FloatBuffer)this.y_2;
   }

   public class11257() {
      super();
      this.m();
      this.N_0 = new Matrix4f();
      this.N_1 = new Matrix4f();
   }

   public float B() {
      return (Float)this.y_0;
   }

   public int Z() {
      return (Integer)this.N_2;
   }

   public int i() {
      return (Integer)this.N_3;
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
      }
   }

   public Matrix4f z() {
      return (Matrix4f)this.N_0;
   }

   public float u() {
      return (Float)this.N_4;
   }

   public class11257 u(float var1) {
      this.y_0 = var1;
      return this;
   }

   public class11257 y(int var1) {
      this.N_2 = var1;
      return this;
   }

   public float y() {
      return (Float)this.N_5;
   }

   public class11257 y(float var1) {
      this.N_5 = var1;
      return this;
   }

   public Matrix4f N() {
      return (Matrix4f)this.N_1;
   }

   public class11257 N(float var1) {
      this.N_4 = var1;
      return this;
   }

   public class11257 N(FloatBuffer var1) {
      this.y_2 = var1;
      return this;
   }

   public class11257 N(int var1) {
      this.N_6 = var1;
      return this;
   }

   public int R() {
      return (Integer)this.N_6;
   }
}
