package NurikWare;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import minecraft.class02968;
import minecraft.class03643;

public class class10219 implements class03643 {
   public class10219(JsonObject var1) {
      super();
      this.L = var1;
   }

   public <T> Optional<T> N(class02968<T> var1) {
      String s = var1.N();
      return this.L.has(s) ? Optional.of((T)var1.y().parse(JsonOps.INSTANCE, this.L.get(s)).getOrThrow(JsonParseException::new)) : Optional.empty();
   }
}
