package NurikWare;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public record class10346(class00500 state, class07209 pos, class00891 block, class02733 orientation, boolean movedByPiston) implements class10340 {
   public class00891 L() {
      return this.block;
   }


   public boolean i() {
      return this.movedByPiston;
   }

   @Nullable
   public class02733 u() {
      return this.orientation;
   }

   public class07209 y() {
      return this.pos;
   }

   public class00500 N() {
      return this.state;
   }

   @Override
   public boolean N(class07299 var1) {
      class04376.N(var1, this.state, this.pos, this.block, this.orientation, this.movedByPiston);
      return false;
   }

   @Override
   public void N(Consumer<class07209> var1) {
      var1.accept(this.pos);
   }
}
