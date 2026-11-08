package NurikWare;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class03458;
import minecraft.class06202;
import minecraft.class07689;

public class class09401 extends class10782 {
   public class09401() {
      super();
   }

   static {
      N();
   }

   private static void N() {
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class06202.Nq().NE().Z().stream().map(var0 -> var0.N().name()).filter(var0 -> !class11938.t().L(var0)), var2);
   }
}
