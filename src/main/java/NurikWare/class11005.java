package NurikWare;

import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class08036;

public class class11005 extends class11273 {
   public class11005(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public class05216 L(class08036 var1) {
      return super.L(var1).i(class06541.field_1080 + " [" + class06541.field_1060 + "F" + class06541.field_1080 + "]" + class06541.field_1070);
   }

   @Override
   public int u(class08036 var1) {
      return -1442807808;
   }

   @Override
   public boolean test(class07049 var1) {
      return class11791.E().or(class11791.z()).and(class11791.y().negate()).and(class11791.N()).test(var1);
   }
}
