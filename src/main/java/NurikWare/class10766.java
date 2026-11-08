package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class06541;
import minecraft.class07689;

public class class10766 extends class10742 {
   public class10766() {
      super();
   }

   private RequiredArgumentBuilder<class07689, Character> y() {
      return (RequiredArgumentBuilder<class07689, Character>)this.N("prefix", new class10787()).executes(var1 -> this.N(class10787.N(var1, "prefix")));
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register((LiteralArgumentBuilder)this.N("prefix").then(this.y()));
   }

   private int N(char var1) {
      class10626.N_1 = var1;
      class11303.y(class11921.N("prefix", " '%s'".formatted(var1)).N(class06541.field_1080));
      class11938.z().N(class11847.N());
      return 1;
   }
}
