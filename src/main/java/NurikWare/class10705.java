package NurikWare;

import org.joml.Vector2d;
import org.joml.Vector2dc;

public class class10705 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public boolean L() {
      return (Boolean)this.N_1;
   }

   public class10705() {
      super();
      this.B();
      this.N_0 = new Vector2d();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = false;
      }
   }

   public Vector2dc u() {
      return (Vector2d)this.N_0;
   }

   public void y() {
      class11938.u().NK().m();
   }

   public void N(double var1, double var3) {
      GPS gps = class11938.u().NK();
      gps.N(true);
      gps.N(var1, var3);
   }

   public void N(Double var1, Double var2) {
      if (var1 != null && var2 != null) {
         ((Vector2d)this.N_0).set(var1, var2);
         this.N_1 = true;
      } else {
         this.N_1 = false;
      }
   }

   public boolean N() {
      return class11938.u().NK().U() && (Boolean)this.N_1;
   }
}
