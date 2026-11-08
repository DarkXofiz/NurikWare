package NurikWare;

import minecraft.class04489;

public record class10416(String name, int index) implements class04489 {

   public String get() {
      return "." + this.name + "[" + this.index + "]";
   }

   public int y() {
      return this.index;
   }

   public String N() {
      return this.name;
   }
}
