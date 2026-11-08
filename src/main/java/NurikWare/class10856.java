package NurikWare;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import minecraft.class07920;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;
import org.jspecify.annotations.Nullable;

public record class10856<Params>(class07931<Params, Void> info, class07924 attributes) implements class07940<Params, Void> {
   public class10856(class07931<Params, Void> info, class07924 attributes) {
      super();
      this.info = info;
      this.attributes = attributes;
   }

   public class07924 y() {
      return this.attributes;
   }

   public class07931<Params, Void> N() {
      return this.info;
   }

   @Nullable
   public JsonElement N(Params var1) {
      if (this.info.L().isEmpty()) {
         throw new IllegalStateException("Method defined as having no parameters");
      } else {
         return (JsonElement)((class07920)this.info.L().get()).L().z().encodeStart(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }
}
