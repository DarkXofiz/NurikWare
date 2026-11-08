package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class12042 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public class12042(int var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
      }
   }

   public void N(int var1, int var2, int var3, int var4) {
      if (var1 != (Integer)this.N_1 || var2 != (Integer)this.N_2 || var3 != (Integer)this.N_3 || var4 != (Integer)this.N_4) {
         GL33.glUniform4i((Integer)this.N_0, var1, var2, var3, var4);
         this.N_1 = var1;
         this.N_2 = var2;
         this.N_3 = var3;
         this.N_4 = var4;
      }
   }
}
