package NurikWare;

import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class class11184 {
   public static Object N_0 = new Vector3f();
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public ByteBuffer L() {
      ((ByteBuffer)this.y_0).flip();
      return (ByteBuffer)this.y_0;
   }

   private void M(int var1) {
      int i = ((ByteBuffer)this.y_0).capacity();

      while (((ByteBuffer)this.y_0).position() + var1 > i) {
         i += i >> 1;
      }

      int j = ((ByteBuffer)this.y_0).position();
      this.y_0 = MemoryUtil.memRealloc((ByteBuffer)this.y_0, i);
      ((ByteBuffer)this.y_0).position(j);
   }

   private static void M() {
      N_0 = null;
   }

   public class11184(int var1) {
      super();
      this.Z();
      this.y_0 = MemoryUtil.memAlloc(var1);
   }

   static {
      M();
   }

   private void Z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
      }
   }

   public int i() {
      return (Integer)this.y_1;
   }

   public ByteBuffer u() {
      return (ByteBuffer)this.y_0;
   }

   private ByteBuffer u(int var1) {
      if (((ByteBuffer)this.y_0).position() + var1 > ((ByteBuffer)this.y_0).capacity()) {
         this.M(var1);
      }

      return (ByteBuffer)this.y_0;
   }

   public class11184 y(int var1) {
      this.u(4).putInt(var1);
      return this;
   }

   public int y() {
      int i = (Integer)this.y_1;
      this.y_1 = i + 1;
      return i;
   }

   public class11184 N(float var1) {
      this.u(4).putFloat(var1);
      return this;
   }

   public class11184 N(float var1, float var2) {
      this.u(8).putFloat(var1).putFloat(var2);
      return this;
   }

   public void N() {
      ((ByteBuffer)this.y_0).position(0);
      this.y_1 = 0;
   }

   public class11184 N(int var1) {
      this.u(4).putInt(var1);
      return this;
   }

   public class11184 N(byte var1) {
      this.u(1).put(var1);
      return this;
   }

   public class11184 N(float var1, float var2, float var3) {
      this.u(12).putFloat(var1).putFloat(var2).putFloat(var3);
      return this;
   }

   public class11184 N(Matrix4f var1, float var2, float var3, float var4) {
      Vector3f vector3f = ((Vector3f)N_0).set(var2, var3, var4);
      var1.transformPosition(vector3f);
      this.u(12).putFloat(vector3f.x).putFloat(vector3f.y).putFloat(vector3f.z);
      return this;
   }
}
