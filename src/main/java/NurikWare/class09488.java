package NurikWare;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Map;
import minecraft.class00667;
import minecraft.class01637;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01668;
import minecraft.class01894;
import minecraft.class02362;
import net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider;
import net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec;

public class class09488<B> implements class02362<B, class01659>, FabricCustomPayloadPacketCodec {
   private CustomPayloadTypeProvider L;

   public class09488(Map var1, class01637 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void encode(B var1, class01659 var2) {
      this.N((B)var1, var2.method_56479(), var2);
   }

   private class02362 N(class02362 var1, class01894 var2, Operation var3, class00667 var4) {
      if (this.L != null) {
         class01668 class01668 = this.L.get(var4, var2);
         if (class01668 != null) {
            return class01668.y();
         }
      }

      return (class02362)var3.call(new Object[]{var1, var2});
   }

   public class01659 decode(B var1) {
      class01894 class01894 = var1.T();
      return (class01659)this.N(this, class01894, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_8710$1, net.minecraft.class_2960]");
         return ((class09488)var0[0]).N((class01894)var0[1]);
      }, var1).decode(var1);
   }

   private <T extends class01659> void N(B var1, class01666<T> var2, class01659 var3) {
      var1.N(var2.N());
      class01894 class01894 = var2.N();
      this.N(this, class01894, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_8710$1, net.minecraft.class_2960]");
         return ((class09488)var0[0]).N((class01894)var0[1]);
      }, var1).encode(var1, var3);
   }

   private class02362<? super B, ? extends class01659> N(class01894 var1) {
      class02362 class02362 = (class02362)this.N.get(var1);
      return class02362 != null ? class02362 : this.y.create(var1);
   }

   public void fabric_setPacketCodecProvider(CustomPayloadTypeProvider var1) {
      if (this.L != null) {
         throw new IllegalStateException("Payload codec provider is already set!");
      } else {
         this.L = var1;
      }
   }
}
