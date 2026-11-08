package NurikWare;

import java.util.Map;
import minecraft.class03926;
import minecraft.class04445;
import org.jspecify.annotations.Nullable;

public record class10410(Map<String, class03926> arguments) implements class04445 {

   @Nullable
   public class03926 N(String var1) {
      return this.arguments.get(var1);
   }

   public Map<String, class03926> N() {
      return this.arguments;
   }
}
