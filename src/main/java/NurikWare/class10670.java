package NurikWare;

import com.mojang.serialization.DataResult;
import minecraft.class04995;
import minecraft.class06756;

public class class10670 implements class06756<Float> {
   public class10670(float var1, float var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public Float y(Float var1) {
      return var1 >= this.L && var1 <= this.u ? var1 : class04995.N(var1, this.L, this.u);
   }

   public DataResult<Float> N(Float var1) {
      return var1 >= this.L && var1 <= this.u ? DataResult.success(var1) : DataResult.error(() -> var1 + " is not in range [" + var1x + "; " + var2 + "]");
   }
}
