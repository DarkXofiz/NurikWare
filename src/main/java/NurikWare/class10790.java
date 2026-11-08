package NurikWare;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01765;
import minecraft.class07802;

@FunctionalInterface
public interface class10790 extends class07802 {
   int apply(int var1, int var2) throws CommandSyntaxException;

   default void apply(class01765 var1, class01765 var2) throws CommandSyntaxException {
      var1.N(this.apply(var1.N(), var2.N()));
   }
}
