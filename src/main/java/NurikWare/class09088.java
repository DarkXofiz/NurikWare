package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL30;

public class class09088 implements class09086 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   @Override
   public class09057 L() {
      return (class09057)this.N_1;
   }

   public String M() {
      return (String)this.N_2;
   }

   public class09088(class09057 var1, class09057 var2, String var3) {
      super();
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = 0;
      }
   }

   @Override
   public int i() {
      if ((Integer)this.N_3 == 0) {
         this.N_3 = GL30.glGenFramebuffers();
         GlStateManager._glBindFramebuffer(36160, (Integer)this.N_3);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, ((class09057)this.N_0).i(), 0);
         if ((class09057)this.N_1 != null && ((class09057)this.N_1).y()) {
            GL30.glFramebufferTexture2D(36160, 36096, 3553, ((class09057)this.N_1).i(), 0);
         }
      }

      return (Integer)this.N_3;
   }

   @Override
   public int u() {
      return ((class09057)this.N_0).R();
   }

   @Override
   public void y() {
      if ((Integer)this.N_3 != 0) {
         GL30.glDeleteFramebuffers((Integer)this.N_3);
         this.N_3 = 0;
      }
   }

   @Override
   public void N(boolean var1, boolean var2) {
      this.N(true);
      short short1 = 0;
      if (var1) {
         short1 |= 16384;
      }

      if (var2 && (class09057)this.N_1 != null && ((class09057)this.N_1).y()) {
         short1 |= 256;
      }

      if (short1 != 0) {
         GL30.glClear(short1);
      }
   }

   @Override
   public void N(boolean var1) {
      GlStateManager._glBindFramebuffer(36160, this.i());
      if (var1) {
         GL30.glViewport(0, 0, this.R(), this.u());
      }
   }

   @Override
   public class09057 N() {
      return (class09057)this.N_0;
   }

   @Override
   public int R() {
      return ((class09057)this.N_0).N();
   }
}
