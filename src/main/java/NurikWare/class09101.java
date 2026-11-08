package NurikWare;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class class09101 {
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
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;

   public class09101 L(int var1) {
      this.N_4 = var1;
      return this;
   }

   public class09101 L(float var1) {
      this.N_2 = var1;
      return this;
   }

   public float L() {
      return (Float)this.N_1;
   }

   public float M() {
      return (Float)this.N_3;
   }

   private void T() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_4 = 0.0F;
         this.y_5 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0;
      }
   }

   public class09101() {
      super();
      this.T();
      this.L_0 = new Matrix4f();
      this.L_1 = new Matrix4f();
   }

   public int B() {
      return (Integer)this.y_2;
   }

   public int Z() {
      return (Integer)this.y_0;
   }

   public class09101 i(int var1) {
      this.y_2 = var1;
      return this;
   }

   public int i() {
      return (Integer)this.y_3;
   }

   public class09101 i(float var1) {
      this.N_3 = var1;
      return this;
   }

   public float m() {
      return (Float)this.y_5;
   }

   public float U() {
      return (Float)this.N_2;
   }

   public Matrix4f z() {
      return (Matrix4f)this.L_0;
   }

   public class09101 u(float var1) {
      this.y_4 = var1;
      return this;
   }

   public float u() {
      return (Float)this.N_0;
   }

   public class09101 u(int var1) {
      this.y_3 = var1;
      return this;
   }

   public class09101 y(int var1) {
      this.y_0 = var1;
      return this;
   }

   public class09101 y(float var1) {
      this.N_0 = var1;
      return this;
   }

   public Matrix4f y() {
      return (Matrix4f)this.L_1;
   }

   public float E() {
      return (Float)this.y_4;
   }

   public class09101 N(FloatBuffer var1) {
      this.N_5 = var1;
      return this;
   }

   public class09101 N(float var1) {
      this.N_1 = var1;
      return this;
   }

   public class09101 N(int var1) {
      this.y_1 = var1;
      return this;
   }

   public int N() {
      return (Integer)this.N_4;
   }

   public FloatBuffer W() {
      return (FloatBuffer)this.N_5;
   }

   public class09101 R(float var1) {
      this.y_5 = var1;
      return this;
   }

   public int R() {
      return (Integer)this.y_1;
   }
}
