package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class09406 implements ArgumentType<String> {
   private static String[] i;
   public static Object N_0 = new String[]{i[0], i[1], i[2], i[3]};

   private static void L() {
   }

   public class09406() {
      super();
   }

   static {
      i();
      L();
   }

   private static void i() {
      i = new String[4];
      i[0] = "спам/флуд";
      i[1] = "упоминание родных";
      i[2] = "упоминание сторонних клиентов";
      i[3] = "оскорбление клиента";
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return s;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N((String[])N_0, var2);
   }
}
