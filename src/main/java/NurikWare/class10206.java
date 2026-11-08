package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import minecraft.class01711;
import minecraft.class03468;
import minecraft.class03478;
import minecraft.class03483;
import minecraft.class07686;

public class class10206 {
   public class10206() {
      super();
   }

   public static <T extends class01711<T>> void N(CommandDispatcher<T> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("return")
                     .requires(class07686.N(class07686.u)))
                  .then(RequiredArgumentBuilder.argument("value", IntegerArgumentType.integer()).executes(new class03478())))
               .then(LiteralArgumentBuilder.literal("fail").executes(new class03468())))
            .then(LiteralArgumentBuilder.literal("run").forward(var0.getRoot(), new class03483(), false))
      );
   }
}
