package NurikWare;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07689;

public class class10684 implements ArgumentType<class10620> {
   public class10684() {
      super();
   }

   public class10620 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getString().substring(var1.getCursor(), var1.getTotalLength());
      ArrayList arraylist = Lists.newArrayList();
      int i = var1.getCursor();

      while (true) {
         int j;
         class06794 class06794;
         while (true) {
            if (!var1.canRead()) {
               return new class10620(s, arraylist.toArray(new class10580[0]));
            }

            if (var1.peek() == '@') {
               j = var1.getCursor();

               try {
                  class06794 = new class06790(var1, true).v();
                  break;
               } catch (CommandSyntaxException commandsyntaxexception) {
                  if (commandsyntaxexception.getType() != class06790.B && commandsyntaxexception.getType() != class06790.R) {
                     throw commandsyntaxexception;
                  }

                  var1.setCursor(j + 1);
               }
            } else {
               var1.skip();
            }
         }

         arraylist.add(new class10580(j - i, var1.getCursor() - i, class06794));
      }
   }

   public static class00392 N(CommandContext<class07689> var0, String var1) {
      return ((class10620)var0.getArgument(var1, class10620.class)).N((class07689)var0.getSource(), true);
   }
}
