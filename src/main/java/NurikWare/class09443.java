package NurikWare;

import minecraft.class01215;

public record class09443(class01215 entry, String source) {

   public class09443(class01215 entry, String source) {
      super();
      this.entry = entry;
      this.source = source;
   }

   @Override
   public String toString() {
      return this.entry + " (from " + this.source + ")";
   }

   public String y() {
      return this.source;
   }

   public class01215 N() {
      return this.entry;
   }
}
