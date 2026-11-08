package NurikWare;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07489;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class10756 extends class06937 {
   public class01894 L() {
      return class07489.N;
   }

   public class10756(class06695 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public static boolean y(class06584 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : var0.N(class01226.Nd);
   }

   public boolean N() {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_8);
   }

   private static void N(CallbackInfoReturnable var0) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var0.setReturnValue(false);
      }
   }

   public boolean N(class06584 var1) {
      return y(var1);
   }
}
