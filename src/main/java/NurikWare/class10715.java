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

public class class10715 implements ArgumentType<class11481> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("waypoint.not-found").formatted(var0)));

   public class10715() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   private static void N() {
   }

   public static class11481 N(CommandContext<?> var0, String var1) {
      return (class11481)var0.getArgument(var1, class11481.class);
   }

   public class11481 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return class11938.E().N().stream().filter(var1x -> s.equals(var1x.m())).findFirst().orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create(s));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class11938.E().y(), var2);
   }
}
