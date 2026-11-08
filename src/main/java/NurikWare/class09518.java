package NurikWare;

import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import minecraft.class01711;
import minecraft.class01736;
import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03126;

public class class09518<T extends class01711<T>> extends class01736<T> implements class01742<T> {
   private final class03126 y;
   private final T L;
   private final List<T> u;

   public class09518(String var1, ContextChain<T> var2, class03126 var3, T var4, List<T> var5) {
      super(var1, var2);
      this.L = (T)var4;
      this.u = var5;
      this.y = var3;
   }

   public void execute(class01752<T> var1, class03099 var2) {
      this.N(this.L, this.u, var1, var2, this.y);
   }
}
