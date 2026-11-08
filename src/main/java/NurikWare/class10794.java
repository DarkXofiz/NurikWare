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

public class class10794 implements ArgumentType<class09045> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("bind.not-found").formatted(var0)));

   private static void L() {
      N_0 = null;
   }

   public class10794() {
      super();
   }

   static {
      N();
      L();
   }

   public static class09045 N(CommandContext<?> var0, String var1) {
      return (class09045)var0.getArgument(var1, class09045.class);
   }

   public class09045 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      class09045 class09045 = class09045.N(s);
      if (class09045 == null) {
         throw ((DynamicCommandExceptionType)N_0).create(s);
      } else {
         return class09045;
      }
   }

   private static void N() {
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(Arrays.stream(class09045.values()).map(var0 -> var0.N().toUpperCase()), var2);
   }
}
