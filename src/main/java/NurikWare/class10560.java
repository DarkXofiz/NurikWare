package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;

public class class10560 {
   private static String[] L;
   public static Object N_0 = new SimpleCommandExceptionType(class00392.L(L[2]));

   public class10560() {
      super();
   }

   static {
      N();
      u();
      y();
   }

   private static void u() {
      L = new String[3];
      L[0] = "save-on";
      L[1] = "commands.save.enabled";
      L[2] = "commands.save.alreadyOn";
   }

   private static void y() {
   }

   private static void N() {
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(L[0]).requires(class07686.N(class07686.R))).executes(var0x -> {
         class07701 class07701 = (class07701)var0x.getSource();
         if (!class07701.W().m(true)) {
            throw ((SimpleCommandExceptionType)N_0).create();
         } else {
            class07701.N(() -> class00392.L(L[1]), true);
            return 1;
         }
      }));
   }
}
