package NurikWare;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01568;
import minecraft.class01578;
import minecraft.class05622;
import minecraft.class07001;
import minecraft.class07701;
import minecraft.class07759;

public class class09477 extends class01578 {
   public class09477(class05622 var1) {
      super();
      this.N = var1;
   }

   protected class07001 N(CommandContext<class07701> var1) throws CommandSyntaxException {
      return class01568.N(class07759.N(var1, "path"), this.N.N(var1));
   }
}
