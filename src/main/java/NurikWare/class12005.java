package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class12005 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class12005(int var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
      }
   }

   public void N(int var1, int var2, int var3) {
      if (var1 != (Integer)this.N_1 || var2 != (Integer)this.N_2 || var3 != (Integer)this.N_3) {
         GL33.glUniform3i((Integer)this.N_0, var1, var2, var3);
         this.N_1 = var1;
         this.N_2 = var2;
         this.N_3 = var3;
      }
   }
}
