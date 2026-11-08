package NurikWare;

import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01056;
import minecraft.class01962;
import minecraft.class03054;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06390;
import minecraft.class06451;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11303 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1 = class06202.Nq();
   public static Object N_2 = new class03054(16777215, null, class00392.N("NurikWare message"), "NurikWare message");

   private static class00392 L(Object var0) {
      return (class00392)(switch (var0) {
         case null -> class00392.y("null");
         case class00392 class00392 -> {
         }
         default -> class00392.N(var0.toString());
      });
   }

   private class11303() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
   }

   public static void y(Object var0) {
      N((class11287)class11293.N_0, L(var0));
   }

   private static void y() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   public static void N(class11287 var0, Object var1) {
      N(var0, L(var1));
   }

   public static void N(Object var0) {
      N((class11287)class11295.N_0, L(var0));
   }

   private static void N(class06390 var0) {
      String s = var0.y().getString().replaceAll("\r", "\\r").replaceAll("\n", "\\n");
      String s1 = (String)class01962.N(var0.u(), class03054::B);
      if (s1 != null) {
         ((Logger)N_0).info("[{}] [CHAT] {}", s1, s);
      } else {
         ((Logger)N_0).info("[CHAT] {}", s);
      }
   }

   public static void N(class11287 var0, class00392 var1) {
      class11923.N(() -> {
         class05216 class05216 = class00392.i().L().y(class00405.N).y(var0.N()).y(var1);
         class06390 class06390 = new class06390(((class01056)((class06202)N_1).i_6).R(), class05216, null, (class03054)N_2);
         N(class06390);
         class06451 class06451 = ((class01056)((class06202)N_1).i_6).i();
         class06451.N(class06390);
         class06451.y(class06390);
      });
   }
}
