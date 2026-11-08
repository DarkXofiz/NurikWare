package NurikWare;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07070;
import minecraft.class07713;
import minecraft.class08036;

public class class11273 extends class11045<class08036> {
   public static Object y_0 = Codec.STRING.optionalFieldOf("don-item");
   public static Object y_1 = Codec.STRING.optionalFieldOf("minecraft:don-item");
   public static Object y_2 = class02837.L.optionalFieldOf("PublicBukkitValues");

   public class11273(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      N();
      i();
   }

   private String B(String var1) {
      if (var1.startsWith("sphere-")) {
         String s = var1.substring(var1.indexOf(45) + 1).toUpperCase();
         return class06541.field_1080 + " [" + class06541.field_1061 + s + class06541.field_1080 + "]" + class06541.field_1070;
      } else {
         return "";
      }
   }

   private static void i() {
      y_0 = null;
      y_1 = null;
      y_2 = null;
   }

   public class05216 L(class08036 var1) {
      class05216 class05216 = super.L(var1);
      if (((class11535)((EntityESP)super.N_0).L_3).U()) {
         for (class07070 class07070 : class07070.values()) {
            String s = this.N(var1.method_61420(class07070));
            if (!s.isEmpty()) {
               class05216.i(s);
            }
         }
      }

      if (var1 instanceof class11814 class11814 && class11814.dataManager().y().N()) {
         class05216.i(this.R());
      }

      return class05216;
   }

   @Override
   public boolean test(class07049 var1) {
      return class11791.B()
         .and(class11791.N().or(var1x -> var1 instanceof class11814 && ((class11814)var1).dataManager().y().N()))
         .and(class11791.E().negate())
         .and(class11791.z().negate())
         .and(class11791.y().negate())
         .and((class11786)((EntityESP)super.N_0).M_3)
         .and((class11785)((EntityESP)super.N_0).M_2)
         .and((class11793)((EntityESP)super.N_0).i_0)
         .test(var1);
   }

   private String N(class06584 var1) {
      class02837 class02837 = (class02837)var1.y().method_58694(class02484.y);
      if (class02837 == null) {
         return "";
      } else {
         Optional optional = (Optional)((MapCodec)y_0).codec().parse(class07713.N, class02837.y()).getOrThrow();
         if (optional.isPresent()) {
            return this.B((String)optional.get());
         } else {
            Optional optional1 = (Optional)((MapCodec)y_2).codec().parse(class07713.N, class02837.y()).getOrThrow();
            if (optional1.isPresent()) {
               Optional optional2 = (Optional)((MapCodec)y_1).codec().parse(class07713.N, ((class02837)optional1.get()).y()).getOrThrow();
               if (optional2.isPresent()) {
                  return this.B((String)optional2.get());
               }
            }

            return "";
         }
      }
   }

   public int u(class08036 var1) {
      return !var1.method_5767() && !var1.method_21751() ? super.u(var1) : -1434451968;
   }

   private static void N() {
   }

   private String R() {
      return class06541.field_1080 + " [" + class06541.field_1061 + "DORMANT" + class06541.field_1080 + "]" + class06541.field_1070;
   }
}
