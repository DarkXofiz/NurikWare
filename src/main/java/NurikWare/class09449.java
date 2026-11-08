package NurikWare;

import java.util.List;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03511;

public record class09449(List<class09443> entries) implements class03511<class01894> {

   public class09449(List<class09443> entries) {
      super();
      this.entries = entries;
   }

   public void y(Consumer<class01894> var1) {
      this.entries.forEach(var1x -> var1x.N().method_43944(var1));
   }

   public List<class09443> N() {
      return this.entries;
   }

   public void N(Consumer<class01894> var1) {
      this.entries.forEach(var1x -> var1x.N().method_32831(var1));
   }
}
