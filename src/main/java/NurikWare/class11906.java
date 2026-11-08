package NurikWare;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;

public record class11906(class11909 type, Pair<Integer, Integer> group, int number) {

   public Pair<Integer, Integer> L() {
      return this.group;
   }

   public class11906(class11909 type, Pair<Integer, Integer> group, int number) {
      super();
      this.type = type;
      this.group = group;
      this.number = number;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class11906 class11906 ? this.number == class11906.number : false;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.number);
   }

   public int u() {
      return this.number;
   }

   public class11909 y() {
      return this.type;
   }

   public String N() {
      return this.type.fields_0d98e95695d6732fd9192964e161ca232_0 + this.number;
   }
}
