package NurikWare;

import minecraft.class04489;

public record class10413(int index) implements class04489 {
   public class10413(int index) {
      super();
      this.index = index;
   }

   public String get() {
      return "[" + this.index + "]";
   }

   public int N() {
      return this.index;
   }
}
