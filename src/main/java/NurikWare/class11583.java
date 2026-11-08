package NurikWare;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class06584;
import minecraft.class07713;

public abstract class class11583 extends class11553<HolyHelper> {
   public Object y_0;
   public Object y_1;

   @Override
   public class11328 L() {
      return var1 -> {
         this.B();
         class02837 class02837 = (class02837)var1.y().method_58694(class02484.y);
         return class02837 == null ? false : ((Optional)((MapCodec)this.y_0).codec().parse(class07713.N, class02837.y()).getOrThrow()).<Boolean>map(var1x -> {
            this.B();
            return ((Optional)((MapCodec)this.y_1).codec().parse(class07713.N, var1x.y()).getOrThrow()).orElse("").equals(this.N());
         }).orElse(false) || this.N(var1);
      };
   }

   public class11583(HolyHelper var1, String var2, String var3, String var4) {
      super(var1, var2);
      this.B();
      this.y_0 = class02837.L.optionalFieldOf(var3);
      this.y_1 = Codec.STRING.optionalFieldOf(var4);
   }

   private void B() {
   }

   private boolean N(class06584 var1) {
      return var1.N(this.y().B()) && var1.Y().getString().contains(this.u());
   }
}
