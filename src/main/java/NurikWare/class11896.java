package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Comparator;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02536;
import minecraft.class02710;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class02944;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class05316;
import minecraft.class05320;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07304;
import minecraft.class07314;
import org.apache.commons.lang3.mutable.MutableFloat;

public class class11896 {
   public static Object[] N;
   private static double[] L;
   private static String[] i;
   private static byte[] M;

   private static void L() {
      M = new byte[1];
      M[0] = 2;
   }

   private class11896() {
      super();
      throw new UnsupportedOperationException(i[0]);
   }

   static {
      L();
      R();
      N();
      i();
      y();
      N[0] = class06202.Nq();
      N[1] = new class05320(class05316.N(class07078.Ly));
   }

   private static void i() {
      i = new String[1];
      i[0] = "This is a utility class and cannot be instantiated";
   }

   private static void y() {
      N = new Object[M[0]];
   }

   public static Optional<class11297> N(class11933 var0) {
      Optional<class11297> optional = class11281.L(var0.u())
         .sorted(
            Comparator.<class11297>comparingDouble(var0x -> var0x.N().P() - var0x.N().s())
               .thenComparingDouble(var1x -> -N(var1x.N(), var0.y()))
               .thenComparingDouble(var0x -> -class11929.N(var0x.N(), class07314.G))
         )
         .max(Comparator.comparingDouble(var1x -> N(var0.y(), var1x.N())));
      if (optional.isEmpty()) {
         return optional;
      } else {
         return var0 != class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0 && N(var0, optional.get().N()) ? Optional.empty() : optional;
      }
   }

   public static boolean N(class11933 var0, class06584 var1) {
      return N(var0.y(), ((class04453)((class06202)N[0]).T_4).method_6118(var0.y())) >= N(var0.y(), var1);
   }

   private static void N() {
   }

   private static double N(class07085 var0, class06584 var1) {
      if (var1.R()) {
         return L[2];
      } else {
         MutableFloat mutablefloat = new MutableFloat(0.0F);

         for (Entry entry : ((class02710)var1.a_(class02484.P, class02710.N)).y()) {
            ((class07304)((class03556)entry.getKey()).N())
               .N(class02523.L)
               .forEach(
                  var2x -> mutablefloat.setValue(
                     ((class02536)var2x.N()).N(entry.getIntValue(), ((class04453)((class06202)N[0]).T_4).method_59922(), mutablefloat.floatValue())
                  )
               );
         }

         ((class02833)var1.a_(class02484.b, class02833.N))
            .y()
            .stream()
            .filter(var1x -> (var1x.N() == class05298.y || var1x.N() == class05298.L) && var1x.L().y(var0))
            .map(var0x -> var0x.y().y())
            .forEach(mutablefloat::add);
         return mutablefloat.doubleValue();
      }
   }

   private static double N(class06584 var0, class07085 var1) {
      return var0.L(class02484.b)
         ? ((class02833)var0.method_58694(class02484.b))
            .y()
            .stream()
            .filter(var1x -> var1x.L().y(var1))
            .mapToDouble(var0x -> ((class05320)N[1]).L(var0x.N()))
            .max()
            .orElse(L[0])
         : L[1];
   }

   private static void R() {
      L = new double[3];
      L[0] = Double.longBitsToDouble(0L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(0L);
   }
}
