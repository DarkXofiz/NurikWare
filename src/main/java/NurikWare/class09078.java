package NurikWare;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class08066;

public class class09078 {
   public static Object N_0 = new ArrayDeque(3);
   public static Object N_1;

   public static void L() {
      if (((Deque)N_0).isEmpty()) {
         N_1 = null;
      } else {
         N_1 = (class08066)((Deque)N_0).removeLast();
      }
   }

   public class09078() {
      super();
   }

   static {
      i();
   }

   private static void i() {
      N_0 = null;
      N_1 = null;
   }

   public static void y() {
      ((Deque)N_0).clear();
      N_1 = null;
   }

   public static void N(class08066 var0) {
      if ((class08066)N_1 != null) {
         ((Deque)N_0).addLast((class08066)N_1);
      }

      N_1 = var0;
   }

   public static class08066 N() {
      return (class08066)N_1;
   }
}
