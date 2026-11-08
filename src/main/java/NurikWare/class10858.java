package NurikWare;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;
import minecraft.class07906;

public class class10858 extends class07906 {
   public class10858(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.N = var3;
   }

   protected String N(String var1) {
      return (String)this.N.apply(var1);
   }
}
