package NurikWare;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public class class09068 extends class09335 {
   public class09068() {
      super(35345);
   }

   public void N(ByteBuffer var1, int var2, int var3) {
      this.N(var1, var3);
      this.N(var2);
   }

   public void N(int var1) {
      GL33.glBindBufferBase(35345, var1, (Integer)super.y_0);
   }
}
