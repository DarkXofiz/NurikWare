package NurikWare;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import minecraft.class01549;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07686;
import minecraft.class07701;
import net.fabricmc.fabric.impl.gamerule.EnumRuleCommand;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09476 implements class05706 {
   public class09476(LiteralArgumentBuilder var1) {
      super();
      this.N = var1;
   }

   public <T> void N(class06839<T> var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         LiteralArgumentBuilder<class07701> literalargumentbuilder = class07686.y(var1.N());
         LiteralArgumentBuilder<class07701> literalargumentbuilder1 = class07686.y(var1.y().toString());
         ((LiteralArgumentBuilder)this.N.then(class01549.N(var1, literalargumentbuilder))).then(class01549.N(var1, literalargumentbuilder1));
      }
   }

   private void N(class06839 var1, CallbackInfo var2) {
      if (((RuleTypeExtensions)var1).fabric_getType() == FabricGameRuleType.ENUM) {
         EnumRuleCommand.register(this.N, var1);
         var2.cancel();
      }
   }
}
