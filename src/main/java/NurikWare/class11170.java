package NurikWare;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL33;

public non-sealed class class11170 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class11170(int var1) {
      super();
      this.N();
      this.N_0 = var1;
   }

   private static int y(FloatBuffer var0) {
      int i = 1;
      int j = var0.limit();

      for (int k = 0; k < j; k++) {
         i = 31 * i + Float.floatToIntBits(var0.get(k));
      }

      return i;
   }

   public void N(FloatBuffer var1) {
      int i = y(var1);
      if (!(Boolean)this.N_2 || i != (Integer)this.N_1) {
         this.N_1 = i;
         this.N_2 = true;
         var1.position(0);
         GL33.glUniform1fv((Integer)this.N_0, var1);
      }
   }

   private void N() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = false;
      }
   }
}
