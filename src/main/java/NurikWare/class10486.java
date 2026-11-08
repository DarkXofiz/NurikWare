package NurikWare;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.Stream;
import minecraft.class05033;

public class class10486 implements Keyable {
   public class10486(class05033[] var1) {
      super();
      this.N = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Arrays.stream(this.N).map(class05033::method_15434).map(var1::createString);
   }
}
