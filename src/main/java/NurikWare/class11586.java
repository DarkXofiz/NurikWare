package NurikWare;

import java.util.List;
import minecraft.class06570;
import org.joml.Vector3d;
import org.joml.Vector3i;

public class class11586 {
   public Object N_0;

   public class11586(class11576 var1) {
      super();
      this.y();
      this.N_0 = var1;
   }

   private void y() {
   }

   private Vector3d N(List<class11556> var1, class11547 var2, Vector3i var3, Vector3i var4) {
      Vector3i vector3i = var4.sub(var3, new Vector3i());
      if (var2.N(var1, var3, vector3i)) {
         Vector3d vector3d = new Vector3d(vector3i);
         Vector3d vector3d1 = new Vector3d(var3);
         return vector3d.mul(0.5).add(vector3d1).add(0.5, 0.5, 0.5);
      } else {
         return null;
      }
   }

   private void N(class11579 var1, Vector3d var2) {
      ((class11576)this.N_0).N(new class11563(class06570.ny.E(), var1, new Vector3d(var2.x, var2.y, var2.z), class11938.j().y() + var1.y()));
   }

   public void N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      for (class11547 class11547 : (List)class11578.N_0) {
         if (class11547.N(var1)) {
            Vector3d vector3d = this.N(var1, class11547, var2, var3);
            if (vector3d != null) {
               this.N(class11547, vector3d);
            }
         }
      }
   }
}
