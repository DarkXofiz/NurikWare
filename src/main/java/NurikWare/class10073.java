package NurikWare;

import com.mojang.datafixers.util.Function5;
import java.util.function.Function;
import minecraft.class02362;

public class class10073<B, C> implements class02362<B, C> {
   public class10073(
      class02362 var1,
      class02362 var2,
      class02362 var3,
      class02362 var4,
      class02362 var5,
      Function5 var6,
      Function var7,
      Function var8,
      Function var9,
      Function var10,
      Function var11
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
      this.z = var10;
      this.U = var11;
   }

   public C decode(B var1) {
      Object object = this.N.decode(var1);
      Object object1 = this.y.decode(var1);
      Object object2 = this.L.decode(var1);
      Object object3 = this.u.decode(var1);
      Object object4 = this.i.decode(var1);
      return (C)this.R.apply(object, object1, object2, object3, object4);
   }

   public void encode(B var1, C var2) {
      this.N.encode(var1, this.M.apply(var2));
      this.y.encode(var1, this.B.apply(var2));
      this.L.encode(var1, this.Z.apply(var2));
      this.u.encode(var1, this.z.apply(var2));
      this.i.encode(var1, this.U.apply(var2));
   }
}
