package NurikWare;

import minecraft.class02112;
import minecraft.class03255;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class09561 implements class02112 {
   private final class03255 N;

   public class09561(class03255 var1) {
      super();
      this.N = var1;
   }

   public Vector2ic method_47944(int var1, int var2, int var3, int var4, int var5, int var6) {
      Vector2i vector2i = new Vector2i();
      vector2i.x = this.N.u() + 3;
      vector2i.y = this.N.L() + 3 + 1;
      if (vector2i.y + var6 + 3 > var2) {
         vector2i.y = this.N.y() - var6 - 3 - 1;
      }

      if (vector2i.x + var5 > var1) {
         vector2i.x = Math.max(this.N.i() - var5 - 3, 4);
      }

      return vector2i;
   }
}
