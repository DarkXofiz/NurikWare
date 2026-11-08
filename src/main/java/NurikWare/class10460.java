package NurikWare;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import minecraft.class04594;

public class class10460 {
   private final List<String> N = Lists.newArrayList();

   public class10460() {
      super();
   }

   public class10460 N(String var1) {
      this.N.add(var1);
      return this;
   }

   public class04594 N(Writer var1) throws IOException {
      return new class04594(var1, this.N);
   }
}
