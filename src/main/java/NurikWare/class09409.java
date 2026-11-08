package NurikWare;

import minecraft.class00494;

public record class09409(class00494 first, class00494 second) {

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class09409 class09409 && this.first == class09409.first && this.second == class09409.second;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this.first) * 31 + System.identityHashCode(this.second);
   }

   public class00494 y() {
      return this.second;
   }

   public class00494 N() {
      return this.first;
   }
}
