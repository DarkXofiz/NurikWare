package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07689;

public abstract class class10742 {
   public Object y_0;
   public static Object L_0;

   public class10742() {
      super();
      this.u();
      this.y_0 = class06202.Nq();
   }

   static {
      y();
   }

   private void u() {
   }

   private static void y() {
      L_0 = 1;
   }

   public <T> RequiredArgumentBuilder<class07689, T> N(String var1, ArgumentType<T> var2) {
      return RequiredArgumentBuilder.argument(var1, var2);
   }

   public static String N(CommandContext<?> var0, String var1) {
      return (String)var0.getArgument(var1, String.class);
   }

   public LiteralArgumentBuilder<class07689> N(String var1) {
      return LiteralArgumentBuilder.literal(var1);
   }

   public boolean N() {
      if (class11938.z().R()) {
         return true;
      } else {
         class11303.y(class11921.N("socket.not-connected").N(class06541.field_1061));
         return false;
      }
   }

   public abstract void N(CommandDispatcher<class07689> var1);
}
