package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.ExecutorService;
import minecraft.class06202;
import minecraft.class07689;

public class class10626 {
   public static Object N_0 = new CommandDispatcher();
   public static Object N_1 = '.';

   public class10626() {
      super();
      ((ExecutorService)class11938.L_1).submit(() -> {
         new class09363().N((CommandDispatcher<class07689>)N_0);
         new class10665().N((CommandDispatcher<class07689>)N_0);
         new class10874().N((CommandDispatcher<class07689>)N_0);
         new class10675().N((CommandDispatcher<class07689>)N_0);
         new class09410().N((CommandDispatcher<class07689>)N_0);
         new class10584().N((CommandDispatcher<class07689>)N_0);
         new class10766().N((CommandDispatcher<class07689>)N_0);
         new class09373().N((CommandDispatcher<class07689>)N_0);
         new class10854().N((CommandDispatcher<class07689>)N_0);
         new class09422().N((CommandDispatcher<class07689>)N_0);
         new class10691().N((CommandDispatcher<class07689>)N_0);
         new class10681().N((CommandDispatcher<class07689>)N_0);
      });
   }

   static {
      N();
   }

   public void N(StringReader var1) {
      try {
         ((CommandDispatcher)N_0).execute(var1, class06202.Nq().NE().L());
      } catch (CommandSyntaxException commandsyntaxexception) {
         class11303.y(commandsyntaxexception.getMessage());
      }
   }

   private static void N() {
      N_0 = null;
      N_1 = '.';
   }
}
