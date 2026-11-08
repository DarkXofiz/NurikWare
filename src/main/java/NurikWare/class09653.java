package NurikWare;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02168;
import minecraft.class02173;
import minecraft.class08501;

public class class09653<T, C, P> extends class02173<class02168<T, C, P>, T> {
   public class09653(class08501<StringReader, class01894> var1, class02168<T, C, P> var2) {
      super(var1, var2);
   }

   public Stream<class01894> y() {
      return ((class02168)this.N).N();
   }

   protected T N(ImmutableStringReader var1, class01894 var2) throws Exception {
      return (T)((class02168)this.N).B(var1, var2);
   }
}
