package NurikWare;

import java.util.function.Consumer;
import minecraft.class05216;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;

public class class11279 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public class11279(class05216 var1, class05361 var2) {
      super();
      this.y();
      this.y_0 = class11284.u();
      this.y_3 = (Consumer<class05362>)var0 -> {};
      this.y_4 = (Consumer<class05362>)var0 -> {};
      this.N_1 = 150;
      this.N_2 = 20;
      this.y_1 = var1;
      this.y_2 = var2;
   }

   public class11279 y(int var1, int var2) {
      this.y_5 = var1;
      this.N_0 = var2;
      return this;
   }

   private void y() {
      this.y_5 = 0;
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
   }

   public class11279 y(Consumer<class05362> var1) {
      this.y_4 = var1;
      return this;
   }

   public class11279 N(Consumer<class05362> var1) {
      this.y_3 = var1;
      return this;
   }

   public class11279 N(int var1, int var2) {
      this.N_1 = var1;
      this.N_2 = var2;
      return this;
   }

   public class11284 N() {
      return new class11284(
         (Integer)this.y_5,
         (Integer)this.N_0,
         (Integer)this.N_1,
         (Integer)this.N_2,
         (class05216)this.y_1,
         (class05361)this.y_2,
         (class05341)this.y_0,
         (Consumer<class05362>)this.y_3,
         (Consumer<class05362>)this.y_4
      );
   }
}
