package NurikWare;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00392;
import minecraft.class01359;
import minecraft.class01590;
import minecraft.class04927;
import minecraft.class06626;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class09469 extends class04927 {
   public class09469(class01359 var1, class01590 var2, int var3, int var4, int var5, int var6, class00392 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.N = var1;
   }

   private void N(class06626 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var2.setReturnValue(super.method_25400(var1));
      }
   }

   public boolean method_25400(class06626 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         return !class01359.N(this.N, this.method_1882(), var1.L(), this.method_1881()) ? false : super.method_25400(var1);
      }
   }
}
