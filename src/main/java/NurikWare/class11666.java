package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class11666 implements class08910 {
   private final List<class08910> N;

   public class11666(List<class08910> var1) {
      super();
      this.N = var1;
   }

   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      var1.N(this.N.size());
      Iterator<class08910> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         iterator.next().method_65584(var1, var2, var3, var4, var5, var6, var7);
      }
   }
}
