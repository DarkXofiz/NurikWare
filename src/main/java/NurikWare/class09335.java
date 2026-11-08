package NurikWare;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.MemoryUtil;

public class class09335 extends class09306 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class09335(int var1) {
      super(GL33.glGenBuffers());
      this.u();
      this.N_0 = var1;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
      }
   }

   public void N() {
      this.u();
      GL33.glBindBuffer((Integer)this.N_0, (Integer)super.y_0);
   }

   public void N(ByteBuffer var1, int var2) {
      this.u();
      this.N();
      int i = var1.position();
      if (i > (Integer)this.N_1) {
         int j = Math.max((Integer)this.N_1 * 2, i);
         GL33.nglBufferData((Integer)this.N_0, j, 0L, var2);
         this.N_1 = j;
      }

      GL33.nglBufferSubData((Integer)this.N_0, 0L, i, MemoryUtil.memAddress0(var1));
   }
}
