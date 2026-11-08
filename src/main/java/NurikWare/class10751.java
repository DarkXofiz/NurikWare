package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class10751 implements ArgumentType<class11997> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("macros.not-found").formatted(((class11997)var0).L())));

   public class10751() {
      super();
   }

   static {
      y();
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   private static void y() {
   }

   public static class11997 N(CommandContext<?> var0, String var1) {
      return (class11997)var0.getArgument(var1, class11997.class);
   }

   private static void N() {
   }

   public class11997 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      return class11938.y().L(s).orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create(s));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class11938.y().N(), var2);
   }
}
