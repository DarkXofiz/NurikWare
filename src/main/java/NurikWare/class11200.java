package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class11200 implements class12004 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11200(int var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0.0F;
      }
   }

   public void N(float var1) {
      if (var1 != (Float)this.N_1) {
         GL33.glUniform1f((Integer)this.N_0, var1);
         this.N_1 = var1;
      }
   }
}
