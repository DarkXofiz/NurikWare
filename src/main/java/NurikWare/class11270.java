package NurikWare;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class11270 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public Matrix4f L() {
      return (Matrix4f)this.L_2;
   }

   public class11270 L(float var1) {
      this.N_1 = var1;
      return this;
   }

   public class11270 L(int var1) {
      this.N_3 = var1;
      return this;
   }

   public Matrix4f M() {
      return (Matrix4f)this.L_1;
   }

   public class11270() {
      super();
      this.s();
      this.L_0 = new Matrix4f();
      this.L_1 = new Matrix4f();
      this.L_2 = new Matrix4f();
      this.y_0 = new Matrix4f();
   }

   public FloatBuffer B() {
      return (FloatBuffer)this.N_5;
   }

   public int Z() {
      return (Integer)this.N_3;
   }

   public int i() {
      return (Integer)this.y_1;
   }

   private void s() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
         this.y_2 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0;
         this.N_4 = 0;
      }
   }

   public int U() {
      return (Integer)this.N_4;
   }

   public int z() {
      return (Integer)this.y_2;
   }

   public float u() {
      return (Float)this.N_2;
   }

   public class11270 u(int var1) {
      this.y_1 = var1;
      return this;
   }

   public class11270 y(int var1) {
      this.y_2 = var1;
      return this;
   }

   public class11270 y(float var1) {
      this.N_2 = var1;
      return this;
   }

   public float y() {
      return (Float)this.N_0;
   }

   public Matrix4f E() {
      return (Matrix4f)this.y_0;
   }

   public float N() {
      return (Float)this.N_1;
   }

   public class11270 N(float var1) {
      this.N_0 = var1;
      return this;
   }

   public class11270 N(int var1) {
      this.N_4 = var1;
      return this;
   }

   public class11270 N(FloatBuffer var1) {
      this.N_5 = var1;
      return this;
   }

   public Matrix4f R() {
      return (Matrix4f)this.L_0;
   }
}
