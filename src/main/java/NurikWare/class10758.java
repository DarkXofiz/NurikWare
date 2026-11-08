package NurikWare;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07499;
import minecraft.class07692;

public class class10758 {
   private int N;
   private final Builder<class05946<class05074>> y = ImmutableList.builder();
   private final Builder<class05946<class06521<?>>> L = ImmutableList.builder();
   private Optional<class01894> u = Optional.empty();

   public static class10758 L(class05946<class06521<?>> var0) {
      return new class10758().u(var0);
   }

   public class10758() {
      super();
   }

   public class10758 u(class05946<class06521<?>> var1) {
      this.L.add(var1);
      return this;
   }

   public class10758 y(class01894 var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public class10758 y(int var1) {
      this.N += var1;
      return this;
   }

   public class10758 y(class05946<class05074> var1) {
      this.y.add(var1);
      return this;
   }

   public class07499 N() {
      return new class07499(this.N, this.y.build(), this.L.build(), this.u.map(class07692::new));
   }

   public static class10758 N(class05946<class05074> var0) {
      return new class10758().y(var0);
   }

   public static class10758 N(class01894 var0) {
      return new class10758().y(var0);
   }

   public static class10758 N(int var0) {
      return new class10758().y(var0);
   }
}
