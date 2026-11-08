package NurikWare;

import java.util.ArrayList;
import java.util.List;

record class09874(List<String> segments) {

   @Override
   public String toString() {
      return String.join("/", this.segments);
   }

   class09874 y(String var1) {
      ArrayList arraylist = new ArrayList(this.segments.size() + 1);
      arraylist.addAll(this.segments);
      arraylist.add(var1);
      return new class09874(List.copyOf(arraylist));
   }

   public List<String> N() {
      return this.segments;
   }

   static class09874 N(String var0) {
      return new class09874(List.of(class09853.N(var0, "rootKey")));
   }
}
