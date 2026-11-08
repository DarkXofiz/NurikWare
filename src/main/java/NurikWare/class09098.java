package NurikWare;

import org.lwjgl.opengl.GL11;

public class class09098 implements class09057 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   @Override
   public void L() {
      if ((Integer)this.N_1 != 0) {
         GL11.glDeleteTextures((Integer)this.N_1);
         this.N_1 = 0;
      }
   }

   public class09098(class09073 var1, int var2) {
      super();
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   @Override
   public int i() {
      return (Integer)this.N_1;
   }

   @Override
   public class09073 u() {
      return (class09073)this.N_0;
   }

   @Override
   public boolean y() {
      return (Integer)this.N_1 != 0;
   }

   @Override
   public int N() {
      return ((class09073)this.N_0).B();
   }

   @Override
   public int R() {
      return ((class09073)this.N_0).N();
   }
}
