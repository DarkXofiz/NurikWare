package NurikWare;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL33;

public non-sealed class class12038 implements class12004 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = BufferUtils.createFloatBuffer(16);

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   public class12038(int var1) {
      super();
      this.L();
      this.N_1 = new Matrix4f().zero();
      this.N_0 = var1;
   }

   static {
      N();
   }

   private static void N() {
      y_0 = null;
   }

   public void N(Matrix4f var1) {
      if (!((Matrix4f)this.N_1).equals(var1)) {
         ((Matrix4f)this.N_1).set(var1);
         var1.get(((FloatBuffer)y_0).position(0));
         GL33.glUniformMatrix4fv((Integer)this.N_0, false, (FloatBuffer)y_0);
      }
   }
}
