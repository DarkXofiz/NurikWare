package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class12003 implements class12004 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class12003(int var1) {
      super();
      this.N();
      this.N_1 = Integer.MIN_VALUE;
      this.N_0 = var1;
   }

   private void N() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
      }
   }

   public void N(int var1) {
      if (var1 != (Integer)this.N_1) {
         GL33.glUniform1i((Integer)this.N_0, var1);
         this.N_1 = var1;
      }
   }
}
