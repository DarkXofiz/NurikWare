package NurikWare;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07713;

public class class11561 extends class11553<AnarchyHelper> {
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;

   @Override
   public class11328 L() {
      return var1 -> {
         this.R();
         class02837 class02837 = (class02837)var1.y().method_58694(class02484.y);
         return class02837 != null && ((Optional)((MapCodec)this.u_0).codec().parse(class07713.N, class02837.y()).getOrThrow()).orElse("").equals(this.N())
            || this.N(var1);
      };
   }

   public class11561(AnarchyHelper var1, String var2, Supplier<class06584> var3, String var4, String var5) {
      super(var1, var2);
      this.R();
      this.u_1 = var3;
      this.u_2 = var4;
      this.u_3 = var5;
      this.u_0 = Codec.STRING.optionalFieldOf("don-item");
   }

   public class11561(AnarchyHelper var1, String var2, class06581 var3, String var4, String var5) {
      this(var1, var2, var3::E, var4, var5);
   }

   @Override
   public String u() {
      this.R();
      return (String)this.u_2;
   }

   @Override
   public class06584 y() {
      this.R();
      return (class06584)((Supplier)this.u_1).get();
   }

   @Override
   public String N() {
      this.R();
      return (String)this.u_3;
   }

   public boolean N(class06584 var1) {
      return var1.Y().getString().toLowerCase().contains(this.u().toLowerCase());
   }

   private void R() {
   }
}
