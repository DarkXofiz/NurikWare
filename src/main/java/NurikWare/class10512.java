package NurikWare;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.concurrent.CompletableFuture;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class05401;
import minecraft.class05404;
import minecraft.class05409;
import minecraft.class05421;
import minecraft.class05422;
import minecraft.class07135;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class10512 implements class07135 {
   private final class01997 field_39375;
   private final class01997 field_55247;
   private final class01997 field_39376;
   private FabricDataOutput fabricDataOutput;

   public class10512(class01996 var1) {
      super();
      this.field_39375 = var1.method_45973(class02024.field_39368, "blockstates");
      this.field_55247 = var1.method_45973(class02024.field_39368, "items");
      this.field_39376 = var1.method_45973(class02024.field_39368, "models");
      this.m_handler$zdn000$fabric_data_generation_api_v1$init_53(var1, null);
   }

   public String method_10321() {
      return "Model Definitions";
   }

   public CompletableFuture<?> method_10319(class04476 var1) {
      class05409 class05409 = new class05409();
      class05421 class05421 = new class05421();
      class05401 class05401 = new class05401();
      class05404 class05404 = new class05404(class05421, class05409, class05401);
      this.m_handler$zdn000$fabric_data_generation_api_v1$setFabricDataOutput_55(var1, null, class05421, class05409);
      class05404 class05404x = class05404;
      this.m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerBlockStateModels_54(class05404x, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4910]");
         ((class05404)var0[0]).L();
         return (Void)null;
      });
      class05422 class05422 = new class05422(class05409, class05401);
      this.m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerItemModels_52(class05422, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4915]");
         ((class05422)var0[0]).N();
         return (Void)null;
      });
      class05421.N();
      class05409.N();
      return CompletableFuture.allOf(class05421.N(var1, this.field_39375), class05401.N(var1, this.field_39376), class05409.N(var1, this.field_55247));
   }

   private void m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerItemModels_52(class05422 var1, Operation var2) {
      if (this instanceof FabricModelProvider) {
         ((FabricModelProvider)this).generateItemModels(var1);
      } else {
         var2.call(new Object[]{var1});
      }
   }

   public void m_handler$zdn000$fabric_data_generation_api_v1$init_53(class01996 var1, CallbackInfo var2) {
      if (var1 instanceof FabricDataOutput fabricdataoutput) {
         this.fabricDataOutput = fabricdataoutput;
      }
   }

   private void m_wrapOperation$zdn000$fabric_data_generation_api_v1$registerBlockStateModels_54(class05404 var1, Operation var2) {
      if (this instanceof FabricModelProvider) {
         ((FabricModelProvider)this).generateBlockStateModels(var1);
      } else {
         var2.call(new Object[]{var1});
      }
   }

   private void m_handler$zdn000$fabric_data_generation_api_v1$setFabricDataOutput_55(
      class04476 var1, CallbackInfoReturnable var2, class05421 var3, class05409 var4
   ) {
      ((FabricModelProviderDefinitions)var3).setFabricDataOutput(this.fabricDataOutput);
      ((FabricModelProviderDefinitions)var4).setFabricDataOutput(this.fabricDataOutput);
      ((FabricItemAssetDefinitions)var4).fabric_setProcessedBlocks(var3.N.keySet());
   }
}
