package NurikWare;

import minecraft.class00500;
import minecraft.class03448;
import minecraft.class03770;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class05885;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.fantastic.IrisParticleRenderTypes;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class10093 extends class05848 {
   private final class05846 N;
   private boolean y;

   public class10093(class03448 var1, double var2, double var4, double var6, class00500 var8) {
      super(var1, var2, var4, var6, N(class06202.Nq().yU().N(), var8, var1, var2, var4, var6, var8));
      this.field_3844 = 0.0F;
      this.field_3847 = 80;
      this.field_3862 = false;
      this.N = this.field_62632.method_45852().equals(class08626.N) ? class05846.N : class05846.y;
      this.N(var1, var2, var4, var6, var8, null);
   }

   private static class08388 N(class03770 var0, class00500 var1, class03448 var2, double var3, double var5, double var7, class00500 var9) {
      return var0.getModelParticleSprite(var1, var2, class07209.method_49637(var3, var5, var7));
   }

   private void N(class03448 var1, double var2, double var4, double var6, class00500 var8, CallbackInfo var9) {
      class08743 class08743 = class05885.N(var8);
      if (class08743 == class08743.field_60923 || class08743 == class08743.field_60925) {
         this.y = true;
      }
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.y && var1.getReturnValue() == class05846.N) {
         var1.setReturnValue(IrisParticleRenderTypes.TERRAIN_OPAQUE);
      }
   }

   public class05846 method_74255() {
      class05846 class05846x;
      class05846 class05846x = class05846x = this.N;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class05846x);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class05846)callbackinforeturnable.getReturnValue() : class05846x;
   }

   public float method_18132(float var1) {
      return 0.5F;
   }
}
