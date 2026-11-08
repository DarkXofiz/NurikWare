package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class00392;

public class class10787 implements ArgumentType<Character> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("prefix.error")));

   public class10787() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   public Character parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getRemaining();
      if (!s.isBlank() && !s.equals("/") && !s.equals("#")) {
         var1.setCursor(var1.getCursor() + 1);
         return s.charAt(0);
      } else {
         throw ((DynamicCommandExceptionType)N_0).create(s);
      }
   }

   private static void N() {
   }

   public static Character N(CommandContext<?> var0, String var1) {
      return (Character)var0.getArgument(var1, Character.class);
   }
}
