package NurikWare;

import java.util.Map;
import org.lwjgl.opengl.GL11;

public class class11731 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public float L() {
      return (Float)this.N_3;
   }

   public class11731(int var1, int var2, int var3, float var4, Map<String, class11773> var5) {
      super();
      this.B();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
      this.N_4 = var5;
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0.0F;
      }
   }

   public int i() {
      return (Integer)this.N_2;
   }

   public int u() {
      return (Integer)this.N_1;
   }

   public int y() {
      return (Integer)this.N_0;
   }

   public class11773 N(String var1) {
      return (class11773)((Map)this.N_4).get(var1);
   }

   public void N() {
      if ((Integer)this.N_0 != 0) {
         GL11.glDeleteTextures((Integer)this.N_0);
      }
   }

   public Map<String, class11773> R() {
      return (Map<String, class11773>)this.N_4;
   }
}
