package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class07209;
import org.joml.Vector3i;

public class class11588 extends class11547 {
   public class11588(String var1, int var2) {
      super(var1, var2);
   }

   private boolean N(List<class11556> var1, Vector3i var2, int var3, int var4, int var5, int var6, int var7) {
      int i = 0;

      for (int j = 0; j <= var4; j++) {
         for (int k = 0; k <= var3; k++) {
            int l = var2.x + j * var6 + var5;
            int i1 = var2.y + k;
            int j1 = var2.z + j;
            int k1 = j1 + var7;
            Iterator iterator = var1.iterator();

            while (iterator.hasNext()) {
               class07209 class07209 = ((class11556)iterator.next()).N();
               if (class07209.method_10263() == l && class07209.method_10264() == i1 && (class07209.method_10260() == j1 || class07209.method_10260() == k1)) {
                  i++;
               }
            }
         }
      }

      return i == var1.size();
   }

   @Override
   public boolean N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      return this.N(var1, var2, var3.y, var3.x, var3.x, -1, 1)
         || this.N(var1, var2, var3.y, var3.x, 0, 1, 1)
         || this.N(var1, var2, var3.y, var3.x, var3.x, -1, -1)
         || this.N(var1, var2, var3.y, var3.x, 0, 1, -1);
   }
}
