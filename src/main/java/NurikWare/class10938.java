package NurikWare;

import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import minecraft.class00392;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class02848;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06244;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class07055;
import minecraft.class07304;
import minecraft.class07314;
import minecraft.class07471;

public class class10938 extends class11882 {
   public Object L_0;

   private List<class10879<?>> P() {
      this.s();
      if ((List)this.L_0 == null || (Boolean)class11938.L_3) {
         this.L_0 = this.T();
      }

      return (List<class10879<?>>)this.L_0;
   }

   private List<class10879<?>> T() {
      return class09233.y()
         .N("lore", var0 -> (class02848)var0.y().method_58694(class02484.W), this::N)
         .N("unbreakable", var0 -> (class06244)var0.y().method_58694(class02484.R), (var0, var1) -> var0 == var1 && var0 == class06244.field_17274)
         .N("attributes", var0 -> (class02833)var0.y().method_58694(class02484.b), this::N)
         .N("enchantments", var0 -> (class02710)var0.y().method_58694(class02484.P), this::N)
         .N("potion", var0 -> (class06517)var0.y().method_58694(class02484.h), this::N)
         .N();
   }

   public class10938(class06584 var1, String var2, String var3, class11165 var4) {
      super(var1, var2, var3, var4);
      this.s();
   }

   private void s() {
   }

   @Override
   public boolean u(class06584 var1) {
      class11343 class11343 = (class11343)class11343.y[0];

      for (class10879<?> class10879 : this.P()) {
         if (!class10879.N((class06584)super.y_5, var1)) {
            class11343 = (Boolean)class11938.L_3 ? class11343.N(class10879.y()) : (class11343)class11343.y[1];
            break;
         }
      }

      if ((Boolean)class11938.L_3 && !class11343.y()) {
         class11303.N("AutoBuy [" + this.R() + "] rejected on check: " + class11343.N());
      }

      return class11343.y();
   }

   private boolean N(class02710 var1, class02710 var2) {
      if (this.B() && var2.N().stream().anyMatch(var0 -> var0.N(var0x -> var0x == class07314.B))) {
         return false;
      } else {
         Set<class03556<class07304>> set = var1.N();
         Set<class03556<class07304>> set1 = var2.N();
         return set.isEmpty() && set1.isEmpty() ? true : N(set, set1, (var2x, var3x) -> var2x.N((class05946)var3x.i().get()) && var1.N(var2x) == var2.N(var3x));
      }
   }

   private boolean N(class02833 var1, class02833 var2) {
      return var1.y().isEmpty() && var2.y().isEmpty() ? true : N(var1.y(), var2.y(), (var0, var1x) -> {
         class07471 class07471x = var0.y();
         class07471 class07471x = var1x.y();
         return var0.L() == var1x.L() && var0.N() == var1x.N() && class07471x.L() == class07471x.L() && class07471x.y() == class07471x.y();
      });
   }

   public static <T> boolean N(Iterable<T> var0, Iterable<T> var1, BiPredicate<T, T> var2) {
      return StreamSupport.<Object>stream(var0.spliterator(), false)
         .allMatch(var2x -> StreamSupport.<Object>stream(var1.spliterator(), false).anyMatch(var2xx -> var2.test(var2x, var2xx)));
   }

   private boolean N(class06517 var1, class06517 var2) {
      Iterable<class07055> iterable = var1.N();
      return !iterable.iterator().hasNext() ? true : N(iterable, var2.N(), (var0, var1x) -> var0.i() == var1x.i() && var0.u() == var1x.u());
   }

   private static String N(class02848 var0) {
      return var0.N().stream().<CharSequence>map(class00392::getString).collect(Collectors.joining());
   }

   private boolean N(class02848 var1, class02848 var2) {
      String s = N(var1);
      return s.isEmpty() || N(var2).contains(s);
   }
}
