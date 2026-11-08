package NurikWare;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import minecraft.class08227;

public class class10881 {
   private final Builder<String, String> N = ImmutableMap.builder();
   private final com.google.common.collect.ImmutableSet.Builder<String> y = ImmutableSet.builder();

   public class10881() {
      super();
   }

   private static String y(String var0) {
      return var0.replaceAll("\n", "\\\\\n");
   }

   public class08227 N() {
      return new class08227(this.N.build(), this.y.build());
   }

   public class10881 N(String var1) {
      this.y.add(var1);
      return this;
   }

   public class10881 N(String var1, int var2) {
      this.N.put(var1, String.valueOf(var2));
      return this;
   }

   public class10881 N(String var1, float var2) {
      this.N.put(var1, String.valueOf(var2));
      return this;
   }

   public class10881 N(String var1, String var2) {
      if (var2.isBlank()) {
         throw new IllegalArgumentException("Cannot define empty string");
      } else {
         this.N.put(var1, y(var2));
         return this;
      }
   }
}
