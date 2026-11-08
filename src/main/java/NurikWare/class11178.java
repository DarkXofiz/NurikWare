package NurikWare;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class class11178 {
   public Object N_0;

   public ByteBuffer L() {
      ((ByteBuffer)this.N_0).flip();
      return (ByteBuffer)this.N_0;
   }

   public class11178(int var1) {
      super();
      this.R();
      this.N_0 = MemoryUtil.memAlloc(var1);
   }

   private ByteBuffer u(int var1) {
      if (((ByteBuffer)this.N_0).position() + var1 > ((ByteBuffer)this.N_0).capacity()) {
         this.R(var1);
      }

      return (ByteBuffer)this.N_0;
   }

   public class11178 y(int var1) {
      this.N(var1);
      this.N(var1 + 1);
      this.N(var1 + 3);
      this.N(var1 + 1);
      this.N(var1 + 2);
      this.N(var1 + 3);
      return this;
   }

   public void y() {
      ((ByteBuffer)this.N_0).position(0);
   }

   public ByteBuffer N() {
      return (ByteBuffer)this.N_0;
   }

   public class11178 N(int var1) {
      this.u(4).putInt(var1);
      return this;
   }

   private void R() {
   }

   private void R(int var1) {
      int i = ((ByteBuffer)this.N_0).capacity();

      while (((ByteBuffer)this.N_0).position() + var1 > i) {
         i += i >> 1;
      }

      int j = ((ByteBuffer)this.N_0).position();
      this.N_0 = MemoryUtil.memRealloc((ByteBuffer)this.N_0, i);
      ((ByteBuffer)this.N_0).position(j);
   }
}
