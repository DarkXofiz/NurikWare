package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector2d;

public class class10726 implements ArgumentType<Vector2d> {
   public class10726() {
      super();
   }

   public static Vector2d N(CommandContext<class07689> var0, String var1) {
      return (Vector2d)var0.getArgument(var1, Vector2d.class);
   }

   public Vector2d parse(StringReader var1) throws CommandSyntaxException {
      class06202 class06202 = class06202.Nq();
      double d0;
      if (var1.peek() == '~') {
         d0 = ((class04453)class06202.T_4).method_23317();
         var1.skip();
      } else {
         d0 = var1.readDouble();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      double d1;
      if (var1.peek() == '~') {
         d1 = ((class04453)class06202.T_4).method_23321();
         var1.skip();
      } else {
         d1 = var1.readDouble();
      }

      return new Vector2d(d0, d1);
   }
}
