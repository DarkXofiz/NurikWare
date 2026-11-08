package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class00892;
import minecraft.class00903;
import minecraft.class00904;
import minecraft.class01905;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class07689;

public class class10747 implements ArgumentType<class00903> {
   public Object N_0;

   public class10747(class04348 var1) {
      super();
      this.y();
      this.N_0 = var1.y(class04227.Z);
   }

   private void y() {
   }

   public class00903 parse(StringReader var1) throws CommandSyntaxException {
      class00904 class00904 = class00892.N((class01905)this.N_0, var1, true);
      return new class00903(class00904.N(), class00904.y().keySet(), class00904.L());
   }

   public static class00903 N(CommandContext<class07689> var0, String var1) {
      return (class00903)var0.getArgument(var1, class00903.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class00892.N((class01905)this.N_0, var2, false, true);
   }
}
