package NurikWare;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01203;
import minecraft.class01228;
import org.jspecify.annotations.Nullable;

public final class class09444 {
   private final List<class01228> N;
   private final Map<class00891, List<class01228>> y = Maps.newHashMap();
   @Nullable
   private List<class01203> L;

   public class09444(List<class01228> var1) {
      super();
      this.N = var1;
   }

   public List<class01228> y() {
      return this.N;
   }

   public List<class01228> N(class00891 var1) {
      return this.y.computeIfAbsent(var1, var1x -> this.N.stream().filter(var1xx -> var1xx.y().N(var1x)).collect(Collectors.toList()));
   }

   public List<class01203> N() {
      if (this.L == null) {
         this.L = this.N(class00869.sr).stream().<class01203>map(class01203::N).toList();
      }

      return this.L;
   }
}
