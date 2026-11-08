package NurikWare;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import minecraft.class02824;
import minecraft.class02831;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class07468;
import minecraft.class07471;

public class class10014 {
   private final Builder<class02824> N = ImmutableList.builder();

   public class10014() {
      super();
   }

   public class02833 N() {
      return new class02833(this.N.build());
   }

   public class10014 N(class03556<class07468> var1, class07471 var2, class02834 var3, class02831 var4) {
      this.N.add(new class02824(var1, var2, var3, var4));
      return this;
   }

   public class10014 N(class03556<class07468> var1, class07471 var2, class02834 var3) {
      this.N.add(new class02824(var1, var2, var3));
      return this;
   }
}
