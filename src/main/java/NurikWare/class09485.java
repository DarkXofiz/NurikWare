package NurikWare;

import minecraft.class00392;
import minecraft.class00565;
import minecraft.class00717;
import minecraft.class01615;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06145;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07057;
import minecraft.class07064;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08007;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09485 implements class00565 {
   public class09485(class01615 var1, class04782 var2, class07049 var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public void N() {
      if (!(this.y instanceof class00717)
         && !(this.y instanceof class07057)
         && this.y != this.L.field_14140
         && !(this.y instanceof class08007 class08007 && !class08007.method_5732())) {
         class06584 class06584 = this.L.field_14140.method_5998(class07050.field_5808);
         if (class06584.N(this.N.method_45162())) {
            if (!this.L.field_14140.method_75202(class06584, 5)) {
               this.L.field_14140.method_5997(this.y);
            }
         }
      } else {
         this.L.method_52396(class00392.L("multiplayer.disconnect.invalid_entity_attacked"));
         class01615.field_14121.warn("Player {} tried to attack an invalid entity", this.L.field_14140.method_74861());
      }
   }

   public void N(class07050 var1, class06889 var2, CallbackInfo var3) {
      class04770 class04770 = this.L.field_14140;
      class07299 class07299 = class04770.method_73183();
      class06145 class06145 = new class06145(this.y, var2.y(this.y.method_23317(), this.y.method_23318(), this.y.method_23321()));
      if (((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact(class04770, class07299, var1, this.y, class06145) != class07082.i) {
         var3.cancel();
      }
   }

   public void N(class07050 var1, CallbackInfo var2) {
      class04770 class04770 = this.L.field_14140;
      class07299 class07299 = class04770.method_73183();
      if (((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact(class04770, class07299, var1, this.y, null) != class07082.i) {
         var2.cancel();
      }
   }

   public void N(class07050 var1, class06889 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, (class09484)((var1x, var2x, var3x) -> var2x.method_5664(var1x, var2, var3x)));
      }
   }

   public void N(class07050 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, class08036::method_7287);
      }
   }

   private void N(class07050 var1, class09484 var2) {
      class06584 class06584xx = this.L.field_14140.method_5998(var1);
      if (class06584xx.N(this.N.method_45162())) {
         class06584 class06584x = class06584xx.t();
         if (var2.run(this.L.field_14140, this.y, var1) instanceof class07041 class07041) {
            class06584 class06584xx = class07041.L() ? class06584x : class06584.E;
            class06912.C.N(this.L.field_14140, class06584xx, this.y);
            if (class07041.i() == class07064.field_52428) {
               this.L.field_14140.method_23667(var1, true);
            }
         }
      }
   }
}
