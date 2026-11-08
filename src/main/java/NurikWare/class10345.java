package NurikWare;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;

public record class10345(class07211 direction, class00500 neighborState, class07209 pos, class07209 neighborPos, int updateFlags, int updateLimit)
   implements class10340 {
   public class07209 L() {
      return this.pos;
   }

   public class10345(class07211 direction, class00500 neighborState, class07209 pos, class07209 neighborPos, int updateFlags, int updateLimit) {
      super();
      this.direction = direction;
      this.neighborState = neighborState;
      this.pos = pos;
      this.neighborPos = neighborPos;
      this.updateFlags = updateFlags;
      this.updateLimit = updateLimit;
   }

   public int i() {
      return this.updateFlags;
   }

   public class07209 u() {
      return this.neighborPos;
   }

   public class00500 y() {
      return this.neighborState;
   }

   @Override
   public boolean N(class07299 var1) {
      class04376.N(var1, this.direction, this.pos, this.neighborPos, this.neighborState, this.updateFlags, this.updateLimit);
      return false;
   }

   @Override
   public void N(Consumer<class07209> var1) {
      var1.accept(this.pos);
   }

   public class07211 N() {
      return this.direction;
   }

   public int R() {
      return this.updateLimit;
   }
}
