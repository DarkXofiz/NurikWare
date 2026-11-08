package NurikWare;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import minecraft.class02012;
import org.joml.Vector3fc;

public class class11660 implements class02012 {
   private final Interner<Vector3fc> N = Interners.newStrongInterner();

   public class11660() {
      super();
   }

   public Vector3fc N(Vector3fc var1) {
      return (Vector3fc)this.N.intern(var1);
   }
}
