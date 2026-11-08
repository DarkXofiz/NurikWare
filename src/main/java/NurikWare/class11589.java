package NurikWare;

import java.util.List;
import org.joml.Vector3i;

public class class11589 extends class11547 {
   public class11589(String var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      return this.N(var3.x, var3.y, var3.z) || this.N(var3.z, var3.y, var3.x);
   }
}
