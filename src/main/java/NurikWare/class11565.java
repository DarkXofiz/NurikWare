package NurikWare;

import java.util.Arrays;
import java.util.List;
import minecraft.class00500;
import minecraft.class00891;

public record class11565(String name, int durationTicks, class00891... blocks) implements class11579 {

   public class00891[] L() {
      return this.blocks;
   }

   public class11565(String var1, class00891... var2) {
      this(var1, 300, var2);
   }


   @Override
   public int y() {
      return this.durationTicks;
   }

   public boolean N(List<class11556> var1) {
      List list = var1.stream().map(var0 -> var0.y().i()).toList();
      return Arrays.stream(this.blocks).allMatch(list::contains);
   }

   public boolean N(class00500 var1) {
      return Arrays.stream(this.blocks).anyMatch(var1::N);
   }

   @Override
   public String N() {
      return this.name;
   }
}
