package NurikWare;

import java.util.Iterator;
import java.util.List;
import org.joml.Vector3i;

public abstract class class11547 implements class11579 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11547(String var1, int var2) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   @Override
   public int y() {
      return (Integer)this.N_1;
   }

   public boolean N(List<class11556> var1) {
      Iterator iterator = ((List)class11570.L_0).iterator();

      while (iterator.hasNext()) {
         if (((class11565)iterator.next()).N(var1)) {
            return true;
         }
      }

      return false;
   }

   public abstract boolean N(List<class11556> var1, Vector3i var2, Vector3i var3);

   public boolean N(int var1, int var2, int var3) {
      return var1 == 4 && var3 == 1 && var2 == 4 || var1 == 6 && var3 == 1 && var2 == 6;
   }

   @Override
   public String N() {
      return (String)this.N_0;
   }
}
