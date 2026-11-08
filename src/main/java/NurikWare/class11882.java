package NurikWare;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import minecraft.class02484;
import minecraft.class06584;

public class class11882 extends class11512 implements Predicate<class06584> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;

   public boolean L(class06584 var1) {
      this.W();
      return class06584.y((class06584)this.y_5, var1);
   }

   public class12018 L() {
      this.W();
      return (class12018)this.N_0;
   }

   public boolean M() {
      this.W();
      return (Boolean)this.y_6;
   }

   public class11882(class06584 var1, String var2, String var3, class11165 var4) {
      super();
      this.W();
      this.y_0 = class11524.N(this, "auto-parser-include", true);
      this.y_1 = class11524.N(this, "max-price", "0", Pattern.compile("^[1-9]\\d{0,18}$"));
      this.y_5 = var1;
      this.N_0 = new class12018("autobuy.name").N(var2);
      this.N_1 = var3;
      this.N_2 = var4;
      this.y_2 = N(i(var1), () -> class11524.N(this, "min-count", 1.0F, 1.0F, 64.0F, 1.0F));
      this.y_3 = N(var1.W(), () -> class11524.N(this, "min-durability-percentage", 50.0F, 1.0F, 100.0F, 1.0F));
      this.y_4 = N(R(var1), () -> class11524.N(this, "ignore-thorns", true));
   }

   @Override
   public boolean equals(Object var1) {
      this.W();
      return var1 instanceof class11882 class11882 ? ((class12018)this.N_0).equals((class12018)class11882.N_0) : false;
   }

   @Override
   public String toString() {
      this.W();
      return (String)this.N_1;
   }

   @Override
   public int hashCode() {
      this.W();
      return ((class12018)this.N_0).hashCode();
   }

   public boolean B() {
      this.W();
      return ((Optional)this.y_4).map(class11536::i).orElse(false);
   }

   public class11533 Z() {
      this.W();
      return (class11533)this.y_1;
   }

   public class11165 i() {
      this.W();
      return (class11165)this.N_2;
   }

   private static boolean i(class06584 var0) {
      return var0.y().N(class02484.L) && (Integer)var0.method_58694(class02484.L) > 1;
   }

   public class06584 U() {
      this.W();
      return (class06584)this.y_5;
   }

   public void z() {
      this.W();
      this.y_6 = false;
      this.w().forEach((var0, var1) -> var1.s());
   }

   public boolean u(class06584 var1) {
      return true;
   }

   public class11507 u() {
      this.W();
      return (class11507)this.y_0;
   }

   public boolean test(class06584 var1) {
      return this.L(var1) && this.u(var1);
   }

   public String y() {
      this.W();
      return class12020.N((class12018)this.N_0);
   }

   public int E() {
      this.W();
      return ((Optional)this.y_2).<Integer>map(var0 -> var0.i().intValue()).orElse(1);
   }

   public class11882 N(boolean var1) {
      this.W();
      this.y_6 = var1;
      return this;
   }

   @Override
   public class12018 N_7(String var1) {
      return new class12018("autobuy.item").N(var1);
   }

   private static <T> Optional<T> N(boolean var0, Supplier<T> var1) {
      return var0 ? Optional.of((T)var1.get()) : Optional.empty();
   }

   public float N() {
      this.W();
      return ((Optional)this.y_3).map(class11536::i).orElse(1.0F);
   }

   public class11882 N(class06584 var1) {
      this.W();
      this.y_5 = var1;
      return this;
   }

   private void W() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_6 = false;
      }
   }

   public String R() {
      this.W();
      return (String)this.N_1;
   }

   private static boolean R(class06584 var0) {
      return var0.y().N(class02484.o) && var0.y().N(class02484.q);
   }
}
