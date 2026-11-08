package NurikWare;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class01733;
import minecraft.class05832;

public class class10482 extends class01733 {
   public class10482(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return class05832.N(var1);
   }
}
