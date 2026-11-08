package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class12017 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class12017(int var1) {
      super();
      this.N();
      this.N_0 = var1;
   }

   public void N(float var1, float var2, float var3) {
      if (var1 != (Float)this.N_1 || var2 != (Float)this.N_2 || var3 != (Float)this.N_3) {
         GL33.glUniform3f((Integer)this.N_0, var1, var2, var3);
         this.N_1 = var1;
         this.N_2 = var2;
         this.N_3 = var3;
      }
   }

   private void N() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
      }
   }
}
