package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;

public class class11180 implements class09086 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   @Override
   public class09057 L() {
      return null;
   }

   public class11180(int var1, int var2, int var3) {
      super();
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
      }
   }

   @Override
   public int i() {
      return (Integer)this.N_0;
   }

   @Override
   public int u() {
      return (Integer)this.N_2;
   }

   @Override
   public void y() {
   }

   @Override
   public void N(boolean var1) {
      GlStateManager._glBindFramebuffer(36160, (Integer)this.N_0);
      if (var1) {
         GL11.glViewport(0, 0, (Integer)this.N_1, (Integer)this.N_2);
      }
   }

   @Override
   public class09057 N() {
      return null;
   }

   @Override
   public void N(boolean var1, boolean var2) {
      this.N(true);
      short short1 = 0;
      if (var1) {
         short1 |= 16384;
      }

      if (var2) {
         short1 |= 256;
      }

      if (short1 != 0) {
         GL11.glClear(short1);
      }
   }

   @Override
   public int R() {
      return (Integer)this.N_1;
   }
}
