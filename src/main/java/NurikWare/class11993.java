package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class11993 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class11993(int var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }
   }

   public void N(float var1, float var2) {
      if (var1 != (Float)this.N_1 || var2 != (Float)this.N_2) {
         GL33.glUniform2f((Integer)this.N_0, var1, var2);
         this.N_1 = var1;
         this.N_2 = var2;
      }
   }
}
