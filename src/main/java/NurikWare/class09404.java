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
import minecraft.class00891;
import minecraft.class07689;

public class class09404 implements ArgumentType<class00891> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("nuker.not-found").formatted(var0)));

   public class09404() {
      super();
   }

   static {
      N();
   }

   public static class00891 N(CommandContext<?> var0, String var1) {
      return (class00891)var0.getArgument(var1, class00891.class);
   }

   private static void N() {
      N_0 = null;
   }

   public class00891 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      return class11938.u()
         .b()
         .m()
         .stream()
         .filter(var1x -> var1x.w().replace("block.minecraft.", "").equals(s))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create(s));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class11938.u().b().m().stream().map(var0 -> var0.w().replace("block.minecraft.", "")), var2);
   }
}
