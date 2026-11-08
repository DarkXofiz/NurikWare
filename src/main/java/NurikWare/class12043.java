package NurikWare;

import org.lwjgl.opengl.GL33;

public non-sealed class class12043 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public class12043(int var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
      }
   }

   public void N(float var1, float var2, float var3, float var4) {
      if (var1 != (Float)this.N_1 || var2 != (Float)this.N_2 || var3 != (Float)this.N_3 || var4 != (Float)this.N_4) {
         GL33.glUniform4f((Integer)this.N_0, var1, var2, var3, var4);
         this.N_1 = var1;
         this.N_2 = var2;
         this.N_3 = var3;
         this.N_4 = var4;
      }
   }

   public void N(int var1) {
      this.N(class11300.u(var1) / 255.0F, class11300.N(var1) / 255.0F, class11300.i(var1) / 255.0F, class11300.y(var1) / 255.0F);
   }
}
