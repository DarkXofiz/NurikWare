package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class10843 implements ArgumentType<String> {
   public class10843() {
      super();
   }

   static {
      N();
   }

   private static void N() {
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return s;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      String s = var2.getRemaining();
      int i = s.lastIndexOf("@");
      if (i == -1) {
         return var2.buildFuture();
      } else {
         if (s.charAt(s.length() - 1) == '@') {
            class11938.z().N(new class11953());
         }

         String s1 = s.substring(i + 1);
         return class11938.z().E().stream().anyMatch(var1x -> var1x.startsWith(s1))
            ? class07689.y(class11938.z().E(), var2.createOffset(var2.getStart() + i + 1))
            : var2.buildFuture();
      }
   }
}
