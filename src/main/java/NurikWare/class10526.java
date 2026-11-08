package NurikWare;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import minecraft.class04370;
import minecraft.class05611;
import minecraft.class05630;

public class class10526 implements class05611 {
   public class10526(class05630 var1, List var2) {
      super();
      this.N = var2;
   }

   public <T> void N(String var1, class04370<T> var2) {
      this.N.add(Pair.of(var1, var2.method_41753()));
   }
}
