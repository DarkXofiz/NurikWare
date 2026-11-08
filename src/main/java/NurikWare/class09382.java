package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class09382 implements ArgumentType<class12002> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("key.not-found").formatted(var0)));

   public class09382() {
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

   public static class12002 N(CommandContext<?> var0, String var1) {
      return (class12002)var0.getArgument(var1, class12002.class);
   }

   public class12002 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      return Arrays.stream(class12002.values())
         .filter(var1x -> s.equalsIgnoreCase(var1x.u().replace(" ", "_")))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create(s));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(Arrays.stream(class12002.values()).map(var0 -> var0.u().replace(" ", "_")), var2);
   }
}
