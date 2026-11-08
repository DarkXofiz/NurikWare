package NurikWare;

import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import minecraft.class01711;
import minecraft.class01736;
import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03126;

public class class09516<T extends class01711<T>> extends class01736<T> implements class01742<T> {
   private final T y;

   public class09516(String var1, ContextChain<T> var2, T var3) {
      super(var1, var2);
      this.y = (T)var3;
   }

   public void execute(class01752<T> var1, class03099 var2) {
      this.N(var1, var2);
      this.N(this.y, List.of(this.y), var1, var2, class03126.N);
   }
}
