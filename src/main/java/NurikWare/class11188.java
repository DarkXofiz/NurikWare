package NurikWare;

import org.lwjgl.opengl.GL33;

public class class11188 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public void L(int var1) {
      GL33.glQueryCounter(((int[])this.N_1)[var1], 36392);
      ((boolean[])this.N_2)[var1] = true;
   }

   public class11188(int var1) {
      super();
      this.R();
      this.N_0 = new int[var1];
      this.N_1 = new int[var1];
      this.N_2 = new boolean[var1];
      GL33.glGenQueries((int[])this.N_0);
      GL33.glGenQueries((int[])this.N_1);
   }

   public void y(int var1) {
      GL33.glQueryCounter(((int[])this.N_0)[var1], 36392);
   }

   public void N() {
      if (!(Boolean)this.N_3) {
         this.N_3 = true;
         GL33.glDeleteQueries((int[])this.N_0);
         GL33.glDeleteQueries((int[])this.N_1);

         for (int i = 0; i < ((boolean[])this.N_2).length; i++) {
            ((boolean[])this.N_2)[i] = false;
         }
      }
   }

   public long N(int var1) {
      if (!((boolean[])this.N_2)[var1]) {
         return -1L;
      } else {
         ((boolean[])this.N_2)[var1] = false;
         long i = GL33.glGetQueryObjectui64(((int[])this.N_0)[var1], 34918);
         return GL33.glGetQueryObjectui64(((int[])this.N_1)[var1], 34918) - i;
      }
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = false;
      }
   }
}
