package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector3d;

public class class09387 implements ArgumentType<Vector3d> {
   public class09387() {
      super();
   }

   public Vector3d parse(StringReader var1) throws CommandSyntaxException {
      class06202 class06202 = class06202.Nq();
      int i;
      if (var1.peek() == '~') {
         i = (int)((class04453)class06202.T_4).method_23317();
         var1.skip();
      } else {
         i = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int j;
      if (var1.peek() == '~') {
         j = (int)((class04453)class06202.T_4).method_23318();
         var1.skip();
      } else {
         j = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int k;
      if (var1.peek() == '~') {
         k = (int)((class04453)class06202.T_4).method_23321();
         var1.skip();
      } else {
         k = var1.readInt();
      }

      return new Vector3d(i, j, k);
   }

   public static Vector3d N(CommandContext<class07689> var0, String var1) {
      return (Vector3d)var0.getArgument(var1, Vector3d.class);
   }
}
