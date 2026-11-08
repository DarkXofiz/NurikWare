package NurikWare;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11813 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private static void L() {
      N_0 = null;
   }

   private class11813() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
      i();
      L();
   }

   private static void i() {
   }

   private static void y() {
   }

   private static void N(List<class11535> var0, Consumer<String> var1) {
      for (class11535 class11535 : var0) {
         N(var1, () -> class11535.E().N());
      }
   }

   private static void N(Consumer<String> var0, Supplier<String> var1) {
      try {
         String s = (String)var1.get();
         if (s != null && !s.isEmpty()) {
            var0.accept(s);
         }
      } catch (Throwable throwable) {
      }
   }

   private static void N(Collection<class11536<?>> var0, Consumer<String> var1, Consumer<String> var2) {
      for (Object object : var0) {
         N(var1, ((class11536)object).P()::N);
         switch (object) {
            case class11523 class11523:
               N(((class11523)object).L(), var2);
               break;
            case class11517 class11517:
               N(((class11517)object).L(), var2);
               break;
            case class11533 class11533:
               N(var1, class11533::L);
               break;
            default:
         }
      }
   }

   public static void N() {
      if ((Boolean)class11938.L_4) {
         System.out.println();
         LinkedHashSet linkedhashset = new LinkedHashSet();
         LinkedHashSet linkedhashset1 = new LinkedHashSet();
         Consumer consumer = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               linkedhashset.add(var1x);
            }
         };
         Consumer consumer1 = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               linkedhashset1.add(var1x);
            }
         };

         for (class11067 class11067 : class11938.u().NN()) {
            N(consumer, class11067.B()::N);
            N(class11067.w().values(), consumer, consumer1);
         }

         for (class11999 class11999 : class11999.values()) {
            Set<String> set = new class12020(class11999, class11999).y().keySet();
            TreeSet treeset = new TreeSet(linkedhashset);
            treeset.removeAll(set);
            TreeSet treeset1 = new TreeSet<>(set);
            treeset1.removeAll(linkedhashset);
            treeset1.removeAll(linkedhashset1);
            treeset1.removeIf(var0x -> !var0x.startsWith("module."));
            ((Logger)N_0).error("==== Locale: {} ====", class11999.N());
            if (treeset.isEmpty()) {
               ((Logger)N_0).error("[MISSING] отсутствует: 0");
            } else {
               ((Logger)N_0).error("[MISSING] отсутствуют ключи ({}):", treeset.size());

               for (String s : treeset) {
                  ((Logger)N_0).error(" - {}", s);
               }
            }

            if (treeset1.isEmpty()) {
               ((Logger)N_0).error("[UNUSED] неиспользуемых описаний/настроек: 0");
            } else {
               ((Logger)N_0).error("[UNUSED] ключи присутствуют, но не используются ({}):", treeset1.size());

               for (String s1 : treeset1) {
                  ((Logger)N_0).error(" - {}", s1);
               }
            }

            System.out.println();
         }
      }
   }
}
