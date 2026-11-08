package NurikWare;

import java.util.List;
import minecraft.class06570;
import minecraft.class07209;
import org.joml.Vector3d;
import org.joml.Vector3i;

public class class11577 {
   public Object N_0;

   private void L() {
   }

   public class11577(class11576 var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   static {
      N();
   }

   private boolean y(List<class11556> var1, Vector3i var2, Vector3i var3) {
      int i = var3.x + var2.x / 2;
      int j = var3.y + var2.y / 2;
      int k = var3.z + var2.z / 2;
      return var1.stream().filter(var3x -> {
         class07209 class07209 = var3x.N();
         return class07209.method_10263() == i && class07209.method_10264() == j && class07209.method_10260() == k;
      }).anyMatch(var0 -> !var0.y().P());
   }

   public void N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      for (class11565 class11565 : (List)class11557.L_0) {
         if (class11565.N(var1)) {
            this.N(var1, class11565, var2, var3);
            break;
         }
      }
   }

   private void N(List<class11556> var1, class11579 var2, Vector3i var3, Vector3i var4) {
      Vector3i vector3i = var4.sub(var3, new Vector3i());
      if (vector3i.x == vector3i.z && vector3i.y >= 3 && !this.y(var1, vector3i, var3)) {
         Vector3d vector3d = new Vector3d(vector3i);
         Vector3d vector3d1 = new Vector3d(var3);
         Vector3d vector3d2 = vector3d.mul(0.5).add(vector3d1).add(0.5, 0.5, 0.5);
         ((class11576)this.N_0).N(new class11563(class06570.TW.E(), var2, new Vector3d(vector3d2.x, vector3d2.y, vector3d2.z), class11938.j().y() + var2.y()));
      }
   }

   private static void N() {
   }
}
