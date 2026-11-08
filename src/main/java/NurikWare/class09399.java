package NurikWare;

import minecraft.class00734;
import org.joml.Vector3fc;

public class class09399 {
   private float N = Float.POSITIVE_INFINITY;
   private float y = Float.POSITIVE_INFINITY;
   private float L = Float.POSITIVE_INFINITY;
   private float u = Float.NEGATIVE_INFINITY;
   private float i = Float.NEGATIVE_INFINITY;
   private float R = Float.NEGATIVE_INFINITY;

   public class09399() {
      super();
   }

   public void N(Vector3fc var1) {
      this.N = Math.min(this.N, var1.x());
      this.y = Math.min(this.y, var1.y());
      this.L = Math.min(this.L, var1.z());
      this.u = Math.max(this.u, var1.x());
      this.i = Math.max(this.i, var1.y());
      this.R = Math.max(this.R, var1.z());
   }

   public class00734 N() {
      return new class00734(this.N, this.y, this.L, this.u, this.i, this.R);
   }
}
