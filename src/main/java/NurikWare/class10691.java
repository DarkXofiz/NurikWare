package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.List;
import java.util.Map;
import minecraft.class00392;
import minecraft.class06541;
import minecraft.class07689;

public class class10691 extends class10742 {
   public class10691() {
      super();
   }

   static {
      y();
   }

   private int y(CommandContext<class07689> var1) {
      CommandDispatcher commanddispatcher = (CommandDispatcher)class10626.N_0;

      for (String s : commanddispatcher.getSmartUsage(commanddispatcher.getRoot(), (class07689)var1.getSource()).values()) {
         this.N("", s);
      }

      return 1;
   }

   private static void y() {
   }

   private int y(CommandContext<class07689> var1, String var2) {
      ParseResults parseresults = ((CommandDispatcher)class10626.N_0).parse((String)var2, (class07689)var1.getSource());
      List list = parseresults.getContext().getNodes();
      if (list.isEmpty()) {
         class11303.y(class11921.N("help.not-found", class06541.field_1068 + var2 + class06541.field_1061).N(class06541.field_1061));
         return 0;
      } else {
         CommandNode commandnode = ((ParsedCommandNode)list.get(list.size() - 1)).getNode();
         Map map = ((CommandDispatcher)class10626.N_0).getSmartUsage(commandnode, (class07689)var1.getSource());
         String s = parseresults.getReader().getString() + " ";
         if (map.isEmpty()) {
            this.N("", parseresults.getReader().getString());
            return 1;
         } else {
            for (String s1 : map.values()) {
               this.N(s, s1);
            }

            return map.size();
         }
      }
   }

   private void N(String var1, String var2) {
      String s = (var1 + var2).replace("|", " | ");
      int i = s.indexOf(" ");
      String s1 = s;
      String s2 = "";
      if (i != -1) {
         s1 = s.substring(0, i);
         s2 = s.substring(i);
      }

      class11303.y(class00392.y((Character)class10626.N_1 + s1).N(class06541.field_1068).y(class00392.y(s2).N(class06541.field_1080)));
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("help").executes(this::y)).then(this.R()));
   }

   private RequiredArgumentBuilder<class07689, String> R() {
      return (RequiredArgumentBuilder<class07689, String>)this.N("command", StringArgumentType.greedyString())
         .executes(var1 -> this.y(var1, StringArgumentType.getString(var1, "command")));
   }
}
