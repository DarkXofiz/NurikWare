package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07490;
import minecraft.class07689;

public class class09422 extends class10742 {
   private void L() {
      class05096 class05096 = (class05096)((class06202)super.y_0).v_3;
      if (class05096 instanceof class06026 class06026) {
         class07490 class07490 = (class07490)class06026.E();
         int i = class07490.E().method_5439();
         int j = 0;
         Iterator var5 = class11107.y().iterator();

         while (var5.hasNext()) {
            class06584 class06584 = ((class11664)var5.next()).N();
            if (j < i) {
               class07490.N(j, class07490.z(), class06584);
               j++;
            } else if (!((class04453)((class06202)super.y_0).T_4).method_31548().M(class06584) && !class06584.R()) {
               ((class04453)((class06202)super.y_0).T_4).method_7328(class06584, false);
            }
         }
      }
   }

   public class09422() {
      super();
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("debug").requires(var0 -> (Boolean)class11938.L_3)).then(this.N("load").executes(var1x -> {
            this.L();
            return 1;
         }))
      );
   }
}
