package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;

public class class10564 {
   private static boolean[] L;
   public static Object[] N;
   private static String[] u;

   public class10564() {
      super();
   }

   static {
      y();
      N();
      R();
      N[0] = new SimpleCommandExceptionType(class00392.L(u[4]));
   }

   private static void y() {
      L = new boolean[1];
      L[0] = true;
   }

   private static int N(class07701 var0, boolean var1) throws CommandSyntaxException {
      var0.N(() -> class00392.L(u[3]), false);
      if (!var0.W().N(true, var1, true)) {
         throw ((SimpleCommandExceptionType)N[0]).create();
      } else {
         var0.N(() -> class00392.L(u[2]), true);
         return 1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(u[0]).requires(class07686.N(class07686.R)))
               .executes(var0x -> N((class07701)var0x.getSource(), false)))
            .then(class07686.y(u[1]).executes(var0x -> N((class07701)var0x.getSource(), true)))
      );
   }

   private static void N() {
      u = new String[5];
      u[0] = "save-all";
      u[1] = "flush";
      u[2] = "commands.save.success";
      u[3] = "commands.save.saving";
      u[4] = "commands.save.failed";
   }

   private static void R() {
      N = new Object[L[0]];
   }
}
