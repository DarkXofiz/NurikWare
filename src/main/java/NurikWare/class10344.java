package NurikWare;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public record class10344(class07209 pos, class00891 block, class02733 orientation) implements class10340 {
   @Nullable
   public class02733 L() {
      return this.orientation;
   }

   public class10344(class07209 pos, class00891 block, @Nullable class02733 orientation) {
      super();
      this.pos = pos;
      this.block = block;
      this.orientation = orientation;
   }

   public class00891 y() {
      return this.block;
   }

   @Override
   public void N(Consumer<class07209> var1) {
      var1.accept(this.pos);
   }

   @Override
   public boolean N(class07299 var1) {
      class00500 class00500 = var1.method_8320(this.pos);
      class04376.N(var1, class00500, this.pos, this.block, this.orientation, false);
      return false;
   }

   public class07209 N() {
      return this.pos;
   }
}
