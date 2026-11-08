package NurikWare;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class10642 extends class10733 {
   public class10642() {
      super();
   }

   static {
      N();
   }

   private static void N() {
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class11938.u().a().filter(var0 -> !var0.R().B()).map(class11067::N), var2);
   }
}
