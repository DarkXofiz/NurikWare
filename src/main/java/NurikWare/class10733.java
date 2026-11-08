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

public class class10733 implements ArgumentType<class11067> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("module.not-found").formatted(((class11067)var0).N())));

   public class10733() {
      super();
   }

   static {
      N();
      y();
   }

   private static void y() {
      N_0 = null;
   }

   private static void N() {
   }

   public static class11067 N(CommandContext<?> var0, String var1) {
      return (class11067)var0.getArgument(var1, class11067.class);
   }

   public class11067 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      return class11938.u().N(s).orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create(s));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class11938.u().t(), var2);
   }
}
